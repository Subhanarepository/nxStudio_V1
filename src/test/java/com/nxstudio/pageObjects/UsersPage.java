package com.nxstudio.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.nxstudio.testCases.BaseClass;

public class UsersPage extends BaseClass {

WebDriver ldriver;
	
	public UsersPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/app-sidebar/div/div[2]/div[2]/div[2]/div")
	@CacheLookup 
	WebElement btnUserSidebar;
	
	@FindBy(xpath = "//*[@id=\"inner-wrapper\"]/app-user/div/div[2]")
	@CacheLookup 
	WebElement btnAddUser;
	
	@FindBy(xpath = "//*[@id=\"inner-wrapper\"]/app-add-user/form/div/div[1]/div[3]/div[1]/div/input")
	@CacheLookup 
	WebElement txtFirstName;
	
	@FindBy(xpath = "//*[@id=\"inner-wrapper\"]/app-add-user/form/div/div[1]/div[3]/div[2]/app-input/div/input")
	@CacheLookup 
	WebElement txtLastName;
	
	/*
	 * @FindBy(xpath =
	 * "//*[@id=\"inner-wrapper\"]/app-add-user/form/div/div[1]/div[4]/div[2]/div[1]/div/p-dropdown/div/span")
	 * 
	 * @CacheLookup WebElement drpdwnCountry;
	 */
	
	/*
	 * @FindBy(className = "p-dropdownitem li")
	 * 
	 * @CacheLookup WebElement drpdwnCountryItem;
	 */

	
	List<WebElement> elements = driver.findElement(By.xpath("")).findElements(By.tagName("span"));
	
	
	@FindBy(xpath = "//*[@id=\"inner-wrapper\"]/app-add-user/form/div/div[1]/div[5]/div/div/app-input/div/input")
	@CacheLookup 
	WebElement txtEmail;
	
	@FindBy(id = "pr_id_23_label")
	@CacheLookup 
	WebElement drpdwnUserRole;
	
	@FindBy(id = "pr_id_24_label")
	@CacheLookup 
	WebElement drpdwnFirmName;
	
	@FindBy(id = "pr_id_25_label")
	@CacheLookup 
	WebElement drpdwnReportsTo;
	
	@FindBy(xpath = "//*[@id=\"inner-wrapper\"]/app-add-user/form/div/div[3]/button[2]")
	@CacheLookup 
	WebElement btnSave;
	
	
	public void clickSidebarUsers()
	{
		btnUserSidebar.click();
	}
	
	
	public void clickAddUserbtn()
	{
		btnAddUser.click();
	}
	
	public void firstName(String fName)
	{
		txtFirstName.sendKeys(fName);
	}
	
	public void lastName(String lName)
	{
		txtLastName.sendKeys(lName);
	}
	
	
	/*
	 * public void selectCountry() { // Select drop = new Select(drpdwnCountry); //
	 * drop.selectByIndex(1); drpdwnCountry.click(); }
	 */
	
	public void selectCountry()
	{
		List<WebElement> options = driver.findElements(By.xpath("*[@id=\\\"inner-wrapper\\\"]/app-add-user/form/div/div[1]/div[4]/div[2]/div[1]/div/p-dropdown/div/span"));
		for(WebElement option : options) {
		if (option.getText().contains("Albania")) 
			{
			 option.click();
			 break;
			}
		}
	}
	
	/*
	 * public void selectCountryItem() { // Select drop = new Select(drpdwnCountry);
	 * // drop.selectByIndex(1); drpdwnCountryItem.click(); }
	 */
	
	public void txtEmail(String Email)
	{
		txtEmail.sendKeys(Email);
	}
	
	
	public void selectRole() {
	      Select drop = new Select(drpdwnUserRole);
	      drop.selectByVisibleText("Partner");  
	}
	

	public void selectFirmName() {
	      Select drop = new Select(drpdwnFirmName);
	      drop.selectByVisibleText("M&M");  
	}
	
	
	public void selectReportTo() {
	      Select drop = new Select(drpdwnReportsTo);
	      drop.selectByVisibleText("Vijay sharma");  
	}
	
	
	public void clickSaveBtn()
	{
		btnSave.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
