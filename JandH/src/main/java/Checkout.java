import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by spirit on 8/3/16.
 */
public class Checkout {
    public final WebDriver driver;

    public Checkout(WebDriver driver) {
        this.driver = driver;
    }

     public void proceedToCheckout(String locator,String ButtonText) throws InterruptedException {

        Thread.sleep(2000);
        List<WebElement> buttons = driver.findElements(By.cssSelector(locator));
        for(WebElement button:buttons){
        if (button.getText().equals(ButtonText)){
            button.click();
            break;
        }
        }


    }
     public void placeYourOrder() { driver.findElements(By.cssSelector(".btn.review.orange.place_order")).get(0).click();}
}