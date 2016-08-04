import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by spirit on 8/3/16.
 */
public class DeleteFromCart {
    private final WebDriver driver;
    public DeleteFromCart(WebDriver driver) {this.driver = driver;}
    @Before
    public void before() {driver.findElement(By.cssSelector(".elem_nav.cart")).click();}
    @Test
    public void deleteFromCart() throws InterruptedException {

        driver.findElements(By.cssSelector(".remove_from_cart")).get(0).click();
        Thread.sleep(2000);
        driver.findElement(By.id("popup_confirm_ok")).click();

    }
}


/*


 */