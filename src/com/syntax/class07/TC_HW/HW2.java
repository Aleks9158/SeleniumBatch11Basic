package com.syntax.class07.TC_HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW2 {
    /*navigate to http://www.uitestpractice.com/Students/Contact
      click on the link
      get text
      print out in the console
     */
    public static String url = "http://www.uitestpractice.com/Students/Contact";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         WebElement href=driver.findElement(By.xpath("//a[text()='This is a Ajax link']"));

        href.click();



    }
}
