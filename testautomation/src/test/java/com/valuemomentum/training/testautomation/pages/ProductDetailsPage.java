package com.valuemomentum.training.testautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class ProductDetailsPage  extends BasePage {

	
	

	 

		public ProductDetailsPage(WebDriver driver) {
			super(driver);
		}

		

		//element
        @FindBy(id="add-to-cart-button")
        private WebElement btnAddToCart;
        
        
        public void clickOnAddToCart() {
          
            //add to cart
            
            btnAddToCart.click();
            

 

        }
	}

