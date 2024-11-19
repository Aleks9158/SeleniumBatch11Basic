package com.syntax.class09;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
public class HomeWork {
    //HW
    //Go to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
    //click on leave. //click on leave list. // choose from "From calendar"
    // choose from "To calendar" .//click only on cancelled and rejected checkboxes
    // uncheck Pending Approval. //select IT support from DD
    // click search // quit the browser
    public static String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement userName= driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement passWord=driver.findElement(By.id("txtPassword"));
        passWord.sendKeys("Hum@nhrm123");
        WebElement loginButton=driver.findElement(By.id("btnLogin"));
        loginButton.click();

    }

}
