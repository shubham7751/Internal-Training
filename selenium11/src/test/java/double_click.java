import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class double_click {
    WebDriver driver;

    @BeforeTest
    public void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.plus2net.com/jquery/msg-demo/event-dblclick.php");
        driver.manage().window().maximize();
    }
    @Test
    public void click() throws InterruptedException {
        WebElement doubleClick = driver.findElement(By.id("b1"));
        Actions act = new Actions(driver);
        Thread.sleep(3000);
        act.doubleClick(doubleClick).build().perform();
        driver.navigate().back();
    }
}
