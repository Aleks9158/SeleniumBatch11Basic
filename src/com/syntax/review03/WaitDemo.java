package com.syntax.review03;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
public class WaitDemo {
    public static String url = "https://chercher.tech/practice/implicit-wait-example";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement checkBox= driver.findElement(By.xpath("//input[@type='checkbox']"));

        checkBox.click();
    }
}

