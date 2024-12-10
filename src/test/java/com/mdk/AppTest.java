package com.mdk;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

	App myApp = new App();
	
	@Test
	public void testValidLogin() {

		int result = myApp.userLogin("Admin", "Admin123");
		System.out.println("Test Cases Executed Successfully");
		Assert.assertEquals(1, result);
	}
	
	
	@Test (enabled = true)
	public void testInValidLogin() {

		int result = myApp.userLogin("Admin", "Admin");
		System.out.println("Test Cases Not Executed Successfully");
		Assert.assertEquals(0, result);
	}


}
