package com.valuemomentum.training.testautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.valuemomentum.training.testautomation.utils.WebDriverHelper;
 


 

	public class MobilesPage extends BasePage {

		public MobilesPage(WebDriver driver) {
			super(driver);

		}

		// element
		@FindBy(xpath = "//*[text()='Cloudtail India']")
		private WebElement _btncloudtrial;

		public ProductPage clickOnSeller() {
			_btncloudtrial.click();
			//WebDriverHelper1.switchToWindow();
			return new ProductPage(driver);

		}

	}
