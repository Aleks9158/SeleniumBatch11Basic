package com.syntax.class02;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatingElements {

 public static void main(String[] args) throws InterruptedException {
   // System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
    System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://fb.com");
    driver.findElement(By.id("email")).sendKeys("syntax@adfadf.com");
    driver.findElement(By.id("pass")).sendKeys("whatever");
    //Thread.sleep(500);
    // для прохождения cookies с нажатием кнопки "только необходимые coockies"
   // driver.findElement(By.className("x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft")).click();
    driver.findElement(By.xpath("//*[@id='facebook']/body/div[3]/div[2]/div/div/div/div/div[3]/div[2]/div/div[1]/div[2]/div/div[1] ")).click();
     //двигаемся после прохождения cookies

    driver.findElement(By.name("login")).click();
    Thread.sleep(2000);
    //driver.findElement(By.linkText("Forgot password?")).click();
    driver.findElement(By.linkText("Забыли пароль?")).click();//в русскоязычном браузере
    //driver.findElement(By.partialLinkText("Forgot")).click();
    driver.quit();
}
}
