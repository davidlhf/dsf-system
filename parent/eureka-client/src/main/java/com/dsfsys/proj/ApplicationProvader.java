package com.dsfsys.proj;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.dsfsys.pub.exception.ConcrrentException;
import com.dsfsys.pub.factory.ServiceFactory;

/** 
* @description
* @param
* @return  
* @author lihf
* @date 2019/12/17
*/ 
@SpringBootApplication(scanBasePackages= {"com.dsfsys.proj"})
@MapperScan("com.dsfsys.proj.db.mapper")
@EnableTransactionManagement
@EnableEurekaClient
@RestController
public class ApplicationProvader {
	 public static void main(String[] args) {
	        SpringApplication.run(ApplicationProvader.class, args );
	    }

	    @Value("${server.port}")
	    String port;

	    @RequestMapping("/hi")
	    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
	    	 Map<String, Object> params = new HashMap<String, Object>();
	    	 params.put("email", "123213");
	    	 params.put("psswd", "12321321321");
	    	 Map<String, Object> map =null;
	    	try {
				map = ServiceFactory.getservice("userInfoSerivce", "findPerson", params);
				map.put("complete", "0");
			} catch (ConcrrentException e) {
				map = new HashMap<>();
				map.put("complete", "1");
				map.put("err_no", e.getErr_code());
				map.put("err_msg", e.getErr_msg());
				map.put("Err_func", e.getErr_func());
			}catch (Exception e) {
				
				map = new HashMap<>();
				map.put("complete", "1");
				map.put("err_no", "1748");
				map.put("err_msg", e.getMessage());
				map.put("Err_func", "home");
			}
	        return JSON.toJSONString(map);
	    }
}
