package com.qa.pages;

import com.qa.pages.BasePage;
import com.qa.pages.MenuPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductsPage extends MenuPage {
	
	// List elements in the Page
	
	@AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView\n"
			+ "")  private MobileElement productTitleText;
	
	@AndroidFindBy (xpath = "(//android.widget.TextView[@content-desc=\"test-Item title\"])[1]") private MobileElement SLBTitle;

	@AndroidFindBy (xpath = "(//android.widget.TextView[@content-desc=\"test-Price\"])[1]") private MobileElement SLBPrice;

public String getTitle() {
	
	return getAttribute(productTitleText, "text");
}

public String getSLBTitle() {
	System.out.println("The Title is " + getAttribute(SLBTitle, "text"));
	return getAttribute(SLBTitle, "text");
	
}

public String getSLBPrice () {
	System.out.println("The Price is " + getAttribute(SLBPrice, "text"));
	return getAttribute(SLBPrice, "text");
}

public ProductDetailsPage pressSLBTitle() {
	click(SLBTitle);
	return new ProductDetailsPage();
}

}
