package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FrameDemo {

    WebDriver driver;

    @BeforeTest
    public void goo() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.manage().window().maximize();

    }

    @Test
    public void text() {
        driver.findElement(By.id("name")).sendKeys("shubham");

        driver.switchTo().frame(driver.findElement(By.id("frm2")));
        driver.findElement(By.id("firstName")).sendKeys("shubham");
        driver.findElement(By.id("lastName")).sendKeys("jawale");
        driver.findElement(By.id("malerb")).click();
        driver.findElement(By.id("englishchbx")).click();
        driver.findElement(By.id("email")).sendKeys("shubhamj@7751");
        driver.findElement(By.id("password")).sendKeys("jawale@123");

        driver.switchTo().defaultContent();
        driver.findElement(By.id("name")).sendKeys("jawale");
    }
}

//        @Test
//    public void back(){
//            driver.findElement(By.id("name").
//        }
//
//
//    }


