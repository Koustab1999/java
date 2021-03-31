package com.valuemomentum.training.testautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.valuemomentum.training.testautomation.utils.WebDriverHelper;

public class ProductPage extends BasePage {

	public ProductPage(WebDriver driver) {
		super(driver);

	}

	// element
	@FindBy(xpath = "//*[text()='AmazonBasics USB Type-C to USB-A 2.0 Male Cable - 3 Feet (0.9 Meters) - Black']")
	private WebElement _lblItem;

	public ProductDetailsPage clickOnItem() {
		_lblItem.click();
		WebDriverHelper.switchToWindow();
		return new ProductDetailsPage(driver);

	}

}
