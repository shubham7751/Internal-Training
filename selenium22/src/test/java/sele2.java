import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class sele2 {
    WebDriver driver = new ChromeDriver();


    @BeforeTest
    public void browser() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        System.out.println("browser ok");
    }
    @Test(priority = 1)
    public void login() throws InterruptedException, IOException {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();


        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        File trg = new File("C:\\Users\\NTS-ShubhamJawale\\Desktop\\img\\img1.png");
        FileUtils.copyFile(src, trg);
        System.out.println("ScreenShot Capture ");


        WebElement section = driver.findElement(By.xpath("x-path"));



//        File src1 =section.getScreenshotAs(OutputType.FILE);
//        File trg1 = new File("C:\\Users\\NTS-Akshay Bokhare\\IdeaProjects\\Demo\\ScreenShots\\BagSection.png");
//        FileUtils.copyFile(src,trg);
//        System.out.println("section screen shot is captured");

    }
    @Test(priority = 2)
    public void alert(){
     WebElement ele=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        System.out.println(ele.getTagName());
        System.out.println("okkkk");
    }
}
