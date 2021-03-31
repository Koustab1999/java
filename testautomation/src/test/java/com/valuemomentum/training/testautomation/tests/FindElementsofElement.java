package com.valuemomentum.training.testautomation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsofElement {
	  public static void main(String[] args) throws InterruptedException {
          System.setProperty("webdriver.chrome.driver","C:\\Users\\koustabj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        
          WebDriver driver= new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("http://www.amazon.in");
          Thread.sleep(10000);
         
          //step1 : identify elements
       WebElement menuItem= driver.findElement(By.xpath("//*[@id='nav-xshop']"));
       WebElement value=  menuItem.findElement(By.tagName("a"));
       System.out.println("value of element: " +value.getText());
      
      
}

}
