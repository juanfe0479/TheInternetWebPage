package com.util.tests;

import com.drivers.Driver;
import com.pages.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    protected Driver driver;
    protected HomePage homePage;
    protected ABPage abPage;
    protected AddRemovePage addRemovePage;
    protected BrokenImagesPage brokenImagesPage;
    protected SoftAssert softAssert;


    @BeforeClass
    @Parameters({"browser", "url"})
    public void start(String browser, String url){
        driver = new Driver(browser);
        driver.getDriver().get(url);
        driver.getDriver().manage().window().maximize();
        homePage = new HomePage(driver.getDriver());
    }

    @AfterClass
    public void cleanUp(){
        driver.getDriver().manage().deleteAllCookies();
        driver.getDriver().quit();
    }
}
