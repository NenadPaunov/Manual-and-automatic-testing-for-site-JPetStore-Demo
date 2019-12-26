package web_page.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import web_page.objects.PetStoreMenu;
import web_page.objects.URLs;

public class TestPetStoreMenu {
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

	// Method to navigate to Menu page
	@Test(priority = 1)
	public void navigateMenu() {
		PetStoreMenu.navigateToMenu(webdriver);
		Assert.assertEquals(webdriver.getCurrentUrl(), URLs.MENU_URL);
		waitTime();
	}

	// Test for methods if they are leading to required page
	@Test(priority = 2)
	public void fish() {
		SoftAssert sa = new SoftAssert();
		PetStoreMenu.navigateToMenu(webdriver);
		PetStoreMenu.enterFishTop(webdriver);
		sa.assertEquals(webdriver.getCurrentUrl(), URLs.FISH_URL);
		waitTime();

		PetStoreMenu.navigateToMenu(webdriver);
		PetStoreMenu.enterFishSB(webdriver);
		sa.assertEquals(webdriver.getCurrentUrl(), URLs.FISH_URL);
		waitTime();
		PetStoreMenu.navigateToMenu(webdriver);
		PetStoreMenu.enterFishPic(webdriver);
		sa.assertEquals(webdriver.getCurrentUrl(), URLs.FISH_URL);
		waitTime();

		sa.assertAll();
	}

	@Test(priority = 3)
	public void dogs() {
		SoftAssert sa = new SoftAssert();
		PetStoreMenu.navigateToMenu(webdriver);
		PetStoreMenu.enterDogsTop(webdriver);
		sa.assertEquals(webdriver.getCurrentUrl(), URLs.DOGS_URL);
		waitTime();

		PetStoreMenu.navigateToMenu(webdriver);
		PetStoreMenu.enterDogsSB(webdriver);
		sa.assertEquals(webdriver.getCurrentUrl(), URLs.DOGS_URL);
		waitTime();
		PetStoreMenu.navigateToMenu(webdriver);
		PetStoreMenu.enterDogsPic(webdriver);
		sa.assertEquals(webdriver.getCurrentUrl(), URLs.DOGS_URL);
		waitTime();

		sa.assertAll();
	}

	@Test(priority = 4)
	public void reptiles() {
		SoftAssert sa = new SoftAssert();
		PetStoreMenu.navigateToMenu(webdriver);
		PetStoreMenu.enterReptilesTop(webdriver);
		sa.assertEquals(webdriver.getCurrentUrl(), URLs.REPTILES_URL);
		waitTime();

		PetStoreMenu.navigateToMenu(webdriver);
		PetStoreMenu.enterReptilesSB(webdriver);
		sa.assertEquals(webdriver.getCurrentUrl(), URLs.REPTILES_URL);
		waitTime();
		PetStoreMenu.navigateToMenu(webdriver);
		PetStoreMenu.enterReptilesPic(webdriver);
		sa.assertEquals(webdriver.getCurrentUrl(), URLs.REPTILES_URL);
		waitTime();

		sa.assertAll();
	}

	@Test(priority = 5)
	public void cats() {
		SoftAssert sa = new SoftAssert();
		PetStoreMenu.navigateToMenu(webdriver);
		PetStoreMenu.enterCatsTop(webdriver);
		sa.assertEquals(webdriver.getCurrentUrl(), URLs.CATS_URL);
		waitTime();

		PetStoreMenu.navigateToMenu(webdriver);
		PetStoreMenu.enterCatsSB(webdriver);
		sa.assertEquals(webdriver.getCurrentUrl(), URLs.CATS_URL);
		waitTime();
		PetStoreMenu.navigateToMenu(webdriver);
		PetStoreMenu.enterCatsPic(webdriver);
		sa.assertEquals(webdriver.getCurrentUrl(), URLs.CATS_URL);
		waitTime();

		sa.assertAll();
	}

	@Test(priority = 6)
	public void birds() {
		SoftAssert sa = new SoftAssert();
		PetStoreMenu.navigateToMenu(webdriver);
		PetStoreMenu.enterBirdsTop(webdriver);
		sa.assertEquals(webdriver.getCurrentUrl(), URLs.BIRDS_URL);
		waitTime();

		PetStoreMenu.navigateToMenu(webdriver);
		PetStoreMenu.enterBirdsSB(webdriver);
		sa.assertEquals(webdriver.getCurrentUrl(), URLs.BIRDS_URL);
		waitTime();
		PetStoreMenu.navigateToMenu(webdriver);
		PetStoreMenu.enterBirdsPic(webdriver);
		sa.assertEquals(webdriver.getCurrentUrl(), URLs.BIRDS_URL);
		waitTime();

		sa.assertAll();
	}

	// Testing method if it leads to SignIn page
	@Test(priority = 7)
	public void signIn() {
		PetStoreMenu.navigateToMenu(webdriver);
		PetStoreMenu.signIn(webdriver);
		Assert.assertEquals(webdriver.getCurrentUrl(), URLs.SIGN_IN_URL);
		waitTime();
		webdriver.close();
	}
}
