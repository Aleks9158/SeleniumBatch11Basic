package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class RadioBtns {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
  //getting the radio btn webElement
       WebElement femaleRadioBtn=driver.findElement(By.xpath("//input[@value='Female'][@name='optradio'] "));
       //click the radio btn Female
        femaleRadioBtn.click();
        Thread .sleep(3000);
        //driver.quit();
    }
}
