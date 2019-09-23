package org.credible.credible;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BorrowerEducationLevelPage {

	WebDriver driver;
	By radioButtons=By.xpath("//input[@type='radio']/..");
	//By bachelorEducation=By.xpath("//input[@value='bachelors']/..");
	public BorrowerEducationLevelPage(WebDriver driver)
	{
	 this.driver=driver;
	}
	
	
	public void selectBachelorEducation(String educationLevel) throws InterruptedException {
		
		Thread.sleep(2000);
		List<WebElement> RadioButtonList=driver.findElements(By.xpath("//input[@type='radio']"));
		for (WebElement radioList : RadioButtonList) {
			if(radioList.getAttribute("value").equalsIgnoreCase(educationLevel)) {
				driver.findElement(By.xpath("//input[@value='"+educationLevel+"']/..")).click();
				break;
			}
		}
	}
		
}	
		
		
	