package com.pages;

import com.util.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ABPage extends BasePage {

    @FindBy(css="h3")
    private WebElement mainTitleAB;

    @FindBy(css=".example p")
    private WebElement mainContentAB;
    public ABPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkABContent(){
        log.info("Test 1. Checking content in AB Page");
        return isElementAvailable(mainTitleAB)&&isElementAvailable(mainContentAB);
    }
}
