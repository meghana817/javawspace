
package com.mphasis.seconwebapp.service;

import java.util.HashMap;
import java.util.Map;

public class LoginService {

    Map<String, String> users = new HashMap<>();

    public LoginService() {
        users.put("Tom", "123");
        users.put("Jai", "456");
        users.put("Jerry", "789");
    }

    public boolean check(String login, String password) {
    	String value = users.get(login);
    	if(password.equals(value))
    		return true;
    	else
    		return false;
       // return users.containsKey(login) && users.get(login).equals(password);
    }
}