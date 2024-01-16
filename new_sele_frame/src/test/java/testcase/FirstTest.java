package testcase;


import base.Basetest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.readxlsx;


import java.io.File;
import java.io.IOException;


@Listeners(utilities.Listner.class)
public class FirstTest extends Basetest  {

    @Test(priority = 1,dataProviderClass = readxlsx.class,dataProvider = "testdata")

    public void LoginTest(String user,String pass) throws InterruptedException, IOException {
       WebElement userId= driver.findElement(By.id(loc.getProperty("user_id")));
       userId.clear();
       userId. sendKeys(user);

        WebElement passId = driver.findElement(By.id(loc.getProperty("password")));
        passId.clear();
        passId. sendKeys(pass);

        driver.findElement(By.id(loc.getProperty("log_in"))).click();
        System.out.println("Login successfully.............");





        driver.findElement(By.className(loc.getProperty("selectproduct"))).click();

        driver.findElement(By.id(loc.getProperty("addcart"))).click();
        driver.findElement(By.className(loc.getProperty("fullcart"))).click();
        driver.findElement(By.id(loc.getProperty("checkout"))).click();



        driver.findElement(By.id(loc.getProperty("username"))).sendKeys("shubham");
        driver.findElement(By.id(loc.getProperty("usersirname"))).sendKeys("jawale");
        driver.findElement(By.id(loc.getProperty("zipcode"))).sendKeys("411028");

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        File trg = new File("C:\\Users\\NTS-ShubhamJawale\\IdeaProjects\\selenium_frame_project\\src\\main\\resources\\screen_shot\\screenshot\\demo.png");
        FileUtils.copyFile(src, trg);
        System.out.println("ScreenShot Capture ");

        driver.findElement(By.id(loc.getProperty("continue"))).click();
        driver.findElement(By.id(loc.getProperty("finish"))).click();
        System.out.println("thank you for your ORDER......");

        Thread.sleep(2000);
    }

//    @Test(priority = 2)
//    public void DropDown()  {
//        Select select=new Select(driver.findElement(By.xpath(loc.getProperty("dropdown"))));
//
//        select.selectByValue("za");
//          }


}

