package com.hms.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(xpath = "//input[@name=\"email\"]")
	WebElement email;
	public void enterEmail(String mail) {
		email.sendKeys(mail);
	}
	
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	
	@FindBy(xpath = "//button[text ()=\"Login\"]")
	WebElement loginBtn;
	public void clickOnLoginBtn() {
		loginBtn.click();
	}
	
	
	@FindBy(xpath = "//button[text () =\"Go to dashboard\"]")
	WebElement goToDashboardBtn;
	public void clickOnGoToDashboardBtn() {
		goToDashboardBtn.click();
	}
	
}
