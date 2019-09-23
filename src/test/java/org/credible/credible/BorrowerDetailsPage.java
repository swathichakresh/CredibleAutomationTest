package org.credible.credible;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BorrowerDetailsPage {

	WebDriver driver;
	By borrowerFirstName = By.xpath("//input[@name='borrower.firstName']");
	By borrowerLastName = By.xpath("//input[@name='borrower.lastName']");
	By continueButton = By.xpath("//button[@type='submit']");

	public BorrowerDetailsPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void setBorrowerDetails(String firstName, String lastName) {
		driver.findElement(borrowerFirstName).sendKeys(firstName);
		driver.findElement(borrowerLastName).sendKeys(lastName);
	}

	public void clickContinue() {
		driver.findElement(continueButton).click();
	}
	
	public void selectBorrowerDetails(String firstName, String lastName) throws InterruptedException {
		Thread.sleep(2000);
		setBorrowerDetails(firstName, lastName);
		clickContinue();
	}
}
