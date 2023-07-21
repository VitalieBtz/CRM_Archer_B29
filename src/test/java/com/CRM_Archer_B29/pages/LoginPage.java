package com.CRM_Archer_B29.pages;

import com.CRM_Archer_B29.utilities.ConfigReader;
import com.CRM_Archer_B29.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginBtn;

    public void simpleLogin(String username){

        usernameBox.sendKeys(username);
        passwordBox.sendKeys(ConfigReader.getProperty("password"));
        loginBtn.click();
    }

    public void login(String user){

       user = user.replace(" ", "_");
       String username = ConfigReader.getProperty(user + "_username");

       usernameBox.sendKeys(username);
       passwordBox.sendKeys(ConfigReader.getProperty("password"));

       loginBtn.click();
    }

    public void dynamicLogin(String user){
        user = user + ConfigReader.getProperty("dynamicUsername");
        String username = ConfigReader.getProperty(user + "_username");

        usernameBox.sendKeys(user);
        passwordBox.sendKeys(ConfigReader.getProperty("password"));

        loginBtn.click();
    }
}
