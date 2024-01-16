import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateDragAndDropReorder {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://mikeplate.github.io/jquery-drag-drop-plugin/example/reorder.html");
        Thread.sleep(5000);
        WebElement drag = driver.findElement(By.xpath("//li[normalize-space()='Item A']"));
        WebElement drop = driver.findElement(By.xpath("//li[normalize-space()='Item D']"));

        Actions act = new Actions(driver);
        act.dragAndDrop(drag,drop).build().perform();
    }
}
