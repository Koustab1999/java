package com.valuemomentum.training.testautomation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class text {
	  public static void main(String[] args) throws Exception {
		 
	 
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\koustabj\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        //calling web Driver
	                WebDriver driver=new ChromeDriver();
	                driver.manage().window().maximize();    
	                driver.get("http://www.amazon.in");
	                Thread.sleep(3000);
	                 
	                WebElement e = driver.findElement(By.xpath("(//*[text()='Mobiles'])[3]"));
	                
	                System.out.println("Text of element " +e.getText());
	                
	                System.out.println("Font of element " +e.getCssValue("font"));
	                
	                System.out.println("Color of element " +e.getCssValue("color"));
	                
	                System.out.println("Dom attribute of the element "+e.getDomAttribute("data-csa-c-content-id"));
	                
	                System.out.println("Font family of element " +e.getCssValue("font family"));
	                
	                
	                Rectangle rect = driver.findElement(By.xpath("(//*[contains(text(),'Cart')])[1]")).getRect();
	                System.out.println(" height value of "+ rect.getHeight());
	                
	                System.out.println(" Width value of "+ rect.getWidth());
	                
	                System.out.println(" X value of "+ rect.getX());
	                
	                System.out.println(" Y value of "+ rect.getY());
	                
	                System.out.println(" Dimensions value of "+ rect.getDimension());
	                
	                System.out.println(" Point value of "+ rect.getPoint());
	                
	                
	                
	                


	                

}
}
