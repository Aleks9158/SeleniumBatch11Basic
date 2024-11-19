package com.syntax.class04.TC_HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TC1 {
    /*Amazon link count:
 Open chrome browser
 Go to “https://www.amazon.com/”
 Get all links
 Get number of links that has text
 Print to console only the links that has text
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/ ");
        // driver.navigate().to("https://www.amazon.com/ ");
        //driver.navigate().back();//-можно двигаться
        //driver.navigate().forward();
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Number of links " + allLinks.size());
        System.out.println(allLinks);
        for (WebElement link : allLinks) {
            String linkText = link.getText();
            String fullLink = link.getAttribute("href");
            if (!linkText.isEmpty()) {

                System.out.println(linkText+"  "+fullLink);
            }
        }
        Thread.sleep(5000);
        driver.quit();
    }
}



