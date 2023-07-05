package com.nxstudio.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
	
	//Login
	public String baseURL = "https://nxcasadigi-studio-qa.project.casadigi.com/login";
	public String username = "subhana.khan@digivalet.com";
	public String invalidusername = "mndbjf87498";
	public String password = "CasaDigi@4.0";
	public static WebDriver driver;
	
	//Add user
	public String FirstName = "Rachel";
	public String LastName = "Swan";
	public String Email = "RachelSwan@gmail.com";
	
	//Forget Password
	public String forgetEmail = "subhana.khan@digivalet.com";
	
	

	@BeforeClass
	public void setup()
	{
		 extent.attachReporter(spark);
		 
		 WebDriverManager.chromedriver().setup(); 
		 driver = new ChromeDriver(); 
		 driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void tearDown()
	{
		extent.flush();
		//driver.quit();
	}
	
}
