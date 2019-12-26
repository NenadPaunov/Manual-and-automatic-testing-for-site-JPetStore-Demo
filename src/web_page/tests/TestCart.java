package web_page.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import web_page.objects.Cart;
import web_page.objects.Paths;
import web_page.objects.Registration;
import web_page.objects.URLs;

public class TestCart {
	WebDriver webdriver;

	// Wait time for Thread
	private void waitTime() {
		try {
			Thread.sleep(3000);
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

	// Testing navigate method
	@Test(priority = 1)
	public void navigateFish() {
		Cart.nagivateToFish(webdriver);
		Assert.assertEquals(webdriver.getCurrentUrl(), URLs.FISH_URL);
		waitTime();
	}

	// Testing adding, removing and buying Fish items
	@Test(priority = 2)
	public void addFish() {
		SoftAssert sa = new SoftAssert();
		Cart.nagivateToFish(webdriver);
		waitTime();
		Cart.enterAngelFish(webdriver);
		waitTime();
		Cart.addLargeAF(webdriver);
		waitTime();
		sa.assertEquals(Cart.isElementPresent(webdriver, By.xpath(Paths.LARGE_ANGELFISH)), true);

		Cart.nagivateToFish(webdriver);
		waitTime();
		Cart.enterAngelFish(webdriver);
		waitTime();
		Cart.addSmallAF(webdriver);
		waitTime();
		sa.assertEquals(Cart.isElementPresent(webdriver, By.xpath(Paths.SMALL_ANGELFISH)), true);

		sa.assertEquals(Cart.getLargeAF(webdriver).isDisplayed(), true);
		waitTime();
		sa.assertEquals(Cart.getSmallAF(webdriver).isDisplayed(), true);
		waitTime();
		Cart.removeLastItem(webdriver);
		waitTime();
		sa.assertEquals(Cart.isElementPresent(webdriver, By.xpath(Paths.SMALL_ANGELFISH)), false);
		waitTime();

		sa.assertAll();

	}
}
