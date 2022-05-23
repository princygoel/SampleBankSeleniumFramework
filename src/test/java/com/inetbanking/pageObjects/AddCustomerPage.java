package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	static WebDriver driver;
	

	public AddCustomerPage(WebDriver driver) {
		AddCustomerPage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String text;
	public static String custID;

	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkAddNewCustomer;

	@FindBy(how = How.NAME, using = "name")
	@CacheLookup
	WebElement txtCustomerName;

	@FindBy(how = How.NAME, using = "rad1")
	@CacheLookup
	WebElement rGender;

	@FindBy(how = How.ID_OR_NAME, using = "dob")
	@CacheLookup
	WebElement txtdob;

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

	@FindBy(how = How.NAME, using = "emailid")
	@CacheLookup
	WebElement txtemailid;

	@FindBy(how = How.NAME, using = "password")
	@CacheLookup
	WebElement txtpassword;
	

	@FindBy(how = How.NAME, using = "sub")
	@CacheLookup
	WebElement btnSubmit;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[3]/a")
	@CacheLookup
	WebElement editCustomer;
	
	@FindBy(how = How.XPATH, using = "	/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]\n"
			+ "")
	@CacheLookup
	WebElement getID;
	

	public void clickAddNewCustomer() throws InterruptedException {
		 text = lnkAddNewCustomer.getText();
		 System.out.println(text);
		 //lnkAddNewCustomer.click();
		 driver.get("https://demo.guru99.com/v4/manager/addcustomerpage.php");
		 Thread.sleep(1000);
	}

	public void custName(String cname) {
		txtCustomerName.sendKeys(cname);
	}

	public void custGender(String cgender) {
		rGender.click();

	}
	
	public void custDob(String mm, String dd, String yy) {
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
		
	}
	
	public void custAddress(String cadd) {
		txtaddress.sendKeys(cadd);	
	}
	
	public void custCity(String ccity) {
		txtCity.sendKeys(ccity);	
	}
	
	public void custState(String cstate) {
		txtstate.sendKeys(cstate);	
	}
	
	public void custPin(int cpinno) {
		txtpinno.sendKeys(String.valueOf(cpinno));	
	}
	
	public void custTelephone(String ctelephone) {
		txttelephoneno.sendKeys(ctelephone);	
	}
	
	public void custemailId(String cemail) {
		txtemailid.sendKeys(cemail);	
	}
	
	public void custPassword(String pass) {
		txtpassword.sendKeys(pass);	
	}
	
	public void custSubmit() 
	{
		btnSubmit.click();
	}
	
	public void getCustID()  {
		 custID = getID.getText();
		 System.out.println(custID);
		 
		
	}

	
	
	

}
