package com.CRM_Archer_B29.pages;

import com.CRM_Archer_B29.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
}
