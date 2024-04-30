package pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class WebDevelopmentPage extends BasePage{
	
	
	public static String parentWindow;
	public static List<String> courseTitles=new ArrayList<String>();
	public static List<String> courseHours=new ArrayList<String>();
	public static List<String> courseRatings=new ArrayList<String>();
	
	
	public WebDevelopmentPage(WebDriver driver)
	{
		super(driver);
	}
	

@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/span[1]/span[1]/input[1]") 
public WebElement chkBoxEnglish;

@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/label[1]/span[1]/span[1]/input[1]") 
public WebElement chkBoxBeginner;


@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]")
public WebElement firstCourse;

@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/div[1]")
public WebElement secondCourse;





//div[contains(@class,"css-1i4o2ol")]//child::span[contains(text(),' hours')]  //secondpage all the course hour elements to 



public void clickEnglishCheckBox() {
	chkBoxEnglish.click();

}

public void clickBeginnerCheckBox() {

	chkBoxBeginner.click();
}

public void getParentWindow(WebDriver driver)
{
	this.driver=driver;
	parentWindow=driver.getWindowHandle();
}

public void clickFirstCourse()
{
	firstCourse.click();
}

public void clickSecondCourse()
{
	secondCourse.click();
}
	

}




	
	//Sol6  
	//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
	






