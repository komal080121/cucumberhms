package com.hms.testcases;

import org.openqa.selenium.support.PageFactory;

import com.hms.browser.BaseClass;
import com.hms.pageObject.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestCase_Login  {

	LoginPage login = PageFactory.initElements(BaseClass.driver, LoginPage.class);

	@Given("username of the user is {string} and password is {string}")
	public void enter_username_Pasword(String userName, String password) {
		login.enterEmail(userName);
		login.enterPassword(password);
	}

	@Then("click on login button")
	public void click_on_login_button() {
		login.clickOnLoginBtn();
		login.clickOnGoToDashboardBtn();
	}

}
