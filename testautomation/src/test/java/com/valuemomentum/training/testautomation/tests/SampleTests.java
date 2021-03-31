package com.valuemomentum.training.testautomation.tests;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SampleTests {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\koustabj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver","C:\\Users\\koustabj\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		 WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new EdgeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
        Thread.sleep(5000);
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().refresh();
		
		
		System.out.println("Title name = "+driver.getTitle());
		System.out.println(" Current URL = "+ driver.getCurrentUrl());
        System.out.println(" Windows details "+ driver.getWindowHandle());
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
        
        driver.navigate().back();
        driver.navigate().forward();
        String currentWindow =  driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> ite = windows.iterator();
        while(ite.hasNext()) {
            String newWindow=ite.next();
            if(!currentWindow.equals(newWindow)) {
                driver.switchTo().window(newWindow);
            }
        }
        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(4000);
        //driver.findElement(By.id("dropdownLangauge")).click();
        //Thread.sleep(5000);
        //driver.findElement(By.xpath("//*[@id=\"fr\"]")).click();
        driver.close();
        driver.quit();
	}
}