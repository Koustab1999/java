package com.valuemomentum.training.testautomation.tests;

import org.testng.annotations.Test;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.valuemomentum.training.testautomation.pages.ProductPage;
import com.aventstack.extentreports.Status;
import com.valuemomentum.training.testautomation.pages.HomePage;
import com.valuemomentum.training.testautomation.pages.MobilesPage;
import com.valuemomentum.training.testautomation.pages.ProductDetailsPage;
import com.valuemomentum.training.testautomation.utils.BaseTest;
import com.valuemomentum.training.testautomation.utils.WebDriverHelper;


public class SmokeTest2 extends BaseTest{
	private static final Logger logger=(Logger) LogManager.getLogger(SmokeTest2.class);
	WebDriver driver;
	HomePage homePage;
	ProductDetailsPage productDetailsPage1;
	MobilesPage mobilesPage;
	ProductPage ProductPage1;
	
	@BeforeClass
	public void setup() {
		logger.info("Setup method called");
		this.driver = getDriver();
		homePage=new HomePage(driver);
		
	}

	@Test
	public void Assessment2() throws InterruptedException, IOException {
		logger.info("Home Page method called");
		
		mobilesPage=homePage.clickOnMobile();
	
		
		Thread.sleep(2000);
		
		logger.info("MobilePage method called");
		
		ProductPage1=mobilesPage.clickOnSeller();
		
		logger.info("Filter Result Page method called");
		
		productDetailsPage1=ProductPage1.clickOnItem();
		Thread.sleep(2000);
		
		logger.info("Product Details Page method called");
	
		productDetailsPage1.clickOnAddToCart();
		Thread.sleep(5000);
		logger.info("Test Ended");
		
		
	
		
	}

		
		
		
	}

