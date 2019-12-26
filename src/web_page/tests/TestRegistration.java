package web_page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utility.ExcelNames;
import utility.ExcelUtils;
import web_page.objects.Registration;
import web_page.objects.SignIn;
import web_page.objects.URLs;

public class TestRegistration {
	WebDriver webdriver;

	// Wait time for Thread
	private void waitTime() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Initialize WebDriver
	@BeforeClass
	void setDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeWebDriveer\\chromedriver.exe");
		webdriver = new ChromeDriver();
	}

	// Method testing to navigate Registration
	@Test(priority = 1)
	public void navigateRegistration() {
		Registration.navigateToRegistration(webdriver);
		Assert.assertEquals(webdriver.getCurrentUrl(), URLs.REGISTER_URL);
		waitTime();
	}

	// Testing registration for one user
	@Test(priority = 2)
	public void testRegistration() {
		ExcelUtils.setExcell(ExcelNames.PATH);
		ExcelUtils.setWorkSheet(0);

		// Id is unique so this field needs to be changed each time
		int userName = 5555665;
		String newPassword = ExcelUtils.getDataAt(1, 1);
		String repeatPassword = ExcelUtils.getDataAt(1, 1);
		String firstName = ExcelUtils.getDataAt(1, 2);
		String lastName = ExcelUtils.getDataAt(1, 3);
		String email = ExcelUtils.getDataAt(1, 4);
		String phone = ExcelUtils.getDataAt(1, 5);
		String adress_1 = ExcelUtils.getDataAt(1, 6);
		String adress_2 = ExcelUtils.getDataAt(1, 7);
		String city = ExcelUtils.getDataAt(1, 8);
		String state = ExcelUtils.getDataAt(1, 9);
		int zip = (int) Double.parseDouble(ExcelUtils.getDataAt(1, 10));
		String country = ExcelUtils.getDataAt(1, 11);
		String language = ExcelUtils.getDataAt(1, 12);
		String category = ExcelUtils.getDataAt(1, 13);
		String t = "true";
		String f = "false";
		Boolean myList = t.equalsIgnoreCase(ExcelUtils.getDataAt(1, 14));
		Boolean myBanner = t.equalsIgnoreCase(ExcelUtils.getDataAt(1, 15));

		Registration.navigateToRegistration(webdriver);

		Registration.fillUserId(webdriver, String.valueOf(userName));
		waitTime();
		Registration.fillNewPassword(webdriver, newPassword);
		waitTime();
		Registration.fillRepeatPassword(webdriver, repeatPassword);
		waitTime();
		Registration.fillFirstName(webdriver, firstName);
		waitTime();
		Registration.fillLastName(webdriver, lastName);
		waitTime();
		Registration.fillEmail(webdriver, email);
		waitTime();
		Registration.fillPhone(webdriver, phone);
		waitTime();
		Registration.fillAdress_1(webdriver, adress_1);
		waitTime();
		Registration.fillAdress_2(webdriver, adress_2);
		waitTime();
		Registration.fillCity(webdriver, city);
		waitTime();
		Registration.fillState(webdriver, state);
		waitTime();
		Registration.fillZip(webdriver, String.valueOf(zip));
		waitTime();
		Registration.fillCountry(webdriver, country);
		waitTime();
		Registration.selectLanguage(webdriver, language);
		waitTime();
		Registration.selectCategory(webdriver, category);
		waitTime();
		Registration.clickMyList(webdriver, myList);
		waitTime();
		Registration.clickMyBanner(webdriver, myBanner);
		waitTime();
		Registration.clickSubmit(webdriver);
		waitTime();

		ExcelUtils.closeExcell();
		Assert.assertEquals(webdriver.getCurrentUrl(), URLs.MENU_URL);
		waitTime();
		webdriver.close();
	}
}
