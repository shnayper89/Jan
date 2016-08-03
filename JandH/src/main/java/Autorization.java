import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by spirit on 8/1/16.
 */
public class Autorization {

    private final WebDriver driver;

    public Autorization(WebDriver driver) {this.driver = driver;}

    public void clickOnYourAccount() throws InterruptedException {

        driver.findElements(By.cssSelector(".elem_nav.dropdown_opener")).get(0).click();
    }
    public void clickOnSignIn() {
        driver.findElement(By.cssSelector(".btn.average.open_popup")).click();
    }
    public void inputUserData (String account, String pass){
    driver.findElements(By.cssSelector(".input_wrapper>input")).get(0).sendKeys(account);
    driver.findElements(By.cssSelector(".input_wrapper>input")).get(1).sendKeys(pass);
    }
    public void clickOnLogin() {
    driver.findElement(By.cssSelector(".btn.login_btn")).click();

    }
    public void checkLogin(String keyword)

    {
        assertEquals(driver.findElements(By.cssSelector(".link_list>li>a")).get(2).getText(), (keyword));
    }


}
