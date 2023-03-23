package TestcaseFC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import graphql.PublicApi;

public class Passenger {

	
	static WebDriver driver;
	
	public Passenger(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Adult
	@FindBy (xpath="//input[@id='ucPassenger1_lstPassenger_FIRSTNAME_0_txtFName_0']")
	public static WebElement firstname;
	
	@FindBy (xpath="//input[@id='ucPassenger1_lstPassenger_LASTNAME_0_txtLName_0']")
	public static WebElement lastname;
	
	
	@FindBy (xpath="//input[@id='ucPassenger1_lstPassenger_PAXMOBILENO_0_txtPaxMobileNo_0']")
	public static WebElement mobileno;
	
	@FindBy (xpath="//input[@id='ucPassenger1_lstPassenger_EMAIL_0_txtEmail_0']")
	public static WebElement email;
	
	@FindBy (xpath="//input[@id='ucPassenger1_lstPassenger_ConfirmEmail_0_txtConfirmEmail_0']")
	public static WebElement confrmemail;
	
	@FindBy (xpath="//input[@id='ucPassenger1_lstPassenger_COUNTRYPOSTCODE_0_txtResPostCode_0']")
	public static WebElement Residential;
	 
	@FindBy (xpath="//input[@id='btnConfirmPassenger']")
	public static WebElement Passctn;
	
	
	//Child
	
	@FindBy (xpath="//input[@id='ucPassenger1_lstPassenger_FIRSTNAME_1_txtFName_1']")
	public static WebElement Childfirstname;
	
	@FindBy (xpath="//input[@id='ucPassenger1_lstPassenger_LASTNAME_1_txtLName_1']")
	public static WebElement Childlastname;
	
	@FindBy (xpath="//select[@id='ucPassenger1_lstPassenger_DATEOFBIRTH_1_ddlDay_1']")
	public static WebElement ChildDOBdate;
	
	@FindBy(xpath="//select[@id='ucPassenger1_lstPassenger_DATEOFBIRTH_1_ddlMonth_1']")
	public static WebElement ChildDOBmonth;
	
	@FindBy (xpath="//select[@id='ucPassenger1_lstPassenger_DATEOFBIRTH_1_ddlYear_1']") 
	public static WebElement ChildDOBYear;
	
	@FindBy (xpath="//input[@id='ucPassenger1_lstPassenger_COUNTRYPOSTCODE_1_txtResPostCode_1']")
	public static WebElement ChildResidential;
	
	//infant
	
	@FindBy (xpath="//input[@id='ucPassenger1_lstPassenger_FIRSTNAME_2_txtFName_2']")
	public static WebElement Infantfirstname;
	
	@FindBy (xpath="//input[@id='ucPassenger1_lstPassenger_LASTNAME_2_txtLName_2']")
	public static WebElement Infantlastname;
	
	@FindBy (xpath="//select[@id='ucPassenger1_lstPassenger_DATEOFBIRTH_2_ddlDay_2']")
	public static WebElement InfantDOBdate;
	
	@FindBy(xpath="//select[@id='ucPassenger1_lstPassenger_DATEOFBIRTH_2_ddlMonth_2']")
	public static WebElement InfantDOBmonth;
	
	@FindBy (xpath="//select[@id='ucPassenger1_lstPassenger_DATEOFBIRTH_2_ddlYear_2']") 
	public static WebElement InfantDOBYear;
	
	@FindBy (xpath="//input[@id='ucPassenger1_lstPassenger_COUNTRYPOSTCODE_2_txtResPostCode_2']")
	public static WebElement InfantResidential;
}


