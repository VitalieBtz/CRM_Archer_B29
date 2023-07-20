package com.CRM_Archer_B29.step_definitions;

import com.CRM_Archer_B29.pages.LoginPage;
import com.CRM_Archer_B29.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Login {
    LoginPage loginPage = new LoginPage();
    @Given("user Login with  Invalid  {string} or {string}")
    public void user_login_with_invalid_or(String string, String string2) {
     loginPage.simpleLogin(string,string2);
    }
    @Then("User should see {string}  displayed")
    public void user_should_see_displayed(String string) {
        Assert.assertTrue(loginPage.IncortectLogin.isDisplayed());
    }




    @Given("user see Remember me link")
    public void userSeeRememberMeLink() {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//label[.='Remember me on this computer']")).getText().equals("Remember me on this computer"));

    }

    @Then("user should click on the link")
    public void userShouldClickOnTheLink() {
      WebElement r =Driver.getDriver().findElement(By.id("USER_REMEMBER"));
      r.click();
        Assert.assertTrue(r.isEnabled());
    }

    @Given("User Enter password")
    public void userEnterPassword() {
        loginPage.simpleLogin("UserUU","");
    }

    @Then("User should see the password in bullet signs")
    public void userShouldSeeThePasswordInBulletSigns() {
        Assert.assertTrue(loginPage.passwordBox.getAttribute("type").equals("password"));
    }
}
