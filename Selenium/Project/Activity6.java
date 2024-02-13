package lmsproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Activity6 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String username = "root";
        String password = "pa$$w0rd";

        driver.get("https://alchemy.hguy.co/lms/");
        driver.findElement(By.xpath("//a[text()='My Account']")).click();

        Assert.assertEquals("My Account – Alchemy LMS", driver.getTitle(), "not matched with expected result");
        //Click on,login button
        driver.findElement(By.xpath("//a[@class='ld-login ld-login ld-login-text ld-login-button ld-button']")).click();

        boolean conditon = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("user_login")))).isDisplayed();
        System.out.println(conditon);
        if(conditon==true) {
            driver.findElement(By.id("user_login")).sendKeys(username);
            driver.findElement(By.id("user_pass")).sendKeys(password);
            driver.findElement(By.id("wp-submit")).click();

            System.out.println(driver.findElement(By.id("wp-admin-bar-my-account")).getText());
            Assert.assertEquals("Howdy, " + username, driver.findElement(By.id("wp-admin-bar-my-account")).getText(), "Not matched with expected result");
        }
        driver.close();

    }
}
