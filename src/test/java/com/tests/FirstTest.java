package com.tests;

import com.pages.HomePage;
import com.util.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FirstTest extends BaseTest {



    @Test(description = "Test A/B testing", priority = 1)
    public void checkABContent(){
        abPage = homePage.goToABPage();
        Assert.assertTrue(abPage.checkABContent(),"Content is not correct");
        abPage.goBack();
    }

    @Test(description = "Add 2 Buttons and Remove 1 Button on Add/Remove Page",priority = 2)
    public void addRemoveButtons(){
        softAssert = new SoftAssert();
        addRemovePage = homePage.goToAddRemovePage();
        addRemovePage.createButtons(2);
        softAssert.assertTrue(addRemovePage.checkQuantityDeleteButton(2),"The numbers of buttons aren't right");
        addRemovePage.deleteButton(1);
        softAssert.assertTrue(addRemovePage.checkQuantityDeleteButton(1),"The numbers of buttons aren't right");
        addRemovePage.goBack();
        softAssert.assertAll();
    }

    @Test(description = "Counting broken images on this page",priority = 3)
    public void brokenImages(){
        brokenImagesPage = homePage.goToBrokenImagesPage();
        brokenImagesPage.countBrokenImages();
        brokenImagesPage.goBack();
    }
}
