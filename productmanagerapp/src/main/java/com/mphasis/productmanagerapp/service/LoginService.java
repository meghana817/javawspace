package com.mphasis.productmanagerapp.service;

import com.mphasis.productmanagerapp.model.UserModel;

public class LoginService {
	
	public boolean check(UserModel usermodel)
	{
		if(usermodel.getLogin().equals("John")&& usermodel.getPassword().equals("123"))
			return true;
		else
			return false;
	}

}
