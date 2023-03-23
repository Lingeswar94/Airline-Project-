package TestcaseFC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightResult {

	static WebDriver driver;
	
	public FlightResult(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="//li[@class='pro select_out']//span[@data-html='true']")
	public static WebElement baseclass;
	
	@FindBy (xpath="//button[@id='btnContinue']")
	public static WebElement flightresultctn;
	
}
