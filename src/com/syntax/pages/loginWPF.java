package com.syntax.pages;

import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginWPF extends CommonMethods {

    @FindBy(id="txtUsername" )
    public WebElement username;

    @FindBy(xpath ="//*[@id='txtPassword']")
            //(id=("txtPassword"));
    public WebElement password;

    @FindBy(css="input#btnLogin")
    public WebElement loginButton;
    @FindBy(xpath= "//span[text()='Invalid credentials']")
    public WebElement msg;

    public loginWPF(){
        PageFactory.initElements(driver,this);
    }



}
