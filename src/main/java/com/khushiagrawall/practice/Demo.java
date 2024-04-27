package com.khushiagrawall.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {
        // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
//        try {
//            Thread.sleep(5000); // Wait for 5 seconds
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        driver.close(); // Close the browser
    }
}
