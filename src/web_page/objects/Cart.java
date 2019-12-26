package web_page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {

	// Navigate to cart
	public static void navigateToCart(WebDriver webdriver) {
		webdriver.navigate().to(URLs.CART);
	}

	// Check if element is present on the page
	public static boolean isElementPresent(WebDriver webdriver, By by) {
		try {
			webdriver.findElement(by);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	// Remove last item from Cart
	public static void removeLastItem(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.REMOVE_1)).click();
	}

	// Methods to navigate to Fish, Dogs, Reptiles, Cats and Birds menu
	public static void nagivateToFish(WebDriver webdriver) {
		webdriver.navigate().to(URLs.FISH_URL);
	}

	public static void nagivateToDogs(WebDriver webdriver) {
		webdriver.navigate().to(URLs.DOGS_URL);
	}

	public static void nagivateToReptiles(WebDriver webdriver) {
		webdriver.navigate().to(URLs.REPTILES_URL);
	}

	public static void nagivateToCats(WebDriver webdriver) {
		webdriver.navigate().to(URLs.CATS_URL);
	}

	public static void nagivateToBirds(WebDriver webdriver) {
		webdriver.navigate().to(URLs.BIRDS_URL);
	}

	// Enter Angel fish menu
	public static void enterAngelFish(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.ANGELFISH)).click();
		;
	}

	// Get and add large and small Angelfish
	public static WebElement getLargeAF(WebDriver webdriver) {
		return webdriver.findElement(By.xpath(Paths.LARGE_ANGELFISH));
	}

	public static void addLargeAF(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.ADD_LARGE_ANGELFISH)).click();
	}

	public static WebElement getSmallAF(WebDriver webdriver) {
		return webdriver.findElement(By.xpath(Paths.SMALL_ANGELFISH));
	}

	public static void addSmallAF(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.ADD_SMALL_ANGELFISH)).click();
	}

	// Methods to finish buying after there is item/s in cart
	public static void buySubmit(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.BUY_SUBMIT)).click();
	}

	public static void continueSubmit(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.BUY_CONTINUE)).click();
	}

	public static void finishBuying(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.FINISH_BUYING)).click();
	}
}
