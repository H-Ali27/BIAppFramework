package StepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverManager;

import java.time.Duration;

public class RAASTPayIDStep {
    private WebDriver driver;
    private WebDriverWait wait;

    public RAASTPayIDStep() {
        this.driver = DriverManager.getDriver();  // Using same WebDriver instance
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }






    @And("the user clicks on Fund Transfer by RAAST ID")
    public void the_user_clicks_on_fund_transfer_by_raast_id() {
        WebElement fundTransferByRaastID = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.bi.digitalbanking:id/2131362240")));
        fundTransferByRaastID.click();
        System.out.println("Clicked on Fund Transfer by RAAST ID.");
    }












//    @And("the user clicks on Review Details")
//    public void the_user_clicks_on_review_details() {
//        WebElement reviewDetailsButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.bi.digitalbanking:id/2131362226")));
//        reviewDetailsButton.click();
//        System.out.println("Clicked on Review Details.");
//    }









}
