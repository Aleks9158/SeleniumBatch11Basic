package com.syntax.class09;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class HandleCookies {

        public static void main(String args[]) throws InterruptedException {
           // System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
                    //"ChromeDriver Path");
            WebDriver driver = new ChromeDriver();
            String url ="https://www.lambdatest.com/";
            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            Set<Cookie> cookiesList =  driver.manage().getCookies();
            for(Cookie getcookies :cookiesList) {
                System.out.println(getcookies);
            }
            Thread.sleep(6000);
            driver.close();
        }
    }

