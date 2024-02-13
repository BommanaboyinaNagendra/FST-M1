package lmsproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity3 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver= new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");
        //System.out.println(driver.findElement(By.xpath("//h3[text()=' Actionable Training ']")).getText());
        Assert.assertEquals("Actionable Training",driver.findElement(By.xpath("//h3[text()=' Actionable Training ']")).getText(),"not matched with expected result");

        driver.close();
    }

}
