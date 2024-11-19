package com.syntax.hr.pages;

import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
//Это от Асель
public class DashboardPage extends CommonMethods {
    @FindBy(xpath = "//*[@class='menu']/ul/li")
    public List<WebElement> dashboardTabs;

    @FindBy(id = "welcome")
    public WebElement welcomeMessage;

    public DashboardPage() {
    PageFactory.initElements(driver, this);
}

}
