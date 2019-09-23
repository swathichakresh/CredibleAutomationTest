package org.credible.credible;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BorrowerDOBPage {

	WebDriver driver;
	By borrowerDOB = By.xpath("//input[@name='borrower.dob']");
	By continueButton = By.xpath("//button[@type='submit']");

	public BorrowerDOBPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void setBorrowerDOB(String date) {
		driver.findElement(borrowerDOB).sendKeys(date);
	}

	public void clickContinue() {
		driver.findElement(continueButton).click();
	}
	
	public void selectBorrowerDOB(String date) throws InterruptedException {
		Thread.sleep(2000);
		setBorrowerDOB(date);
		clickContinue();
	}
}
