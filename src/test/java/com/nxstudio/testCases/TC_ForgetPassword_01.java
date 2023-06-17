package com.nxstudio.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.nxstudio.pageObjects.ForgetClass;


public class TC_ForgetPassword_01 extends BaseClass {

	@Test(priority = 8)
	public void invalidEmailFormat() throws InterruptedException
	{
		ExtentTest test = extent.createTest("Login").assignAuthor("Subhana").assignDevice("Windows")
		.assignCategory("Smoke Test");
		
		
		driver.get(baseURL);
		driver.findElement(By.id("login-email-field")).sendKeys("123rdff42");
		
		Thread.sleep(3000);
		ForgetClass fc = new ForgetClass(driver);
		fc.clickLoginForgetBtn();
		Thread.sleep(3000);
		
		fc.setForgetEmail(Email);
		fc.clickForgetbtn();
		
		Thread.sleep(5000);
		
		/*
		 * Thread.sleep(5000); 
		 * lp.clickLogout();
		 */
		
		test.log(Status.PASS, "User Login successfully");
	}
	
	
}
