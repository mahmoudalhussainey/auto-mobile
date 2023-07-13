package org.mahmoudalhussainey.pageObjects.android;

import java.util.List;

import org.mahmoudalhussainey.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TaskCPage extends AndroidActions {

	AndroidDriver driver;

	@AndroidFindBy(className = "android.widget.EditText")
	private WebElement search;

	@AndroidFindBy(xpath = "")
	private WebElement taskname;

	@AndroidFindBy(id = "")
	private WebElement Cardtext;

//	driver.findElement(By.id("android:id/button1")).click();
	@AndroidFindBy(xpath="Filter")
	private WebElement Filter;
	@AndroidFindBy(id="calender")
	private WebElement calender;
	@AndroidFindBy(accessibility="Next month")
	private WebElement calendermounth;
	@AndroidFindBy(accessibility="14 August 2023")
	private WebElement calenderday;
	@AndroidFindBy(id="android:id/button1")
	private WebElement okbut;
	@AndroidFindBy(xpath="//android.widget.StatusView)[5]")
	private WebElement Laststatus; 
	@AndroidFindBy(xpath="Filter")
	private WebElement Filter2;
	@AndroidFindBy(xpath="Reset button")
	private WebElement resst;
	

//	driver.findElement(By.id("")).click();
	@AndroidFindBy(xpath="")
	private WebElement changestatus;
	@AndroidFindBy(id="")
	private WebElement cancel;
	@AndroidFindBy(xpath="")
	private WebElement drawer;
	@AndroidFindBy(accessibility="")
	private WebElement createicon;
	@AndroidFindBy(id="")
	private WebElement field;
	@AndroidFindBy(id="")
	private WebElement taskvalue;
	@AndroidFindBy(xpath="")
	private WebElement desfield;
	@AndroidFindBy(className="")
	private WebElement description;
	
	
	@AndroidFindBy(id="calender")
	private WebElement calender1;
	@AndroidFindBy(accessibility="Next month")
	private WebElement calendermounth1;
	@AndroidFindBy(accessibility="14 August 2023")
	private WebElement calenderday1;
	@AndroidFindBy(id="android:id/button1")
	private WebElement okbut1;
	
	@AndroidFindBy(xpath="")
	private WebElement assigneeclick;
	@AndroidFindBy(xpath="")
	private WebElement chooseassingee;
	@AndroidFindBy(id="")
	private WebElement createbtn;

	

	public TaskCPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	public void Searchfield() {
		search.click();
//		return null;

	}

	public void TaskName(String task1) {
		taskname.sendKeys(task1);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}

	public String cardtext(String text) {
		return Cardtext.getText();

	}
	public void AdvancedFilter()
	{
		
		Filter.click();
	}
	public void Calenderr()
	{
		
		calender.click();
	}
	
	public void mounth()
	{
		calendermounth.click();
		
	}
	public void day()
	{
		calenderday.click();
		
	}
	public void OKbut()
	{
		okbut.click();
		
	}
	public void LASTSTATUS()
	{
		Laststatus.click();
SwipeAction(Laststatus, "Left");

	}
	public void Filteration()
	{
		Filter2.click();
		
	}
	public void RESET()
	{
		
		resst.click();
	}
	public void CHANGE()
	{
		changestatus.click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Cancelled\"));"));
		ScrollToEndAction();
		
	}
	public void CANCEL()
	{
		cancel.click();
		
	}
	public void DRWER()
	{
		drawer.click();
		
		
	}
	public void Create()
	{
		createicon.click();
		
	}
	public void FIELD()
	{
		field.click();
		
	}
	public void TASKVALUE(String value) {
		taskvalue.sendKeys(value);
	}
	public void DESFIELD()
	{
		desfield.click();
			
	}
	public void DESCRIPTION(String value1) {
		description.sendKeys(value1);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	public void CALENDER()
	{
		
		calender1.click();
	}
	
	public void MOUNTH()
	{
		calendermounth1.click();
		
	}
	public void DAY()
	{
		calenderday1.click();
		
	}
	public void OKBTN()
	{
		okbut1.click();
		
	}
	public void ASSIGNEECLICK()
	{
		assigneeclick.click();
		
	}
	public void CHOSSEEASSIGNEE()
	{
		chooseassingee.click();
		
	}
	public void CREATEBTN()
	{
		
		createbtn.click();
		
	}
	
	

}
