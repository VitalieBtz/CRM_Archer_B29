package com.CRM_Archer_B29.pages;

import com.CRM_Archer_B29.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamPage {

    public ActivityStreamPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Message']/span")
    public WebElement messageInputBox;

    @FindBy(xpath = "//span[@title='Link']/i")
    public WebElement linkBtn;

    @FindBy(xpath = "//input[@placeholder='Link text']")
    public WebElement linkTxtInputBox;

    @FindBy(xpath = "//input[@placeholder='Link URL']")
    public WebElement linkURLInputBox;

    @FindBy(xpath = "//input[@id='undefined']")
    public WebElement linkSaveBtn;

    @FindBy(xpath = "//div[contains(@id, 'blog_post_body')]")
    public WebElement feedMsg;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendBtn;

    @FindBy(xpath = "//span[@id='feed-add-post-form-link-text']")
    public WebElement moreBtn;

    @FindBy(xpath = "//span[.='Appreciation']")
    public WebElement appreciationBtn;

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadFileBtn;

    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement uploadingField;

    @FindBy(xpath = "//span[@class='insert-btn']")
    public WebElement insertInTxtBtn;

    @FindBy(xpath = "//span[@bx-bound='Y']")
    public WebElement removeFileBtn;
}
