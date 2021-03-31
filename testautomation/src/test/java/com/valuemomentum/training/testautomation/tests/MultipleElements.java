package com.valuemomentum.training.testautomation.tests;


import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {
	
	     public static void main(String[] args) throws InterruptedException {
	            System.setProperty("webdriver.chrome.driver","C:\\Chrome_driver\\chromedriver.exe");

	            WebDriver driver= new ChromeDriver();
	            driver.manage().window().maximize();
	            driver.get("http://www.amazon.in");
	            Thread.sleep(10000);
	            
	            
	           

	            //step1 : identify elements
	         List<WebElement> menuItem= driver.findElements(By.xpath("//*[@id='nav-xshop']/a"));
	         System.out.println("size of element " +menuItem.size());

	         //step 2 : print all the text values
//	         for(int i=0;i<=menuItem.size();i++) {
//	             String textvalue= menuItem.get(i).getText(); //*[@id='nav-Xshop']/a[1]
//	             System.out.println(" menu item value = " +textvalue);
//	         }


	         for(WebElement value :menuItem)
	             System.out.println("menu value"+value.getText());

}
}
