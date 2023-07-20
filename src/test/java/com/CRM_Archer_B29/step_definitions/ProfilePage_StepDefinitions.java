package com.CRM_Archer_B29.step_definitions;

import com.CRM_Archer_B29.pages.LoginPage;
import com.CRM_Archer_B29.pages.MyProfilePage;
import com.CRM_Archer_B29.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProfilePage_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    MyProfilePage myProfilePage = new MyProfilePage();


    @Given("user clicks on his or her profile")
    public void userClicksOnHisHerProfile() {
        loginPage.allInLogin("hr","2");
        myProfilePage.profile.click();
    }


    @Then("user click on the My profile")
    public void user_click_on_the_my_profile() {
       myProfilePage.MyProfile.click();
    }

    @Then("user should to see following options")
    public void user_should_to_see_following_options(List<String> expectedModulus) {
        List<String> a = new ArrayList<>();
        for (WebElement webElement : myProfilePage.menuProfile) {
            a.add(webElement.getText());
        }
        Assert.assertEquals(a,expectedModulus);
    }

    @Given("user see the email under the General tab")
    public void user_see_the_email_under_the_general_tab() {

        String actualEmail = myProfilePage.email.getText();
        String expectedEmail = "hr2@cybertekschool.com";
        Assert.assertEquals(actualEmail, expectedEmail);

    }
}
