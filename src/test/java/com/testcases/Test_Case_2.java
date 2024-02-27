package com.testcases;
//Description: User is able to Navigate Menu in the Header
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Case_2 {
	
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
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Products')]"))).build().perform();
		Thread.sleep(2000);
		
		Assert.assertEquals("Utilities", "Utilities");
		Thread.sleep(2000);
		
		action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Solutions')]"))).build().perform();
		Thread.sleep(2000);
		
		Assert.assertEquals("All Solutions", "All Solutions");
		Thread.sleep(2000);
		
		action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Resources')]"))).build().perform();
		Thread.sleep(2000);
		
		Assert.assertEquals("All Resources", "All Resources");
		
		Thread.sleep(2000);
		
		action.moveToElement(driver.findElement(By.xpath("//div//a[contains(@class,'main-nav-link')]"))).build().perform();
		
		Thread.sleep(2000);
		
		driver.close();//It will close current running window of the Chrome
		
		
	}
}


