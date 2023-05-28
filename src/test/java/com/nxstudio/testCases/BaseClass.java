package com.nxstudio.testCases;

//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

//import com.nxstudio.utilities.ReadConfig;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

//ReadConfig readconfig = new ReadConfig();
	
	public String baseURL = "https://demo.guru99.com/V4/";
	public String username = "mngr505693";
	public String password = "agegEsE";
	public static WebDriver driver;

	//public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver 2");
		//System.setProperty("webdriver.chrome.driver","‪‪/Drivers/chromedriver‬‬ 2");
		//System.setProperty("webdriver.chrome.driver","/Users/subhanakhan/Downloads/chromedriver 2");
		//WebDriverManager.chromedriver().setup();
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Subhana Khan\\eclipse-workspace\\nxStudio_V1\\Drivers\\chromedriver.exe"
		 * ); d
		driver = new ChromeDriver(); */
		
		
		/*
		 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver(); driver.
		 manage().window().maximize();*/
		
		//logger = Logger.getLogger("NexGen Studio");
		//PropertyConfigurator.configure("Log4j.properties");
		
		if(br.equals("chrome"))
				{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Subhana Khan\\eclipse-workspace\\nxStudio_V1\\Drivers\\chromedriver.exe");
				}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Subhana Khan\\eclipse-workspace\\nxStudio_V1\\Drivers\\chromedriver.exe");
	
		}
		
	}
	
	@AfterClass
	public void tearDown()
	{
		
		driver.quit();
	}
	
}
