package main;

import org.apache.poi.poifs.crypt.dsig.SignatureInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ExcelNames;
import utility.ExcelUtils;
import web_page.objects.Cart;
import web_page.objects.MyAccount;
import web_page.objects.Paths;
import web_page.objects.PetStoreHome;
import web_page.objects.PetStoreMenu;
import web_page.objects.Registration;
import web_page.objects.SignIn;
import web_page.objects.SignOut;
import web_page.objects.URLs;

public class MainProgram {

	// Wait time for 1sec
	public static void waitTime() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Wait time for 3 sec for parts where is needed for user to see more
	public static void waitTime2() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeWebDriveer\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();

		// Go to Home URL
		webdriver.get(URLs.HOME_URL);
		webdriver.manage().window().maximize();
		waitTime();

		// Go to Menu URL
		PetStoreMenu.navigateToMenu(webdriver);
		waitTime();
		// Open Excell
		ExcelUtils.setExcell(ExcelNames.PATH);
		ExcelUtils.setWorkSheet(0);

		// How many rows from Excel will itterate
		for (int i = 1; i < 3; i++) {
			int userName = (int) Double.parseDouble(ExcelUtils.getDataAt(i, 0)) + 978140;
			String newPassword = ExcelUtils.getDataAt(i, 1);
			String repeatPassword = ExcelUtils.getDataAt(i, 1);
			String firstName = ExcelUtils.getDataAt(i, 2);
			String lastName = ExcelUtils.getDataAt(i, 3);
			String email = ExcelUtils.getDataAt(i, 4);
			String phone = ExcelUtils.getDataAt(i, 5);
			String adress_1 = ExcelUtils.getDataAt(i, 6);
			String adress_2 = ExcelUtils.getDataAt(i, 7);
			String city = ExcelUtils.getDataAt(i, 8);
			String state = ExcelUtils.getDataAt(i, 9);
			int zip = (int) Double.parseDouble(ExcelUtils.getDataAt(i, 10));
			String country = ExcelUtils.getDataAt(i, 11);
			String language = ExcelUtils.getDataAt(i, 12);
			String category = ExcelUtils.getDataAt(i, 13);
			String t = "true";
			String f = "false";
			Boolean myList = t.equalsIgnoreCase(ExcelUtils.getDataAt(i, 14));
			Boolean myBanner = t.equalsIgnoreCase(ExcelUtils.getDataAt(i, 15));

			// Go to Registration page
			Registration.navigateToRegistration(webdriver);

			// Fill registration for new user
			Registration.fillUserId(webdriver, String.valueOf(userName));
			waitTime();
			Registration.fillNewPassword(webdriver, newPassword);
			waitTime();
			Registration.fillRepeatPassword(webdriver, repeatPassword);
			waitTime();
			Registration.fillFirstName(webdriver, firstName);
			waitTime();
			Registration.fillLastName(webdriver, lastName);
			waitTime();
			Registration.fillEmail(webdriver, email);
			waitTime();
			Registration.fillPhone(webdriver, phone);
			waitTime();
			Registration.fillAdress_1(webdriver, adress_1);
			waitTime();
			Registration.fillAdress_2(webdriver, adress_2);
			waitTime();
			Registration.fillCity(webdriver, city);
			waitTime();
			Registration.fillState(webdriver, state);
			waitTime();
			Registration.fillZip(webdriver, String.valueOf(zip));
			waitTime();
			Registration.fillCountry(webdriver, country);
			waitTime();
			Registration.selectLanguage(webdriver, language);
			waitTime();
			Registration.selectCategory(webdriver, category);
			waitTime();
			Registration.clickMyList(webdriver, myList);
			waitTime();
			Registration.clickMyBanner(webdriver, myBanner);
			waitTime();
			Registration.clickSubmit(webdriver);
			waitTime();
		}

		// Go to Menu after registration of users is complete
		SignIn.navigateToMenu(webdriver);

		// Sign in new user
		int userName = (int) Double.parseDouble(ExcelUtils.getDataAt(1, 0));
		String password = ExcelUtils.getDataAt(1, 1);
		SignIn.fillSIUsername(webdriver, String.valueOf(userName));
		waitTime();
		SignIn.fillSIPassword(webdriver, password);
		waitTime();
		SignIn.clickSILogin(webdriver);

		// Close Excell
		ExcelUtils.closeExcell();

		// Go to My Account and change First name
		MyAccount.navigateMyAccount(webdriver);
		waitTime2();
		String ime = "Nenad";
		Registration.fillFirstName(webdriver, ime);
		waitTime2();

		// Go to Fish menu and add large and small AngelFish
		Cart.nagivateToFish(webdriver);
		waitTime();
		Cart.enterAngelFish(webdriver);
		waitTime();
		Cart.addLargeAF(webdriver);
		waitTime();
		Cart.nagivateToFish(webdriver);
		waitTime();
		Cart.enterAngelFish(webdriver);
		waitTime();
		Cart.addSmallAF(webdriver);
		waitTime2();

		// Remove last item from shopping cart
		Cart.removeLastItem(webdriver);

		// Finish buying items from cart
		waitTime2();
		Cart.buySubmit(webdriver);
		waitTime2();
		Cart.continueSubmit(webdriver);
		waitTime2();
		Cart.finishBuying(webdriver);

		// Sign out and close driver
		waitTime2();
		SignOut.signOut(webdriver);
		waitTime2();
		webdriver.close();

	}

}
