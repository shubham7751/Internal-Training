import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class drag_and_drop {

    WebDriver driver;

    @BeforeTest
    public void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }


    @Test
    public void drag() throws InterruptedException {


        driver.get("http://mikeplate.github.io/jquery-drag-drop-plugin/example/reorder.html");
        Thread.sleep(5000);
        WebElement drag = driver.findElement(By.xpath("//li[normalize-space()='Item A']"));
        WebElement drop = driver.findElement(By.xpath("//li[normalize-space()='Item D']"));


    }
}
