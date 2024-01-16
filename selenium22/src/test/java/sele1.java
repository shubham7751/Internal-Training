import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class sele1 {
    WebDriver driver = new ChromeDriver();
    //private TakesScreenshot section;


    @BeforeTest
    public void browser() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        System.out.println("okkk");
    }
    @Test
    public void login() throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
       // Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void order() throws InterruptedException {  // IOException
        Select select = new Select(driver.findElement(By.className("product_sort_container")));
        Thread.sleep(2000);
        select.selectByValue("za");
        System.out.println("By z to a");
    }


//
//        File src =section.getScreenshotAs(OutputType.FILE);
//        File trg = new File("C:\\Users\\NTS-Akshay Bokhare\\IdeaProjects\\Demo\\ScreenShots\\BagSection.png");
//        FileUtils.copyFile(src,trg);
//        System.out.println("section screen shot is captured");



    @Test(priority = 3)
    public  void product() throws InterruptedException {
        WebElement abc=driver.findElement(By.className("inventory_item_name"));
        abc.click();

        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("first-name")).sendKeys("shubham");
        driver.findElement(By.id("last-name")).sendKeys("jawale");
        driver.findElement(By.id("postal-code")).sendKeys("411028");
        Thread.sleep(2000);
        driver.findElement(By.id("continue")).click();
        System.out.println("done............................");
    }
//    @AfterTest
//    public void browser_close(){
//        driver.quit();
//        System.out.println("driver is closed");
//    }
}
