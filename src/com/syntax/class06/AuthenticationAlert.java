package com.syntax.class06;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AuthenticationAlert {
    public static String url = "http://the-internet.herokuapp.com/basic_auth";
    //username:password@

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }

}

