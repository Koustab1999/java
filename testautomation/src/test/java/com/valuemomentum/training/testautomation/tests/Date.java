package com.valuemomentum.training.testautomation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date {
	
	  public static void main(String[] args) throws InterruptedException {
          System.setProperty("webdriver.chrome.driver","C:\\Users\\koustabj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        
          WebDriver driver= new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://paytm.com/flights");
          Thread.sleep(10000);
          
          WebElement depdate = driver.findElement(By.xpath("(//*[@class='_3jkx'])[1]"));
          depdate.click();
        //  driver.findElement(By.name("Departure-Date")).getAttribute("20 Mar 2021");
          

}
}
