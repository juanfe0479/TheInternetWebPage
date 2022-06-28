package com.pages;

import com.util.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddRemovePage extends BasePage {
    @FindBy(css=".example>button")
    private WebElement addButton;

    @FindBy(css="#elements .added-manually")
    private List<WebElement> deleteButtonList;

    @FindBy(css="#elements button:first-child")
    private WebElement fistDeleteButton;

    public AddRemovePage(WebDriver driver) {
        super(driver);
    }

    public void createButtons(int times){
        log.info("Test 2. Creating "+times +" buttons");
        for(int i=0;i<times;i++){
            click(addButton);
        }
    }

    public boolean checkQuantityDeleteButton(int number){
        return number==deleteButtonList.size();
    }

    public void deleteButton(int times){
        log.info("Test 2. Deleting "+times +" buttons");
        if(deleteButtonList.size() >= times){
            for(int i=0;i<times;i++){
                click(fistDeleteButton);
            }
        }
        else{
            log.info("Test 2. The button(s) that you want to delete are more than all remain");
        }

    }
}
