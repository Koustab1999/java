package com.valuemomentum.training.testautomation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\koustabj\\Downloads\\chromedriver_win32\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Amazon Pay")).click();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 driver.findElement(By.linkText("Prime")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Fashion")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.partialLinkText("Men's t - shirts & polos")).click();
		 Thread.sleep(2000);
		 

	}

}
