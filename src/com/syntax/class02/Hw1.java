package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=4919CD8320CE26FFDD1BD7857A67A2AA
//fill out the form
//click on register
//close the browser
public class Hw1 {
    public static void main (String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=4919CD8320CE26FFDD1BD7857A67A2AA)");
        driver.findElement(By.name("customer.firstName")).sendKeys("A");
        driver.findElement(By.name("customer.lastName")).sendKeys("B");
        driver.findElement(By.id("customer.address.street")).sendKeys("Abbee Road");
        driver.findElement(By.id("customer.address.city")).sendKeys("London");
        driver.findElement(By.id("customer.address.state")).sendKeys("Montana");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("51109");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("333222");
        driver.findElement(By.id("customer.ssn")).sendKeys("a124578");
        driver.findElement(By.id("customer.username")).sendKeys("Atung");
        driver.findElement(By.id("customer.password")).sendKeys("Abbee");
        //driver.findElement(By.xpath("//*[@id=\"repeatedPassword\"]")).sendKeys("Abbee");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Abbee");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[13]/td[2]/input")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
