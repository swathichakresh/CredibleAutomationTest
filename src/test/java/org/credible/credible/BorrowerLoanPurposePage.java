package org.credible.credible;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BorrowerLoanPurposePage {

	WebDriver driver;
	By radioButtons=By.xpath("//input[@type='radio']/..");
	

	public BorrowerLoanPurposePage(WebDriver driver) {
		this.driver = driver;
	}

	public List<String> selectBorrowerLoanPurpose(String purpose) throws InterruptedException {
		Thread.sleep(2000);
		List<String>radioButtonList= new ArrayList<String>();
		List<WebElement> RadioButtonList=driver.findElements(By.xpath("//input[@type='radio']"));
		for (WebElement radioList : RadioButtonList) {
			radioButtonList.add(radioList.getAttribute("value"));
			
			if(radioList.getAttribute("value").equalsIgnoreCase(purpose)) {
				driver.findElement(By.xpath("//input[@value='"+purpose+"']/..")).click();
			
				
			}
			
		}
		return radioButtonList;
	
	}
	
}
