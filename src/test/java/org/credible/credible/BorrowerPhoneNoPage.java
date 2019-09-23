package org.credible.credible;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BorrowerPhoneNoPage {
	
	WebDriver driver;
	By borrowerPhoneNo=By.xpath("//input[@name='borrower.phone']");
	
	public BorrowerPhoneNoPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setBorrowerPhoneNo(long phoneNo) {
		driver.findElement(borrowerPhoneNo).sendKeys(String.valueOf(phoneNo));
	}
	
	public void selectBorrowerPhoneNo(long phoneNo) throws InterruptedException
	{
		Thread.sleep(2000);
		setBorrowerPhoneNo(phoneNo);
	}

}
