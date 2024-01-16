package testcase;

import base.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Readxlsdata;

import java.io.File;
import java.io.IOException;


public class FirstTest extends BaseTest {


    @Test(dataProviderClass = Readxlsdata.class,dataProvider = "testdata")
    public  void LoginTest(String user1,String pass1)
    {
        WebElement userid= driver.findElement(By.id(loc.getProperty("user_id")));
        userid.clear();
        userid.sendKeys(user1);

       WebElement passw1= driver.findElement(By.id(loc.getProperty("password")));
       passw1.clear();
       passw1.sendKeys(pass1);

        driver.findElement(By.id(loc.getProperty("log_in"))).click();
        System.out.println("run succesfully.............");


       // File
//        TakesScreenshot screenshot = (TakesScreenshot) driver;
//        File src = screenshot.getScreenshotAs(OutputType.FILE);
//        File trg = new File("C:\\Users\\NTS-ShubhamJawale\\IdeaProjects\\selenium_frame_project\\src\\main\\resources\\screen_shot\\screenshot\\demo.png");
//        FileUtils.copyFile(src, trg);
//        System.out.println("ScreenShot Capture ");

    }


}
