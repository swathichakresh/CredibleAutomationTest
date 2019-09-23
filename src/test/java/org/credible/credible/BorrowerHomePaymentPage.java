package org.credible.credible;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BorrowerHomePaymentPage {

	WebDriver driver;
	By borrowerHomePayment = By.xpath("//input[@name='expenses.housingPayment']");
	By continueButton = By.xpath("//button[@type='submit']");

	public BorrowerHomePaymentPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setBorrowerHomePayment(int homePayment) {
		driver.findElement(borrowerHomePayment).sendKeys(String.valueOf(homePayment));
	}

	public void clickContinue() {
		driver.findElement(continueButton).click();
	}

	public void selectBorrowerHomePayment(int homePayment) throws InterruptedException {
		Thread.sleep(2000);
		setBorrowerHomePayment(homePayment);
		clickContinue();
	}

}
