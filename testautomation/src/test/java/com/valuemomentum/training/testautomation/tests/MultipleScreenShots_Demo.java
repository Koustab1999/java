package com.valuemomentum.training.testautomation.tests;

import java.io.File;
import java.io.IOException;
import java.util.List;

 

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class MultipleScreenShots_Demo {
    public static void main(String[] args) throws Exception {
     	System.setProperty("webdriver.chrome.driver","C:\\Users\\koustabj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        // calling web Driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.amazon.in");
        Thread.sleep(5000);
        
        
        // step:1 identify the elements for find Elements()
        List<WebElement> menuitems = driver.findElements(By.xpath("//*[@id=\"nav-xshop\"]/a"));
        System.out.println("Size of MenuItems :" + menuitems.size());
        
        
         File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         try {
            FileUtils.copyFile(scrFile, new File("C:\\QA Training\\screenshots\\sc1.png"));
         }
         catch (IOException e) {
             e.printStackTrace();
         }
         
         for(WebElement w:menuitems ) {
             String text=w.getText();
             System.out.println("Menu value: "+w.getText());
             try {
                    FileUtils.copyFile(scrFile, new File("C:\\QA Training\\screenshots\\image_"+text+".png"));
                 }
                 catch (IOException e) {
                     e.printStackTrace();
                 }
             
         }
         Thread.sleep(2000);
         driver.close();
         driver.quit();

 

    }
}
 