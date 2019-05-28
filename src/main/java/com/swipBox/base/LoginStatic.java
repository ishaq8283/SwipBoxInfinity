package com.swipBox.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginStatic{
	WebDriver driver;
	public LoginStatic(WebDriver driver) {
		this.driver=driver;
	}
	public void doLogin(String userName, String password) throws InterruptedException {
		driver.findElement(By.cssSelector("#username")).sendKeys(userName);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("body > app-root > app-layout > div.sb-login-container > div > div > app-login > div > div > div.card-body > form > button")).click();
		Thread.sleep(3000);
	}
	public void goToTermAndCondition() {
		driver.findElement(By.cssSelector("body > app-root > app-layout > div.sb-login-container > div > div > app-login > div > div > div.card-body > p > a:nth-child(1)")).click();
	}
	public void goToPrivacyPolicy() {
		driver.findElement(By.cssSelector("body > app-root > app-layout > div.sb-login-container > div > div > app-login > div > div > div.card-body > p > a:nth-child(2)")).click();
	}
	public void goToForgotPassword() {
		driver.findElement(By.cssSelector("body > app-root > app-layout > div.sb-login-container > div > div > app-login > div > div > div.card-body > h6 > a")).click();
	}
}
