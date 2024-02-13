package lmsproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity2 {
    public static void main(String[] args) {


        WebDriverManager.firefoxdriver().setup();
        WebDriver driver= new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");

        String text=driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']")).getText();


        Assert.assertEquals("Learn from Industry Experts",text,"not matched with expected result");

        driver.close();


    }
}
