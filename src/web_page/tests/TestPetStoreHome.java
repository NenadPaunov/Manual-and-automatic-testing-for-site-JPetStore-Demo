package web_page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import web_page.objects.PetStoreHome;
import web_page.objects.URLs;

public class TestPetStoreHome {
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

	// Testing methods which leads Home page
	@Test(priority = 1)
	public void openHome() {
		PetStoreHome.openHomePage(webdriver);
		waitTime();
		Assert.assertEquals(webdriver.getCurrentUrl(), URLs.HOME_URL);
		waitTime();
	}

	// Testing methods which leads to navigate Home page
	@Test(priority = 2)
	public void navigateHome() {
		PetStoreHome.navigateToHP(webdriver);
		Assert.assertEquals(webdriver.getCurrentUrl(), URLs.HOME_URL);
		waitTime();
	}

	// Testing method which leads to Menu page
	@Test(priority = 3)
	public void enterShop() {
		PetStoreHome.openHomePage(webdriver);
		PetStoreHome.enterShop(webdriver);
		Assert.assertEquals(webdriver.getCurrentUrl(), URLs.MENU_URL);
		waitTime();
		webdriver.close();
	}
}
