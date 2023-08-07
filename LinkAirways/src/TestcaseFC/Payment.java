package TestcaseFC;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Payment {

	public static Properties properties;
	static WebDriver driver;
	public Payment(WebDriver driver) {
		 this.driver=driver;
	}
	
	
	@FindBy (xpath="//label[@for='rdolstPaymentType_0']")
	public static WebElement CCpayment;
	
	@FindBy (xpath="//input[@id='ucCardDetails_txtFName']")
	public static WebElement Paymentcardname;
	
	@FindBy (xpath="//select[@id='ucCardDetails_ddlYear']")
	public static WebElement Expirydate;
	
	@FindBy (xpath="//input[@id='ucCardDetails_txtCardNumber']")
	public static WebElement Cardno;
	
	@FindBy (xpath="//input[@id='ucCardDetails_txtCVVCode']")
	public static WebElement CVV;

	@FindBy (xpath= "//input[@id='ucPersonalDetails1_txtFName']")
	public static WebElement BillingName;
	
	@FindBy (xpath="//input[@id='ucPersonalDetails1_txtLName']")
	public static WebElement billinglastname;
	
	@FindBy (xpath="//input[@id='ucPersonalDetails1_txtAdd1']")
	public static WebElement Address;
	
	@FindBy (xpath="//input[@id='ucPersonalDetails1_txtCity']")
	public static WebElement city;
	
	@FindBy (xpath="//select[@id='ucPersonalDetails1_ddlCountry']//option[@value='India']")
	public static WebElement Country;
	
	@FindBy (xpath="//input[@id='ucPersonalDetails1_txtPostCode']")
	public static WebElement Postcode; 
	
	@FindBy (xpath="//input[@id='ucPersonalDetails1_txtContactNo']")
	public static WebElement Contact;
	
	@FindBy (xpath="//*[@id='chkRules']")
	public static WebElement rule;
	
	@FindBy (xpath="//input[@id='btnBooking']")
	public static WebElement continuebtn;
	
	
	
	
}





