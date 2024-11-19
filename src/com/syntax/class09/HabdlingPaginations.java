package com.syntax.class09;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class HabdlingPaginations {
    static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        // Login Actions
        WebElement userName= driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement passWord=driver.findElement(By.id("txtPassword"));
        passWord.sendKeys("hum@nhrm123");
        WebElement loginButton=driver.findElement(By.id("btnLogin"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //Navigating to add employee
        WebElement pimButton=driver.findElement(By.id("menu_pim_viewPimModule"));
        pimButton.click();
        WebElement addEmployeeButton= driver.findElement(By.id("menu_pim_addEmployee"));
        addEmployeeButton.click();

        //adding an employee and saving
        WebElement firstName=driver.findElement(By.id("firstName"));
        firstName.sendKeys("Nassir");
        WebElement lastName=driver.findElement(By.id("lastName"));
        lastName.sendKeys("Ariyan");
        WebElement empIdField=driver.findElement(By.id("employeeId"));
        String empId=empIdField.getAttribute("value");
        WebElement savebutton=driver.findElement(By.id("btnSave"));
        savebutton.click();

        WebElement employeeListButton=driver.findElement(By.id("menu_pim_viewEmplyeeList"));
        employeeListButton.click();

        boolean flag=true;
        while(flag){
            // reinitializing all the elements because the page gets refreshed after each page.
            List<WebElement> tableRows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
            for (int i = 0; i < tableRows.size(); i++) {
                String rowText=tableRows.get(i).getText();
                if(rowText.contains(empId)){
                    flag=false;
                    System.out.println(rowText);
                    WebElement checkbox=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+ i +"]/td[1]"));
                    checkbox.click();
                    WebElement deleteButton=driver.findElement(By.id("btnDelete"));
                    deleteButton.click();
                    WebElement confirmDelete=driver.findElement(By.id("dialogDeleteBtn"));
                    confirmDelete.click();
                    break;
                }

            }
            if (flag){
                WebElement nextbutton=driver.findElement(By.linkText("Next"));
                nextbutton.click();
            }

        }
    }

}

