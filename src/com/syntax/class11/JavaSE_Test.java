package com.syntax.class11;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JavaSE_Test {


    @Test
    public void Login()
    {

        //Launching the Site.
        //WebDriver driver= new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        WebDriver driver= new  ChromeDriver();
        driver.get("https://demo.guru99.com/V4/");
        //Creating the JavascriptExecutor interface object by Type casting
        JavascriptExecutor js = (JavascriptExecutor)driver;

        //Launching the Site.


        WebElement button =driver.findElement(By.name("btnLogin"));

        //Login to Guru99
        driver.findElement(By.name("uid")).sendKeys("mngr550802");
        driver.findElement(By.name("password")).sendKeys("tehUveh");

        //Perform Click on LOGIN button using JavascriptExecutor
        js.executeScript("arguments[0].click();", button);

        //To generate Alert window using JavascriptExecutor. Display the alert message
        js.executeScript("alert('Welcome to Guru99');");
        //не доведено до конца,нужно корректировать,менять credentials
    }
}
