package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        // WebElement tRadioButton = driver.findElement(By.xpath("//button[@id='buttoncheck']"));
        WebElement tRadioButton = driver.findElement(By.xpath("//input[@value='Male']"));

        boolean isTRadioButtonEnabled = tRadioButton.isEnabled();
        System.out.println(isTRadioButtonEnabled);

        if (!isTRadioButtonEnabled) {
            System.out.println("Not Enabled");
        } else {
            System.out.println("Enabled");
        }
            boolean isTRadioButtonDisplayed= tRadioButton.isDisplayed();
            System.out.println(isTRadioButtonDisplayed);

        boolean isTRadioButtonSelected= tRadioButton.isSelected();
        System.out.println("Before clicking"+" "+isTRadioButtonSelected);
        tRadioButton.click();
        isTRadioButtonSelected= tRadioButton.isSelected();
        System.out.print("After clicking " +  isTRadioButtonSelected);
        Thread.sleep(2000);//вставил чтобы рассмотреть
        driver.quit();
        }
    }

