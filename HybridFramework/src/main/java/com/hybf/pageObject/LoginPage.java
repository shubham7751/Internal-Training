package com.hybf.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

//4line same
    WebDriver localDriver;

    public LoginPage(WebDriver remoteDriver) {

        localDriver=remoteDriver;
        PageFactory.initElements(remoteDriver,this);

    }

    @FindBy(name= "email")
    WebElement emailId;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement password;

    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginButton;


    public void enterEmail(){
        emailId.sendKeys("noremeb435@pbridal.com");

    }


    public void enterPassword(){
        password.sendKeys("nts@123");

    }

    public void clickLogin(){
        loginButton.click();
    }

    }

