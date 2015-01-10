package com.dreamsyssoft.demo.rest.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.dreamsyssoft.demo.rest.model.User;




@WebService
public interface UserManager
{
	
	@WebMethod
	public User fetchUserById(int id);
	
	@WebMethod
	public Boolean SaveUser(User user);
	
	@WebMethod
	public User UpdateUser(User user);


}
