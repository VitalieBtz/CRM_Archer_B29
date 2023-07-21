package com.CRM_Archer_B29.step_definitions;

import com.CRM_Archer_B29.pages.ActivityStreamPage;
import com.CRM_Archer_B29.pages.HomePage;
import com.CRM_Archer_B29.pages.LoginPage;
import com.CRM_Archer_B29.utilities.BrowserUtils;
import com.CRM_Archer_B29.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LinkInMessage_StepDefs {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @When("user enters {string} and {string} to log in")
    public void user_enters_and_to_log_in(String userType, String userNumber) {
        loginPage.allInLogin(userType, userNumber);
    }

    @When("user clicks the activity stream button")
    public void user_clicks_the_activity_stream_button() {
        homePage.activityStreamBtn.click();
    }

    @Then("user lands on the activity stream page")
    public void user_lands_on_the_activity_stream_page() {

        String expectedInTitle = "Portal";
        BrowserUtils.verifyTitleContains(expectedInTitle);
    }

    @When("user clicks the message box")
    public void user_clicks_the_message_box() {
        activityStreamPage.messageInputBox.click();
    }

    @When("user clicks the link button")
    public void user_clicks_the_link_button() {
        activityStreamPage.linkBtn.click();
    }

    @When("user enters {string} in the link text field")
    public void user_enters_the_in_the_link_text_field(String linkText) {

        BrowserUtils.waitForVisibility(activityStreamPage.linkTxtInputBox, 2);
        activityStreamPage.linkTxtInputBox.click();
        activityStreamPage.linkTxtInputBox.sendKeys(linkText);
    }

    @When("user enters {string} in the Link URL field")
    public void user_enters_the_in_the_link_url_field(String url) {

        BrowserUtils.waitForVisibility(activityStreamPage.linkURLInputBox, 2);
        activityStreamPage.linkURLInputBox.click();
        activityStreamPage.linkURLInputBox.sendKeys(url);
    }

    @When("user clicks the Save button")
    public void user_clicks_the_save_button() {

        BrowserUtils.waitForVisibility(activityStreamPage.linkSaveBtn, 2);
        activityStreamPage.linkSaveBtn.click();
    }

    @Then("user should see the {string} link attached in the message input field.")
    public void userShouldSeeTheLinkAttachedInTheMessageInputField(String linkText) {

        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));

        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//a[.=\'"+linkText+"\']")).isDisplayed());
    }

    @And("user clicks the Send button")
    public void userClicksTheSendButton() {
        activityStreamPage.sendBtn.click();
    }

    @Then("By clicking on the {string} link user should be able to navigate to the correct URL.")
    public void byClickingOnTheLinkUserShouldBeAbleToNavigateToTheCorrectURL(String linkText) {

        BrowserUtils.sleep(1);
        WebElement linkInMsg = Driver.getDriver().findElement(By.xpath("//div[contains(@id, 'blog_post_body')]//a[.=\'"+linkText+"\']"));
        linkInMsg.click();
    }

    @Then("Link should open in a new tab the title of which should contain {string}")
    public void linkShouldOpenInANewTabTheTitleOfWhichShouldContain(String expectedInTitle) {

        BrowserUtils.switchWindowAndVerify(expectedInTitle);
    }
}
