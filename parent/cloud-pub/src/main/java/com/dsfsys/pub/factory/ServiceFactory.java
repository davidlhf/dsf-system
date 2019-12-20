package com.dsfsys.pub.factory;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;

import org.springframework.util.ReflectionUtils;

import com.alibaba.fastjson.JSON;
import com.dsfsys.pub.exception.ConcrrentException;
import com.dsfsys.proj.beanutils.SpringUtil;

public class ServiceFactory {

	   private static Logger LOGGER = DsfLoggerFactory.getDbsLog();
	
	public static Map<String,Object> getservice(String servName,String funcName,Map<String,Object> params) throws ConcrrentException {
		if(servName==null||funcName==null) {
			LOGGER.error("0002","servName must be inputed","ServiceFactory.getservice");
			throw new ConcrrentException("0002","servName must be inputed","ServiceFactory.getservice");
		}
		Object obj = SpringUtil.getBean(servName);
		Method method = null;
		Map<String,Object> responce = new HashMap<>();
		LOGGER.info("invoke: "+servName+"."+funcName+" request datas:"+JSON.toJSONString(params));
		try {
			method = ReflectionUtils.findMethod(obj.getClass(), funcName,Map.class,Map.class);
		} catch (Exception e) {
			throw new ConcrrentException("1748",e.getMessage(),"ServiceFactory.getservice");
		}
		try {
			responce = (Map<String, Object>) ReflectionUtils.invokeMethod(method, obj, params,responce);
		} catch (Exception e) {
			throw new ConcrrentException("1748",e.getMessage(),"ServiceFactory.getservice");
		}
		LOGGER.info("invoke: "+servName+"."+funcName+" responce datas:"+JSON.toJSONString(responce));
		return responce;
	}
	
}
