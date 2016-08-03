import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by spirit on 8/1/16.
 */
public class AddToCart {

    private final WebDriver driver;
    public AddToCart(WebDriver driver) {this.driver = driver;}

    @Before
    public void before() {
        driver.get("http://jandh3-test.php-cd.attractgroup.com/");
    }
    @Test
    public void choseItem() throws InterruptedException {


    driver.findElements(By.cssSelector(".item>a>img")).get(0).click();
    driver.findElements(By.cssSelector(".btn.add_to_cart")).get(0).click();





    }
    @After
    public void after() {driver.findElement(By.cssSelector(".elem_nav.cart"));}
}

/*
 order.before();
        for (int i = 0; i < 4; i++) {
            order.choseItem();
            checkReelSpool.checkReelSpool();
        }
 */