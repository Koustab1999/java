package com.valuemomentum.training.testautomation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest2 {

	public static void main(String[] args) throws InterruptedException {
	
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\koustabj\\Downloads\\chromedriver_win32\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"sobe_d_b_5_2\"]/div/a")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[4]/h2/a/span")).click();
		// driver.switchTo().newWindow(WindowType.TAB);
		 driver.findElement(By.id("add-to-cart-button")).click();
		 Thread.sleep(2000);

		 
		 
	}
	

}
