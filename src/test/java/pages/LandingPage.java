package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class LandingPage {

    WebDriver driver;
    Wait wait;

    private String landingPageUrl = "http://automationpractice.com/index.php";
    private String signInButtonXpath = "//a[@class='login']";
    private String signInPageUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    private String currentUrl ="";

    public LandingPage(WebDriver driver, Wait wait){
        this.driver=driver;
        this.wait= wait;
    }

    public void navigateToLandingPage(){

        driver.navigate().to(landingPageUrl);
    }

    public void clickSignInButton(){
        driver.findElement(By.xpath(signInButtonXpath)).click();
    }

    public void userNavigatedLoginPage(){
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(signInPageUrl,currentUrl);
    }







}
