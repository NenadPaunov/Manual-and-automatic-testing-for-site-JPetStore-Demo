package web_page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utility.ExcelNames;
import utility.ExcelUtils;
import web_page.objects.SignIn;
import web_page.objects.URLs;

public class TestSignIn {
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

	// Testing method navigate
	@Test(priority = 1)
	public void navigateSignIn() {
		SignIn.navigateToMenu(webdriver);
		Assert.assertEquals(webdriver.getCurrentUrl(), URLs.SIGN_IN_URL);
		waitTime();
	}

	// Testing Sign in
	@Test(priority = 2)
	public void testSignIn() {
		SignIn.navigateToMenu(webdriver);
		ExcelUtils.setExcell(ExcelNames.PATH);
		ExcelUtils.setWorkSheet(0);
		int userName = (int) Double.parseDouble(ExcelUtils.getDataAt(1, 0));
		String password = ExcelUtils.getDataAt(1, 1);
		System.out.println(password);

		SignIn.fillSIUsername(webdriver, String.valueOf(userName));
		waitTime();
		SignIn.fillSIPassword(webdriver, password);
		waitTime();
		SignIn.clickSILogin(webdriver);

		Assert.assertEquals(webdriver.getCurrentUrl(), URLs.MENU_URL);
		waitTime();
	}

	// Testing if method leads to Registration page
	@Test(priority = 3)
	public void testRegisterLink() {
		SignIn.navigateToMenu(webdriver);
		waitTime();
		SignIn.clickSIRegister(webdriver);
		waitTime();
		Assert.assertEquals(webdriver.getCurrentUrl(), URLs.REGISTER_URL);
		waitTime();
		webdriver.close();
	}
}
