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

public class AddAccountPage {
	static WebDriver driver;
	AddCustomerPage ac = new AddCustomerPage(driver);
	String cust_id = AddCustomerPage.custID;

	public AddAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String text;
	
	

	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[5]/a\n"
			+ "")
	@CacheLookup
	WebElement clk_NewAccount;
	
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")
	@CacheLookup
	WebElement send_Id;
	
	@FindBy(how = How.NAME, using = "selaccount")
	@CacheLookup
	WebElement account_type;
	
	@FindBy(how = How.NAME, using = "inideposit")
	@CacheLookup
	WebElement deposit;
	
	
	@FindBy(how = How.NAME, using = "button2")
	@CacheLookup
	WebElement clkSubmit;

	
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]\n"
			+ "")
	@CacheLookup
	WebElement getID;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]/tbody/tr[1]/td/p	")
	@CacheLookup
	WebElement success_message;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]/tbody/tr[4]/td[2]")
	@CacheLookup
	WebElement get_Account;
	

	
	
	public void click_Account() {
		text = clk_NewAccount.getText();
		 System.out.println(text);
		 driver.get("https://demo.guru99.com/v4/manager/addAccount.php");
		//clk_NewAccount.click();
		System.out.println(cust_id);
	}
	
	public void add_CustomerID() {
		send_Id.sendKeys(cust_id);
	}
	
	public void add_Account(String acc_type) {
		
		account_type.sendKeys(acc_type);
	}
	
	public void add_Deposit(String amount) {
		
		deposit.sendKeys(amount);
	}
	
    public void clickSubmit() {
		
		clkSubmit.click();
	}
    
    public void message() {
    	String msg = success_message.getText();
    	System.out.println(msg);
    }
    
    public void get_AccountID() {
    	String account_id = get_Account.getText();
    	System.out.println(account_id);
    }
	
}
