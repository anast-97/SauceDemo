package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class CheckoutPage extends BasePage {

        protected final static By CONTINUE_BUTTON = By.cssSelector("#continue");

        public CheckoutPage(WebDriver driver) {
            super(driver);
        }

        public boolean isContinueButtonDisplayed() {
            try {
                driver.findElement(CONTINUE_BUTTON).isDisplayed();
                return true;
            }
            catch (NoSuchElementException e){
                return false;
            }
        }

    }

