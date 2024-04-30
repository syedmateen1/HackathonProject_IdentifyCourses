package pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class WebDevelopmentPage extends BasePage{
	
	public WebDriver driver;
	public String parentWindow;
	public String firstCourseWindow;
	public String secondCourseWindow;
	public List<String> courseTitles=new ArrayList<String>();
	public List<String> courseHours=new ArrayList<String>();
	public List<String> courseRatings=new ArrayList<String>();
	public List<Integer> listOfSecondCourseHoursInInt=new ArrayList<Integer>();
	public int secondCourseHours;
	
	public WebDevelopmentPage(WebDriver driver)
	{
		super(driver);
	}
	

@FindBy(xpath="/html/body/div[2]/div/div/main/div[2]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div[2]/div[1]/label/span/span/input") 
public WebElement chkBoxEnglish;

@FindBy(xpath="/html/body/div[2]/div/div/main/div[2]/div/div/div/div/div[1]/div/div/div/div[4]/div/div/div[1]/label/span/span/input") 
public WebElement chkBoxBeginner;


@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]")
public WebElement firstCourse;

@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/div[1]")
public WebElement secondCourse;

@FindBy(xpath="//*[@id='rendered-content']/div/main/section[2]/div/div/div[1]/div[1]/section/h1")
public WebElement firstCourseTitle;

@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/main[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[2]/div[3]/div[1]")
public WebElement firstCourseHours;

@FindBy(xpath="/html/body/div[2]/div/main/section[2]/div/div/div[2]/div/div/section/div[2]/div[1]/div[1]")
public WebElement firstCourseRating;

@FindBy(xpath="//h1[normalize-space()=\"Meta Front-End Developer Professional Certificate\"]")
public WebElement secondCourseTitle;

@FindAll({@FindBy(xpath="//div[contains(@class,'css-1i4o2ol')]//child::span[contains(text(),'hours')]")})
public List<WebElement> hours;

@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/main[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]")
public WebElement secondCourseRating;



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
	
public void getWindowHandles()
{
	
	Set<String> windows=driver.getWindowHandles();
	for(String i: windows)
	{
		
		if(driver.switchTo().window(i).getTitle().equalsIgnoreCase("Python for Data Science, AI & Development | Coursera"))
		{
			firstCourseWindow=i;
		}
		else if(driver.switchTo().window(i).getTitle().equals("Meta Front-End Developer Professional Certificate | Coursera"))
		{
			secondCourseWindow=i;
		}
	}
}

public void firstCourseDetails()
{
	driver.switchTo().window(firstCourseWindow);
	courseTitles.add(firstCourseTitle.getText());
	courseHours.add(firstCourseHours.getText());
	courseRatings.add(firstCourseRating.getText());
	
	
}

public void secondCourseDetails()
{
	secondCourseHours=0;
	driver.switchTo().window(secondCourseWindow);
	courseTitles.add(secondCourseTitle.getText());
	for(WebElement e: hours)
	{
		listOfSecondCourseHoursInInt.add(Integer.parseInt(e.getText().substring(0,2)));
	}
	for(int i: listOfSecondCourseHoursInInt)
	{
		secondCourseHours=secondCourseHours+i;
	}
	courseHours.add(Integer.toString(secondCourseHours));
	courseRatings.add(secondCourseRating.getText());
}
	
	//Sol6  
	//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
	




}

