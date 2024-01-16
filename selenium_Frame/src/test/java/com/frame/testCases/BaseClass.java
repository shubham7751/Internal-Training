package com.frame.testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

public class BaseClass {
    public String baseURL="https://demo.guru99.com/";
    public String username="mngr522580";
    public String password="vyqypyd";
    public static WebDriver driver;

    @BeforeTest
    public void setDriver() {
        {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver = new ChromeDriver();


        }
    }
    @AfterTest
    public void closeDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }



}