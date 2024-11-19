package com.syntax.class03;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Xpathdemo {
    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        WebElement username = driver.findElement(By.xpath("//input[contains(@id, 'username')]"));
       // WebElement username = driver.findElement(By.xpath("//input[@id= 'ctl00_MainContent_username']"));//можно использовать другой xpath
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.xpath("//input[@type = 'password']"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.xpath("//input[@value = 'Login']"));
        loginButton.click();
        Thread.sleep(3000);
        driver.quit();

    }
}

