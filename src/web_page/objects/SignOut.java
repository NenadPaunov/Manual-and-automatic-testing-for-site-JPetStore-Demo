package web_page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOut {

	// Method to navigate to SignOut page
	public static void signOut(WebDriver webdriver) {
		webdriver.findElement(By.xpath(Paths.SIGN_OUT)).click();
	}
}
