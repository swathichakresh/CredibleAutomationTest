package org.credible.credible;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BorrowerAnnualIncomePage {
	WebDriver driver;
	By borrowerannualIncomeValue=By.xpath("//input[@name='employment.incomeYearly']");
	By continueButton = By.xpath("//button[@type='submit']");
	
	public BorrowerAnnualIncomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setBorrowerAnnualIncome(int annualIncome) {
		driver.findElement(borrowerannualIncomeValue).sendKeys(String.valueOf(annualIncome));
	}
	
	public void clickContinue() {
		driver.findElement(continueButton).click();
	}
	
	public void selectBorrowerAnnualIcome(int annualIncome) throws InterruptedException
	{
		Thread.sleep(2000);
		setBorrowerAnnualIncome(annualIncome);
		clickContinue();
	}

}
