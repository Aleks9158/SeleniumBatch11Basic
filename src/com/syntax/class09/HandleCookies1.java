package com.syntax.class09;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCookies1 {


        public static void main(String args[]) {
            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            String url ="https://www.lambdatest.com/";
            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

            //For creating a new cookie we should pass the name of the cookie and its value
            Cookie cname = new Cookie("myCookie", "12345678889");
            driver.manage().addCookie(cname);

//retrieve the cookies to view the newly added cookie
            Set<Cookie> cookiesList =  driver.manage().getCookies();
            for(Cookie getcookies :cookiesList) {
                System.out.println(getcookies );
            }
            driver.close();
        }
    }






