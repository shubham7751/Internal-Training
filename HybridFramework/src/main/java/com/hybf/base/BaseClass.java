package com.hybf.base;


import com.hybf.utilitys.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class BaseClass {


    //read config file
    public  Configuration configuration = new Configuration();

   public  String url = configuration.getUrl();
    public String browser = configuration.getBrowser();


    public static WebDriver driver;

    @BeforeClass
    public void setUp(){
        String browser1 =browser;

        switch (browser1.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                break;
            default:
                System.out.println("Browser cant not be Null");
        }

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

    }

    @AfterClass
    public void endBrowser(){

        driver.quit();
    }

    public static void Capture_Screenshot(WebDriver driver, String Testname) throws IOException, InterruptedException {
        String timeStamp = new SimpleDateFormat("YYYY.mm.dd.hh.mm.ss").format(new Date());
        Thread.sleep(4000);
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String destfilepath = System.getProperty("user.dir")+"\\screenshots\\"+Testname+timeStamp+".png";
        FileUtils.copyFile(src,new File(destfilepath));
    }

}


