package com.qa.pages;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SettingsPage extends BasePage {
	@AndroidFindBy (accessibility="test-LOGOUT") private MobileElement logoutBtn;
	
	public LoginPage pressLogoutBtn() {
		
		click(logoutBtn);
		return new LoginPage();
	}

}
