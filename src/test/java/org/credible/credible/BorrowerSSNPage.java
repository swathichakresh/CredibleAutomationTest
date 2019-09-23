package org.credible.credible;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BorrowerSSNPage {
	
	WebDriver driver;
	By borrowerSSNValue=By.xpath("//input[@placeholder='Social security number']");
	By continueButton = By.xpath("//button[@type='submit']");
	
	public BorrowerSSNPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setBorrowerSSN(int annualIncome) {
		driver.findElement(borrowerSSNValue).sendKeys(String.valueOf(annualIncome));
	}
	
	public void clickContinue() {
		driver.findElement(continueButton).click();
	}
	
	public void selectBorrowerSSN(int annualIncome) throws InterruptedException
	{
		Thread.sleep(2000);
		setBorrowerSSN(annualIncome);
		clickContinue();
	}

}
