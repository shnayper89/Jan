import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by spirit on 8/1/16.
 */
public class JandH {
    FirefoxDriver driver = new FirefoxDriver();
    Autorization autorization = new Autorization(driver);
    AddToCart addToCart = new AddToCart(driver);
    CheckReelSpool checkReelSpool = new CheckReelSpool(driver);
    DeleteFromCart deleteFromeCart = new DeleteFromCart(driver);
    Checkout checkout = new Checkout(driver);
    PaymentMethod paymentmethod = new PaymentMethod(driver);

    @Before

    public void before() {
        driver.get("http://jandh3-test.php-cd.attractgroup.com/");
    }

    @Test
    public void firstTest() throws InterruptedException {
        Thread.sleep(2000);
        autorization.clickOnYourAccount();
        Thread.sleep(2000);
        autorization.clickOnSignIn();
        Thread.sleep(2000);
        autorization.inputUserData("qakelremtest1@kismail.ru", "111111");
        Thread.sleep(2000);
        autorization.clickOnLogin();
        Thread.sleep(2000);
        autorization.clickOnYourAccount();
        Thread.sleep(2000);
        autorization.checkLogin("Your Account");
        Thread.sleep(2000);
        addToCart.before();

        for (int i = 0; i < 1; i++) {
            addToCart.choseItem();
            checkReelSpool.checkReelSpool();
        }

        addToCart.after();

        checkout.proceedToCheckout(".btn", "Proceed to Checkout");

        checkout.placeYourOrder();

}


}
    //@After

    //public void close() {driver.close();}


