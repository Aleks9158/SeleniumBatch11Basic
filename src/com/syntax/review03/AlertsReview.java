package com.syntax.review03;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertsReview {
    public static String url="https://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        // Finding alert and clicking on it.
        WebElement simpleAlert= driver.findElement(By.xpath("//button[@onclick=\"myAlertFunction()\"]"));
        simpleAlert.click();
        // Handling the alert.
        Alert alert= driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        // Locating prompt alert below
        WebElement jsAlert= driver.findElement(By.xpath("//button[@onclick=\"myPromptFunction()\"]"));
        jsAlert.click();
        Thread.sleep(2000);
        driver.switchTo().alert();
        Thread.sleep(2000);
        alert.sendKeys("Hello Batch 12 Students");
        alert.accept();

    }

}

