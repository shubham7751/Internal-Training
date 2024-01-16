package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class datadriven1 {
  WebDriver driver=new ChromeDriver();
@BeforeTest
  public void goo(){
      driver.get("https://www.saucedemo.com/");
      driver.manage().window().maximize();
  }



  @DataProvider(name="LoginData")
  public String [][] getData()
  {
    String loginData[][]={
            {"standard_user1","secret_sauce1"},
            {"standard_user2","secret_sauce2"},
            {"standard_user","secret_sauce"}
    };

    return loginData;

  }


  @Test(dataProvider="LoginData")
  public void loginTest(String user,String password){
  WebElement name=driver.findElement(By.id("user-name"));
  name.clear();
  name.sendKeys(user);

    WebElement pass= driver.findElement(By.id("password"));
    pass.clear();
    pass.sendKeys(password);

     driver.findElement(By.id("login-button")).click();

     String Expected ="Swag Labs";

    String Actual=driver.getTitle();
    Assert.assertEquals("Actual","Expected");




  }


























//    public void foo(){
//    driver.findElement(By.id("user-name")).sendKeys("standard_user");
//    driver.findElement(By.id("password")).sendKeys("secret_sauce");
//
//    driver.findElement(By.id("login-button")).click();
//
//    //
//      //Assert.assertEquals("shubham",ss.getText());
//  }



}
