package com.nxstudio.testCases;


import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.nxstudio.pageObjects.LoginPage;
import com.nxstudio.pageObjects.UsersPage;


public class TC_Users_01 extends BaseClass {

	@Test
	public void addUser() throws InterruptedException
	{
		//Login
		ExtentTest test = extent.createTest("Add User").assignAuthor("Subhana").assignDevice("Windows")
		.assignCategory("Smoke Test");
		
		driver.get(baseURL);
		Thread.sleep(3000);
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setUserPassword(password);
		
		Thread.sleep(3000);
		lp.clickSubmit();
		Thread.sleep(5000);
		
		test.log(Status.PASS, "User Login successfully");
		
		//Add User
		UsersPage au = new UsersPage(driver);
		au.clickSidebarUsers();
		Thread.sleep(3000);
		
		au.clickAddUserbtn();
		Thread.sleep(3000);
		
		au.firstName(FirstName);
		au.lastName(LastName);
		au.selectCountry();
		//au.selectCountryItem();
		au.txtEmail(Email);
		au.selectRole();
		au.selectFirmName();
		au.selectReportTo();
		
		au.clickSaveBtn();
		Thread.sleep(3000);
		test.log(Status.PASS, "User Login successfully");
		
	}
}
