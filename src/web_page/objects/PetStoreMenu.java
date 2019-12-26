package web_page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PetStoreMenu {

	// Navigate to Menu page
	public static void navigateToMenu(WebDriver webdriver) {
		webdriver.navigate().to(URLs.MENU_URL);
	}

	// Methods to enter Fish, Dogs, Reptiles, Cats and Birds on top, side bar and on
	// picture
	public static void enterFishTop(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.FISH_TOP)).click();
	}

	public static void enterDogsTop(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.DOGS_TOP)).click();
	}

	public static void enterReptilesTop(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.REPTILES_TOP)).click();
	}

	public static void enterCatsTop(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.CATS_TOP)).click();
	}

	public static void enterBirdsTop(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.BIRDS_TOP)).click();
	}

	public static void enterFishSB(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.FISH_SIDE_BAR)).click();
	}

	public static void enterDogsSB(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.DOGS_SIDE_BAR)).click();
	}

	public static void enterReptilesSB(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.REPTILES_SIDE_BAR)).click();
	}

	public static void enterCatsSB(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.CATS_SIDE_BAR)).click();
	}

	public static void enterBirdsSB(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.BIRDS_SIDE_BAR)).click();
	}

	public static void enterFishPic(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.FISH_PICTURE)).click();
	}

	public static void enterDogsPic(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.DOGS_PICTURE)).click();
	}

	public static void enterReptilesPic(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.REPTILES_PICTURE)).click();
	}

	public static void enterCatsPic(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.CATS_PICTURE)).click();
	}

	public static void enterBirdsPic(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.BIRDS_PICTURE)).click();
	}

	// Method to enter SignIn
	public static void signIn(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.SIGN_IN)).click();
	}
}
