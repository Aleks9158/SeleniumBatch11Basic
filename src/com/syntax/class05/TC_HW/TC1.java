package com.syntax.class05.TC_HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TC1 {
    /* Facebook dropdown verification
Open chrome browser
Go to “https://www.facebook.com”
click on create new account
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth
Quit browser
     */
    public static String url = "https://www.facebook.com/";

    public static void main(String[] args) throws InterruptedException {
        // System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.xpath("(//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft'])[6]")).click();
        Thread.sleep(1000);
        WebElement createNewAccount = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")) ;             //linkText("Create new account"));
        createNewAccount.click();
        Thread.sleep(1000);
        WebElement month = driver.findElement(By.xpath("//*[@id='month']") ) ;             //("select[id='month']"));
        Select monthDD = new Select(month);
        if (!monthDD.isMultiple()) {
            List<WebElement> options1 = monthDD.getOptions();
            if (options1.size() == 12) {
                System.out.println("Month DD has 12 month options");
            } else {
                System.out.println("Month DD does NOT have12 month options");
            }
        }
        Thread.sleep(1000);
        monthDD.selectByValue("3");    //VisibleText("Mar");
        WebElement day = driver.findElement(By.xpath("//*[@id='day']"));                                //cssSelector("select[id='day']"));
        Select dayDD = new Select(day);
        if (!dayDD.isMultiple()) {
            List<WebElement> options2 = dayDD.getOptions();
            if (options2.size() == 31) {
                System.out.println("Day DD has 31 day options");
            } else {
                System.out.println("Day DD does NOT have 31 day options");
            }
        }
        Thread.sleep(1000);
        dayDD.selectByValue("17");
        WebElement year = driver.findElement(By.xpath("//*[@id='year']"));                                //cssSelector("select[id='day']"));
        Select yearDD = new Select(year);
        if (!yearDD.isMultiple()) {
            List<WebElement> options3 = yearDD.getOptions();
            if (options3.size() == 115) {
                System.out.println("Year DD has 115 year options");
            } else {
                System.out.println("Year DD does NOT have 115 day options");
            }
        }
        Thread.sleep(1000);
        yearDD.selectByValue("1990");
        Thread.sleep(2000);
        driver.quit();
    }
}

