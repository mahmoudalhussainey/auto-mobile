package org.mahmoudalhussainey.pageObjects.android;

import org.mahmoudalhussainey.utils.AndroidActions;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LogInPage extends AndroidActions {
	AndroidDriver driver;// Local Object variable class

	public LogInPage(AndroidDriver driver) {
		super (driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(xpath = "") 
	private WebElement title;
	@AndroidFindBy(className= "")
	private WebElement title2;
	@AndroidFindBy(xpath = "")
	private WebElement nextbutton;
//
//	driver.findElement(By.id("")).sendKeys("123456");

	@AndroidFindBy(id="")
	private WebElement next2;

	@AndroidFindBy(xpath="")
	private WebElement phone;
	@AndroidFindBy(className="")
	private WebElement Ok;
	
	@AndroidFindBy(className="")
	private WebElement otp;


	// Actions
	public String validatetitle(String title) {
		
		return driver.getTitle();

	}
public String validatetitle2(String title2) {
		
		return driver.getTitle();

	}
public void NextButton() throws InterruptedException
{
	nextbutton.click();
	Thread.sleep(3000);


}
public void NextButton2() 
{
	nextbutton.click();
	
}
public void PhoneNum(String phone1)
{
	phone.sendKeys(phone1);

}
public void submit()
{
	
	Ok.click();
}
public TaskCPage OTP(String OTP1)
{
	phone.sendKeys(OTP1);
	return	new TaskCPage(driver);


}

	
		
	}


