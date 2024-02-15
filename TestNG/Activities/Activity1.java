package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethode(){
        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/");

    }

    @Test
    public void test(){
        String title= driver.getTitle();
    System.out.println("from the test method");
    System.out.println(" Page title "+driver.getTitle());

        Assert.assertEquals("Training Support", title);
        driver.findElement(By.id("about-link")).click();


        System.out.println("New page title is: " + driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "About Training Support");
    }

    @AfterMethod
    public void afterMethode(){
        driver.close();
    }

}
