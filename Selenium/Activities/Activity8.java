package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Activity8 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
         System.out.println("Page Title is:-"+driver.getTitle());
         WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));


       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Find the toggle button and click it
        WebElement checkbox = driver.findElement(By.id("toggleCheckbox"));
        checkbox.click();
        // Wait for the checkbox to disappear
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dynamicCheckbox")));
        System.out.println(checkbox.isDisplayed());
        // Click the button again
        checkbox.click();
        // Wait for the element to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicCheckbox")));
        System.out.println(checkbox.isDisplayed());

        // Close the browser
        driver.close();



    }
}
