package com.qa.pages;

import com.qa.pages.BasePage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage {
	
	// Define Elements in the Page
	
	@AndroidFindBy (accessibility = "test-Username") private MobileElement usernameTextField;
	
	@AndroidFindBy (accessibility = "test-Password") private MobileElement passwordTextField;
	
	@AndroidFindBy (accessibility = "test-LOGIN") private MobileElement loginButton;
	
	@AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView\n"
	  		+ "") private MobileElement errorText;
	
// Create methods occurring in the login page	

public LoginPage enterUserName(String username) {
	clear(usernameTextField);
	System.out.println("Login with " + username);
	sendKeys(usernameTextField, username);
	return this;	
	
}

public LoginPage enterPassword(String password) {
	
	sendKeys(passwordTextField, password);
	System.out.println("Password is " + password);
	return this;	
	
}

public ProductsPage pressLoginButton() {
	
	System.out.println("Press Login Button");
	click(loginButton);
	return new ProductsPage();	
	
}

public ProductsPage login(String username, String password) {
	
	enterUserName(username);
	enterPassword(password);
	return pressLoginButton();
	
}

public String getErrText() {
	System.out.println("Error text is - " + errorText);
	return getAttribute(errorText, "text");
}



}