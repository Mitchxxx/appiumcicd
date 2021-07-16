package com.qa.pages;

import com.qa.pages.MenuPage;

import com.qa.utils.GlobalParams;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ProductDetailsPage extends MenuPage {
	
	// List elements in the Page
	
	
	@AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[1]\n"
			+ "") private MobileElement SLBTitle;

	@AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[2]") private MobileElement SLBText;

	@AndroidFindBy (accessibility = "test-BACK TO PRODUCTS") private MobileElement backToProductsBtn;
	
	@AndroidFindBy (accessibility = "test-Price") private MobileElement SLBPrice;


	@iOSXCUITFindBy(id = "test-Price")
	private MobileElement iOSProductPrice;
	
	
public String getSLBTitle() {
	System.out.println("The Title of the product is " + getAttribute(SLBTitle, "text"));
	return getAttribute(SLBTitle, "text");
	
}

public String getSLBText () {
	System.out.println("The Description of the product is " + getAttribute(SLBText, "text"));
	return getAttribute(SLBText, "text");
}

public String getSLBPrice () {
	
	System.out.println("The Price of the product is " + getAttribute(SLBPrice, "text"));
	return getAttribute (SLBPrice, "text");
	
}

	public String getPrice() throws Exception {
		switch(new GlobalParams().getPlatformName()){
			case "Android":
				return getText(andScrollToElementUsingUiScrollable("description", "test-Price"), "price is: ");
			case "iOS":
				return getText(iOSScrollToElementUsingMobileScroll(iOSProductPrice), "price is: ");
			default:
				throw new Exception("Invalid platform name");
		}
	}


	public ProductsPage pressBackToProductsBtn() {
		click(backToProductsBtn, "navigate back to products page");
		return new ProductsPage();
}


}
