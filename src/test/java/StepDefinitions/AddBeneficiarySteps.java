package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverManager;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class AddBeneficiarySteps {
    private WebDriver driver;
    private WebDriverWait wait;

    public AddBeneficiarySteps() {
        this.driver = DriverManager.getDriver();  // Using same WebDriver instance
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
//    @Given("the user is on the home screen")
//    public void the_user_is_on_the_home_screen() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        try {
//            WebElement homeScreenElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
//                    By.id("com.bi.digitalbanking:id/2131362794"))); // ✅ Ensure correct ID
//            org.junit.Assert.assertTrue("Home Screen not visible!", homeScreenElement.isDisplayed());
//            System.out.println(" Home Screen is visible.");
//        } catch (Exception e) {
//            System.out.println(" Home Screen not visible.");
//            e.printStackTrace();
//            Assert.fail("Failed: Home screen element not found.");
//        }
//    }
//
//    @And("the user navigates to the 'Beneficiary' section")
//    public void the_user_navigates_to_the_beneficiary_section() {
//        WebElement addBeneficiaryButtonMain = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.bi.digitalbanking:id/2131362993")));
//        addBeneficiaryButtonMain.click();
//    }

//    @And("the user adds the beneficiary")
//    public void the_user_adds_the_beneficiary() {
//        // Click on the 'Add Beneficiary' button on the 'My Beneficiary' screen
//        WebElement addBeneficiaryButtonOnBeneficiaryScreen = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.bi.digitalbanking:id/2131362226")));
//        addBeneficiaryButtonOnBeneficiaryScreen.click();
//    }

    @And("the user selects the bank")
    public void the_user_selects_the_bank() {
        // Step 1: Open the dropdown IBFT
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.bi.digitalbanking:id/2131363401")));
        dropdown.click();

// Step 2: Search for "Bank" in the search field in IBFT
        WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bi.digitalbanking:id/2131363383")));
        searchField.sendKeys("BankIslami");

// Step 3: Locate the Bank element by XPath
        WebElement bankElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.bi.digitalbanking:id/2131362503")));

// Step 4: Use WebDriver's click method to select Bank
        bankElement.click();
    }

    @And("the user enters the account number")
    public void the_user_enters_the_account_number() {
        WebElement accountNumberField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bi.digitalbanking:id/2131362620")));
        accountNumberField.sendKeys("102700605260201");
    }

    @And("the user clicks the next button")
    public void the_user_clicks_the_next_button() {
        WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.bi.digitalbanking:id/2131362226")));
        nextButton.click();
    }

    @And("the user waits for the OTP and enters the nickname")
    public void the_user_waits_for_the_otp_and_enters_the_nickname() {


        WebElement otpScreen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bi.digitalbanking:id/2131363634")));
        assertTrue("Authentication is visible", otpScreen.isDisplayed());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement nicknameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bi.digitalbanking:id/2131362596")));
        nicknameField.sendKeys("Hamza BIPL");
    }

    @And("the user clicks on 'Add Beneficiary' Button")
    public void the_user_clicks_on_add_beneficiary_button() {
        WebElement addBeneficiaryButtonFinal = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.bi.digitalbanking:id/2131362226")));
        addBeneficiaryButtonFinal.click();
    }

    @Then("the user should see a confirmation message 'Beneficiary added successfully' and click Ok")
    public void the_user_should_see_a_confirmation_message_and_click_Ok () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.bi.digitalbanking:id/2131362191")));
        okButton.click();
    }

    @And("the user navigates to the home screen")
    public void the_user_navigates_to_the_home_screen() {
        WebElement addBeneficiaryButtonFinal = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.bi.digitalbanking:id/2131362831")));
        addBeneficiaryButtonFinal.click();
    }
}
