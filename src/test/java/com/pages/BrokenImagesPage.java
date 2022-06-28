package com.pages;

import com.util.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BrokenImagesPage extends BasePage {

    @FindBy(tagName = "img")
    private List<WebElement> imagesList;

    public BrokenImagesPage(WebDriver driver) {
        super(driver);
    }

    public int countBrokenImages(){
        log.info("Test 3. Counting broken images");
        int brokenImagesCount = 0;
        log.info("Test 3. This page has "+imagesList.size()+ " images");
        for(WebElement img : imagesList){
            if(img != null){
                if(img.getAttribute("naturalWidth").equals("0")){
                    log.info("Test 3. "+img.getAttribute("outerHTML")+" is broken");
                    brokenImagesCount ++;
                }
            }
        }
        log.info("Test 3. This page has "+brokenImagesCount+" broken images");
        return brokenImagesCount;
    }
}
