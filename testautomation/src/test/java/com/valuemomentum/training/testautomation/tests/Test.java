package com.valuemomentum.training.testautomation.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\koustabj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver dm = new ChromeDriver();
		dm.get("https://www.amazon.in/");
		
		dm.manage().window().maximize();
		File FinalPage = ((TakesScreenshot) dm).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(FinalPage, new File("C:\\Training\\Java\\testautomation\\ScreenShot\\FinalPage.png"));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		Thread.sleep(3000);
		
		
		
		dm.findElement(By.xpath("(//*[@class='nav-a  '])[7]")).click();
		Thread.sleep(3000);

		dm.findElement(By.xpath("(//*[@class='a-icon a-icon-checkbox'])[6]")).click();
		Thread.sleep(3000);

		File ProductPage = ((TakesScreenshot) dm).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(ProductPage, new File("C:\\Training\\Java\\testautomation\\ScreenShot\\ProductPage.png"));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
		
		
		
		dm.findElement(By.xpath("(//*[@class='a-size-base-plus a-color-base a-text-normal'])[4]")).click();
		Thread.sleep(3000);
		File ProductPage1 = ((TakesScreenshot) dm).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(ProductPage1, new File("C:\\Training\\Java\\testautomation\\ScreenShot\\ProductPage.png"));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
		
		
		
		
		dm.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(3000);
		
		dm.quit();
		dm.close();

		
		
	}

}
