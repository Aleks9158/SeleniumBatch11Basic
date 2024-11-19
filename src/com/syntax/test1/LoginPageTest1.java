package com.syntax.test1;

import com.syntax.pages.DashboardPage;
import com.syntax.pages.LoginPage;
import com.syntax.testBase.BaseClass;

public class LoginPageTest1 {
    public static void main(String[] args) {
        // calling the method openWithSpecificUrl from the base class to initiate the driver declaration and
        //open the browser and navigate to specific url
        // BaseClass.openWithSpecificUrl("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php");
        //create an object of the class that has your requared webelements
        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys("Admin");
        loginPage.password.sendKeys("Hum@nhrm123");
        loginPage.loginButton.click();
//verify that dashboard page is mentioned on the page that opens up
        DashboardPage dashboard=new DashboardPage();
        String WelcomeMsg=dashboard.msg.getText();
        System.out.println(WelcomeMsg);


        BaseClass.tearDown();

    }
}
