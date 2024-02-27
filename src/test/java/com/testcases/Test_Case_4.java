package com.testcases;
//Description: User is able to Scroll up/down the web page
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Case_4 {
	
	@Test
	public void Test1() throws Throwable{
		 
		WebDriver driver;

		//Creating an object of ChromeDriver
		driver = new ChromeDriver();
		
		//launching the specified URL 
		driver.get("https://www.entrata.com/");
		
		//It will maximize the window
		driver.manage().window().maximize();
		
		//It will click on Accept Cookies pop-up
		WebElement ele = driver.findElement(By.xpath("//div//button[contains(text(),'Accept Cookies')]"));
		ele.click();
		Thread.sleep(4000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,6500)", "");//It will Scroll to the end of web page
		Thread.sleep(4000);
		
		js.executeScript("window.scrollBy(0,-6500)", "");//It will Scroll up to the top of web page
		Thread.sleep(4000);
		
		driver.close();//It will close current running window of the Chrome
		
		
	}
}


