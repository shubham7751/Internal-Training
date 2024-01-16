import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowAndTabs {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");

        String MainTab = driver.getWindowHandle();
        System.out.println(MainTab);
        Thread.sleep(5000);
        driver.switchTo().newWindow(WindowType.TAB); //driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.google.com/");
        System.out.println(driver.getWindowHandles());
        Thread.sleep(5000);
        driver.switchTo().window(MainTab);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
