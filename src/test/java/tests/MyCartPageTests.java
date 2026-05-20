package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyCartPageTests extends BaseTest{

    @Test(groups = "Regression", description = "Проверка наличия товара в корзине")
    public void addToCartAndGo(){
        loginPage.openLoginPage();
        loginPage.login("standard_user", "secret_sauce");
        String productsName = "Sauce Labs Onesie";
        productsPage.clickToAddButton(productsName);
        productsPage.goToCartButton();
        Assert.assertTrue(myCartPage.checkoutButtonDisplayed());
    }
}
