package com.valuemomentum.training.testautomation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class Web_ElementDemo {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\koustabj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //calling web Driver
                WebDriver driver=new ChromeDriver();
                driver.manage().window().maximize();    
                driver.get("http://www.amazon.in");
                Thread.sleep(3000);
                
                
                WebElement newReleases=driver.findElement(By.xpath("(//*[contains(text(),'Cart')])[1]"));
                System.out.println("Text of the Element :"+newReleases.getText());
                System.out.println("Arial Role of the Element :"+newReleases.getAriaRole()); // ?
                System.out.println("Accessible  of the Element :"+newReleases.getAccessibleName());
                System.out.println("Height of the Element :"+newReleases.getCssValue("line-height"));
                System.out.println("Font-Family of the Element :"+newReleases.getCssValue("font-family"));
                System.out.println("Color of the Element :"+newReleases.getCssValue("color"));
                System.out.println("Attribute "+newReleases.getAttribute("class"));
                System.out.println("DomAttribute "+newReleases.getDomAttribute("class"));
                System.out.println("Tag name " + newReleases.getTagName());
                
                driver.close();
                driver.quit();
 

 


                }

 

}
