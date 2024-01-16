package com.frame.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
    WebDriver ldriver;
    Loginpage(WebDriver rdriver){
        ldriver=rdriver;


        pageFactory.initElements(rdriver,this);
    }
    @FindBy(name="uid");
    WebElement txtUserName;

}
