package com.hybf.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    WebDriver localDriver;

    public HomePage(WebDriver remoteDriver) {
        localDriver = remoteDriver;
        PageFactory.initElements(remoteDriver,this);

    }


    //Find Element

    @FindBy(xpath="//span[normalize-space()='My Account']")
    WebElement myAccountFild;

    @FindBy(xpath="//a[normalize-space()='Login']")
    WebElement login;



    public void clickMyAccountFild(){
        myAccountFild.click();

    }

    public void clickloginFild(){
        login.click();

    }


}

