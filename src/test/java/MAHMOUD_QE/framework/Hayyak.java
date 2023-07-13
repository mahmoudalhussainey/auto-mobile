package MAHMOUD_QE.framework;

import org.mahmoudalhussainey.pageObjects.android.TaskCPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

//import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.Test;

import java.net.MalformedURLException;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Hayyak extends BaseTest {

	@Test(priority = 1, description = "Validate Login  is enabled when user enter  phone number in filled")
	public void Log_in() throws MalformedURLException, InterruptedException {
		loginpage.validatetitle("Delegate your tasks effortlessly");

		String title = loginpage.validatetitle("Delegate your tasks effortlessly");
		Assert.assertEquals(title, "Delegate your tasks effortlessly");

		loginpage.validatetitle2("Delegate your tasks effortlessly");

		String title2 = loginpage.validatetitle2("Watch as our virtual assistant takes care of everything");
		Assert.assertEquals(title2, "Watch as our virtual assistant takes care of everything");

		loginpage.NextButton();
		loginpage.NextButton2();
		loginpage.PhoneNum("787979494");
		loginpage.submit();
//		loginpage.OTP("123456");
		TaskCPage taskpage = loginpage.OTP("123456");

	}

	@Test(priority = 2, description = "Validate The client can search about any task")
	public void Task_search() throws MalformedURLException, InterruptedException {
		taskpage.Searchfield();
		taskpage.TaskName("mahmoud 33");

		String text = taskpage.cardtext("mahmoud 33");
		Assert.assertEquals(text, "mahmoud 33");
		Assert.assertTrue(driver.findElement(By.id("")).isDisplayed());

		driver.findElement(AppiumBy.className("android.widget.EditText")).click();
		driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("mahmoud 33");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		String Cardtext = driver.findElement(By.id("")).getText();
		Assert.assertEquals(Cardtext, "mahmoud 33");
		Assert.assertTrue(driver.findElement(By.id("")).isDisplayed());

	}
	@Test(priority=3,description = "Advanced Filter")
	public void Advanced_Filter() throws MalformedURLException, InterruptedException {
		taskpage.AdvancedFilter();
		taskpage.Calenderr();
		taskpage.mounth();
		taskpage.day();
		taskpage.OKbut();
		taskpage.LASTSTATUS();
		Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.StatusView)[5]")).getAttribute("focusable"),
		"true");

      Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.StatusView)[5]")).getAttribute("focusable"),
		"false");
      Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@content-desc='all. Tasks Task\\']"))
				.isDisplayed());
         taskpage.Filteration();
         taskpage.RESET();
	
     }

@Test(priority=4,description="Validate the user can convert the status")
public void Change_Status() {
	
	taskpage.CHANGE();
	taskpage.CANCEL();
	String status = driver.findElement(By.id("")).getText();
	Assert.assertEquals(status, "Cancelled");
	Assert.assertTrue(driver.findElement(By.id("")).isDisplayed());
}
  @Test(priority=5,description="Validate if user can create task")
  public void Create_To_Do() {
	  taskpage.DRWER();
	  taskpage.Create();
	  taskpage.FIELD();
	  taskpage.TASKVALUE("MAHMOUD");
	  taskpage.DESFIELD();
	  taskpage.DESCRIPTION("Hello dear this task for testing");
	  taskpage.CALENDER();
	  taskpage.MOUNTH();
	  taskpage.DAY();
	  taskpage.OKBTN();
	  taskpage.ASSIGNEECLICK();
	  taskpage.CHOSSEEASSIGNEE();
	  taskpage.CREATEBTN();
	  Assert.assertTrue(driver.findElement(By.id("")).isDisplayed());

	  
	  
	  
	  
}

}
