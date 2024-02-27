package com.testcases;
//Description: User is able to Navigate to URL and Accept Cookies
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Case_1 {

	@Test
	public void Test1() throws Throwable{
		 
		WebDriver driver;

		//Creating an object of ChromeDriver
		driver = new ChromeDriver();
		
		//launching the specified URL 
		driver.get("https://www.entrata.com/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//div//button[contains(text(),'Accept Cookies')]"));
		ele.click();
		Thread.sleep(2000);
		
	
		driver.close();//it will close current running window of the Chrome
		
		
	}
}


