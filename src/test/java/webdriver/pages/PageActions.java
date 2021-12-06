package webdriver.pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;



public class PageActions extends BasePage{
    //protected nLocators.page1locators page1 = new nLocators().page1locators()

    public PageActions(WebDriver driver) {
        super(driver);
    }


    public void click(By locator, int timeOutInSeconds)  {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
            wait.until(ExpectedConditions.elementToBeClickable(locator));
            driver.findElement(locator).click();
        } catch (TimeoutException e) {
            throw new IllegalStateException(locator + " NOT FOUND");
        }
    }


    public void navigate(String url, int timeOutInSeconds) {
        try {
            driver.get(url);
            WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("html")));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            assert js.executeScript("return document.readyState;").equals("complete");
        } catch (TimeoutException e) {
            throw new IllegalStateException("Can't load page at " + url);
        }
    }


    public void highlight(By locator, int timeOutInSeconds) throws Exception{
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(locator);
        String original_style = element.getAttribute("style");
        js.executeScript("arguments[0]. setAttribute('style', 'border:5px solid red; background:yellow')", element);
        //Thread.sleep(timeOutInSeconds);
        //js.executeScript(original_style, element); //restore
    }


}
