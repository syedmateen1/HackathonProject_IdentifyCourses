package testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.FirstPage;
import pageObjects.HomePage;
import pageObjects.SecondPage;
import pageObjects.WebDevelopmentPage;
import testBase.BaseClass;

public class testcase1 extends BaseClass{
	
	@Test
	public void test() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.clickSearchInputBox();
		hp.searchCourse();
		hp.clickSearchButton();
		
        WebDevelopmentPage wdp=new WebDevelopmentPage(driver);
        Thread.sleep(3000);
        wdp.clickEnglishCheckBox();
        wdp.clickBeginnerCheckBox();
        wdp.getParentWindow(driver);
        Thread.sleep(3000);
        
        
        
       
        
        
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, -document.bodyscrollHeight)");
        
        
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOf(wdp.secondCourse));
        
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='css-1evtm7z']")));
        
        
        wdp.clickFirstCourse();
        
        wdp.clickSecondCourse();
        FirstPage fp=new FirstPage(driver);
        Thread.sleep(3000);
        fp.getWindowHandles();
        
        
        
        fp.firstCourseDetails();
        
        SecondPage sp=new SecondPage(driver);
        sp.secondCourseDetails();
        for(String c:WebDevelopmentPage.courseTitles)
        {
        System.out.println(c);
        }
        for(String h : WebDevelopmentPage.courseHours )
        {
        	System.out.println(h);
        }
        for(String r: WebDevelopmentPage.courseRatings)
        {
        	System.out.println(r);
        }
        	
        	
        
//		
//		regpage.setFirstName(randomeString().toUpperCase());
//		regpage.setLastName(randomeString().toUpperCase());
//		regpage.setEmail(randomeString()+"@gmail.com");// randomly generated the email
//		regpage.setTelephone(randomeNumber());
//		
//		String password=randomAlphaNumeric();
//		
//		regpage.setPassword(password);
//		regpage.setConfirmPassword(password);
//		
//		regpage.setPrivacyPolicy();
//		regpage.clickContinue();
//		
//		String confmsg=regpage.getConfirmationMsg();
//		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		
	}
	
	
	
	
}








