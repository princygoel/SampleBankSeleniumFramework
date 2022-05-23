package com.inetbanking.pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerPage  {
	WebDriver driver;
	AddCustomerPage ac = new AddCustomerPage(driver);
	String cust = AddCustomerPage.custID;


	public DeleteCustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	String text;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[4]/a")
	@CacheLookup
	WebElement clickDeleteCust;
	
	@FindBy(how = How.NAME, using = "cusid")
	@CacheLookup
	WebElement deletecustID;
	
	@FindBy(how = How.NAME, using = "AccSubmit")
	@CacheLookup
	WebElement sub;
	
	public void deleteCustomer() throws InterruptedException {
		// text = clickDeleteCust.getText();
		// System.out.println(text);
		// clickDeleteCust.click();
		 driver.get("https://demo.guru99.com/v4/manager/DeleteCustomerInput.php");
		 Thread.sleep(1000);

		
	}
	
	public void deleteCustomerID() {
		System.out.println(cust);
		deletecustID.sendKeys(cust);
	}
	
	public void cickldeleteSubmit() throws InterruptedException {
		sub.click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.switchTo().defaultContent();
		
		Alert a1 = driver.switchTo().alert();
		System.out.println(a.getText());
		a1.accept();
		driver.switchTo().defaultContent();
	}


}
