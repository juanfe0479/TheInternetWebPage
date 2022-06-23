package com.util.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    private final WebDriverWait wait;
    protected Logger log;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,20);
        this.log = Logger.getLogger(BasePage.class);
        PageFactory.initElements(driver,this);
    }

    public void click(WebElement element){
        waitForElement(element);
        element.click();
    }

    public void sendKeys(WebElement element, String keys){
        waitForElement(element);
        element.sendKeys(keys);
    }

    public boolean isElementAvailable(WebElement element){
        try{
            waitForElement(element);
            return true;
        }catch (NoSuchElementException | TimeoutException e){
            return false;
        }
    }

    public void waitForElement(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
