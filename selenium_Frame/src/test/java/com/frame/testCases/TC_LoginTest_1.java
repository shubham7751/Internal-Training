package com.frame.testCases;

import org.testng.annotations.Test;

public class TC_LoginTest_1 extends BaseClass{
    @Test
    public void open(){
        driver.get("https://www.plus2net.com/jquery/msg-demo/event-dblclick.php");
        driver.manage().window().maximize();
    }
}
