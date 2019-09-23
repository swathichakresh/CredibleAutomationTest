package org.credible.credible;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BorrowerCreditScorePage {

	WebDriver driver;
	By borrowerCreditScoreValue=By.xpath("//input[@value='749']/..");
	public BorrowerCreditScorePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void selectBorrowerCreditScore() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(borrowerCreditScoreValue).click();
	}
}
