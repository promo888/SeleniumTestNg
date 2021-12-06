package webdriver.tests;

import webdriver.pages.GooglePage2;
import org.testng.Assert;
import org.testng.annotations.Test;

import webdriver.factory.PageinstancesFactory;
import webdriver.pages.GooglePage;

/**
 * The Class GoogleSearchTest.
 *
 *
 */
@Test(testName = "Google search test", description = "Test description")
public class GoogleSearchTest extends BaseTest {

	/**
	 * Google search test.
	 */
	@Test
	public void googleSearchTest() {
		driver.get("https://www.google.com/");
		GooglePage googlePage = PageinstancesFactory.getInstance(GooglePage.class);
		googlePage.searchText("abc");
		Assert.assertTrue(driver.getTitle().contains("abc"), "Title doesn't contain abc : Test Failed");
	}

	@Test
	public void googleSearchTest2() throws Exception {
		GooglePage2 googlePage = PageinstancesFactory.getInstance(GooglePage2.class);
		googlePage.navigate(googlePage.urlMain, 3);
		googlePage.searchText("selenium");
		googlePage.highlight(googlePage.searchMain, 3);
		Assert.assertTrue(driver.getTitle().contains("selenium"), "Title doesn't contain selenium : Test Failed");
	}
}
