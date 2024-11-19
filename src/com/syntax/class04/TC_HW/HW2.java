package com.syntax.class04.TC_HW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    /*HRMS Application Negative Login:
Open chrome browser
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username
Leave password field empty
Click on login button
Verify error message with text "Password cannot be empty" is displayed.
     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("");
        WebElement loginButton = driver.findElement(By.className("button"));
        loginButton.click();
        WebElement pswIsEmpt=driver.findElement(By.xpath("//span[text()='Password is Empty']"));
        pswIsEmpt.isDisplayed();
        System.out.println(pswIsEmpt.isDisplayed());//OK

       // System.out.println(driver.findElement(By.xpath("//span[text()='Password is Empty']")).isDisplayed());//Ok
       // WebElement error=driver.findElement(By.id("span Message"));//-не работает
        WebElement error=driver.findElement(By.xpath("//span[text()='Password is Empty']"));

       // if(error.equals("Password is Empty")) {//-не работает
        if(error.isDisplayed()){

            System.out.println("Password cannot be empty-verified");
        }
Thread.sleep(3000);
        driver.quit();
        }
    }


