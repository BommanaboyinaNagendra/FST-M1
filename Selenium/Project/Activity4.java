package lmsproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity4 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver= new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");

        Assert.assertEquals("Email Marketing Strategies",driver.findElement(By.xpath("//h3[text()='Email Marketing Strategies']")).getText(),"not matched with expected result");

        driver.close();
    }

}
