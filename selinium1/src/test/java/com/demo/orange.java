package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class orange {
    WebDriver driver=new ChromeDriver();
    @BeforeTest
    public void a(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }
    @Test
    public void b(){
        driver.findElement(By.className("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys(" admin123");
        driver.findElement(By.tagName("submit")).click();
        System.out.println("ok");
    }

}
