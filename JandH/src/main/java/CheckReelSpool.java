import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by spirit on 8/2/16.
 */
public class CheckReelSpool {
    private final WebDriver driver;

    public CheckReelSpool(WebDriver driver) {this.driver = driver;}

    public void checkReelSpool() throws InterruptedException {
        Thread.sleep(2000);
        if (driver.findElement(By.id("popup")).isDisplayed()) {
            Thread.sleep(2000);
            driver.findElement(By.xpath(".//*[@id='popup_confirm_ok']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath(".//*[@id='line_form_1']/div[2]/label")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath(".//*[@id='line_btn_1']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath(".//*[@id='linespool_params_block']/form/div/div[1]/a/div/b")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath(".//*[@id='linespool_params_block']/form/div/div[1]/div/ul/li[4]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath(".//*[@id='linespool_params_block']/form/div/div[2]/a/div")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath(".//*[@id='linespool_params_block']/form/div/div[2]/div/ul/li[2]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath(".//*[@id='linespool_params_block']/form/div/div[3]/a/div/b")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath(".//*[@id='linespool_params_block']/form/div/div[3]/div/ul/li[2]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath(".//*[@id='line_btn_2']")).click();
            driver.get("http://jandh3-test.php-cd.attractgroup.com/");

        }
        else {driver.get("http://jandh3-test.php-cd.attractgroup.com/");}
    }


}
