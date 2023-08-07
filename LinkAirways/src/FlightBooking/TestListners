package FlightBooking;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import CommonProperties.LanuchBrowser;
import TestcaseFC.Thankspage;

public class TestListners extends LanuchBrowser implements ITestListener {

	
	//public static Properties properties;
	
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
		System.out.println("Booking is going to start ");
	}
	 @Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		System.out.println("LinkAirways Test Booking is Started");
	}
	 
	 @Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		PageFactory.initElements(driver, Thankspage.class);
		String PNR = Thankspage.PNR.getText();
		System.out.println(Thankspage.PNR.getText());
	}
	
	
}
