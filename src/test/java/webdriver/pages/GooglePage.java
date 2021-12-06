package webdriver.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;



//https://www.selenium.dev/documentation/guidelines/page_object_models/

/**
 * The Class represents GooglePage.
 *
 *
 */
public class GooglePage extends BasePage {
	
	/** The searchinput. */
	@FindBy(name = "q")
	private WebElement searchinput;


	/**
	 * Instantiates a new google page.
	 *
	 * @param driver the driver
	 */
	public GooglePage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Searches the given text.
	 *
	 * @param key the key
	 */
	public void searchText(String key) {
		//waitForElementToAppear(driver, searchInput2, 2, searchinput+" NOT Found");
		searchinput.sendKeys(key + Keys.ENTER);
	}


	public void waitForElementToAppear(WebDriver driver, By selector, long timeOutInSeconds, String timeOutMessage) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
		} catch (TimeoutException e) {
			throw new IllegalStateException(timeOutMessage);
		}
	}




}
