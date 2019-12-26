package web_page.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utility.ExcelNames;
import utility.ExcelUtils;
import web_page.objects.MyAccount;
import web_page.objects.Paths;
import web_page.objects.PetStoreMenu;
import web_page.objects.Registration;
import web_page.objects.SignIn;

public class TestDataChange {
	WebDriver webdriver;

	// Wait time for Thread
	private void waitTime() {
		try {
			Thread.sleep(2000);
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

	// Test for changing some info about signed user
	@Test(priority = 1)
	void changeData() {
		PetStoreMenu.navigateToMenu(webdriver);

		SignIn.navigateToMenu(webdriver);
		ExcelUtils.setExcell(ExcelNames.PATH);
		ExcelUtils.setWorkSheet(0);
		int userName = 55555665;
		String password = ExcelUtils.getDataAt(1, 1);
		System.out.println(password);

		SignIn.fillSIUsername(webdriver, String.valueOf(userName));
		waitTime();
		SignIn.fillSIPassword(webdriver, password);
		waitTime();
		SignIn.clickSILogin(webdriver);

		MyAccount.navigateMyAccount(webdriver);
		waitTime();
		String ime = "Nenad";
		Registration.fillFirstName(webdriver, ime);
		waitTime();

		Assert.assertEquals(Registration.getFirstName(webdriver).getAttribute("value"), ime);
		waitTime();

		boolean b = false;
		Registration.clickMyList(webdriver, b);
		waitTime();

		Assert.assertEquals(Registration.getMyList(webdriver).isSelected(), b);
		ExcelUtils.closeExcell();
		waitTime();
		webdriver.close();
	}
}
