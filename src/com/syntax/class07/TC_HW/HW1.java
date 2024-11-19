package com.syntax.class07.TC_HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HW1 {
    /*Go to https://demoqa.com/browser-windows
click on New Tab and print the text from new tab in the console
click on New Window and print the text from new window in the console
click on New Window Message and print the text from new window in the console
Verify (compare) the titles for each page
Print out the title of the all pages
     */
    public static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle = driver.getWindowHandle();
        System.out.println(mainPageHandle);//печатает номер главного окна ,других окон см.Class08 Moazzum
         WebElement newTab = driver.findElement(By.id("tabButton"));   //работают оба метода //xpath("//*[@id='tabButton']"));
        //  newTab.click();
        Thread.sleep(2000);
          System.out.println(newTab.getText());//печатает название кнопки
        WebElement newWindow = driver.findElement(By.xpath("//*[@id='windowButton']"));
        // newWindow.click();
        //driver.switchTo().newWindow();
        // String txt = driver.switchTo().alert().getText();
        //System.out.println(txt);
        // WebElement igAndFbButton = driver.findElement (By.id("messageWindowButton")) ;                                  //(By.xpath("//*[@id='messageWindowButton']"));
        //  newWindow.click();
        //
        newTab.click();
        newWindow.click();
        // igAndFbButton.click();//срабатывает ,но до конца не доходит т.к.нет определения URL окна
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        Thread.sleep(2000);
        Iterator<String> it = allWindowHandles.iterator();
        while (it.hasNext()) { //start iterating through the handles(начать перебирать ручки-обработку)
            String handle = it.next(); // get the next handle
            driver.switchTo().window(handle);//переключаем driver НА окно вкладки-на URL
           if (driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/sample")) {
                System.out.println(driver.getCurrentUrl());//печатаем URL обрабатіваеміх окон
                break;//если нужно одно вызываемое окно останавливаем первую итерацию

          /*  String title=driver.getTitle();
            if (title.equalsIgnoreCase("Google Chrome")){//с этими окнами не работает!!!!
                System.out.println(title);
                break;
                */

            }

         /*   if (!mainPageHandle.equals(handle)) { // set a condition
                driver.switchTo().window(handle); // switch to a window which is not equal to main page handle
                //driver.manage().window().maximize();
                String title = driver.getTitle();
                System.out.println(title);//в нашем примере у окон нет ссылки ,а есть отдельное URL поэтому
                       применяем предыдущий метод
          */
            }
         WebElement text=driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println(text.getText());
        }
    }


