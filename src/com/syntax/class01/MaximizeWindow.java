package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
    public static void main(String[] args) throws InterruptedException {
        //  System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();
       //  driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.quit();
    }
}

