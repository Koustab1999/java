package com.valuemomentum.training.testautomation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class KeyBoardActions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\koustabj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver","C:\\Users\\koustabj\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		 //  System.setProperty("webdriver.chrome.driver","C:\\Chrome_driver\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new EdgeDriver();
		
		driver.navigate().to("https://www.google.co.in/");
        Thread.sleep(5000);
       // driver.navigate().refresh();
		
		
		//System.out.println("Title name = "+driver.getTitle());
		//System.out.println(" Current URL = "+ driver.getCurrentUrl());
      //  System.out.println(" Windows details "+ driver.getWindowHandle());
        WebElement element = driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
        element.sendKeys("iphone"+Keys.ENTER);
        // driver.findElement(By.xpath("//*[@class='gLFyf gsfi'])").sendKeys("iphone"+Keys.ENTER);
        driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys(Keys.DOWN);
        driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys(Keys.DOWN);
        driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys(Keys.DOWN);
        
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys(Keys.DOWN);
        driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys(Keys.DOWN);
        driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys(Keys.DOWN);
        driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys(Keys.DOWN);
        
        driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
     
     


}
}
