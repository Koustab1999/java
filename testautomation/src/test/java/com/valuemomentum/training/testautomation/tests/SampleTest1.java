package com.valuemomentum.training.testautomation.tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest1 { // Today's Deals in amazon

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\koustabj\\Downloads\\chromedriver_win32\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
	        Thread.sleep(4000);
		 driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.id("dealTitle")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.id("add-to-cart-button")).click();
		// driver.findElement(By.xpath("//*[text()=' Electronics ']")).click();
		 //driver.findElement(By.xpath("//*[@id=\"octopus-dlp-asin-stream\"]/ul/li[1]/span/div/div[2]/div[1]")).click();
		// Thread.sleep(4000);

		 //driver.findElement(By.id("add-to-cart-button")).click();
	}

}
