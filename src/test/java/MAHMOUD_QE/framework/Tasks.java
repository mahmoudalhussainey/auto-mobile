package MAHMOUD_QE.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;

//import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import java.net.MalformedURLException;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Tasks extends BaseTest {

	@Test(description = "Validate The client can search about any task")
	public void Task_search() throws MalformedURLException, InterruptedException {
		driver.findElement(AppiumBy.className("android.widget.EditText")).click();
		driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("mahmoud 33");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		String Cardtext = driver.findElement(By.id("")).getText();
		Assert.assertEquals(Cardtext, "mahmoud 33");
		Assert.assertTrue(driver.findElement(By.id("")).isDisplayed());

	}

	@Test(description = "Advanced Filter")
	public void Advanced_Filter() throws MalformedURLException, InterruptedException {
		driver.findElement(By.xpath("Filter")).click();
		driver.findElement(By.id("calender")).click();

		driver.findElement(AppiumBy.accessibilityId("Next month")).click();
		driver.findElement(AppiumBy.accessibilityId("14 August 2023")).click();
		driver.findElement(By.id("android:id/button1")).click();
		
		
		WebElement Laststatus = driver.findElement(By.xpath("(//android.widget.StatusView)[5]"));
		Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.StatusView)[5]")).getAttribute("focusable"),
				"true");
		SwipeAction(Laststatus, "Left");

		Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.StatusView)[5]")).getAttribute("focusable"),
				"false");
		
		
		driver.findElement(By.id("")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@content-desc='all. Tasks Task\\']"))
				.isDisplayed());
		driver.findElement(By.xpath("Filter")).click();
		driver.findElement(By.xpath("Reset button")).click();
//		WebElement Reset = driver.findElement(By.xpath(""));
//
//		((JavascriptExecutor) driver).executeScript("mobile: dragGesture",
//				ImmutableMap.of("elementId", ((RemoteWebElement) Reset).getId(), "endX",700 , "endY", 800)); Ask Eman about it
//		

	}
	@Test(description="Validate the user can convert the status")
	public void Change_Status() {
		driver.findElement(By.xpath("")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Cancelled\"));"));
		ScrollToEndAction();
		driver.findElement(By.id("")).click();
		String status = driver.findElement(By.id("")).getText();
		Assert.assertEquals(status, "Cancelled");
		Assert.assertTrue(driver.findElement(By.id("")).isDisplayed());
	}


}
