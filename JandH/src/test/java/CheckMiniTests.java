import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by spirit on 8/4/16.
 */
public class CheckMiniTests {
    FirefoxDriver driver = new FirefoxDriver();
    Autorization autorization = new Autorization(driver);
    AddToCart addToCart = new AddToCart(driver);
    CheckReelSpool checkReelSpool = new CheckReelSpool(driver);
    DeleteFromCart deleteFromeCart = new DeleteFromCart(driver);
    Checkout checkout = new Checkout(driver);
    PaymentMethod paymentmethod = new PaymentMethod(driver);
    Check_OrderIsPlaced check_OrderIsPlaced = new Check_OrderIsPlaced(driver);

    @Before

    public void before() {
        driver.get("http://jandh3-test.php-cd.attractgroup.com/");
    }

    @Test
    public void firstTest() throws InterruptedException {

        autorization.clickOnYourAccount();

        autorization.clickOnSignIn();

        autorization.inputUserData("qakelremtest1@kismail.ru", "111111");
        autorization.clickOnLogin();
        autorization.clickOnYourAccount();

        autorization.checkLogin("Your Account");
        driver.get("http://jandh3-test.php-cd.attractgroup.com/checkout/success/41281");

        check_OrderIsPlaced.check_OrderIsPlaced();
    }
}
