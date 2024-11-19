package com.syntax.class05.TC_HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.syntax.testBase.BaseClass.driver;

public class HW1 {
    /*Go to facebook sign up page
Fill out the whole form
Click signup
     */
    public static String url = "https://www.facebook.com";
    public static String firstName = "Alex";
    public static String lastName = "Si";//надо менять всё время для регистрации

    public static String email = "123qwe@сab.com";//надо менять всё время для регистрации
    public static String password = "password3";


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.xpath("(//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft'])[6]")).click();             //linkText("Create new account"));

        Thread.sleep(1000);

        WebElement createNewAccount = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));             //linkText("Create new account"));
        createNewAccount.click();
        Thread.sleep(1000);

        WebElement enterFirstName = driver.findElement(By.name("firstname"));
        WebElement enterLastName = driver.findElement(By.name("lastname"));
        WebElement enterEmail = driver.findElement(By.name("reg_email__"));
        // WebElement confirmEmail = driver.findElement(By.name("reg_email_confirmation__"));
        WebElement enterPassword = driver.findElement(By.name("reg_passwd__"));
        enterFirstName.sendKeys(firstName);
        enterLastName.sendKeys(lastName);
        enterEmail.sendKeys(email);
        // confirmEmail.sendKeys(email);
        enterPassword.sendKeys(password);

        WebElement day = driver.findElement(By.xpath("(//*[@class='_9407 _5dba _9hk6 _8esg'])[1]"));
        // WebElement day = driver.findElement(By.name("birthday_day"));
        Select selectDay = new Select(day);
        List<WebElement> dayOptions = selectDay.getOptions();
        for (WebElement dayOption : dayOptions) {
            String dayOptionValue = dayOption.getText();
            if (dayOptionValue.equals("8")) {
                dayOption.click();
                break;
            }
        }

       /* WebElement month = driver.findElement(By.id("month"));
        Select selectMonth = new Select(month);
        List<WebElement> monthOptions = selectMonth.getOptions();
        for (WebElement monthOption : monthOptions) {
            String monthOptionValue = monthOption.getText();
            if (monthOptionValue.equals("окт")) {
                monthOption.click();
                break;*/


        WebElement month = driver.findElement(By.id("month"));
        Select selectMonth = new Select(month);
        List<WebElement> monthOptions = selectMonth.getOptions();
        for (WebElement monthOption : monthOptions) {
            String monthOptionValue = monthOption.getText();
            if (monthOptionValue.equals("окт")) {
                monthOption.click();
                break;
       /* WebElement day = driver.findElement(By.id("day"));
        Select selectDay = new Select(day);
        List<WebElement> dayOptions = selectDay.getOptions();
        for (WebElement dayOption : dayOptions) {
            String dayOptionValue = dayOption.getText();
            if (dayOptionValue.equals("10")) {
                dayOption.click();
                break;*/
            }
        }
        WebElement year = driver.findElement(By.id("year"));
        Select selectYear = new Select(year);
        List<WebElement> yearOptions = selectYear.getOptions();
        for (WebElement yearOption : yearOptions) {
            String yearOptionValue = yearOption.getText();
            if (yearOptionValue.equals("1960")) {
                yearOption.click();
                break;

            }
        }
       /* WebElement genderRadioButton = driver.findElement(By.xpath("//input[@id='sex']"));
      //  WebElement genderRadioButton = driver.findElement(By.name("sex"));                             //xpath("//*[@id='u_2_5_/x']"));
        Select select = new Select(genderRadioButton);

        List<WebElement> genderRadioButtonOptions = select.getOptions();//driver.findElements(By.xpath("//*[@id='u_2_5_tQ']"));
        // System.out.println(genderRadioButtonOptions.size());
//        boolean isGenderRadioButtonSelected = genderRadioButton.isSelected();
        for (WebElement genderRadioButtonOption : genderRadioButtonOptions) {
            String genderOptions = genderRadioButtonOption.getAttribute("value");
            if (genderOptions.equals("2")) {
                genderRadioButton.click();*/

        WebElement sex = driver.findElement(By.xpath("(//input[@id='sex'])[2]"));
        sex.click();
        Thread.sleep(1000);


        //  WebElement genderRadioButton = driver.findElement(By.name("sex"));                             //xpath("//*[@id='u_2_5_/x']"));
   /*     Select selectSex = new Select(sex);

        List<WebElement>  sexOptions= selectSex.getOptions();//driver.findElements(By.xpath("//*[@id='u_2_5_tQ']"));
        // System.out.println(genderRadioButtonOptions.size());
//        boolean isGenderRadioButtonSelected = genderRadioButton.isSelected();
        for (WebElement  sexOption : sexOptions) {
            String sexOptionValue = sexOption.getAttribute("value");
            if (sexOptionValue.equals("2")) {
                click() ;
                break; */




     WebElement button = driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _6o _6v']"));
        button.click();
}
}





