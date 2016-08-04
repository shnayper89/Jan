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

        for (int i = 0; i < 4; i++) {
            addToCart.before();
            addToCart.choseItem();
            checkReelSpool.checkReelSpool();
        }

        addToCart.after();

        checkout.proceedToCheckout(".btn", "Proceed to Checkout");

        paymentmethod.clickOnChangePaymentMethod();
        paymentmethod.selectionPaymentMethod_CreditCard();
        paymentmethod.clickOnPlaceYourOrder();

        check_OrderIsPlaced.check_OrderIsPlaced();

}


}
    //@After

    //public void close() {driver.close();}


