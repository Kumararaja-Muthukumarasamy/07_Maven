package com.mdk;

import java.util.ResourceBundle;

public class App {

	public int userLogin(String uName, String pwd) {

		ResourceBundle rb = ResourceBundle.getBundle("config");

		String userName = rb.getString("UserName");
		System.out.println(userName);
		String password = rb.getString("Password");
		System.out.println(password);
		if(uName.equals(userName) && pwd.equals(password)) {
			return 1;
		} else {
			return 0;
		}

	}

}
