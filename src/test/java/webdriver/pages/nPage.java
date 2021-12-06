package webdriver.pages;
import org.openqa.selenium.*;
import org.openqa.selenium.By;

//https://www.selenium.dev/documentation/webdriver/web_element/

public class nPage {
    protected WebDriver driver;

    private By usernameBy = By.name("user_name");
    private By passwordBy = By.name("password");
    private By signinBy = By.name("sign_in");

    public nPage(WebDriver driver){
        this.driver = driver;
    }

    public nPage loginValidUser(String userName, String password) {
        driver.findElement(usernameBy).sendKeys(userName);
        driver.findElement(passwordBy).sendKeys(password);
        driver.findElement(signinBy).click();
        return this;
    }
}

