package com.CRM_Archer_B29.pages;

import com.CRM_Archer_B29.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_253_Page {

    public US_253_Page (){   PageFactory.initElements(Driver.getDriver(),this);   }

    @FindBy(xpath ="//span[.='Poll']/span" )
    public WebElement pollButton;

    //@FindBy(xpath ="//input[@id ='feed-add-post-destination-input']" )
    @FindBy(xpath ="//span[@class='feed-add-post-del-but']" )
    public WebElement toInputBox;


    @FindBy(xpath = "//span[text()='All employees']")
    public WebElement allEmployeesBox;

    @FindBy(id = "multi_0")
    public WebElement multipleChoiceCheckBox;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement pollTitleErrorMsg;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement pollTitle;

    @FindBy(id = "question_0")
    public WebElement questionButton;

    @FindBy(xpath = "//input[@placeholder='Answer  1']")
    public WebElement answer1Button;

    @FindBy(xpath = "//input[@placeholder='Answer  2']")
    public WebElement answer2Button;

    @FindBy(xpath = "//span[.='Please specify at least one person.']")
    public WebElement specifyOnePersonMsj;

    @FindBy(xpath = "//span[.='The question text is not specified.']")
    public WebElement specifyQuestionTextMsj;

    @FindBy(xpath = "//span[@class='feed-post-more-text']")
    public WebElement moreButton;

    @FindBy(xpath = "//span[.='Delete']")
    public WebElement deleteButton;





}
