import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateKeyboardEvent {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(4000);

        WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        Actions act =new Actions(driver);
        act.sendKeys("Admin");
        act.sendKeys(Keys.TAB).sendKeys("admin123").sendKeys(Keys.ENTER).build().perform();
    }
}
