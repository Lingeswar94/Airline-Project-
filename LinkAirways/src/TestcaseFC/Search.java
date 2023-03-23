package TestcaseFC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Search {

	static WebDriver driver;

	public Search(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ucMiniSearch_rdoJourneyType_0")
	public static WebElement oneway;

	@FindBy(xpath = "//div[@class='btn-group bootstrap-select form-control deptCitysearch']")
	public static WebElement depart;

	@FindBy(xpath = "//input[@class='form-control']/following::select[1]")
	public static WebElement departdropdown;

	@FindBy (xpath="//select[@id='ucMiniSearch_arrCity']")
	public static WebElement arrival;
	
	@FindBy (xpath="//*[@class='next']")
	public static WebElement month;
	
	@FindBy (xpath="//td[@class='day dt-highlight'][normalize-space()='27']")
	public static WebElement departdte;
	
	@FindBy (xpath="//select[@id='ucMiniSearch_ddlAdult']")
	public static WebElement Adult;
	
	@FindBy (xpath="//select[@id='ucMiniSearch_ddlChild']")
	public static WebElement Child;
	
	@FindBy (xpath="//select[@id='ucMiniSearch_ddlInfant']")
	public static WebElement Infant;
	
	@FindBy (xpath="//input[@id='btnminiSearch']")
    public static WebElement searchbtn;
	
	
	
	
}

