package com.khushiagrawall.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTest {
    WebDriver driver=new ChromeDriver();
    @BeforeMethod
    public void setUp(){
        driver.get("https://www.google.com");
    }
    @Test
    public void DemoTest() throws InterruptedException {
        Thread.sleep(5000);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
