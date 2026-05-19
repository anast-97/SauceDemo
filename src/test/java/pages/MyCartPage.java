package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class MyCartPage extends BasePage {

    public MyCartPage(WebDriver driver) {
        super(driver);
    }

        protected final static By CHECKOUT_BUTTON = By.cssSelector("#checkout");
        protected final static By CONTINUE_SHOPPING_BUTTON = By.cssSelector("#continue-shopping");
        protected final static By MENU_BUTTON = By.cssSelector("#react-burger-menu-btn");
        protected final static By ALL_ITEM_BUTTON = By.cssSelector("#inventory_sidebar_link");
        protected final static By ABOUT_BUTTON = By.cssSelector("#about_sidebar_link");
        protected final static By LOGOUT_BUTTON = By.cssSelector("#logout_sidebar_link");
        protected final static By RESET_APP_STATE_BUTTON = By.cssSelector("#reset_sidebar_link");
        protected final static By CLOSE_MENU_BUTTON = By.cssSelector("#react-burger-cross-btn");

        Alert alert;

        public boolean checkoutButtonDisplayed() {
            try {
                driver.findElement(CHECKOUT_BUTTON).isDisplayed();
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }

        public boolean continueShoppingButtonDisplayed() {
            try {
                WebElement element = driver.findElement(CONTINUE_SHOPPING_BUTTON);
                wait.until(ExpectedConditions.elementToBeClickable(element));
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }

        }

        public void clickToMenuButton() {
            driver.findElement(MENU_BUTTON).click();
        }

        public void clickToAllItemButton() {
            driver.findElement(ALL_ITEM_BUTTON).click();
        }

        public void clickToAboutButton() {
            driver.findElement(ABOUT_BUTTON).click();
        }

        public void clickToLogoutButton() {
            driver.findElement(LOGOUT_BUTTON).click();
        }

        public void clickToResetButton() {
            driver.findElement(RESET_APP_STATE_BUTTON).click();
        }

        public void clickToCloseButton() {
            driver.findElement(CLOSE_MENU_BUTTON).click();
        }

        public void clickToCheckoutButton() {
            driver.findElement(CHECKOUT_BUTTON).click();
        }

    }

