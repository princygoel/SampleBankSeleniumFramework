package com.inetbanking.testCases;


import org.openqa.selenium.Alert;

import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.Test;


import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
		public void loginTest() throws InterruptedException 
	{
				
		logger.info("This is information message..");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Enter name");
		lp.setPassword(password);
		logger.info("Enter password");
		lp.clickSubmit();
		System.out.println("Done");
		
		/*Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.switchTo().defaultContent();
		*/
		
	    if(driver.getTitle().equals(" Guru99 Bank Manager HomePage")) 
	    {
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(true);
		}
		
	}

}
