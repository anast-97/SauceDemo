import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsPageTests extends BaseTest{

    @Test(groups = "Smoke")
    public void getProductPriceTest() {
        loginPage.openLoginPage();
        loginPage.login("standard_user", "secret_sauce");
        String productName = "Sauce Labs Bolt T-Shirt";
        Assert.assertEquals(productsPage.getProductPrice(productName), "$15.99");
        Assert.assertEquals(productsPage.getProductDescription(productName), "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.");
    }

    @Test
    public void addToCartTest(){
        loginPage.openLoginPage();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.clickToAddButton("Sauce Labs Onesie");
        productsPage.clickToCartButtonAndGo();
        Assert.assertTrue(myCartPage.checkoutButtonDisplayed());
    }
}


