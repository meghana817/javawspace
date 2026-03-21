package com.mphasis.productmanagerapp.model;

import java.util.Objects;

public class UserModel {
	private String login;
	private String password;
	public UserModel() {
		
	}

	public UserModel(String login,String password)
	{
		this.login=login;
		this.password=password;

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(login);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserModel other = (UserModel) obj;
		return Objects.equals(login, other.login);
	}
	

}
