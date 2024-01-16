import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateRedioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement RedioButton = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
        RedioButton.click();
        RedioButton.isEnabled();
        RedioButton.isDisplayed();
        RedioButton.isSelected();

        System.out.println(RedioButton.getText());
        System.out.println(RedioButton.getAttribute("class"));
        System.out.println(RedioButton.getTagName());
    }
}
