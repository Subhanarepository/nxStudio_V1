package com.nxstudio.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nxstudio.pageObjects.LoginPage;

public class TC_Login_001 extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException
	{
		driver.get(baseURL);
		//logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		//logger.info("Email is Entered");
		
		lp.setUserPassword(password);
		//logger.info("Password is Entered");
		
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		if(driver.getTitle().equals(" Guru99 Bank Home Page "))
		{
			Assert.assertTrue(true);
			//logger.info("Valid page tile");
		}
		else
		{
			Assert.assertTrue(false);
			//logger.info("Invalid page tile");
		}
			
	}
	
}
