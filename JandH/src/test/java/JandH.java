import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by spirit on 8/1/16.
 */
public class JandH {
    FirefoxDriver driver = new FirefoxDriver();
    Autorization qakelremtest = new Autorization(driver);
    AddToCart order = new AddToCart(driver);
    CheckReelSpool checkReelSpool = new CheckReelSpool(driver);
    DeleteFromCart deleteFromeCurt = new DeleteFromCart(driver);
    Checkout checkout = new Checkout(driver);

    @Before

    public void before() {
        driver.get("http://jandh3-test.php-cd.attractgroup.com/");
    }

    @Test
    public void firstTest() throws InterruptedException {

        qakelremtest.clickOnYourAccount();
        qakelremtest.clickOnSignIn();
        qakelremtest.inputUserData("qakelremtest1@kismail.ru", "111111");
        qakelremtest.clickOnLogin();
        qakelremtest.clickOnYourAccount();
        qakelremtest.checkLogin("Your Account");

        order.before();
        //for (int i = 0; i < 1; i++) {
            order.choseItem();
            checkReelSpool.checkReelSpool();
        //}

        order.after();


    }

}
    //@After

    //public void close() {driver.close();}


