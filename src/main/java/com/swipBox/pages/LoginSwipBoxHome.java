package com.swipBox.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.swipBox.base.Page;

public class LoginSwipBoxHome extends Page {
//	WebDriver driver;
//	public LoginSwipBoxHome(WebDriver driver) {
//		this.driver=driver;
//	}
	public void doLogin(String userName, String password) throws InterruptedException, IOException {
		type("loginUserName_CSS", userName);
		type("loginPassword_CSS", password);
		click("LoginButton_CSS");
		verifyEquals("DashBoardMainPage_XPATH", "Dashboard");
		analyzeLog("doLogin");
	}

	public void goToTermAndCondition() {
		driver.findElement(By.cssSelector(
				"div > app-login > div > div > div.card-body > p > a:nth-child(1)"))
				.click();
	}

	public void goToPrivacyPolicy() {
		driver.findElement(By.cssSelector(
				"div > app-login > div > div > div.card-body > p > a:nth-child(2)"))
				.click();
	}

	public void goToForgotPassword() {
		driver.findElement(By.cssSelector(
				"div > app-login > div > div > div.card-body > h6 > a"))
				.click();
	}
}
