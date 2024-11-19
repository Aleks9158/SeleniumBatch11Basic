package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverCommands {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //navigate to this website
        //fill the username
        //delete the username
        //fill the new user name  "Tester"
        //find the WebElement
        WebElement  userName=driver.findElement(By.cssSelector("#ctl00_MainContent_username"));
        // send the text AON
        userName.sendKeys("AON");
        //Deletethe userName entered
        Thread.sleep(2000);
        userName.clear();
        //enter the new username
        Thread.sleep(2000);
        userName.sendKeys("Tester");



    }
}
