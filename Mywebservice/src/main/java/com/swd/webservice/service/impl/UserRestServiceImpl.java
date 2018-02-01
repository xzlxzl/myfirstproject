package com.swd.webservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.swd.webservice.service.IUserService;
import com.swd.webservice.service.UserRestService;

public class UserRestServiceImpl implements UserRestService{
    @Autowired
    private IUserService userService;
	@Override
	public String getUserName(int userNo) {
	    String userName=userService.getUserById(userNo).getUserName();
		return userName;
	}
        
}
