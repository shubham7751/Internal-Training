import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateAuthentication {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://@the-internet.herokuapp.com/");
//
//         driver.findElement(By.xpath("//a[normalize-space()='Basic Auth']")).click();
//         driver.switchTo().alert().sendKeys("admin");
//         Actions act =new Actions(driver);
//         act.sendKeys(Keys.TAB).sendKeys("admin").sendKeys(Keys.ENTER).build().perform();
        String username="admin";
        String password="admin";
        Thread.sleep(5000);
        String URL="https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth";
        driver.get(URL);
    }
}
