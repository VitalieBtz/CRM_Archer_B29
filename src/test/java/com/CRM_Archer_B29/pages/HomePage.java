package com.CRM_Archer_B29.pages;

import com.CRM_Archer_B29.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.XMLFormatter;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[normalize-space(text())='Activity Stream']")
    public WebElement activityStreamBtn;
    @FindBy(id = "user-block")
    public WebElement UsertabOptions;
    @FindBy(xpath = "(//a[@class='menu-popup-item menu-popup-no-icon '])[3]")
    public WebElement LogoutBtn;
    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement MessageTABE;
@FindBy(id = "blog-submit-button-save")
    public WebElement SendMessageBTN;
@FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement ATleastOnePersonERRORM;
}
