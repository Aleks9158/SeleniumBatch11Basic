package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class launchBrowser {
    public static void main (String[]args) throws InterruptedException {
         // System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
       // System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe ");

       // WebDriver      driver = new FirefoxDriver();
        WebDriver driver=new ChromeDriver();
       // driver.get("http://www.google.com");
        driver.get("http://fb.com");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.quit();
    }
}


