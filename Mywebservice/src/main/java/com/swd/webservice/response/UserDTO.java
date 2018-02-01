package com.swd.webservice.response;

import javax.xml.bind.annotation.XmlType;

import com.sun.xml.txw2.annotation.XmlElement;
import com.swd.webservice.common.WsConstants;


@XmlElement
@XmlType(name="User",namespace=WsConstants.NS)
public class UserDTO {
    private String userId;
    private String userName;
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
    
}
