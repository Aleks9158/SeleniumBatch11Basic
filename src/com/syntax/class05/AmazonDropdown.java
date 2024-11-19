package com.syntax.class05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
public class AmazonDropdown {
    public static String url = "http://amazon.com";

    public static void main(String[] args) throws InterruptedException {

     System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(15000);//капча в Amazon вводится вручную -нужно время
        WebElement categoriesDD = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(categoriesDD);




        List<WebElement> options = select.getOptions();
        int size = options.size();
        System.out.println(size);

        for(WebElement option:options) {

            String optionText = option.getText();
            System.out.println(optionText);

        }
      //single select
       // select.selectByValue ("search-alias=appliances");
        select.selectByValue( "search-alias=stripbooks-intl-ship");
     // select.selectByValue( "search-alias=automotive-intl-ship");
      //  Thread.sleep(1000);
      //  select.selectByValue ("search-alias=baby-products-intl-ship");


    }
}

