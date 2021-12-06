package webdriver.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;



public class GooglePage2 extends PageActions {

    public String urlMain = "http://www.google.com";
    public By searchMain = By.name("q");

    public GooglePage2(WebDriver driver) {
        super(driver);
    }


    public void searchText(String text) {
        waitForElementToAppear(driver, searchMain, 2, text + " NOT Found");
        driver.findElement(searchMain).sendKeys(text + Keys.ENTER);
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
