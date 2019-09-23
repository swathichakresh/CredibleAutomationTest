package org.credible.credible;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BorrowerHomeDetailsPage {

	WebDriver driver;
	By homeDetails = By.xpath("//input[@value='rent']/..");

	public BorrowerHomeDetailsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickHomeDetails() {
		driver.findElement(homeDetails).click();

	}

	public void selectBorrowerHomeDetails() throws InterruptedException {
		Thread.sleep(2000);
		clickHomeDetails();
	}
}
