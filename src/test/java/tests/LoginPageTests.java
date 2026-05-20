package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest{

    @Test(groups = "Smoke", description = "Авторизация на сайте SauceDemo")
    public void loginTest(){
        loginPage.openLoginPage();
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isMyCartDisplayed());
    }
}
