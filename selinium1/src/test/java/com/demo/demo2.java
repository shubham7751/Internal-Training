package com.demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo2 {


    WebDriver driver = new ChromeDriver();
        @BeforeTest
        @Parameters({"browser","url"})
          public void  setUp(String b,String u){
       // System.setProperty("webdriver.crome.driver","C:\\Users\\NTS-ShubhamJawale\\Downloads\\chromedriver_win32\\chromedriver.exe");

        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.get(u);
    }
@AfterTest
    public void EndTest(){

            driver.quit();
    }
        @Test
    public void C(){
            WebElement abc=driver.findElement(By.id("alertButton"));
            abc.click();
            driver.switchTo().alert().accept();
            System.out.println("third execute ");
            Assert.assertTrue(abc.isDisplayed());
        }
        @Test
    public void B(){
          WebElement ss = driver.findElement(By.id("confirmButton"));
          ss.click();
           driver.switchTo().alert().accept();
            System.out.println("Second execute ");
            Assert.assertEquals("A","A");
            Assert.assertTrue(ss.isDisplayed());

        }


        @Test
    public void A(){
            driver.findElement(By.id("promtButton")).click();
            driver.switchTo().alert().sendKeys("Akshay");
            driver.switchTo().alert().accept();
            System.out.println("first execute ");
        }


    }


