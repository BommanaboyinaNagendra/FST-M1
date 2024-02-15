package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class Activity17 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver=new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/selects");
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));

        System.out.println("Page Title "+driver.getTitle());
        WebElement element =driver.findElement(By.id("single-select"));
        Select select=new Select(element);

        select.selectByVisibleText("Option 2");
        select.selectByIndex(3);
        select.selectByValue("4");

        List<WebElement> options=select.getOptions();
        for(WebElement e:options){
            System.out.println(e.getText());
        }


        driver.quit();


    }
}
