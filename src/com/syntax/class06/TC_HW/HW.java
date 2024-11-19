package com.syntax.class06.TC_HW;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    /*Go to https://syntaxprojects.com/javascript-alert-box-demo.php
click on each button and handle the alert accordingly
     */
    public static String url = " https://syntaxprojects.com/javascript-alert-box-demo.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement simpleAlertButton = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        simpleAlertButton.click();
        Alert alertBox = driver.switchTo().alert();
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
       // alertBox.accept();
        WebElement confirmBoxButton = driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']")); //(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confirmBoxButton.click();
        Thread.sleep(2000);
        Alert confirmAlert = driver.switchTo().alert(); // switch the focus to alert
        String alertText = confirmAlert.getText();
        System.out.println(alertText);
        confirmAlert.dismiss();
        WebElement promptAlertButton = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        promptAlertButton.click();
        Thread.sleep(2000);
        Alert promptBox = driver.switchTo().alert();
        System.out.println(promptBox.getText());
       promptBox.sendKeys("Batch 12 ");
        Thread.sleep(2000);
        promptBox.accept();
       // WebElement promptBox =driver.findElement(By.xpath(
        //textbox.clear();
    }
}
