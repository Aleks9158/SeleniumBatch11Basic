package com.syntax.class08;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandleStaticWebTables {
    public static String url = "http://syntaxprojects.com/table-search-filter-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement> rowData = driver.findElements(By.xpath("//table[@id = 'task-table']/tbody/tr")); // storing elements inside the list
        System.out.println(rowData.size());

        Iterator<WebElement> it = rowData.iterator(); // creating iterator
        while(it.hasNext()) {
            WebElement row = it.next(); // getting next element
            String rowText = row.getText();
            System.out.println(rowText);
        }

        System.out.println("------------------------");

        List<WebElement> colsData = driver.findElements(By.xpath("//table[@id = 'task-table']/thead/tr/th"));
        System.out.println(colsData.size());
        for(WebElement colData: colsData) { // looping through each web element
            String colText = colData.getText();
            System.out.println(colText);
        }
    }

}

