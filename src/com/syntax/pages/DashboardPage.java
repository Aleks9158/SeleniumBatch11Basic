package com.syntax.pages;
import com.syntax.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends CommonMethods {
    public WebElement msg=driver.findElement(By.xpath("//a[text()='Welcome Admin']"));
  //  @FindBy(id = "welcome")
    //public WebElement welcomeAdmin;

    //public DashboardPage() {
        //PageFactory.initElements(driver, this);
    }


