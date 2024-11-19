package com.syntax.class02;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebOrderTask {
    /**
     * Task
     * Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
     * Login
     * Get title and verify
     * logout
     * close the browser
     */
    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
       WebElement username= driver.findElement(By.id("ctl00_MainContent_username"));
               username.sendKeys("Tester");
        WebElement password= driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement button=driver.findElement(By.className("button"));
        button.click();
        //другой вариант кода
      //  driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        //driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        //driver.findElement(By.className("button")).click();

        String title = driver.getTitle();
        if(title.equals("Web Orders")) {//Title в самой таблице
            System.out.println("Title Is Correct");
        } else {
            System.out.println("Title is not Correct");
        }
        Thread.sleep(2000);
        driver.findElement(By.linkText("Logout")).click();//найти ссылку в коде
       // driver.findElement(By.id("ctl00_logout")).click();
        driver.quit();

    }
}

