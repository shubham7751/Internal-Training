import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateDoubleClick {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.plus2net.com/jquery/msg-demo/event-dblclick.php");

        WebElement doubleClick = driver.findElement(By.id("b1"));
        Actions act = new Actions(driver);
        Thread.sleep(3000);
        act.doubleClick(doubleClick).build().perform();
        driver.navigate().back();
    }
}
