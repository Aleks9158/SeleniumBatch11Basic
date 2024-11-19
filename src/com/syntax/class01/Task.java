package com.syntax.class01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task {
    /**
     * 1. launch the browser
     * 2. navigate to amazon web site
     * 3. print out the title and the url in the console
     * 4. close the browser
     */

    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         //System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe ");
        // WebDriver      driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        System.out.println(title + " " + url);
        Thread.sleep(4000);
        driver.quit();
    }
}

