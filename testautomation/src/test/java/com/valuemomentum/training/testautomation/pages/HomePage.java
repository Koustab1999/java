package com.valuemomentum.training.testautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {




	public HomePage(WebDriver driver) {
		super(driver);

	}

	
	@FindBy(xpath ="//*[contains(@class,'nav-a  ')and contains(text(),'Mobiles')]")
	
	
	private WebElement _btnMobile;


	public MobilesPage clickOnMobile() {
		_btnMobile.click();
		return new MobilesPage(driver);
	}

	}