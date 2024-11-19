package com.syntax.class02;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Recap {

public static void main(String[] args)// throws InterruptedException {//при включении Thread
{  //System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
    System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    driver.get("http://fb.com");
    //driver.manage().window().maximize();
    String title = driver.getTitle();
    String expectedTitle = "Facebook - Log In or Sign Up";//необходимо перевести браузер или facebook на англ
   // Thread.sleep(4000);//включение задержки исполнения
    if(title.equals(expectedTitle)) {
        System.out.println("Title Is Correct");
    } else {
        System.out.println("Title is Incorrect");
    }

    driver.quit();
}
}
