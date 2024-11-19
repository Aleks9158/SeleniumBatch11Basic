package com.syntax.class06.TC_HW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task {
    /*Navigate to https://syntaxprojects.com/bootstrap-iframe.php
verify the header text Sorry, We Couldn't Find Anything For “Asksn” is displayed
verify enroll today button is enabled
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://syntaxprojects.com/bootstrap-iframe.php");
        driver.manage().window().maximize();
       driver.switchTo().frame(0);
        WebElement textbox = driver.findElement(By.className("heading-13"));
        Thread.sleep(1000);
        System.out.println(textbox);
        if (textbox.isDisplayed()) {
            System.out.println("h1 Text is Displayed");
        } else {
            System.out.println("h1Text is NOT Displayed");}
            driver.switchTo().defaultContent();
            driver.switchTo().frame("FrameTwo");
            WebElement enrollTodayButton = driver.findElement(By.className("text-block-2"));
            //driver.switchTo().frame(enrollTodayButton);
            boolean isEnrollTodayButtonEnabled = enrollTodayButton.isEnabled();
           // System.out.println(isEnrollTodayButtonEnabled);
            if (!isEnrollTodayButtonEnabled) {
                System.out.println("Not Enabled");
            } else {
                System.out.println("Enabled");
                driver.quit();
            }
        }
    }





