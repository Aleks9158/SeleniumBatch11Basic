package com.syntax.class06;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HandleFrames {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.switchTo().frame(0);

        WebElement textbox = driver.findElement(By.id("name"));
        textbox.sendKeys("Batch 12 Forever!!!");

        driver.switchTo().defaultContent();

        WebElement alertButton = driver.findElement(By.id("alert"));
        alertButton.click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.switchTo().frame("iframe_a");
        textbox.clear();
        textbox.sendKeys("we are back to frame");
        Thread.sleep(1000);

        driver.switchTo().defaultContent();

        WebElement frameElement = driver.findElement(By.xpath("//iframe[@src = '/Demo.html']"));
        driver.switchTo().frame(frameElement);
        textbox.clear();
        textbox.sendKeys("Hold your horses");
        Thread.sleep(3000);
        driver.quit();
    }

}

