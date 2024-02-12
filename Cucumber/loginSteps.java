package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginSteps {
    WebDriver driver;
    WebDriverWait wait;

    @Given("^User is on Login page$")
    public void loginPage() {
        //Setup instances
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Open browser
        driver.get("https://v1.training-support.net/selenium/login-form");
    }
    @When("^User enters username and password$")
    public void enterCredentials() {
        //Enter username
        driver.findElement(By.id("username")).sendKeys("admin");
        //Enter password
        driver.findElement(By.id("password")).sendKeys("password");
        //Click Login
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Then("^Read the page title and confirmation message$")
    public void readTitleAndHeading() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));

        System.out.println("Title of Page is: "+driver.getTitle());
        System.out.println("confirm msg is: "+driver.findElement(By.id("action-confirmation")).getText());
    }

    @And("^Close the Browser$")
    public void closeBrowser() {
        //Close browser
        driver.close();
    }


}
