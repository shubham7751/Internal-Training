package com.demo;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class demo1 {

    public static void main(String[] args) {

System.setProperty("webdriver.crome.driver","C:\\Users\\NTS-ShubhamJawale\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.saucedemo.com/");
driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 driver.findElement(By.id("user-name")).sendKeys("standard_user");

driver.findElement(By.id("password")).sendKeys("secret_sauce");
driver.findElement(By.id("login-button")).click();
//Select sel1=new Select(driver.findElement(By.className("product_sort_container")));
//sel1.selectByValue("za");
//driver.findElement(By.className("product_sort_container"));
//driver.findElement(By.className("inventory_item_name")).click();
//driver.findElement(By.className("inventory_item_name")).click();
//driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
//driver.findElement(By.className("shopping_cart_link")).click();
//driver.findElement(By.id("checkout")).click();
//driver.findElement(By.id("first-name")).sendKeys("shubham");
//driver.findElement(By.id("last-name")).sendKeys("Jawale");
//driver.findElement(By.id("postal-code")).sendKeys("411028");
//driver.navigate().back();


















    }
}
