import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class demo3 {
    WebDriver driver=new ChromeDriver();
      @BeforeTest
    public void goo() {

        driver.get("https://demoqa.com/alerts");
        driver.manage().window().fullscreen();
    }
    @Test
    public void soo(){
          driver.findElement(By.id("promtButton")).click();

          driver.switchTo().alert().sendKeys("shubham");
        driver.switchTo().alert().accept();
        System.out.println("finish");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
//    @AfterTest
//    public void noo(){
//          driver.quit();
//    }
}
