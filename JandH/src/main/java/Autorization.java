import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by spirit on 8/1/16.
 */
public class Autorization {

    private final WebDriver driver;

    public Autorization(WebDriver driver) {this.driver = driver;}

    public void clickOnYourAccount() {
        driver.findElement(By.xpath("html/body/div[8]/header/div[2]/nav/div[1]/ul/li[1]/a")).click();
    }
    public void clickOnSignIn() {
        driver.findElement(By.cssSelector(".btn.average.open_popup")).click();
    }
    public void inputUserData (String account, String pass){
    driver.findElement(By.xpath(".//*[@id='signin_form']/div[1]/div[1]/input")).sendKeys(account);
    driver.findElement(By.xpath(".//*[@id='signin_form']/div[1]/div[2]/input")).sendKeys(pass);
    }
    public void clickOnLogin() {
    driver.findElement(By.xpath(".//*[@id='signin_form']/div[2]/button")).click();

    }
    public void checkRightEntry(String keyword)

    {
        assertEquals(driver.findElement(By.xpath("html/body/div[8]/header/div[2]/nav/div[1]/ul/li[1]/div/div[2]/ul/li[1]/ul/li[1]/a")).getText(), (keyword));
    }


}
