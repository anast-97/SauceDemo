import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest{

    @Test(groups = "Smoke")
    public void loginTest(){
        loginPage.openLoginPage();
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isMyCartDisplayed());
    }
}
