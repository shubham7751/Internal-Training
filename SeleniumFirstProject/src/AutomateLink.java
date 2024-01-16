import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutomateLink {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        List<WebElement> link = driver.findElements(By.tagName("a"));
        System.out.println(link.size());

        for (int i=0;i< link.size();i++){
            System.out.println(link.get(i).getAttribute("href"));
            System.out.println(link.get(i).getText());
        }
    }
}
