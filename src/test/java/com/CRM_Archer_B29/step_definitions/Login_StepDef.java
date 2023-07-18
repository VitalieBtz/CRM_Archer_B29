package com.CRM_Archer_B29.step_definitions;

import com.CRM_Archer_B29.pages.LoginPage;
import com.CRM_Archer_B29.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class Login_StepDef {
    LoginPage loginPage = new LoginPage();

    //    sc1
    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("environment");
    }

    @When("User enters a valid {string} and {string}")
    public void user_enters_a_valid_and(String user, String pass) {

    }

    @When("User clicks login button")
    public void user_clicks_login_button() {
        loginPage.loginBtn.click();
    }

    @Then("User should land on a home page")
    public void user_should_land_on_a_home_page() {
        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "stream";
        Assert.assertTrue(expectedURL.contains(actualURL));
    }


    //sc2

    @When("User enters invalid {string} or invalid {string}")
    public void userEntersInvalidOrInvalid(String arg0, String arg1) {

    }


    @Then("User should see message {string}")
    public void user_should_see_message(String string) {


    }


    //sc3

    @When("User enters only a  {string} or {string}")
    public void user_enters_only_a_or(String string, String string2) {

    }


    //sc4

    @When("User locates {string} link")
    public void user_locates_link(String string) {

    }

    @Then("User clicks {string} link")
    public void user_clicks_link(String string) {

    }


    //sc5

    @When("User enters any {string} and {string}")
    public void user_enters_any_and(String string, String string2) {

    }

    @Then("password is in bullet signs")
    public void password_is_in_bullet_signs() {

    }
}
