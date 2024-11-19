package com.syntax.review03;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ImplicitDemoPractice {
    public static String url = "http://syntaxprojects.com/dynamic-elements-loading.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebDriverWait wait=new WebDriverWait(driver,20);
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // driver.manage().window().maximize();
        WebElement btn = driver.findElement(By.id("startButton"));
        btn.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Welcome')]")));
        WebElement WelcomeMsg=driver.findElement(By.xpath("//*[contains(text(), 'Welcome Syntax')]"));
        System.out.println(WelcomeMsg.getText());

    }
}

