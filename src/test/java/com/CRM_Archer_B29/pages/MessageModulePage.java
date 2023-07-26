package com.CRM_Archer_B29.pages;

import com.CRM_Archer_B29.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessageModulePage {

    public MessageModulePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text() ='Message']")
    public WebElement messageBtn;

    @FindBy(xpath = "//*[@id=\"bx-b-uploadfile-blogPostForm\"]")
    public WebElement uploadFilesBtn;

    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement uploadFilesBox;

    @FindBy(xpath = "//span[@class=\"insert-btn\"]")
    public WebElement insertBtn;

    @FindBy(xpath = "//span[@class=\"del-but\"]")
    public WebElement removeBtn;

    @FindBy(xpath = "//span[@class=\"insert-text\"]")
    public WebElement inTextBtn;

    @FindBy(xpath = "//div[@class='diskuf-files-block']")
    public WebElement filesBlock;






}
