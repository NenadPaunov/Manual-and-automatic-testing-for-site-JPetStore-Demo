package web_page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {

	// Method to navigate to SignIn page
	public static void navigateToMenu(WebDriver webdriver) {
		webdriver.navigate().to(URLs.SIGN_IN_URL);
	}

	// Methods to get, click and fill fields so User can log in
	public static WebElement getSIUsername(WebDriver webdriver) {
		return webdriver.findElement(By.xpath(Paths.SI_USERNAME));
	}

	public static void clickSIUsername(WebDriver webdriver) {
		getSIUsername(webdriver).click();
	}

	public static void fillSIUsername(WebDriver webdriver, String s) {
		if (getSIUsername(webdriver).getAttribute("value").isEmpty()) {
			getSIUsername(webdriver).sendKeys(s);
		} else {
			getSIUsername(webdriver).clear();
			getSIUsername(webdriver).sendKeys(s);
		}
	}

	public static WebElement getSIPassword(WebDriver webdriver) {
		return webdriver.findElement(By.xpath(Paths.SI_PASSWORD));
	}

	public static void clickSIPassword(WebDriver webdriver) {
		getSIPassword(webdriver).click();
	}

	public static void fillSIPassword(WebDriver webdriver, String s) {
		if (getSIPassword(webdriver).getAttribute("value").isEmpty()) {
			getSIPassword(webdriver).sendKeys(s);
		} else {
			getSIPassword(webdriver).clear();
			getSIPassword(webdriver).sendKeys(s);
		}
	}

	// Method for Login
	public static void clickSILogin(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.SI_LOGIN)).click();
	}

	// Method which leads to Registration page
	public static void clickSIRegister(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.SI_REGISTER)).click();
	}
}
