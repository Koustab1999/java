package com.valuemomentum.training.testautomation.tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
	   public static void main(String args[]) throws IOException, InterruptedException {
  	System.setProperty("webdriver.chrome.driver","C:\\Users\\koustabj\\Downloads\\chromedriver_win32\\chromedriver.exe");

  	 

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://www.amazon.in");
    Thread.sleep(3000);
    
    driver.findElement(By.linkText("Best Sellers")).click();
  	Thread.sleep(3000);
  	
  	driver.findElement(By.linkText("Music")).click();
  	Thread.sleep(3000);
  	
  	driver.findElement(By.linkText("Shaan and the Music of Shaan")).click();
  	Thread.sleep(3000);
  	
  	driver.findElement(By.id("add-to-cart-button")).click();
  	Thread.sleep(3000);
  	
  	driver.navigate().back();
  	
  	driver.findElement(By.linkText("Rocky and the Music of Rocky")).click();
  	driver.findElement(By.id("add-to-cart-button")).click();
  	Thread.sleep(3000);
  	
  	
  	
  	driver.close();
  	driver.quit();
  

  	 /*List<WebElement> menuItem= driver.findElements(By.xpath("//*[@id='nav-xshop']"));
  	  System.out.println("Size of the Element "+menuItem.size());
  	    
  	  	for(WebElement value : menuItem)
  	      System.out.println("menu value"+value.getText());*/
  	  	
  	
  	
  	
   
}
}
