package org.credible.credible;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BorrowerCitizenPage {

	WebDriver driver;
	By citizenDetails = By.xpath("//input[@value='us_citizen']/..");

	public BorrowerCitizenPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickCitizen() {
		driver.findElement(citizenDetails).click();

	}

	public void selectBorrowerCitizen() throws InterruptedException {
		Thread.sleep(2000);
		clickCitizen();
	}
}
