package lmsproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Activity8 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String username = "root";
        String password = "pa$$w0rd";

        driver.get("https://alchemy.hguy.co/lms/");
        driver.findElement(By.id("menu-item-1506")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("wpforms[fields][0]"))));

        driver.findElement(By.name("wpforms[fields][0]")).sendKeys("Bommanaboyina");
        driver.findElement(By.name("wpforms[fields][1]")).sendKeys("Bommanaboyina.Nagendra@ibm.com  ");
        driver.findElement(By.name("wpforms[fields][3]")).sendKeys("Information");
        driver.findElement(By.name("wpforms[fields][2]")).sendKeys("Need to contact");
        driver.findElement(By.id("wpforms-submit-8")).click();


        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("wpforms-confirmation-8"))));
        System.out.println(driver.findElement(By.id("wpforms-confirmation-8")).getText());
        Assert.assertEquals("Thanks for contacting us! We will be in touch with you shortly.",driver.findElement(By.id("wpforms-confirmation-8")).getText(),"not matched with expected result");

        driver.close();



    }
}
