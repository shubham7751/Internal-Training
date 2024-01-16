import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFileUpload {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement upload = driver.findElement(By.id("file-upload"));
        upload.sendKeys("C:\\Users\\NTS-Shreyash Jadhav\\Desktop\\add.txt");
        driver.findElement(By.id("file-submit")).click();
    }
}
