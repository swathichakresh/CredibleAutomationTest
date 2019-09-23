package org.credible.credible;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BorrowerHomeAddressPage {

	WebDriver driver;
	By borrowerAddress = By.xpath("//input[@name='currentAddress.full_address']");
	By borrowerAddressSuggestion = By.xpath("(//input[@name='currentAddress.full_address']/parent::div/following-sibling::div/ul/li)[1]");
	//By borrowerUnit = By.xpath("//input[@name='currentAddress.unit']");
	By continueButton = By.xpath("//button[@type='submit']");

	public BorrowerHomeAddressPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void setBorrowerAddress(String address, int unit) {
		driver.findElement(borrowerAddress).sendKeys(address);
		//driver.findElement(borrowerUnit).sendKeys(String.valueOf(unit));
	}
	
	public void selectBorrowerHomeSugAddress() {
		
		driver.findElement(borrowerAddressSuggestion).click();
	}

	public void clickContinue() {
		driver.findElement(continueButton).click();
	}
	
	public void selectBorrowerHomeAddress(String address, int unit) throws InterruptedException {
		Thread.sleep(2000);
		setBorrowerAddress(address, unit);
		selectBorrowerHomeSugAddress();
		Thread.sleep(2000);
		clickContinue();
	}
}
