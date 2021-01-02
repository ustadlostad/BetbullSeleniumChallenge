package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class LoginPage {

    WebDriver driver;
    Wait wait;

    private String email = "test@betbull.com";
    private String password = "asdasd";
    private String signInButtonId = "SubmitLogin";
    private String addressFieldId = "email";
    private String passwordFieldId = "passwd";
    private String error1Xpath = "//div[@id='center_column']/div[@class ='alert alert-danger']";
    private String errorMessage1Xpath = "//div[@id='center_column']/div[@class ='alert alert-danger']/p";
    private String errorMessage2Xpath = "//div[@id='center_column']/div[@class ='alert alert-danger']/ol/li";


    public LoginPage(WebDriver driver, Wait wait){
        this.driver=driver;
        this.wait= wait;
    }

    public void clickSignInButton(){
        driver.findElement(By.id(signInButtonId)).click();
    }

    public void checkErrorMessage(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(error1Xpath))));
        Assert.assertEquals("There is 1 error",driver.findElement(By.xpath(errorMessage1Xpath)).getText());
        Assert.assertEquals("An email address required.",driver.findElement(By.xpath(errorMessage2Xpath)).getText());
    }

    public void fillEmail(){
        driver.findElement(By.id(addressFieldId)).sendKeys(email);
    }

    public void checkErrorMessageForPassword(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(error1Xpath))));
        Assert.assertEquals("There is 1 error",driver.findElement(By.xpath(errorMessage1Xpath)).getText());
        Assert.assertEquals("Password is required.",driver.findElement(By.xpath(errorMessage2Xpath)).getText());
    }

    public void fillPassword(){
        driver.findElement(By.id(passwordFieldId)).sendKeys(password);
    }

    public void checkErrorMessageForEmail(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(error1Xpath))));
        Assert.assertEquals("There is 1 error",driver.findElement(By.xpath(errorMessage1Xpath)).getText());
        Assert.assertEquals("An email address required.",driver.findElement(By.xpath(errorMessage2Xpath)).getText());
    }

    public void checkErrorMessageForAuthentication(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(error1Xpath))));
        Assert.assertEquals("There is 1 error",driver.findElement(By.xpath(errorMessage1Xpath)).getText());
        Assert.assertEquals("Authentication failed.",driver.findElement(By.xpath(errorMessage2Xpath)).getText());
    }





}
