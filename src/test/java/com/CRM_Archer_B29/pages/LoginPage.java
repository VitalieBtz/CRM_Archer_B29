package com.CRM_Archer_B29.pages;


import com.CRM_Archer_B29.utilities.ConfigReader;
import com.CRM_Archer_B29.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.InputMismatchException;

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
    @FindBy(xpath = "//div[@class='errortext']")
    public WebElement IncortectLogin;

    public void simpleLogin(String username,String password){

        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
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

        usernameBox.sendKeys(user);
        passwordBox.sendKeys(ConfigReader.getProperty("password"));

        loginBtn.click();
    }
    public void allInLogin(String userType, String userNumber){

        int userNum = Integer.parseInt(userNumber);

        if (!(userType.equalsIgnoreCase("hr")
                || userType.equalsIgnoreCase("helpdesk")
                || userType.equalsIgnoreCase("marketing"))
                || (userNum < 1 || userNum > 101)){
            throw new InputMismatchException("Invalid login arguments");
        }

        if (userType.equalsIgnoreCase("hr")){
            usernameBox.sendKeys(userType + userNumber + ConfigReader.getProperty("dynamicUsername"));
            passwordBox.sendKeys(ConfigReader.getProperty("password"));
            loginBtn.click();
        } else if (userType.equalsIgnoreCase("helpdesk")) {
            usernameBox.sendKeys(userType + userNumber + ConfigReader.getProperty("dynamicUsername"));
            passwordBox.sendKeys(ConfigReader.getProperty("password"));
            loginBtn.click();
        } else if (userType.equalsIgnoreCase("marketing")) {
            usernameBox.sendKeys(userType + userNumber + ConfigReader.getProperty("dynamicUsername"));
            passwordBox.sendKeys(ConfigReader.getProperty("password"));
            loginBtn.click();
        }
    }
}
