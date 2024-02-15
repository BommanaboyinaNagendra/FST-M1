package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net");
        System.out.println("title of Page " + driver.getTitle());

        driver.findElement(By.id("about-link")).click();
        Thread.sleep(2000);

        System.out.println("title of Page " + driver.getTitle());

        driver.close();


    }
}
