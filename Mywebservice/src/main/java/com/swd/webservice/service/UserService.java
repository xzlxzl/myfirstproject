package com.swd.webservice.service;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.swd.webservice.common.WsConstants;
import com.swd.webservice.response.UserDTO;
@WebService(name="UserService",targetNamespace=WsConstants.NS)
public interface UserService {
    public String getUerName(@WebParam(name="userId")String userId);
    
    public UserDTO getUser(@WebParam(name="userId")String userId);
}
