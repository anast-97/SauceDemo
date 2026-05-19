package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class LoginPage extends BasePage {
    protected final static By EMAIL_VALUE = By.cssSelector("#user-name");
    protected final static By PASSWORD_VALUER = By.cssSelector("#password");
    protected final static By LOGIN_BUTTON = By.cssSelector("#login-button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openLoginPage() {
        driver.navigate().to("https://www.saucedemo.com/");
    }

    public void setEmailValue(String email) {
        driver.findElement(EMAIL_VALUE).sendKeys(email);
    }

    public void setPasswordValue(String password) {
        driver.findElement(PASSWORD_VALUER).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(LOGIN_BUTTON).click();
    }

    public void login(String email, String password) {
        setEmailValue(email);
        setPasswordValue(password);
        clickLoginButton();
    }
}

