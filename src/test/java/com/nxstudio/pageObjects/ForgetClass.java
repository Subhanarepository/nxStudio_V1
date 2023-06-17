package com.nxstudio.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetClass {
	
WebDriver ldriver;
	
	public ForgetClass(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="forgot-password-btn")
	@CacheLookup 
	WebElement loginForgetbtn;
	
	@FindBy(id="forgot-password-email")
	@CacheLookup 
	WebElement txtForgetEmail;
	

	@FindBy(id="reset-password-button")
	@CacheLookup 
	WebElement btnForgetSave;
	
	
	public void clickLoginForgetBtn()
	{
		loginForgetbtn.click();
	}
	
	public void setForgetEmail(String email)
	{
		txtForgetEmail.sendKeys(email);
	}	
	
	public void clickForgetbtn()
	{
		btnForgetSave.sendKeys();
	}
	
	
}
