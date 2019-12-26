package web_page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	// Method to navigate to Registration
	public static void navigateToRegistration(WebDriver webdriver) {
		webdriver.navigate().to(URLs.REGISTER_URL);
	}

	// Methods to get, click and add all fields for User registration
	public static WebElement getUserId(WebDriver webdriver) {
		return webdriver.findElement(By.xpath(Paths.USER_ID));
	}

	public static void clickUserId(WebDriver webdriver) {
		getUserId(webdriver).click();
	}

	public static void fillUserId(WebDriver webdriver, String s) {
		getUserId(webdriver).sendKeys(s);
	}

	public static WebElement getNewPassword(WebDriver webdriver) {
		return webdriver.findElement(By.xpath(Paths.NEW_PASSWORD));
	}

	public static void clickNewPassword(WebDriver webdriver) {
		getNewPassword(webdriver).click();
	}

	public static void fillNewPassword(WebDriver webdriver, String s) {
		if (getNewPassword(webdriver).getAttribute("value").isEmpty()) {
			getNewPassword(webdriver).sendKeys(s);
		} else {
			getNewPassword(webdriver).clear();
			getNewPassword(webdriver).sendKeys(s);
		}
	}

	public static WebElement getRepeatPassword(WebDriver webdriver) {
		return webdriver.findElement(By.xpath(Paths.REPEAT_PASSWORD));
	}

	public static void clickRepeatPassword(WebDriver webdriver) {
		getRepeatPassword(webdriver).click();
	}

	public static void fillRepeatPassword(WebDriver webdriver, String s) {
		if (getRepeatPassword(webdriver).getAttribute("value").isEmpty()) {
			getRepeatPassword(webdriver).sendKeys(s);
		} else {
			getRepeatPassword(webdriver).clear();
			getRepeatPassword(webdriver).sendKeys(s);
		}
	}

	public static WebElement getFirstName(WebDriver webdriver) {
		return webdriver.findElement(By.xpath(Paths.FIRST_NAME));
	}

	public static void clickFirstName(WebDriver webdriver) {
		getFirstName(webdriver).click();
	}

	public static void fillFirstName(WebDriver webdriver, String s) {
		if (getFirstName(webdriver).getAttribute("value").isEmpty()) {
			getFirstName(webdriver).sendKeys(s);
		} else {
			getFirstName(webdriver).clear();
			getFirstName(webdriver).sendKeys(s);
		}
	}

	public static WebElement getLastName(WebDriver webdriver) {
		return webdriver.findElement(By.xpath(Paths.LAST_NAME));
	}

	public static void clickLastName(WebDriver webdriver) {
		getLastName(webdriver).click();
	}

	public static void fillLastName(WebDriver webdriver, String s) {
		if (getLastName(webdriver).getAttribute("value").isEmpty()) {
			getLastName(webdriver).sendKeys(s);
		} else {
			getLastName(webdriver).clear();
			getLastName(webdriver).sendKeys(s);
		}
	}

	public static WebElement getEmail(WebDriver webdriver) {
		return webdriver.findElement(By.xpath(Paths.EMAIL));
	}

	public static void clickEMAIL(WebDriver webdriver) {
		getEmail(webdriver).click();
	}

	public static void fillEmail(WebDriver webdriver, String s) {
		if (getEmail(webdriver).getAttribute("value").isEmpty()) {
			getEmail(webdriver).sendKeys(s);
		} else {
			getEmail(webdriver).clear();
			getEmail(webdriver).sendKeys(s);
		}
	}

	public static WebElement getPhone(WebDriver webdriver) {
		return webdriver.findElement(By.xpath(Paths.PHONE));
	}

	public static void clickPhone(WebDriver webdriver) {
		getPhone(webdriver).click();
	}

	public static void fillPhone(WebDriver webdriver, String s) {
		if (getPhone(webdriver).getAttribute("value").isEmpty()) {
			getPhone(webdriver).sendKeys(s);
		} else {
			getPhone(webdriver).clear();
			getPhone(webdriver).sendKeys(s);
		}
	}

	public static WebElement getAdress_1(WebDriver webdriver) {
		return webdriver.findElement(By.xpath(Paths.ADRESS_1));
	}

	public static void clickAdress_1(WebDriver webdriver) {
		getAdress_1(webdriver).click();
	}

	public static void fillAdress_1(WebDriver webdriver, String s) {
		if (getAdress_1(webdriver).getAttribute("value").isEmpty()) {
			getAdress_1(webdriver).sendKeys(s);
		} else {
			getAdress_1(webdriver).clear();
			getAdress_1(webdriver).sendKeys(s);
		}
	}

	public static WebElement getAdress_2(WebDriver webdriver) {
		return webdriver.findElement(By.xpath(Paths.ADRESS_2));
	}

	public static void clickAdress_2(WebDriver webdriver) {
		getAdress_2(webdriver).click();
	}

	public static void fillAdress_2(WebDriver webdriver, String s) {
		if (getAdress_2(webdriver).getAttribute("value").isEmpty()) {
			getAdress_2(webdriver).sendKeys(s);
		} else {
			getAdress_2(webdriver).clear();
			getAdress_2(webdriver).sendKeys(s);
		}
	}

	public static WebElement getCity(WebDriver webdriver) {
		return webdriver.findElement(By.xpath(Paths.CITY));
	}

	public static void clickCity(WebDriver webdriver) {
		getCity(webdriver).click();
	}

	public static void fillCity(WebDriver webdriver, String s) {
		if (getCity(webdriver).getAttribute("value").isEmpty()) {
			getCity(webdriver).sendKeys(s);
		} else {
			getCity(webdriver).clear();
			getCity(webdriver).sendKeys(s);
		}
	}

	public static WebElement getState(WebDriver webdriver) {
		return webdriver.findElement(By.xpath(Paths.STATE));
	}

	public static void clickState(WebDriver webdriver) {
		getState(webdriver).click();
	}

	public static void fillState(WebDriver webdriver, String s) {
		if (getState(webdriver).getAttribute("value").isEmpty()) {
			getState(webdriver).sendKeys(s);
		} else {
			getState(webdriver).clear();
			getState(webdriver).sendKeys(s);
		}
	}

	public static WebElement getZip(WebDriver webdriver) {
		return webdriver.findElement(By.xpath(Paths.ZIP));
	}

	public static void clickZip(WebDriver webdriver) {
		getZip(webdriver).click();
	}

	public static void fillZip(WebDriver webdriver, String s) {
		if (getZip(webdriver).getAttribute("value").isEmpty()) {
			getZip(webdriver).sendKeys(s);
		} else {
			getZip(webdriver).clear();
			getZip(webdriver).sendKeys(s);
		}
	}

	public static WebElement getCountry(WebDriver webdriver) {
		return webdriver.findElement(By.xpath(Paths.COUNTRY));
	}

	public static void clickCountry(WebDriver webdriver) {
		getCountry(webdriver).click();
	}

	public static void fillCountry(WebDriver webdriver, String s) {
		if (getCountry(webdriver).getAttribute("value").isEmpty()) {
			getCountry(webdriver).sendKeys(s);
		} else {
			getCountry(webdriver).clear();
			getCountry(webdriver).sendKeys(s);
		}
	}

	public static Select getLanguage(WebDriver webdriver) {
		return new Select(webdriver.findElement(By.xpath(Paths.LANGUAGE)));
	}

	public static void selectLanguage(WebDriver webdriver, String s) {
		getLanguage(webdriver).selectByVisibleText(s.toLowerCase());
	}

	public static Select getCategory(WebDriver webdriver) {
		return new Select(webdriver.findElement(By.xpath(Paths.CATEGORY)));
	}

	public static void selectCategory(WebDriver webdriver, String s) {
		getCategory(webdriver).selectByVisibleText(s.toUpperCase());
	}

	public static WebElement getMyList(WebDriver webdriver) {
		return webdriver.findElement(By.xpath(Paths.MY_LIST));
	}

	public static void clickMyList(WebDriver webdriver, boolean b) {
		if (b) {
			if (!webdriver.findElement(By.xpath(Paths.MY_LIST)).isSelected())
				webdriver.findElement(By.xpath(Paths.MY_LIST)).click();
		} else {
			if (webdriver.findElement(By.xpath(Paths.MY_LIST)).isSelected())
				webdriver.findElement(By.xpath(Paths.MY_LIST)).click();
		}
	}

	public static WebElement getMyBanner(WebDriver webdriver) {
		return webdriver.findElement(By.xpath(Paths.MY_BANNER));
	}

	public static void clickMyBanner(WebDriver webdriver, boolean b) {
		if (b) {
			if (!webdriver.findElement(By.xpath(Paths.MY_BANNER)).isSelected())
				webdriver.findElement(By.xpath(Paths.MY_BANNER)).click();
		} else {
			if (webdriver.findElement(By.xpath(Paths.MY_BANNER)).isSelected())
				webdriver.findElement(By.xpath(Paths.MY_BANNER)).click();
		}
	}

	// Submit for creating new user
	public static void clickSubmit(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.SUBMIT)).click();
	}
}
