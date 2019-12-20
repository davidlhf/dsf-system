package com.dsfsys.proj.db.service.usercenter;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dsfsys.pub.exception.ConcrrentException;
import com.dsfsys.proj.db.entity.usercenter.UserInfo;
import com.dsfsys.proj.db.entity.usercenter.UserInfoExample;
import com.dsfsys.proj.db.mapper.usercenter.UserInfoMapper;

@Component("userInfoSerivce")
public class UserInfoSerivce {
    @Autowired
    UserInfoMapper userInfoMapper;
    
    public Map<String,Object> findPerson(Map<String,Object> input,Map<String,Object> responce) throws ConcrrentException{
    	try {
	    	UserInfoExample userInfoExample= new UserInfoExample();
	    	UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
	    	if(input.get("email")!=null) {
	    		criteria.andEmailEqualTo(input.get("email").toString());
	    	}
	    	if(input.get("psswd")!=null) {
	    		criteria.andPsswdEqualTo(input.get("psswd").toString());
	    	}
	    	if(input.get("aliace")!=null) {
	    		criteria.andAliaceEqualTo(input.get("aliace").toString());
	    	}
	    	List<UserInfo> userInfo = userInfoMapper.selectByExample(userInfoExample);
	    	responce.put("return", userInfo);
	    	return responce;
    	}catch(Exception e) {
    		throw new ConcrrentException("0001", e.getMessage(), "UserInfoSerivce.findPerson");
    	}
    }
}
