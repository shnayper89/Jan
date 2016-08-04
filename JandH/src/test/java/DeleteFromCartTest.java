import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by spirit on 8/4/16.
 */
public class DeleteFromCartTest {
    FirefoxDriver driver = new FirefoxDriver();
    Autorization autorization = new Autorization(driver);
    AddToCart addToCart = new AddToCart(driver);
    CheckReelSpool checkReelSpool = new CheckReelSpool(driver);
    DeleteFromCart deleteFromCart = new DeleteFromCart(driver);
    Checkout checkout = new Checkout(driver);
    PaymentMethod paymentmethod = new PaymentMethod(driver);

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
        deleteFromCart.before();
        for (int i = 0; i < 100; i++) {

            deleteFromCart.deleteFromCart();
            Thread.sleep(2000);
        }



    }


}
//@After

//public void close() {driver.close();}


