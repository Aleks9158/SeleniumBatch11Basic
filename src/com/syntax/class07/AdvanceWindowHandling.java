package com.syntax.class07;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvanceWindowHandling {
    /**
     * click on buttons and open new windows (tabs)
     * switch to windows and perform different actions
     */

    public static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle = driver.getWindowHandle();
        WebElement igButton = driver.findElement(By.linkText("Follow On Instagram"));
        Thread.sleep(2000);

        WebElement fbButton = driver.findElement(By.linkText("Like us On Facebook"));
        WebElement igAndFbButton = driver.findElement(By.linkText("Follow Instagram & Facebook"));

        igButton.click();
        fbButton.click();
        igAndFbButton.click();

        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        Thread.sleep(2000);
        Iterator<String> it = allWindowHandles.iterator();
        while (it.hasNext()) { //start iterating through the handles(начать перебирать ручки-обработку)
            String handle = it.next(); // get the next handle
            if (!mainPageHandle.equals(handle)) { // set a condition
                driver.switchTo().window(handle); // switch to a window which is not equal to main page handle
                //driver.manage().window().maximize();
                String title = driver.getTitle();

                System.out.println(title);
                Thread.sleep(3000);

            }
        }
     /*   driver.switchTo().window(mainPageHandle); // swithing back to parent handle
        igButton.click();
        Thread.sleep(2000);
    */
        driver.quit();
    }
    }






