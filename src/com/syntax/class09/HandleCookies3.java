package com.syntax.class09;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleCookies3 {

        public static void main(String args[]) {
            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            String url ="https://www.lambdatest.com/";
            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);


            driver.manage().deleteAllCookies();
            Set<Cookie> cookiesListNew =  driver.manage().getCookies();
            cookiesListNew.size();
            System.out.println("The size is "+cookiesListNew);

            driver.close();
        }
    }



