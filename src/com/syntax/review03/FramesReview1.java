package com.syntax.review03;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesReview1 {
    public static String url = "https://chercher.tech/practice/frames";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        // click on the check box that resides inside another frame
        driver.switchTo().frame(0);
        WebElement topic=driver.findElement(By.xpath("//b[@id=\"topic\"]"));
        System.out.println(topic.getText());

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        WebElement dropdown=driver.findElement(By.tagName("select"));

        Select select=new Select(dropdown);
        select.selectByIndex(2);
        driver.switchTo().defaultContent();
        // driver.switchTo().frame(0);
        WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frame1);

        driver.switchTo().frame("frame3");
        driver.findElement(By.xpath("//input[@id='a']")).click();


    }
}

