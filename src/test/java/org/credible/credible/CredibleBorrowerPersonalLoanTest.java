package org.credible.credible;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CredibleBorrowerPersonalLoanTest {
	WebDriver driver;
	BorrowerLoginPage loginPage;
	BorrowerLoanPage borrowerLoanPage;
	BorrowerLoanAmtPage borrowerLoanAmountPage;
	BorrowerLoanPurposePage borrowerLoanPurposePage;
	BorrowerEducationLevelPage borrowerEducationLevel;
	BorrowerEmploymtStatusPage borrowerEmploymentStatus;
	BorrowerAnnualIncomePage borrowerAnnualIncome;
	BorrowerCreditScorePage borrowerCreditScore;
	BorrowerDetailsPage borrowerDetails;
	BorrowerDOBPage borrowerDOB;
	BorrowerHomeAddressPage borrowerHomeAddress;
	BorrowerHomeDetailsPage borrowerHomeDetails;
	BorrowerHomePaymentPage borrowerHomePayment;
	BorrowerCitizenPage borrowerCitizen;
	BorrowerSSNPage borrowerSSN;
	BorrowerPhoneNoPage borrowerPhoneNo;

	@BeforeTest
	public void init() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.credible.com");
	}

	@Test
	public void testHomePage() {
		Assert.assertTrue(driver.getTitle().contains("Credible"));
	}

	@Test(dependsOnMethods = { "testHomePage" })
	public void testLoginPage() throws InterruptedException {
		By loginButton = By.linkText("Log In");
		driver.findElement(loginButton).click();
		By login = By.xpath("//button[@type='submit']");
		loginPage = new BorrowerLoginPage(driver);
		loginPage.selectLoginPage("Swathi920206@credible.com", "Passw0rd");

	}

	@Test(dependsOnMethods = { "testLoginPage" })
	public void testLoanRequestPage() throws InterruptedException {
		borrowerLoanPage = new BorrowerLoanPage(driver);
		borrowerLoanPage.selectPersonalLoan();
	}

	@Test(dependsOnMethods = { "testLoanRequestPage" })
	public void testLoanAmtPage() throws InterruptedException {
		borrowerLoanAmountPage = new BorrowerLoanAmtPage(driver);
		borrowerLoanAmountPage.selectLoanAmount("2000");
	}

	@Test(dependsOnMethods = { "testLoanAmtPage" })
	public void testBorrowerLoanPurpose() throws InterruptedException {
		borrowerLoanPurposePage = new BorrowerLoanPurposePage(driver);
		borrowerLoanPurposePage.selectBorrowerLoanPurpose("home_improvement");
	}

	@Test(dependsOnMethods = { "testBorrowerLoanPurpose" })
	public void testBorrowerEducationLevelPage() throws InterruptedException {
		borrowerEducationLevel = new BorrowerEducationLevelPage(driver);
		borrowerEducationLevel.selectBachelorEducation("bachelors");

	}

	@Test(dependsOnMethods = { "testBorrowerEducationLevelPage" })
	public void testBorrowerEmployementStatusPage() throws InterruptedException {
		borrowerEmploymentStatus = new BorrowerEmploymtStatusPage(driver);
		borrowerEmploymentStatus.selectEmploymtStatus("employed_full_time");

	}

	@Test(dependsOnMethods = { "testBorrowerEmployementStatusPage" })
	public void testBorrowerAnnualIncomePage() throws InterruptedException {
		borrowerAnnualIncome = new BorrowerAnnualIncomePage(driver);
		borrowerAnnualIncome.selectBorrowerAnnualIcome(60000);
	}

	@Test(dependsOnMethods = { "testBorrowerAnnualIncomePage" })
	public void testBorrowerCreditScorePage() throws InterruptedException {
		borrowerCreditScore = new BorrowerCreditScorePage(driver);
		borrowerCreditScore.selectBorrowerCreditScore();
	}

	@Test(dependsOnMethods = { "testBorrowerCreditScorePage" })
	public void testBorrowerDetailsPage() throws InterruptedException {
		borrowerDetails = new BorrowerDetailsPage(driver);
		borrowerDetails.selectBorrowerDetails("Great", "CredibleProd");

	}

	@Test(dependsOnMethods = { "testBorrowerDetailsPage" })
	public void testBorrowerDOBPage() throws InterruptedException {
		borrowerDOB = new BorrowerDOBPage(driver);
		borrowerDOB.selectBorrowerDOB("01/01/1980");

	}

	@Test(dependsOnMethods = { "testBorrowerDOBPage" })
	public void testBorrowerHomeAddressPage() throws InterruptedException {
		borrowerHomeAddress = new BorrowerHomeAddressPage(driver);
		borrowerHomeAddress.selectBorrowerHomeAddress("4950", 79);

	}

	@Test(dependsOnMethods = { "testBorrowerHomeAddressPage" })
	public void testBorrowerHomeDetailsPage() throws InterruptedException {
		borrowerHomeDetails = new BorrowerHomeDetailsPage(driver);
		borrowerHomeDetails.selectBorrowerHomeDetails();

	}

	@Test(dependsOnMethods = { "testBorrowerHomeDetailsPage" })
	public void testBorrowerHomePaymentPage() throws InterruptedException {
		borrowerHomePayment = new BorrowerHomePaymentPage(driver);
		borrowerHomePayment.selectBorrowerHomePayment(2000);

	}

	@Test(dependsOnMethods = { "testBorrowerHomePaymentPage" })
	public void testBorrowerCitizenPage() throws InterruptedException {
		borrowerCitizen = new BorrowerCitizenPage(driver);
		borrowerCitizen.selectBorrowerCitizen();

	}

	@Test(dependsOnMethods = { "testBorrowerCitizenPage" })
	public void testBorrowerSSNPage() throws InterruptedException {
		borrowerSSN = new BorrowerSSNPage(driver);
		borrowerSSN.selectBorrowerSSN(111111111);

	}

	@Test(dependsOnMethods = { "testBorrowerSSNPage" })
	public void testBorrowerPhoneNoPage() throws InterruptedException {
		borrowerPhoneNo = new BorrowerPhoneNoPage(driver);
		borrowerPhoneNo.selectBorrowerPhoneNo(5105105100L);

	}

	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}

}
