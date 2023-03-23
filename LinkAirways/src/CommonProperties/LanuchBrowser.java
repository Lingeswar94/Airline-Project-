package CommonProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanuchBrowser {

	public static WebDriver driver;
	public static Properties properties;
	Logger logger = Logger.getLogger(LanuchBrowser.class);

	public Properties loadbrowser() throws IOException {

		FileInputStream fileInputStream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileInputStream);
		return properties;

	}

	@BeforeSuite
	public void launchBrowser() throws IOException {

		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Open LinkAirways ");
		logger.info("Booking PNR with normal flow");
		loadbrowser();
		String Browser = properties.getProperty("browser");
		String Url = properties.getProperty("url");
		String driverLocation = properties.getProperty("DriverLocation");

		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--load-extension=C:\\Selenium\\Site_Authentication\\Site_Authentication");
	    WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", driverLocation);
		logger.info("Lanching Chrome Browser");
		driver = new ChromeDriver();
		driver.navigate().to(Url);
		logger.info("Navigating to Application");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void tearDown() {
		// driver.quit();
	}
}
