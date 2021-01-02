package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.LandingPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class TestStepsUI {

    Wait wait;
    WebDriver driver;
    Actions action;

    LandingPage landingPage ;
    LoginPage loginPage;

    @Before("@UI")
    public void testInitialization(){
        System.getProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
        action = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        landingPage = new LandingPage(driver,wait);
        loginPage = new LoginPage(driver, wait);

    }

    @Given("user is on landing page")
    public void user_is_on_landing_page() {

        landingPage.navigateToLandingPage();

    }

    @And("user cliks sign in button")
    public void user_cliks_sign_in_button() {

        landingPage.clickSignInButton();

    }

    @Then("user is navigated LoginPage")
    public void user_is_navigated_LoginPage() {

        landingPage.userNavigatedLoginPage();

    }

    @When("sign in with no credentials")
    public void sign_in_with_no_credentials() {
        loginPage.clickSignInButton();
    }


    @Then("There will be an error message")
    public void there_will_be_an_error_message() {
        loginPage.checkErrorMessage();
    }

    @When("only email is entered")
    public void only_email_is_entered() {
        loginPage.fillEmail();
        loginPage.clickSignInButton();
    }

    @Then("There will be an error message1")
    public void there_will_be_an_error_message1() {
        loginPage.checkErrorMessageForPassword();
    }

    @When("only password is entered")
    public void only_password_is_entered() {
        loginPage.fillPassword();
        loginPage.clickSignInButton();
    }

    @Then("There will be an error message2")
    public void there_will_be_an_error_message2() {
        loginPage.checkErrorMessageForEmail();
    }

    @When("email and password are incorrect")
    public void email_and_password_are_incorrect() {
        loginPage.fillEmail();
        loginPage.fillPassword();
        loginPage.clickSignInButton();
    }
    @Then("There will be an error message3")
    public void there_will_be_an_error_message3() {
        loginPage.checkErrorMessageForAuthentication();
    }


    @After("@UI")
    public void tearDown(){
        driver.quit();
    }

}
