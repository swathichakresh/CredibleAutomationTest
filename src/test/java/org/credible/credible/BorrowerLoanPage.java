package org.credible.credible;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BorrowerLoanPage {
	WebDriver driver;
	By personalLoanButton = By.xpath("//a[@href='/personal-loans/borrower']");

	public BorrowerLoanPage(WebDriver driver) {
		this.driver = driver;
	}

	public void selectPersonalLoan() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(personalLoanButton).click();
	}

}
