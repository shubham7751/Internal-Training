package com.hybf.testcase;

import com.hybf.base.BaseClass;
import com.hybf.pageObject.HomePage;
import com.hybf.pageObject.LoginPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;


@Listeners(com.hybf.utilitys.TestngListeners.class)
public class Tc_1_HomePage extends BaseClass {

    @Test(priority = 1)
    public void HomePage() {

        driver.get(url);

        HomePage homePage = new HomePage(driver);

        homePage.clickMyAccountFild();
        homePage.clickloginFild();

        System.out.println("Url Open successful");
    }

    @Test(priority = 2)
    public void LoginPage() throws InterruptedException, IOException {


        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterEmail();
        loginPage.enterPassword();
        loginPage.clickLogin();

        System.out.println("Login successful");


//       = Assert.assertEquals(driver.getTitle(),"Your Store");

        if (driver.getTitle().equalsIgnoreCase("My Accoun")) {

            System.out.println("title matched");
        } else {

            System.out.println("Test Fail" + " >>> " + "ScreenShot Captured");
            BaseClass.Capture_Screenshot(driver, "LoginPage");


        }


    }


}


