package webdriver.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import webdriver.factory.PageinstancesFactory;
import webdriver.pages.FacebookLoginPage;

/**
 * The Class FaceBookLoginTest.
 *
 *
 */
@Test(testName = "Facebook login test", description = "Facebook login test")
public class FaceBookLoginTest extends BaseTest {

	@Test
	public void facebookLoginTest() {
		driver.get("https://www.facebook.com/");
		FacebookLoginPage facebookLoginPage = PageinstancesFactory.getInstance(FacebookLoginPage.class);
		facebookLoginPage.enterEmail("abc").enterPassword("abc").clickSignIn();
		Assert.assertTrue(false, "Login failed : Test failed");
	}
}
