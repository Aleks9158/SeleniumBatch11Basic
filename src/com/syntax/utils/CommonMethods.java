package com.syntax.utils;

import com.syntax.testBase.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CommonMethods extends BaseClass {
    /**
     * this method will send text to a given element
     *
     * @param element
     * @param text
     */
    public void sendText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public static JavascriptExecutor getJSExecutor() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js;
    }

    public static void jsClick(WebElement element) {
        getJSExecutor().executeScript("arguments [0].click();", element);
    }

    public void switchToFrame(WebElement element) {
        try {
            driver.switchTo().frame(element);
        } catch (NoSuchFrameException e) {
            e.printStackTrace();
        }
    }

    /**
     * this method will switch to a frame by index
     *
     * @param index
     */
    public void switchToFrame(int index) {
        try {
            driver.switchTo().frame(index);
        } catch (NoSuchFrameException e) {
            e.printStackTrace();
        }
    }

    public void switchToFrame(String nameOrId) {
        try {
            driver.switchTo().frame(nameOrId);
        } catch (NoSuchFrameException e) {
            e.printStackTrace();
        }
    }

    //drop down text
    public static void selectDdValue(WebElement element, String textToSelect) {


        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            if (option.getText().equals(textToSelect)) {
                select.selectByVisibleText(textToSelect);
                break;
            }

        }
        }
        //drop down index
        public static void selectDdValue (WebElement element,int index) {
         Select select= new Select(element);
         int size=select.getOptions().size();
         if (size>index) {
              select.selectByIndex(index );
         }
        }
    }

