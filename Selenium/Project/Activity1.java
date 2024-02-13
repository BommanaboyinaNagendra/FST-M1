package lmsproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity1 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver=new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");
      //  System.out.println(driver.getTitle());

        Assert.assertEquals("Alchemy LMS – An LMS Application",driver.getTitle(),"Not matched with expected result");
        driver.close();
    }

}
