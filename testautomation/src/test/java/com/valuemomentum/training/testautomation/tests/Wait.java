package com.valuemomentum.training.testautomation.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait {
	// impilicit wait 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\koustabj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver","C:\\Users\\koustabj\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		 WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new EdgeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().refresh();
		

}
}
