package com.syntax.class04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ElementCommands {
    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
      // System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");//drivers!=driver||Driver;
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Form");
        WebElement marriedRadioButton = driver.findElement(By.xpath("(//input[@name = 'optradio'])[1]"));
        boolean isMarriedRadioButtonEnabled = marriedRadioButton.isEnabled();
        System.out.println(isMarriedRadioButtonEnabled);

        if(!isMarriedRadioButtonEnabled) {
            System.out.println("Not Enabled");
        } else {
            System.out.println("Enabled");
        }

        boolean isMarriedRadioButtonDisplayed = marriedRadioButton.isDisplayed();
        System.out.println(isMarriedRadioButtonDisplayed);

        boolean isMarriedRadioButtonSelected = marriedRadioButton.isSelected();
        System.out.println("Before clicking " + isMarriedRadioButtonSelected);
        marriedRadioButton.click();
        isMarriedRadioButtonSelected = marriedRadioButton.isSelected();
        System.out.println("After clicking " + isMarriedRadioButtonSelected);
        Thread.sleep(2000);
        driver.quit();

    }
}

