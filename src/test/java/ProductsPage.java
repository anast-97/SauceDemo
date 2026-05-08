import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductsPage extends  BasePage {
    protected final static By ADD_BUTTON = By.cssSelector(".btn.btn_inventory");
    protected final static By ITEM_PRICE = By.cssSelector(".inventory_item_price");
    protected final static By PRODUCT_DESCRIPTION = By.cssSelector(".inventory_item_desc");
    private final static String ITEM_CONTAINER = "//div[@class='inventory_item' and .//div[contains(@class, 'inventory_item_name') and contains(text(), '%s')]]";

    private final static By MY_CART_BUTTON = By.cssSelector(".shopping_cart_link");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isMyCartDisplayed() {
        try {
            WebElement element = driver.findElement(MY_CART_BUTTON);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void clickToAddButton(String productName) {
        this.getProductCartByName(productName).findElement(ADD_BUTTON).click();
    }

    public String getProductPrice(String productName) {
        return
                this.getProductCartByName(productName).findElement(ITEM_PRICE).getText();
    }

    public String getProductDescription(String productName) {
        return
                this.getProductCartByName(productName).findElement(PRODUCT_DESCRIPTION).getText();
    }

    public WebElement getProductCartByName(String productName) {
        return
                driver.findElement(By.xpath(String.format(ITEM_CONTAINER, productName)));
    }

    public void goToCartButton(){
        driver.findElement(MY_CART_BUTTON).click();
    }
}



