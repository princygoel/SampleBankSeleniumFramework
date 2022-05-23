package com.inetbanking.testCases;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddNewCustomer_002 extends BaseClass {
	
	@Test
	public void addNewCustomer() throws InterruptedException {
		
	
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		

		  
		AddCustomerPage addcust = new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		
		
		addcust.custName("Princytest1");
		addcust.custGender("female");
		addcust.custDob("10", "15", "1198");
		Thread.sleep(2000);
		addcust.custAddress("India");
		addcust.custCity("Noida");
		addcust.custState("UP");
		addcust.custPin(987656);
		addcust.custTelephone("9876543212");
		String email = ramdomString()+"@gmail.com";
		addcust.custemailId(email);
		addcust.custPassword("jhkhkkh");
		addcust.custSubmit();
		
		Thread.sleep(2000);
		
		boolean res = driver.getPageSource().contains("Customer Registered successfully!.. ");
	
		if(res = true) {
			Assert.assertTrue(true);
			Logger.info("test case passed");
		}
		else {
			Assert.assertTrue(false);
			Logger.info("test case failed");
		}
	
	}
	
	

}
