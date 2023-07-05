package com.nxstudio.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="login-email-field")
	@CacheLookup 
	WebElement txtUserName;
	
	//CACHELookup - PageFactory annotation @CacheLookup is used to mark the WebElements once located so that the same instance in the DOM can always be used. 
	//CacheLookup attribute can be used to instruct the InitElements() method to cache the element once its located and so that it will not be searched 
	//over and over again. 
	//It is useful when the elements that are always going to be there. For AJAX based applications, it may not work where the DOM changes based on user 
	//action on the page, otherwise every time when we use a Web Element the WebDriver will go and search it again.
	
	@FindBy(id="login-password-field")
	@CacheLookup 
	WebElement txtPassword;
	
	@FindBy(id="user-login-btn")
	@CacheLookup 
	WebElement btnLogin;
	
	/*
	 * @FindBy(xpath
	 * ="//*[@id=\"wrapper\"]/app-sidebar/div/div[3]/div[2]/div[2]/div/div[2]")
	 * 
	 * @CacheLookup WebElement btnLogout;
	 */
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setinvalidUserName(String invalidname)
	{
		txtUserName.sendKeys(invalidname);
	}
	
	
	public void setUserPassword(String upassword)
	{
		txtPassword.sendKeys(upassword);
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
	}
	
	/*
	 * public void clickLogout() { btnLogout.click(); }
	 */
}
