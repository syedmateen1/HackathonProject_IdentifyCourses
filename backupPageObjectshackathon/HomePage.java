package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	
	
	public HomePage(WebDriver d)
	{
		super(d);
	}
	
@FindBy(xpath="//*[@placeholder='What do you want to learn?']") 
WebElement searchInputBox;

@FindBy(xpath="//button[@class=\"nostyle search-button\"]//div[@class=\"magnifier-wrapper\"]//*[name()=\"svg\"]") 
WebElement searchButton;



public void clickSearchInputBox()
{
	searchInputBox.click();
}

public void searchCourse()
{
	searchInputBox.sendKeys("web development courses");
}

public void clickSearchButton()
{
	searchButton.click();
}

}
