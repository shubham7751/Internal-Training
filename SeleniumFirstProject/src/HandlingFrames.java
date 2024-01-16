import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/iframe");

        driver.switchTo().frame("mce_0_ifr");
        WebElement iframe = driver.findElement(By.id("tinymce"));
        Thread.sleep(5000);
        iframe.clear();
        Thread.sleep(5000);
        iframe.sendKeys("My Name Is Shreyash");
        Thread.sleep(5000);
        driver.switchTo().defaultContent();
        driver.quit();
    }
}
