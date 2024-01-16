package testcase;

import base.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import utilities.Readxlsdata;

import java.io.File;
import java.io.IOException;

public class FirstTest1 extends BaseTest {
   // private TakesScreenshot section;
    @Test(dataProviderClass = Readxlsdata.class,dataProvider = "testdata")
    public  void LoginTest1(String username,String password) throws InterruptedException, IOException {
        driver.findElement(By.id(loc.getProperty("user_id"))).sendKeys("username");
        Thread.sleep(3000);
        driver.findElement(By.id(loc.getProperty("password"))).sendKeys("password");
        Thread.sleep(3000);
        driver.findElement(By.id(loc.getProperty("log_in"))).click();
        System.out.println("run succesfully.............");


  //      File
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        File trg = new File("C:\\Users\\NTS-ShubhamJawale\\IdeaProjects\\selenium_frame_project\\src\\main\\resources\\screen_shot\\screenshot\\demo.png");
        FileUtils.copyFile(src, trg);
        System.out.println("ScreenShot Capture ");



    }

}
