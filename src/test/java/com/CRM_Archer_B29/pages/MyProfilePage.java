package com.CRM_Archer_B29.pages;

import com.CRM_Archer_B29.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyProfilePage {
    public MyProfilePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "user-block")
    public WebElement profile;

    @FindBy(xpath = "//span[.='My Profile']")
    public WebElement MyProfile;

    @FindBy(xpath = "//div[@id='profile-menu-filter']/a")
    public List<WebElement> menuProfile;

    @FindBy(xpath = "//*[@id=\"workarea-content\"]/div/div/div[3]/table/tbody/tr[2]/td[2]/a")
    public WebElement email;

}
