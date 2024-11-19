package com.syntax.class04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassCommandDemo {
    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.className("button"));

        Thread.sleep(2000);//вставил чтобы рассмотреть
        username.clear();
        password.clear();
        Thread.sleep(2000);//вставил чтобы рассмотреть
        driver.quit();
    }
}

