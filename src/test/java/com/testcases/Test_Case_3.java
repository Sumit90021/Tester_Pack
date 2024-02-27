package com.testcases;
//Description: User is able to Navigate to Watch Demo and Fill the Details in the Form
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Case_3 {
	
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
		
		WebElement ele1=driver.findElement(By.xpath("//div[3]//a[contains(text(),'Watch Demo')]"));
		ele1.click();
		Thread.sleep(4000);
		
		//Actions action = new Actions(driver);
		driver.findElement(By.xpath("//div[contains(@class,'mktoFieldWrap mktoRequiredField')]//input[1][@id='FirstName']")).sendKeys("Sumit");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(@class,'mktoFieldWrap mktoRequiredField')]//input[1][@id='LastName']")).sendKeys("Sharma");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(@class,'mktoFieldWrap mktoRequiredField')]//input[1][@id='Email']")).sendKeys("test@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(@class,'mktoFieldWrap mktoRequiredField')]//input[1][@id='Company']")).sendKeys("Automation");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(@class,'mktoFieldWrap mktoRequiredField')]//input[1][@id='Phone']")).sendKeys("1234567895");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(@class,'mktoFieldWrap mktoRequiredField')]//select[@id='Unit_Count__c']")).sendKeys("100");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(@class,'mktoFieldWrap mktoRequiredField')]//input[@id='Title']")).sendKeys("QA");
		Thread.sleep(4000);
		
		
		driver.close();//It will close current running window of the Chrome
		
		
	}
}


