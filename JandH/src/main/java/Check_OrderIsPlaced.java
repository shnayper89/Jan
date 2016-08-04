import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by spirit on 8/4/16.
 */
public class Check_OrderIsPlaced {
    public final WebDriver driver;

    public Check_OrderIsPlaced(WebDriver driver) {
        this.driver = driver;
    }

    public void check_OrderIsPlaced() throws InterruptedException {
        Autorization blabla = new Autorization(driver);
        Thread.sleep(10000);
        String testNumOfOrder = driver.findElement(By.cssSelector(".order_num")).getText().substring(14);
        Thread.sleep(2000);
        blabla.clickOnYourAccount();
        Thread.sleep(2000);
        blabla.clickOnYourOrder();
        Thread.sleep(2000);
        String numOfOrder = driver.findElements(By.cssSelector(".name")).get(4).getText().substring(7, 15);
        System.out.println(testNumOfOrder);
        System.out.println(numOfOrder);
        if(testNumOfOrder.equals(numOfOrder)) {
            System.out.println("Order is created");
        }
        else System.out.println("Order is not created!!!!");
    }






}
