package com.syntax.class04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class GetAllLinksFromEbay {
    public static void main(String[] args) {
        //  System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://ebay.com");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Number of links " + allLinks.size());

         for (WebElement link : allLinks) {
          String linkText = link.getText();
          String fullLink = link.getAttribute("href");//все
           System.out.println(linkText + "    " + fullLink);


        //   for (WebElement link : allLinks) {
          //  String fullLink = link.getAttribute("href");//только полные
           // if (!fullLink.isEmpty()) {
             //   System.out.println(fullLink);

            }
        }

    }
   //}


