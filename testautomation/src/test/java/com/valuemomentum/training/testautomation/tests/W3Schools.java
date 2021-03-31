package com.valuemomentum.training.testautomation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schools {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\koustabj\\Downloads\\chromedriver_win32\\chromedriver.exe");
	

		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().fullscreen();
		
		
		driver.get("https://www.w3schools.com/html/html_iframe.asp");
        Thread.sleep(3000);
        
        int frame = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Number of iframes "+frame);
        
        Dimension size = driver.manage().window().getSize();
        int width1 = size.getWidth();
        int height1 = size.getHeight();
        driver.manage().window().setSize(new Dimension(998, 670));
        System.out.println("Width of screen "+width1);
        System.out.println("Height of the screen "+height1);
        Thread.sleep(10000);
        
        Point position = driver.manage().window().getPosition(); 
        int x1 = position.getX(); 
        int y1 = position.getY();
        System.out.println("Position of x "+x1);
        System.out.println("Position of y "+y1);
        driver.manage().window().setPosition(new Point(200, 200));
        
        
        
      /*  driver.switchTo().frame(0);
        driver.findElement(By.id("topnavbtn_references")).click();
        Thread.sleep(3000);
       
        
        driver.switchTo().parentFrame();
        driver.findElement(By.id("topnavbtn_references")).click();
        Thread.sleep(3000);
      
       
        driver.switchTo().frame(0);
        driver.findElement(By.id("topnavbtn_references")).click();
        Thread.sleep(3000);
        
        
        driver.switchTo().parentFrame();
        driver.findElement(By.id("topnavbtn_references")).click();
        Thread.sleep(3000);*/
       
      

}
}
