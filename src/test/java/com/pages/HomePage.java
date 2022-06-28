package com.pages;

import com.util.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = "li a[href*='/abtest']")
    private WebElement abLink;

    @FindBy(css = "li a[href*='/add_remove']")
    private WebElement addRemoveLink;

    @FindBy(css = "li a[href*='/basic_auth']")
    private WebElement loginLink;

    @FindBy(css = "li a[href*='/broken_images']")
    private WebElement brokenImgLink;

    @FindBy(css = "li a[href*='/challenging_dom']")
    private WebElement challengingDOMLink;

    @FindBy(css = "li a[href*='/checkboxes']")
    private WebElement checkboxesLink;

    @FindBy(css = "li a[href*='/context_menu']")
    private WebElement contextMenuLink;

    @FindBy(css = "li a[href*='/digest_auth']")
    private WebElement digestAuthLink;

    @FindBy(css = "li a[href*='/disappearing_elements']")
    private WebElement disappearingLink;

    @FindBy(css = "li a[href*='/drag_and_drop']")
    private WebElement dragDropLink;

    @FindBy(css = "li a[href*='/dropdown']")
    private WebElement dropdownLink;

    @FindBy(css = "li a[href*='/dynamic_content']")
    private WebElement dynamicContentLink;

    @FindBy(css = "li a[href*='/dynamic_controls']")
    private WebElement dynamicControlsLink;

    @FindBy(css = "li a[href*='/dynamic_loading']")
    private WebElement dynamicLoadingLink;

    @FindBy(css = "li a[href*='/entry_ad']")
    private WebElement entryAdLink;

    @FindBy(css = "li a[href*='/exit_intent']")
    private WebElement exitIntentLink;

    @FindBy(css = "li a[href*='/download']")
    private WebElement downloadLink;

    @FindBy(css = "li a[href*='/upload']")
    private WebElement uploadLink;

    @FindBy(css = "li a[href*='/floating_menu']")
    private WebElement floatingMenuLink;

    @FindBy(css = "li a[href*='/forgot_password']")
    private WebElement forgotPasswordLink;

    @FindBy(css = "li a[href*='/login']")
    private WebElement formAuthLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public ABPage goToABPage(){
        click(abLink);
        return new ABPage(driver);

    }

    public AddRemovePage goToAddRemovePage(){
        click(addRemoveLink);
        return new AddRemovePage(driver);
    }

    public BrokenImagesPage goToBrokenImagesPage(){
        click(brokenImgLink);
        return new BrokenImagesPage(driver);
    }
}
