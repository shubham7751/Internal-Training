package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    public static WebDriver driver;
    public static Properties prop=new Properties();
    public static Properties loc=new Properties();
    public static FileReader fr;
    public static FileReader fr1;




     @BeforeMethod
    public void setUp() throws IOException {
        if(driver==null)
        {
           // System.out.println("The Path is : "+System.getProperty("user.dir"));//gives path
             fr=new FileReader(System.getProperty("user.dir")+"\\src\\main\\resources\\config\\config.properties");
                                           //C:\Users\NTS-ShubhamJawale\IdeaProjects\selenium_frame_project---\\src\\main.....
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
    @AfterMethod
    public void TearDown(){
   driver.quit();
        System.out.println("browser close succesfully..");
    }
}
