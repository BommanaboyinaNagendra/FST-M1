package lmsproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String username = "root";
        String password = "pa$$w0rd";

        driver.get("https://alchemy.hguy.co/lms/");
        driver.findElement(By.id("menu-item-1508")).click();

       boolean condition= wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']")))).isDisplayed();
        System.out.println(condition);
       if(condition==true){
          System.out.println(driver.findElements(By.xpath("//div[@class='ld_course_grid col-sm-8 col-md-4 ']")).size());

        }
driver.close();
    }
}
