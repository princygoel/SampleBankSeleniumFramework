package com.inetbanking.testCases;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.DeleteCustomerPage;
import com.inetbanking.pageObjects.EditCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_DeleteCustomer_004 extends BaseClass {
	
	@Test
	public void deleteCustomer() throws InterruptedException {
		
	
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		  
		AddCustomerPage addcust = new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		addcust.custName("Dheeraj");
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
		addcust.getCustID();
		
		
		EditCustomerPage editcust = new EditCustomerPage(driver);

		editcust.editNewCustomer();
		editcust.addCustomerID();
		editcust.clickSubmit();
		editcust.custAddress("Australia");
		editcust.custCity("Melbome");
		editcust.custState("Melbomne");
		editcust.custPin(1238501);
		editcust.custTelephone("9876548712");
		editcust.editSubmit();
		
	
	   DeleteCustomerPage delcust = new DeleteCustomerPage(driver);
	
	   delcust.deleteCustomer();
	   delcust.deleteCustomerID();
	   delcust.cickldeleteSubmit();
	   }
}
