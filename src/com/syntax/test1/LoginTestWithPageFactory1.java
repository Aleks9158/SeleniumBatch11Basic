package com.syntax.test1;

import com.syntax.pages.loginWPF;
import com.syntax.testBase.BaseClass;

public class LoginTestWithPageFactory1 {
    public static void main(String[] args) {

        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php" );
        loginWPF log = new loginWPF();
        log.username.sendKeys("Admin");
        log.password.sendKeys("Hum@nhrm123");
        log.loginButton.click();
        BaseClass.tearDown();
    }
}
