package TestcaseFC;

import java.awt.Robot;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Thankspage {

	public static Properties properties;
	static WebDriver driver;

	public Thankspage(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(xpath = "//input[@id='btnContinue']")
	public static WebElement simulation;

	@FindBy(xpath = "//button[@type='button']")
	public static WebElement existing;

	@FindBy(xpath = "//h4[@class='rel-pos']")
	public static WebElement PNR;

}
