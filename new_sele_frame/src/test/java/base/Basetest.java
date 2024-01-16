package base;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Basetest {
    public static WebDriver driver;
    public static Properties prop=new Properties();
    public static Properties loc=new Properties();
    public static FileReader fr;
    public static FileReader fr1;




    @BeforeTest
    public void setUp() throws IOException {
        if(driver==null)
        {

            fr=new FileReader(System.getProperty("user.dir")+"\\src\\main\\resources\\config\\config.properties");

            prop.load(fr);
            fr1=new FileReader(System.getProperty("user.dir")+"\\src\\main\\resources\\config\\locater.properties");
            loc.load(fr1);
        }
        if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.get(prop.getProperty("testurl"));

        }

        else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
            driver.get(prop.getProperty("testurl"));

        }

    }



    public static void CaptureScreenshot(WebDriver driver, String testName) throws IOException {


        String timeStamp = new SimpleDateFormat("YYYY.mm.dd.hh.mm.ss").format(new Date());
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File src = screenshot.getScreenshotAs(OutputType.FILE);



        File trg = new File(System.getProperty(("user.dir")+"\\src\\main\\resources\\config\\sc" + testName + timeStamp + ".png"));



        FileUtils.copyFile(src, trg);
        System.out.println("ScreenShot Capture ");


    }








    @AfterTest
    public void TearDown(){
        driver.quit();
        System.out.println("browser close succesfully..");
    }

}
