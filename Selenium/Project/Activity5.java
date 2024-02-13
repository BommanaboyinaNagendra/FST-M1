package lmsproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity5 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver= new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");
        driver.findElement(By.xpath("//a[text()='My Account']")).click();
        //System.out.println(driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']")).getText());
        Assert.assertEquals("My Account – Alchemy LMS",driver.getTitle(),"not matched with expected result");

        Assert.assertEquals("My Account",driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']")).getText(),"not matched with expected result");

        driver.close();
    }
}
