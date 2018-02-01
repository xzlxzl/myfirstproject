package com.swd.webservice.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.swd.webservice.mapper.UserMapper;
import com.swd.webservice.service.IUserService;
import com.swd.webservice.vo.User;
@Service
public class IuserServiceImpl implements IUserService{
    @Resource
    private UserMapper userMapper;
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return userMapper.selectById(userId);
	}

}
