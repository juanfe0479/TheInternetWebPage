package com.pages;

import com.util.pages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasicAuthPage extends BasePage {


    public BasicAuthPage(WebDriver driver) {
        super(driver);
    }

    public void logInAuth(String user,String password){
        try {
            wait.until(ExpectedConditions.alertIsPresent());
        }
        catch (Exception e){
            driver.navigate().refresh();
        }
        driver.switchTo().defaultContent();
        actions.sendKeys(user);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        actions.sendKeys(Keys.TAB);
        alert.sendKeys(user);
        actions.sendKeys(Keys.TAB);
        alert.sendKeys(password);
        alert.accept();

    }
}