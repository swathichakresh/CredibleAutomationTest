package org.credible.credible;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BorrowerLoanAmtPage {

	WebDriver driver;
	By id = By.id("loanAmount");
	By continueButton = By.cssSelector("button[type='submit']");

	public BorrowerLoanAmtPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setLoanAmount(String loanAmt) {
		driver.findElement(id).clear();
		driver.findElement(id).sendKeys(loanAmt);

	}

	public void selectLoanAmount(String loanAmt) throws InterruptedException {
		Thread.sleep(2000);
		this.setLoanAmount(loanAmt);
		driver.findElement(continueButton).click();
	}

}
