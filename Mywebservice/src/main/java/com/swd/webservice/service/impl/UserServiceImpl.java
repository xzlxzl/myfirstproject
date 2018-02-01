package com.swd.webservice.service.impl;

import javax.annotation.Resource;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swd.webservice.common.WsConstants;
import com.swd.webservice.mapper.UserMapper;
import com.swd.webservice.response.UserDTO;
import com.swd.webservice.service.IUserService;
import com.swd.webservice.service.UserService;
import com.swd.webservice.vo.User;
@WebService(serviceName = "UserService",   
endpointInterface = "com.swd.webservice.service.UserService",  
targetNamespace = WsConstants.NS)  
public class UserServiceImpl implements UserService{
     @Autowired
     private IUserService userService;
	@Override
	public String getUerName(String userId) {
		User  user=userService.getUserById(Integer.parseInt(userId));
		return user.getUserName();
	}

	@Override
	public UserDTO getUser(String userId) {
		UserDTO userDto =new UserDTO();
		userDto.setUserId("123");
		userDto.setUserName("123123");
		return userDto;
	}
  
}
