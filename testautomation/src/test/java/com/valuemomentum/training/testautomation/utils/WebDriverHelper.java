package com.valuemomentum.training.testautomation.utils;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class WebDriverHelper extends BaseTest   {
	
	static WebDriver driver;
	/*   @BeforeTest
	   public void test_beforesuite() {
	       System.out.println(" Before Suite");
	  	 System.setProperty("webdriver.chrome.driver","C:\\Users\\koustabj\\Downloads\\chromedriver_win32\\chromedriver.exe");

	       driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.navigate().to("https://www.amazon.in/");
	   }

	   public static WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	@AfterTest
	   public void test_aftersuite() {
	       System.out.println(" After Suite");
	       driver.close();
	       driver.quit();
	}*/
	   
	public static void captureScreenshot(String MethodName) {

		 

	     File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
	     try {
	       FileUtils.copyFile(scrFile, new File("./ScreenShots/"+MethodName+".png"));
	     }
	     catch (IOException e) {
	         e.printStackTrace();
	     }
	}
	public static void switchToWindow()
	{
		String currentWindow = getDriver().getWindowHandle();
		Set<String> windows = getDriver().getWindowHandles();
		Iterator<String> ite = windows.iterator();
		while (ite.hasNext()) {
			String newWindow = ite.next();
			if (!currentWindow.equals(newWindow)) {
				getDriver().switchTo().window(newWindow);
			}
		}
		
	}
     
	}


