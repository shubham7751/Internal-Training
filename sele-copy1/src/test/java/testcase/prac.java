//package testcase;
//
//import base.BaseTest;
//import org.openqa.selenium.By;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//public class prac extends BaseTest {
//    @Test(dataProvider="testData")
//    public static void LoginTest(String username,String password) throws InterruptedException {
//        driver.findElement(By.id(loc.getProperty("user_id"))).sendKeys("username");
//        Thread.sleep(3000);
//        driver.findElement(By.id(loc.getProperty("password"))).sendKeys("password");
//        Thread.sleep(3000);
//        driver.findElement(By.id(loc.getProperty("log_in"))).click();
//        System.out.println("run succesfully.............");
//    }
//    @DataProvider(name="testData")
//    public Object[][] tData(){
//        return new Object[][]{
//                {"standard_user1","secret_sauce1"},
//                {"standard_user3","secret_sauce3"},
//                {"standard_user","secret_sauce"}
//        };
//    }
//}
