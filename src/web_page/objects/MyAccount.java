package web_page.objects;

import org.openqa.selenium.WebDriver;

public class MyAccount {

	// Go to my Account
	public static void navigateMyAccount(WebDriver webdriver) {
		webdriver.navigate().to(URLs.MY_ACCOUNT);
	}
}
