import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



/**
 * Created by spirit on 8/3/16.
 */
public class PaymentMethod {
    public final WebDriver driver;
    public PaymentMethod(WebDriver driver) {this.driver = driver;}

    public void clickOnChangePaymentMethod() {driver.findElement(By.cssSelector(".change.checkout_change_payment")).click();}

    public void selectionPaymentMethod_CreditCard() throws InterruptedException {
        Thread.sleep(2000);
        if (driver.findElement(By.id("add_new_card")).getText().equals("Add new card")) {
            driver.findElement(By.id("save_payment_card")).click();

        }

        else if(driver.findElement(By.cssSelector(".payment_tab_1.show_tab.active")).getText().equals("PayPal")) {
            driver.findElement(By.cssSelector(".payment_tab_2.show_tab")).click();
            driver.findElement(By.id("save_payment_card")).click();
        }
        else System.out.print("Payment Method is not selected");
    }

    public void selectionPaymentMethod_Paypal() throws InterruptedException {
        Thread.sleep(2000);
        if (driver.findElement(By.id("add_new_card")).getText().equals("Add new card")) {
            driver.findElement(By.cssSelector(".payment_tab_1.show_tab")).click();
            driver.findElement(By.id("save_payment_paypal")).click();
        }
        else if(driver.findElement(By.cssSelector(".payment_tab_1.show_tab.active")).getText().equals("PayPal")) {
            driver.findElement(By.id("save_payment_paypal")).click();
        }
        else System.out.print("Payment Method is not selected");
    }

    public void clickOnPlaceYourOrder() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElements(By.cssSelector(".btn.review.orange.place_order")).get(0).click();}


}
