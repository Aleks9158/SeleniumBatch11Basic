package com.syntax.pages;
import com.syntax.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginPage extends CommonMethods {
  //  public WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
    public WebElement username = driver.findElement(By.xpath("//*[@id='txtUsername']"));
        //  ("txtUsername"));

    //public WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
    public WebElement password = driver.findElement(By.xpath("//*[@id='txtPassword']"));
            //By.id("txtPassword"));
            //это тоже правильно
           // ("txtPassword"));

    public WebElement loginButton = driver.findElement(By.id("btnLogin"));

    //span[text()='Invalid credentials']
   // public WebElement invalidCredentialMsg = driver.findElement(By.xpath( "//span[text()='Invalid credentials']"));
        //("//*[@id='spanMessage']"));
            //"//span[text()='Invalid credentials']"));
}
