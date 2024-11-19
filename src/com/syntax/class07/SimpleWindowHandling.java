package com.syntax.class07;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
public class SimpleWindowHandling {
    /**
     * click on Help link
     * switch between tabs
     */
    public static String url = "http://accounts.google.com/signup";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(10000);
        driver.get(url);

        String mainPageHandle = driver.getWindowHandle(); // get window handle for the main page
        System.out.println(mainPageHandle);

        WebElement helpLink = driver.findElement(By.linkText("Справка"));//"Help"меняется на "Справка " в руской версии Chrome
        Thread.sleep(1000);
        helpLink.click();

        Set<String> allWindowHandles = driver.getWindowHandles(); // store all the handles in a set
        System.out.println(allWindowHandles.size());

        Iterator<String> it = allWindowHandles.iterator(); // have an iterator in order to iterate through the handles
        mainPageHandle = it.next(); // take the first step and assign the main handle
        String childHandle = it.next(); // take the second step and have a child handle
        System.out.println(childHandle);
         Thread.sleep(2000);
        driver.switchTo().window(childHandle);//переключиться ещё раз на childwindow(childHandle),чттобы при закрытии
                                            // остаься на главном окне при закрытии драйвера.
        Thread.sleep(2000);
        driver.close();
        Thread.sleep(2000);
        driver.switchTo().window(mainPageHandle);
        helpLink.click();

        driver.quit();

    }
}

