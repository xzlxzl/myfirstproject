package com.swd.webservice.service;



import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
@WebService
@Path("/userRestService")
@Produces({"application/json","application/xml"})
public interface UserRestService {

	@GET
	@Path("/getusername/{id}")
	@Produces({"application/json","application/xml"})
	public String getUserName(@PathParam("id") int userNo);
	 
}
