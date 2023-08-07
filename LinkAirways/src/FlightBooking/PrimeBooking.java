package FlightBooking;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import CommonProperties.LanuchBrowser;
import TestcaseFC.Addon;
import TestcaseFC.FlightResult;

import TestcaseFC.Passenger;
import TestcaseFC.Payment;
import TestcaseFC.Search;
import TestcaseFC.Thankspage;

public class PrimeBooking extends LanuchBrowser {
	// static WebDriver driver;
	Logger logger = Logger.getLogger(PrimeBooking.class);

	public void departurecity() {
		Select select1 = new Select(Search.departdropdown);
		select1.selectByValue("BNE");
	}

	public void arrivalcity() {
		Select select2 = new Select(Search.arrival);
		select2.selectByValue("OAG");
	}

	public void adultpax() {
		Select selectadult = new Select(Search.Adult);
		selectadult.selectByIndex(0);
	}

	public void childpax() {
		Select selectChild = new Select(Search.Child);
		selectChild.selectByIndex(1);
	}

	public void infantpax() {
		Select selectInfant = new Select(Search.Infant);
		selectInfant.selectByIndex(1);
	}

	public void expirydate() {
		Select select = new Select(Payment.Expirydate);
		select.selectByValue("2025");
	}

	public void ChildDObdate() {
		Select selectdobchd = new Select(Passenger.ChildDOBdate);
		selectdobchd.selectByIndex(5);
	}

	public void ChildDObmonth() {
		Select selectdobchd = new Select(Passenger.ChildDOBmonth);
		selectdobchd.selectByIndex(5);
	}

	public void ChildDObyear() {
		Select selectdobchd = new Select(Passenger.ChildDOBYear);
		selectdobchd.selectByIndex(5);
	}

	public void InfantDObdate() {
		Select selectdobchd = new Select(Passenger.InfantDOBdate);
		selectdobchd.selectByIndex(12);
	}

	public void InfantDObmonth() {
		Select selectdobchd = new Select(Passenger.InfantDOBmonth);
		selectdobchd.selectByIndex(5);
	}

	public void InfantDObyear() {
		Select selectdobchd = new Select(Passenger.InfantDOBYear);
		selectdobchd.selectByIndex(2);
	}

	public void checkbox() {
		Actions actions = new Actions(driver);
		actions.moveToElement(Payment.rule);
		actions.click().build().perform();
	}

	public void screenshot() throws AWTException, IOException {

		Robot robot = new Robot();
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(dimension);
		BufferedImage image = robot.createScreenCapture(rectangle);
		File file = new File("C:\\Users\\Kalaivani\\Pictures\\Selenium PNR\\pnr.png");
		ImageIO.write(image, "png", file);
	}

	@Test
	public void login() throws InterruptedException, AWTException, IOException {
		logger.info("Logging into Searchflight");
		PageFactory.initElements(driver, Search.class);
		Search.oneway.click();
		String trip = Search.oneway.getText();
		logger.info("Selected Journey type :" + trip);
		Search.depart.click();
		departurecity();
		arrivalcity();
		Search.month.click();
		Search.departdte.click();
		adultpax();
		childpax();
		infantpax();
		Search.searchbtn.click();

		PageFactory.initElements(driver, FlightResult.class);
		logger.info("Flight Result page");
		FlightResult.baseclass.click();
		FlightResult.flightresultctn.click();

		Thread.sleep(3000);
		PageFactory.initElements(driver, Passenger.class);
		// Adult
		logger.info("Passgener page");
		logger.info("Enter Adult pax");
		String AdultpaxFirstname = properties.getProperty("AdultpaxfirstName");
		String AdultpaxLastname = properties.getProperty("AdultpaxLastName");
		String Mobile = properties.getProperty("MobileNo");
		String Email = properties.getProperty("EMail");
		String Confrimmail = properties.getProperty("Confirmmail");
		String Resdentialno = properties.getProperty("Residential");
		Passenger.firstname.sendKeys(AdultpaxFirstname);
		Passenger.lastname.sendKeys(AdultpaxLastname);
		Passenger.mobileno.sendKeys(Mobile);
		Passenger.email.sendKeys(Email);
		Passenger.confrmemail.sendKeys(Confrimmail);
		Passenger.Residential.sendKeys(Resdentialno);
		// Child
		logger.info("Enter Child pax");
		String childfirtsname = properties.getProperty("Childfirstname");
		String childlastsname = properties.getProperty("Childlastname");
		String ChildResidential = properties.getProperty("ChildResidential");
		Passenger.Childfirstname.sendKeys(childfirtsname);
		Passenger.Childlastname.sendKeys(childlastsname);
		ChildDObdate();
		ChildDObmonth();
		ChildDObyear();
		Passenger.ChildResidential.sendKeys(ChildResidential);
		// Infant
		String Infantfirstname = properties.getProperty("Infantfirstname");
		String Infantlastname = properties.getProperty("Infantlastname");
		String InfantResidential = properties.getProperty("InfantResidential");
		logger.info("Enter Infant pax");
		Passenger.Infantfirstname.sendKeys(Infantfirstname);
		Passenger.Infantlastname.sendKeys(Infantlastname);
		InfantDObdate();
		InfantDObmonth();
		InfantDObyear();
		Passenger.InfantResidential.sendKeys(InfantResidential);
		Passenger.Passctn.click();

		PageFactory.initElements(driver, Addon.class);
		logger.info("Addon Page");
		// Addon.Baggage.click();
		// Addon.bagselect.click();
		// Addon.baggageselection.click();
		Addon.Addonctn.click();

		PageFactory.initElements(driver, Payment.class);
		logger.info("Payment Page");
		logger.info("Enter CC detail");
		Payment.CCpayment.click();
		String Paymentcardname = properties.getProperty("Paymentcardname");
		Payment.Paymentcardname.sendKeys(Paymentcardname);
		expirydate();
		Payment.Expirydate.click();
		Payment.Expirydate.click();
		String Cardno = properties.getProperty("Cardno");
		Payment.Cardno.sendKeys(Cardno);
		String CVV = properties.getProperty("CVV");
		Payment.CVV.sendKeys(CVV);
		Payment.BillingName.clear();
		String BillingName = properties.getProperty("BillingName");
		Payment.BillingName.sendKeys(BillingName);
		String billinglastname = properties.getProperty("billinglastname");
		Payment.billinglastname.sendKeys(billinglastname);
		String Address = properties.getProperty("Address");
		Payment.Address.sendKeys(Address);
		String city = properties.getProperty("city");
		Payment.city.sendKeys(city);
		Payment.Country.click();
		Payment.Postcode.clear();
		String Postcode = properties.getProperty("Postcode");
		Payment.Postcode.sendKeys(Postcode);
		Payment.Contact.clear();
		String Contact = properties.getProperty("Contact");
		Payment.Contact.sendKeys(Contact);
		checkbox();
		System.out.println(Payment.rule.isSelected());
		Payment.continuebtn.click();

		PageFactory.initElements(driver, Thankspage.class);
		logger.info("Thanks Page");
		// Thankspage.simulation.click();
		Thankspage.existing.click();
		String PNR = Thankspage.PNR.getText();
		logger.info(PNR);
		//System.out.println(Thankspage.PNR.getText());
		Thread.sleep(2000);
		screenshot();
	}

}
