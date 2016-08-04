import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by spirit on 8/2/16.
 */
public class CheckReelSpool {
    private final WebDriver driver;

    public CheckReelSpool(WebDriver driver) {this.driver = driver;}

    public void checkReelSpool() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);


        Random rand = new Random();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if (driver.findElement(By.id("popup")).isDisplayed()) {

            driver.findElement(By.id("popup_confirm_ok")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            int i;
            do {
                i = rand.nextInt(5);
            } while(i==2);
            System.out.println(i);
            driver.findElements(By.cssSelector(".spooling_radio__label")).get(i).click();

            driver.findElement(By.id("line_btn_1")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".chosen-single>div>b")));
            driver.findElements(By.cssSelector(".chosen-single>div>b")).get(0).click();

            driver.findElement(By.xpath(".//*[@id='linespool_params_block']/form/div/div[1]/div/ul/li[4]")).click();

            driver.findElements(By.cssSelector(".chosen-single>div>b")).get(1).click();

            driver.findElement(By.xpath(".//*[@id='linespool_params_block']/form/div/div[2]/div/ul/li[2]")).click();

            driver.findElements(By.cssSelector(".chosen-single>div>b")).get(2).click();

            driver.findElement(By.xpath(".//*[@id='linespool_params_block']/form/div/div[3]/div/ul/li[2]")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("line_btn_2")));
            driver.findElement(By.cssSelector("line_btn_2")).click();


        }

    }


}
