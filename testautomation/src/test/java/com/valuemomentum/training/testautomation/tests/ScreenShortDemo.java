package com.valuemomentum.training.testautomation.tests;

 

import java.io.File;
import java.io.IOException;

 

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class ScreenShortDemo {
    public static void main(String args[]) throws IOException, InterruptedException {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\koustabj\\Downloads\\chromedriver_win32\\chromedriver.exe");

 

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.amazon.in");
        Thread.sleep(3000);
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./ScreenShot/image.png"));
        Thread.sleep(3000);
      
        
       // FileUtils.copyFile(scrFile, new File("C:\\QA Training\\screenshots\\image_"+text+".png"));
        driver.close();
        driver.quit();
    }
}