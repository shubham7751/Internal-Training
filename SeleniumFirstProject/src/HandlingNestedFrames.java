import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingNestedFrames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        List<WebElement> p =driver.findElements(By.tagName("frame"));
        System.out.println("Total frames are: "+p.size());

        System.out.println("==============================================================================================================================================================================");

        driver.switchTo().frame(1);
        String bottom = driver.findElement(By.tagName("body")).getText();
        System.out.println(bottom);

        System.out.println("==============================================================================================================================================================================");
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");

        String top =driver.findElement(By.tagName("body")).getText();
        System.out.println(top);
        driver.switchTo().defaultContent();

        System.out.println("=======================================================================================================");

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");

        String middle =driver.findElement(By.tagName("body")).getText();
        System.out.println(middle);
        driver.switchTo().defaultContent();


        System.out.println("=======================================================================================================");

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-right");

        String right =driver.findElement(By.tagName("body")).getText();
        System.out.println(right);
        driver.switchTo().defaultContent();
        driver.quit();
    }
}
