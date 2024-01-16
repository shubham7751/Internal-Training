package frame;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class frameDemo {
    WebDriver driver;

    @BeforeTest
    public void goo()  {
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.manage().window().maximize();

    }

    @Test
    public void text(){
    driver.findElement(By.id("name")).sendKeys("shubham");
    }


}
