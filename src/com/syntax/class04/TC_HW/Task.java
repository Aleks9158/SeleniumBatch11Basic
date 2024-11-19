package com.syntax.class04.TC_HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task {
    /* Open chrome browser
     Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
     Enter valid username and password (username - Admin, password - Hum@nhrm123)
     Click on login button
     Then verify Syntax Logo is displayed.
     */

    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
         System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.className("button"));
        Thread.sleep(2000);
        WebElement divLogo=driver.findElement(By.xpath("//div[@id='divLogo']"))  ;
        boolean isDivLogoDisplayed=divLogo.isDisplayed();
        System.out.println("Logo is displayed:"+isDivLogoDisplayed);
        loginButton.click();
        Thread.sleep(2000);//вставил чтобы рассмотреть


      // username.clear();
      //  password.clear();
        driver.quit();
    }
    }

