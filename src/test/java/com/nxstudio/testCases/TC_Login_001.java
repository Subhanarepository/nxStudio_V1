package com.nxstudio.testCases;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.nxstudio.pageObjects.LoginPage;

public class TC_Login_001 extends BaseClass {

	@Test(priority = 1)
	public void launchBrowser() throws InterruptedException
	{
		ExtentTest test = extent.createTest("Launch browser").assignAuthor("Subhana").assignDevice("Windows")
				.assignCategory("Smoke Test");
		
		Thread.sleep(3000);
		
		driver.get(baseURL);
		test.log(Status.PASS, "User Launch browser");
		test.pass("Browser Launched Successfully");
		 
	}
	
		
		@Test(priority = 2)
		public void verifyTitle(ITestResult result) throws InterruptedException
		{
			ExtentTest test = extent.createTest("VerifyTitle").assignAuthor("Subhana").assignDevice("Windows")
					.assignCategory("Smoke Test");
			
		Thread.sleep(3000);
		if(driver.getTitle().equals("CasaDigi Studio"))
		{
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
			Assert.assertTrue(true);
		}
		else
		{
			test.log(Status.FAIL, "The page title is not matching");
			
		}
	
	}
		
	
		@Test(priority = 3)
		public void blankFields() throws InterruptedException
		{
			
			ExtentTest test = extent.createTest("Negative Test Case - Blank fields").assignAuthor("Subhana").assignDevice("Windows")
			.assignCategory("Smoke Test");
			
			
			Thread.sleep(3000); 
			driver.get(baseURL); 
			test.log(Status.PASS, "User Launch browser");

			Thread.sleep(3000);
			LoginPage lp = new LoginPage(driver);
			lp.setUserName("");
			lp.setUserPassword("");
			
		
			lp.clickSubmit();
			Thread.sleep(3000);
			test.log(Status.FAIL, "Email and Password fields are required");
			
	}
		
		
		@Test(priority = 4)
		public void passwordBlankFields() throws InterruptedException
		{
			
			ExtentTest test = extent.createTest("Negative Test Case - Password Blank field").assignAuthor("Subhana").assignDevice("Windows")
			.assignCategory("Smoke Test");
			
		
			 Thread.sleep(3000); 
			 driver.get(baseURL); 
			 test.log(Status.PASS, "User Launch browser");
			 
			 Thread.sleep(3000);
			LoginPage lp = new LoginPage(driver);
			lp.setUserName(username);
			lp.setUserPassword("");
			
			Thread.sleep(3000);
			lp.clickSubmit();
			
			test.log(Status.FAIL, "Password fields are required");
			
	}
		
		
		@Test(priority = 5)
		public void emailBlankFields() throws InterruptedException
		{
			
			ExtentTest test = extent.createTest("Negative Test Case - Email Blank field").assignAuthor("Subhana").assignDevice("Windows")
			.assignCategory("Smoke Test");
			 
			
			 Thread.sleep(3000); 
			 driver.get(baseURL); 
			 test.log(Status.PASS, "User Launch browser");
			 
			 Thread.sleep(3000); 
			LoginPage lp = new LoginPage(driver);
			lp.setUserName("");
			lp.setUserPassword(password);
			
		
			lp.clickSubmit();
			Thread.sleep(3000);
			test.log(Status.FAIL, "Email fields are required");
			
		}
		
		@Test(priority = 6)
		public void invalidCredentials() throws InterruptedException 
		{
			
			ExtentTest test = extent.createTest("Negative Test Case - InvalidCredentials").assignAuthor("Subhana").assignDevice("Windows")
			.assignCategory("Smoke Test");
					
					Thread.sleep(3000); 
					driver.get(baseURL); 
					test.log(Status.PASS, "User Launch browser");

					Thread.sleep(3000);
					driver.findElement(By.id("login-email-field")).sendKeys("subhanakhan16@gmail.com");
					driver.findElement(By.id("login-password-field")).sendKeys("CasaDigi@4.0");
					
					driver.findElement(By.id("user-login-btn")).click();
					Thread.sleep(3000);
					test.log(Status.FAIL, "Email fields are required");
			
		}
		
		
		@Test(priority = 7)
		public void invalidEmailFormat() throws InterruptedException
		{
			ExtentTest test = extent.createTest("Invalid Email Format").assignAuthor("Subhana").assignDevice("Windows")
			.assignCategory("Smoke Test");
			
			
			driver.get(baseURL);
			
			
			Thread.sleep(3000);
			LoginPage lp = new LoginPage(driver);
			lp.setinvalidUserName(invalidusername);
			lp.setUserPassword(password);
			
			Thread.sleep(3000);
			lp.clickSubmit();
			Thread.sleep(5000);
			
			/*
			 * Thread.sleep(5000); 
			 * lp.clickLogout();
			 */
			
			test.log(Status.FAIL, "Invalid Email address");
		}
		
		
		@Test(priority = 8)
		public void Login() throws InterruptedException
		{
			ExtentTest test = extent.createTest("Login").assignAuthor("Subhana").assignDevice("Windows")
			.assignCategory("Smoke Test");
			
			
			driver.get(baseURL);
			
			Thread.sleep(3000);
			LoginPage lp = new LoginPage(driver);
			lp.setUserName(username);
			lp.setUserPassword(password);
			
			Thread.sleep(3000);
			lp.clickSubmit();
			Thread.sleep(5000);
			
			/*
			 * Thread.sleep(5000); 
			 * lp.clickLogout();
			 */
			
			test.log(Status.PASS, "User Login successfully");
		}
		
		
		
		
		

}

		


	
		
	
		
		
		
	
	

	


