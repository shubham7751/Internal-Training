import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jqueryscript.net/demo/tap-hold-event-handler/");

        WebElement holdClick = driver.findElement(By.id("1"));

        Actions act =new Actions(driver);
        act.clickAndHold(holdClick).build().perform();

    }
}
