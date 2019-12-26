package web_page.objects;

public class Paths {
	public static final String ENTER_SHOP = "//a[contains(text(),'Enter the Store')]";

	public static final String FISH_TOP = "//div[@id='QuickLinks']//a[1]//img[1]";
	public static final String DOGS_TOP = "//div[@id='Header']//a[2]//img[1]";
	public static final String REPTILES_TOP = "//div[@id='Header']//a[3]//img[1]";
	public static final String CATS_TOP = "//div[@id='Header']//a[4]//img[1]";
	public static final String BIRDS_TOP = "//div[@id='Header']//a[5]//img[1]";

	public static final String FISH_SIDE_BAR = "//div[@id='Content']//a[1]//img[1]";
	public static final String DOGS_SIDE_BAR = "//div[@id='Content']//a[2]//img[1]";
	public static final String REPTILES_SIDE_BAR = "//div[@id='Content']//a[4]//img[1]";
	public static final String CATS_SIDE_BAR = "//div[@id='Content']//a[3]//img[1]";
	public static final String BIRDS_SIDE_BAR = "//div[@id='Content']//a[5]//img[1]";

	public static final String FISH_PICTURE = "//body//area[2]";
	public static final String DOGS_PICTURE = "//body//area[3]";
	public static final String REPTILES_PICTURE = "//body//area[4]";
	public static final String CATS_PICTURE = "//body//area[5]";
	public static final String BIRDS_PICTURE = "//body//area[6]";

	public static final String SIGN_IN = "//a[contains(text(),'Sign In')]";
	public static final String SI_USERNAME = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]";
	public static final String SI_PASSWORD = "//input[@name='password']";
	public static final String SI_LOGIN = "//input[@name='signon']";
	public static final String SI_REGISTER = "//a[contains(text(),'Register Now!')]";

	public static final String USER_ID = "//input[@name='username']";
	public static final String NEW_PASSWORD = "//input[@name='password']";
	public static final String REPEAT_PASSWORD = "//input[@name='repeatedPassword']";
	public static final String FIRST_NAME = "//input[@name='account.firstName']";
	public static final String LAST_NAME = "//input[@name='account.lastName']";
	public static final String EMAIL = "//input[@name='account.email']";
	public static final String PHONE = "//input[@name='account.phone']";
	public static final String ADRESS_1 = "//input[@name='account.address1']";
	public static final String ADRESS_2 = "//input[@name='account.address2']";
	public static final String CITY = "//input[@name='account.city']";
	public static final String STATE = "//input[@name='account.state']";
	public static final String ZIP = "//input[@name='account.zip']";
	public static final String COUNTRY = "//input[@name='account.country']";
	public static final String LANGUAGE = "//select[@name='account.languagePreference']";

	public static final String CATEGORY = "//select[@name='account.favouriteCategoryId']";
	public static final String MY_LIST = "//input[@name='account.listOption']";
	public static final String MY_BANNER = "//input[@name='account.bannerOption']";
	public static final String SUBMIT = "//input[@name='newAccount']";

	public static final String MY_ACCOUNT = "//a[contains(text(),'My Account')]";

	public static final String CART = "//img[@name='img_cart']";
	public static final String REMOVE_1 = "/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[8]/a[1]";
	public static final String ANGELFISH = "//a[contains(text(),'FI-SW-01')]";
	public static final String ADD_LARGE_ANGELFISH = "//tr[2]//td[5]//a[1]";
	public static final String LARGE_ANGELFISH = "//a[contains(text(),'EST-1')]";
	public static final String ADD_SMALL_ANGELFISH = "//tr[3]//td[5]//a[1]";
	public static final String SMALL_ANGELFISH = "//a[contains(text(),'EST-2')]";
	public static final String BULLDOG = "//a[contains(text(),'K9-BD-01')]";
	public static final String ADD_FEMALE_BULLDOG = "//a[contains(text(),'EST-7')]";
	public static final String IGUANA = "//a[contains(text(),'EST-7')]";
	public static final String ADD_GREEN_IGUANA = "//a[@class='Button']";
	public static final String GREEN_IGUANA = "//a[contains(text(),'EST-13')]";
	public static final String BUY_SUBMIT = "//a[contains(text(),'Proceed to Checkout')]";
	public static final String BUY_CONTINUE = "//input[@name='newOrder']";
	public static final String FINISH_BUYING = "//a[@class='Button']";

	public static final String SIGN_OUT = "//a[contains(text(),'Sign Out')]";
}
