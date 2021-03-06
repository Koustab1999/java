package com.valuemomentum.training.testautomation.tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class YouTube {
	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\koustabj\\Downloads\\chromedriver_win32\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.co.in/");
		// Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
			//				.pollingEvery(Duration.ofMillis(1)).ignoring(NoSuchElementException.class);
		
		 
	       // Thread.sleep(4000);
	WebElement element = driver.findElement(By.xpath("//*[@class = 'gLFyf gsfi']"));
	element.sendKeys("YouTube"+Keys.ENTER);
	
	 Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
						.pollingEvery(Duration.ofMillis(1)).ignoring(NoSuchElementException.class);
	
	driver.findElement(By.xpath("(//*[@class='iUh30 Zu0yb tjvcx'])[1]")).click();
	
	WebElement element1 =  driver.findElement(By.id("search"));
	element1.sendKeys("brown munde"+Keys.ENTER);
	
	 Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(1)).ignoring(NoSuchElementException.class);
	 
	 
	File Menupage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
	try {
		
		FileUtils.copyFile(Menupage, new File("C:\\Training\\Java\\testautomation\\ScreenShot\\YouTube.png"));
	} 
	catch (IOException e) 
	{
		
		e.printStackTrace();
	}
	
	WebElement element2= driver.findElement(By.xpath("//*[@class='style-scope ytd-video-renderer'][2]"));
	element2.click();
	Thread.sleep(3000);
			
	//driver.findElement(By.xpath("(//*[@class='ytp-player-content ytp-iv-player-content'])[1]"));
	//Thread.sleep(10000);
	
	driver.findElement(By.xpath("//*[@class='ytp-play-button ytp-button']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@class='ytp-play-button ytp-button']")).click();
	driver.quit();
	driver.close();
	

		
		

		
	}

}



