package com.CRM_Archer_B29.step_definitions;

import com.CRM_Archer_B29.pages.ActivityStreamPage;
import com.CRM_Archer_B29.utilities.BrowserUtils;
import com.CRM_Archer_B29.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class AppreciationMessage_StepDefinition {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @Then("user clicks on MORE module")
    public void userClicksOnMOREModule() {
        activityStreamPage.moreModule.click();
    }


    @And("user clicks Appreciation")
    public void userClicksAppreciation() {
        BrowserUtils.waitForVisibility(activityStreamPage.appreciationPopUp,2);
        activityStreamPage.appreciationPopUp.click();
    }


    @When("user enters {string} in Message Content which is a mandatory field.")
    public void userEntersInMessageContentWhichIsAMandatoryField(String message) {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        activityStreamPage.messageContentBox.sendKeys(message);

    }


    @Then("user choose recipient in To field which is a mandatory field")
    public void userChooseRecipientInToFieldWhichIsAMandatoryField() {

    }

    @Then("user clicks send button.")
    public void userClicksSendButton() {
        activityStreamPage.sendBtn.click();

    }
    @And("verifies user can see {string} which is the appreciation message under Activity Stream.")
    public void verifiesUserCanSeeWhichIsTheAppreciationMessageUnderActivityStream(String message) {
        BrowserUtils.sleep(1);
        WebElement appreciationMsg = Driver.getDriver().findElement(By.xpath("//div[contains(@id, 'blog_post_body')]//a[.=\'"+message+"\']"));
        Assert.assertTrue(appreciationMsg.isDisplayed());

    }


    @Then("user does not choose any recipient in To field which is a mandatory field")
    public void userDoesNotChooseAnyRecipientInToFieldWhichIsAMandatoryField() {
    }

    @Then("user verifies that mandatory field error message:Please specify at least one person")
    public void userVerifiesThatMandatoryFieldErrorMessagePleaseSpecifyAtLeastOnePerson() {
    }

    @When("user left the message field empty")
    public void userLeftTheMessageFieldEmpty() {
    }

    @And("user verifies that mandatory field error message:The message title is not specified")
    public void userVerifiesThatMandatoryFieldErrorMessageTheMessageTitleIsNotSpecified() {
    }

    @And("user verifies that the delivery should be to All employees by default.")
    public void userVerifiesThatTheDeliveryShouldBeToAllEmployeesByDefault() {
    }

    @Then("user clicks cancel button")
    public void userClicksCancelButton() {
    }

    @And("user verifies that user should be able to cancel sending appreciation at any time before sending.")
    public void userVerifiesThatUserShouldBeAbleToCancelSendingAppreciationAtAnyTimeBeforeSending() {
    }


}


