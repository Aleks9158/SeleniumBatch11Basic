package com.syntax.class09;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.CookieStore;
import java.util.Set;


public class addCookie {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();

            //WebDriver.manage().Cookies.DeleteAllCookies(); //delete all cookies
            Thread.sleep(7000); //wait 7 seconds to clear cookies.
                    try {
                // driver.manage().deleteAllCookies();
                // driver.get("http://www.example.com");
                // public void ClearBrowserCache(){

                        driver.get("http://fb.com");
                        driver.findElement(By.id("email")).sendKeys("syntax@adfadf.com");
                        driver.findElement(By.id("pass")).sendKeys("whatever");
                        driver.findElement(By.name("login")).click();
                // WebDriver.manage().Cookies.DeleteAllCookies(); //delete all cookies
                //  Thread.sleep(7000); //wait 7 seconds to clear cookies.

                //driver.get("http://fb.com");

                // Adds the cookie into current browser context
               // driver.manage().addCookie(new org.openqa.selenium.Cookie("key", "value"));

            } finally {
                Thread.sleep(4000);
                driver.quit();
            }
        }
    }



