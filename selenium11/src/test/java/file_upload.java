import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class file_upload {
    WebDriver driver;

    @BeforeTest
    public void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
    }
    @Test
    public void file(){

       // C:\Users\NTS-Shreyash Jadhav\Desktop\add.txt
        WebElement upload = driver.findElement(By.id("file-upload"));
        upload.sendKeys("C:\\Users\\NTS-ShubhamJawale\\Desktop\\New folder\\file.txt");
        driver.findElement(By.id("file-submit")).click();
    }
}
