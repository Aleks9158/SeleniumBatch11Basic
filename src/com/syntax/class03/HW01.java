package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW01 {
        public static void main(String[] args) throws InterruptedException {
            // System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
           // driver.get("https://www.facebook.com/");
            driver.navigate().to("http://syntaxprojects.com");
            WebElement btn = driver.findElement(By.xpath("//a[@class='btn btn-success btn-outline-rounded green']"));
            btn.click();
            Thread.sleep(3000);
            WebElement sform = driver.findElement(By.xpath("(//a[@class='list-group-item'])[1]"));
            sform.click();
            WebElement message = driver.findElement(By.xpath("//input[@id='user-message']"));
            message.sendKeys("Tester");
            WebElement  button= driver.findElement(By.xpath("//button[@class='btn btn-default']"));
            button.click();
            Thread.sleep(3000); // pause the execution for 3 secs

            //driver.close(); // will close the current tab
            driver.quit(); // will quit the whole browser
        }
    }

