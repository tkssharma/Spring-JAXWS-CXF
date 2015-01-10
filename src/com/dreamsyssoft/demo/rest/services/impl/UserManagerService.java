package com.dreamsyssoft.demo.rest.services.impl;

import java.util.Arrays;
import java.util.Date;

import javax.jws.WebService;




import com.dreamsyssoft.demo.rest.model.User;
import com.dreamsyssoft.demo.rest.services.UserManager;

@WebService(endpointInterface="com.dreamsyssoft.demo.rest.services.UserManager")
public class UserManagerService implements UserManager
{

	@Override
	public User fetchUserById(int id) {
		User user = new User();
		user.setCity("hello");
		user.setId(1);
		user.setState("India");
		user.setBirthDate(new Date());
		user.setEmail("hello@gmail.com");
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public Boolean SaveUser(User user) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public User UpdateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}



}
