package com.syntax.hr.pages;

import com.syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//Это от Асель
public class LoginPage extends CommonMethods {
    //Это всё Instance variable
    @FindBy(id="txtUsername" )
    public WebElement usernameBox;

   @FindBy (name="txtPassword")
    public WebElement passwordBox;
   // @FindBy(xpath ="//*[@id='txtPassword']")
    //(id=("txtPassword"));
    //public WebElement password;
   @FindBy(xpath="//input[@id='btnLogin']")
   public WebElement loginBtn;

  //  @FindBy(css="input#btnLogin")
    //public WebElement loginBtn;

    @FindBy(id = "spanMessage")
    public WebElement errorMessage;
    //@FindBy(xpath= "//span[text()='Invalid credentials']")
   // public WebElement errorMesssage;
    @FindBy(xpath="//span[text ='Username cannot be empty']")
    public WebElement userNameEmptyMsg;

    @FindBy(xpath="//span[text ='Password cannot be empty']")
    public WebElement passwordEmptyMsg;

//Этот конструктор нужен для инициирования variable
    public LoginPage(){
       PageFactory.initElements(driver,this);}
    }



