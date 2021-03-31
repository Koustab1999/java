package com.valuemomentum.training.testautomation.tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest4 {
	WebDriver driver;

	@BeforeTest
	public void test_beforesuite() {
		System.out.println(" Before Suite");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\koustabj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		System.out.println(" After Suite");
		driver.close();
		driver.quit();
	}

	@Test
	public void MedplustTest() {
		System.out.println(" Test ");
		driver.get("https://www.medplusmart.com");
		System.out.println("Title name =" + driver.getTitle());

		// attach Screenshot
		File HomePage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(HomePage, new File("C:\\Training\\Java\\testautomation\\ScreenShot\\HomePage.png"));
		} catch (IOException e) {
		
			e.printStackTrace();
		}

		driver.navigate().refresh();

		// Click on the hamburger and select the Personal Care
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//*[contains(text(),'Health Store')])[2]"))).perform();
		
		
		// attach Screenshot
		File Menupage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		try {
			
			FileUtils.copyFile(Menupage, new File("C:\\Training\\Java\\testautomation\\ScreenShot\\Menupage.png"));
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(1)).ignoring(NoSuchElementException.class);
		WebElement next = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(
						By.xpath("//*[contains(@class,'cate-main') and contains(@title,'Personal Care')]\r\n"));
			}

		});
		next.click();

		System.out.println("Home page name =" + driver.getTitle());
		// attach Screenshot
		File PersonalCareMenu = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(PersonalCareMenu, new File("C:\\Training\\Java\\testautomation\\ScreenShot\\PersonalCareMenu.png"));
		} catch (IOException e) {

			e.printStackTrace();
		}

		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(1)).ignoring(NoSuchElementException.class);
		WebElement next1 = wait1.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//*[@id=\"leftNav_MART_20004\"]/a"));}
		});
		next1.click();
		// attach Screenshot
		File OralCareMenu = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(OralCareMenu, new File("C:\\Training\\Java\\testautomation\\ScreenShot\\OralCareMenu.png"));
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Personal care page name =" + driver.getTitle());
		Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(1)).ignoring(NoSuchElementException.class);
		WebElement next2 = wait2.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//*[@id=\"leftNav_MART_30046\"]/a"));

}
		});
        next2.click();
		System.out.println("oral care page name =" + driver.getTitle());
		Wait<WebDriver> wait3 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(1)).ignoring(NoSuchElementException.class);
		WebElement slider = wait3.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//*[@id=\"PriceRange\"]"));

}
		});
		
		act.dragAndDropBy(slider, -35, 0).build().perform();
		// attach Screenshot

		WebElement price = driver.findElement(By.className("price"));
		File slider1 = price.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(slider1, new File("C:\\Training\\Java\\testautomation\\ScreenShot\\slider.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Toothpaste page name =" + driver.getTitle());
		Wait<WebDriver> wait4 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(1)).ignoring(NoSuchElementException.class);
		WebElement next4 = wait4.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("(//*[@id=\"PEPS0011_dropdownMenu\"])[2]"));

}
		});
		next4.click();

		WebElement Product1Grams = driver.findElement(By.linkText("70 grams - Rs 55.00"));

		Product1Grams.click();
		String product1 = driver.findElement(By.xpath(
				"//*[contains(@class,'productName') and contains(text(),'PEPSODENT EXPERT PROTECTION GUMCARE TOOTHPASTE 70GM')]"))
				.getText();

		System.out.println("Item Selected:" + Product1Grams);
		System.out.println("Grams:" + product1);
		Wait<WebDriver> wait5 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(1)).ignoring(NoSuchElementException.class);
		WebElement next5 = wait5.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("(//*[contains(text(),'Add to Cart')])[2]"));

}
		});
		next5.click();
		// attach Screenshot

		WebElement Item1= driver.findElement(By.xpath("//*[@id=\"addMoreProducts\"]/div[1]"));
		File item1 = Item1.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(item1, new File("C:\\Training\\Java\\testautomation\\ScreenShot\\item1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Wait<WebDriver> wait6 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(1)).ignoring(NoSuchElementException.class);
		WebElement next6 = wait6.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("(//*[@id=\"PEPS0017_dropdownMenu\"])[2]"));

}
		});
		next6.click();
		
		

		WebElement Product2Grams = driver.findElement(By.linkText("80 grams - Rs 50.00"));

		Product2Grams.click();
		String product2 = driver.findElement(By.xpath(
				"//*[contains(@class,'productName') and contains(text(),'PEPSODENT GERMICHECK 2IN1 TOOTHPASTE 150GM')]"))
				.getText();
		System.out.println("Item Selected:" + product2);
		System.out.println("Grams:" + product2);
		System.out.println();
		Wait<WebDriver> wait7 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(1)).ignoring(NoSuchElementException.class);
		WebElement next7 = wait7.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("(//*[contains(text(),'Add to Cart')])[6]"));

}
		});
		next7.click();
		
		// attach Screenshot

		WebElement Item2 = driver.findElement(By.xpath("//*[@id=\"addMoreProducts\"]/div[2]"));
		File item2 = Item2.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(item2, new File("C:\\Training\\Java\\testautomation\\ScreenShot\\item2.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Wait<WebDriver> wait8 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(1)).ignoring(NoSuchElementException.class);
		WebElement next8 = wait8.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//*[@id=\"miniCartDiv\"]"));

			}
		});
		next8.click();
		// attach Screenshot

		WebElement cart =driver.findElement(By.xpath("//*[@id=\"miniCartDiv\"]/div"));
		File Cart = cart.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(Cart, new File("C:\\QA Training\\screenshots\\Cart.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String cartProduct1 = driver.findElement(By.xpath("//*[@id=\"cartTableBody\"]/tr[1]/td[1]")).getText();
		String cartProduct2 = driver.findElement(By.xpath("//*[@id=\"cartTableBody\"]/tr[2]/td[1]")).getText();
		System.out.println("Seleceted Items 1 :" + cartProduct1);
		System.out.println("                2:" + cartProduct2);

		if (cartProduct1.contentEquals(product1) && (cartProduct2.contentEquals(product2))) {
			System.out.println("The item selected and displayed are same(TRUE)");
		}
		driver.findElement(By.xpath("//*[@id=\"pharmaCheckOutBtn\"]")).click();
		// attach Screenshot

		File checkout = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(checkout, new File("C:\\Training\\Java\\testautomation\\ScreenShot\\checkout.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Dimension size = driver.manage().window().getSize();
	        int width1 = size.getWidth();
	        int height1 = size.getHeight();
	        driver.manage().window().setSize(new Dimension(998, 670));
	        System.out.println("Width of screen "+width1);
	        System.out.println("Height of the screen "+height1);
	        
	        Point position = driver.manage().window().getPosition(); 
	        int x1 = position.getX(); 
	        int y1 = position.getY();
	        System.out.println("Position of x "+x1);
	        System.out.println("Position of y "+y1);
	        driver.manage().window().setPosition(new Point(1100, 1100));   
	   
		System.out.println("title of the sign in page =" + driver.getTitle());
		
		
	}

}
