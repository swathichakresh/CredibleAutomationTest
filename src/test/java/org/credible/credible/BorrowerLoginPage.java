package org.credible.credible;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BorrowerLoginPage {
	WebDriver driver;
	By userName = By.name("email");
	By passWord = By.name("password");
	By login = By.xpath("//button[@type='submit']");

	public BorrowerLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Set user name in textbox
	public void setUserName(String strUserName) {
		try {
			driver.findElement(userName).sendKeys(strUserName);
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			driver.findElement(userName).sendKeys(strUserName);
		}
	}

	// Set password in password textbox
	public void setPassword(String strPassword) {
		driver.findElement(passWord).sendKeys(strPassword);
	}

	// Click on login button
	public void clickLogin() {
		driver.findElement(login).click();
	}

	public void selectLoginPage(String strUserName, String strPasword) throws InterruptedException {
		Thread.sleep(2000);
		this.setUserName(strUserName);
		this.setPassword(strPasword);
		this.clickLogin();
	}

}
