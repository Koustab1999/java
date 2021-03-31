
    
package com.valuemomentum.training.testautomation.tests;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;

 

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

 

public class SampleTest3 {

	String baseURL;
	static String nodeURL;
	
		static WebDriver driver;	
			


    public static void main(String[] args) throws InterruptedException, MalformedURLException {
    	nodeURL = "http://192.168.1.194:5555";
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setBrowserName("chrome");
      //  capability.setPlatform(Platform.WIN10);
        driver = new RemoteWebDriver(new URL(nodeURL), capability);

    //	 System.setProperty("webdriver.chrome.driver","C:\\Users\\koustabj\\Downloads\\chromedriver_win32\\chromedriver.exe");
    //    WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.amazon.in");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Mobiles")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Samsung")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Over ₹20,000")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Last 30 days")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/h2/a/span")).click();
        Thread.sleep(3000);
        String currentWindow =  driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> ite = windows.iterator();
        while(ite.hasNext()) {
            String newWindow=ite.next();
            if(!currentWindow.equals(newWindow)) {
                driver.switchTo().window(newWindow);
            }
        }
        //with exchage
        driver.findElement(By.xpath("//*[@id=\"buyBackAccordionRow\"]/div/div[1]/a/h5/div[1]/span/span")).click();
        Thread.sleep(3000);
        //choose phone to exchange
        driver.findElement(By.xpath("//*[@id=\"chooseButton\"]/span/input")).click();
        Thread.sleep(3000);
        //phone drop down
        driver.findElement(By.xpath("//*[@id=\"buyBackDropDown1Id\"]/span/span")).click();
        Thread.sleep(3000);
        //choose apple from drop down
        driver.findElement(By.xpath("//*[@id=\"buyBackDropDown1_2\"]")).click();
        Thread.sleep(3000);
        //model drop down
        driver.findElement(By.xpath("//*[@id=\"AppleId\"]/span/span")).click();
        Thread.sleep(3000);
        //choode model from drop down
        driver.findElement(By.xpath("//*[@id=\"Apple_2\"]")).click();
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        
    }

 

}
 