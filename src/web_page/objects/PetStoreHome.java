package web_page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PetStoreHome {

	// Open Home page
	public static void openHomePage(WebDriver webdriver) {
		webdriver.get(URLs.HOME_URL);
	}

	// Navigate Home page
	public static void navigateToHP(WebDriver webdriver) {
		webdriver.navigate().to(URLs.HOME_URL);
	}

	// Enter Menu page
	public static void enterShop(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.ENTER_SHOP)).click();
	}

}
