package com.syntax.class06;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
    /**
     * handle each and every alert on the page
     */
    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement simpleAlertButton = driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Alert simpleAlert = driver.switchTo().alert(); // switch the focus to alert
        Thread.sleep(3000);
       simpleAlert.accept(); // handling simple alert

        WebElement confirmAlertButton = driver.findElement(By.xpath("//*[@id='confirm']"));             //    (By.id("confirm"));
        confirmAlertButton.click();
        Thread.sleep(2000);
        Alert confirmAlert =driver.switchTo().alert(); // switch the focus to alert
        String alertText =confirmAlert.getText();
        System.out.println(alertText);
        confirmAlert.dismiss();

        WebElement promptAlertButton = driver.findElement(By.cssSelector("button#prompt"));
        promptAlertButton.click();
        Thread.sleep(2000);
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("Batch 12 is the Best!!!");//Есть дефект т.к есть слово перед вставкой
        promptAlert.accept();
        Thread.sleep(2000);
        driver.quit();
    }

}

