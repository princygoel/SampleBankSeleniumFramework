package com.inetbanking.testCases;


import org.apache.logging.log4j.Logger;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass  {
	
	ReadConfig readconfig = new ReadConfig();
	
	Logger logger =LogManager.getLogger(BaseClass.class);
	public static Logger Logger;
	public static WebDriver driver;
	public String baseURL = readconfig.getApplicationURL();
	public String username =readconfig.getUsername();
	public String password =readconfig.getPassword();
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		String projectPath = System.getProperty("user.dir");
	 System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");

		//System.out.println(projectPath);
	if(br.equals("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	else {

        WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	driver.get(baseURL);
	driver.manage().window().maximize();
        
	}
	
	
	public String ramdomString() {
		String email = RandomStringUtils.randomAlphabetic(8);
		return (email);
	}

}
 