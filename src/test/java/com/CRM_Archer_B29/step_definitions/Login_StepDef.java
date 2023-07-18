package com.CRM_Archer_B29.step_definitions;

import com.CRM_Archer_B29.pages.LoginPage;
import com.CRM_Archer_B29.utilities.BrowserUtils;
import com.CRM_Archer_B29.utilities.ConfigReader;
import com.CRM_Archer_B29.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Login_StepDef {
    LoginPage loginPage = new LoginPage();

    //    sc1
    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("environment"));
    }

    @When("User enters a valid {string} and {string}")
    public void user_enters_a_valid_and(String user, String pass) {
        loginPage.loginWPass(user, pass);
    }

    @When("User clicks login button")
    public void user_clicks_login_button() {
        loginPage.loginBtn.click();
    }

    @Then("User should land on a home page")
    public void user_should_land_on_a_home_page() {
        String expectedURL = "stream";
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualURL.contains(expectedURL));
    }


    //sc2

    @When("User enters invalid {string} or invalid {string}")
    public void userEntersInvalidOrInvalid(String invalidUser, String invalidPass) {
        loginPage.loginWPass(invalidUser, invalidPass);
    }

    @Then("User should see message Incorrect login or password")
    public void userShouldSeeMessageIncorrectLoginOrPassword() {
        String expectedMsg = "Incorrect login or password";
        String actualMsg = loginPage.errorMessage.getText();

        Assert.assertEquals(expectedMsg, actualMsg);
    }


    //sc3

    @When("User enters only a  {string} or {string}")
    public void user_enters_only_a_or(String username, String password) {
        loginPage.loginWPass(username, password);
    }

    @Then("User should see message Please fill out this field")
    public void userShouldSeeMessagePleaseFillOutThisField() {
        String actualMsg = loginPage.errorMessage.getText();
        String expectedMsg = "Please fill out this field";

        Assert.assertEquals(expectedMsg, actualMsg);
    }
    //sc4

    @When("User clicks Remember Me link")
    public void userClicksRememberMeLink() {
        loginPage.rememberMe.click();
    }

    @Then("Remember Me link is selected")
    public void rememberMeLinkIsSelected() {
        Assert.assertTrue(loginPage.rememberMe.isEnabled());
    }


    //sc5

    @When("User enters any {string} and {string}")
    public void user_enters_any_and(String username, String password) {
        loginPage.loginWPass(username, password);
    }

    @Then("password is in bullet signs")
    public void password_is_in_bullet_signs() {
        String expectedAttributeValue = "password";
        String actAttributeValue = loginPage.hiddenPass.getAttribute("type");

        Assert.assertEquals(expectedAttributeValue, actAttributeValue);
    }


}
