import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AutomateDropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        Select obj=new Select(driver.findElement(By.id("dropdown")));
//        obj.selectByIndex(1);
//        obj.selectByValue("1");
        obj.selectByVisibleText("Option 2");

        List<WebElement> dropdownvaluescount =obj.getOptions();
        System.out.println(dropdownvaluescount.size()); 


    }
}
