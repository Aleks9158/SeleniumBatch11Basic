package com.syntax.test;
import com.syntax.pages.LoginPage;
import com.syntax.testBase.BaseClass;
public class LoginPageTest {
    public static void main (String[]args) {
        // calling the method openwithspecificurl from the base class to initiate the driver declaration and
        //open the browser and navigate to specific url
       // BaseClass.openWithSpecificUrl("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php  ");
              //  "//auth/validateCredentials");

        //create an object of the class that has your requared webelements
        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys("admin");
       // loginPage.password.sendKeys("test");
        loginPage.password.sendKeys("Hum@nhrm123");
        loginPage.loginButton.click();

        BaseClass.tearDown();
    }
}

