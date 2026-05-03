import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected ProductsPage productsPage;
    protected MyCartPage myCartPage;

    @BeforeMethod(alwaysRun = true)
    @Parameters({"browserName", "message"})
    public void setUp(@Optional("fireFox") String browserName, @Optional("No message") String message) {
        if (browserName.equals("fireFox")) {
            this.driver = new FirefoxDriver();
        } else
            if (browserName.equals("chrome")){
                this.driver = new ChromeDriver();
            }
        System.out.println(message);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        this.loginPage = new LoginPage(driver);
        this.productsPage = new ProductsPage(driver);
        this.myCartPage = new MyCartPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        this.driver.quit();
    }
}
