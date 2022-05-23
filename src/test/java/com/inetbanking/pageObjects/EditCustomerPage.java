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

public class EditCustomerPage  {
	WebDriver driver;
	AddCustomerPage ac = new AddCustomerPage(driver);
	String cust = AddCustomerPage.custID;


	public EditCustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	String text;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[3]/a")
	@CacheLookup
	WebElement editCustomer;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
	@CacheLookup
	WebElement addId;
	
	@FindBy(how = How.NAME, using = "AccSubmit")
	@CacheLookup
	WebElement clkSubmit;
	
	@FindBy(how = How.NAME, using = "addr")
	@CacheLookup
	WebElement txtaddress; 

	@FindBy(how = How.NAME, using = "city")
	@CacheLookup
	WebElement txtCity;
	
	@FindBy(how = How.NAME, using = "state")
	@CacheLookup
	WebElement txtstate;

	@FindBy(how = How.NAME, using = "pinno")
	@CacheLookup
	WebElement txtpinno;

	@FindBy(how = How.NAME, using = "telephoneno")
	@CacheLookup
	WebElement txttelephoneno;
	
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input[1]")
	@CacheLookup
	WebElement sub;

	

	public void editNewCustomer() throws InterruptedException {
		
		 text = editCustomer.getText();
		 System.out.println(text);
		 driver.get("https://demo.guru99.com/v4/manager/EditCustomer.php");
		// editCustomer.click();
		 Thread.sleep(1000);
		
	}
	
	public void addCustomerID() {
		System.out.println(cust);
		addId.sendKeys(cust);
	}
	
	public void clickSubmit() {
		
		clkSubmit.click();
	}
	
	public void custAddress(String cadd) {
		txtaddress.clear();
		txtaddress.sendKeys(cadd);	
	}
	
	public void custCity(String ccity) {
		txtCity.clear();
		txtCity.sendKeys(ccity);	
	}
	
	public void custState(String cstate) {
		txtstate.clear();
		txtstate.sendKeys(cstate);	
	}
	
	public void custPin(int cpinno) {
		txtpinno.clear();
		txtpinno.sendKeys(String.valueOf(cpinno));	
	}
	
	public void custTelephone(String ctelephone) {
		txttelephoneno.clear();
		txttelephoneno.sendKeys(ctelephone);	
	}
	
	public void editSubmit() throws InterruptedException {
		sub.click();
		Thread.sleep(1000);
		System.out.println("Customer edited.. ");
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(1000);
		a.accept();
		driver.switchTo().defaultContent();
		
	}
	
	

}
