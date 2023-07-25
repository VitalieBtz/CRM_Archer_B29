package com.CRM_Archer_B29.step_definitions;

import com.CRM_Archer_B29.pages.ActivityStreamPage;
import com.CRM_Archer_B29.utilities.BrowserUtils;
import com.CRM_Archer_B29.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AppreciationMessage_StepDef {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    @Then("user clicks on MORE module")
    public void userClicksOnMOREModule() {
     activityStreamPage.moreModule.click();
    }

    @And("user clicks Appreciation")
    public void userClicksAppreciation() {

      activityStreamPage.appreciationPopUp.click();

    }

    @When("user enters {string} in Message Content which is a mandatory field.")
    public void userEntersInMessageContentWhichIsAMandatoryField(String message) {
        Driver.getDriver().switchTo().frame(0);
        activityStreamPage.appreciationMessageContent.sendKeys(message);
        Driver.getDriver().switchTo().defaultContent();

    }

    @When("user left the message field empty")
    public void userLeftTheMessageFieldEmpty() {
    }

    @Then("user clicks send button.")
    public void userClicksSendButton() {
        BrowserUtils.waitForVisibility(activityStreamPage.sendBtn, 2);
        activityStreamPage.sendBtn.click();

    }

    @And("user verifies that mandatory field error message:The message title is not specified")
    public void userVerifiesThatMandatoryFieldErrorMessageTheMessageTitleIsNotSpecified() {
        String expectedErrorMessage = "The message title is not specified";
        String actualErrorMessage = activityStreamPage.errorMessageTitle.getText();
        BrowserUtils.waitForVisibility(activityStreamPage.errorMessageTitle, 2);
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);
    }

    @Then("user removes All employees recipient which is default")
    public void userRemovesAllEmployeesRecipientWhichIsDefault() {

        activityStreamPage.allEmployeesRemove.click();
        BrowserUtils.waitForInvisibilityOf(activityStreamPage.allEmployeesRemove);

    }

    @Then("user verifies that mandatory field error message:Please specify at least one person.")
    public void userVerifiesThatMandatoryFieldErrorMessagePleaseSpecifyAtLeastOnePerson() {
        String expectedErrorMessage = "Please specify at least one person.";
        String actualErrorMessage = activityStreamPage.errorMessagePerson.getText();
        BrowserUtils.waitForVisibility(activityStreamPage.errorMessagePerson, 2);
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);

    }

    @And("verifies user can see {string} which is the appreciation message under Activity Stream.")
    public void verifiesUserCanSeeWhichIsTheAppreciationMessageUnderActivityStream(String message) {

        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//div[.='"+message+"']")).isDisplayed());//dynamic appreciation message

    }

    @And("user verifies that the delivery should be to All employees by default.")
    public void userVerifiesThatTheDeliveryShouldBeToAllEmployeesByDefault() {
        Assert.assertTrue(activityStreamPage.allEmployeesDefault.isDisplayed());
    }

    @Then("user clicks cancel button")
    public void userClicksCancelButton() {
        BrowserUtils.waitForVisibility(activityStreamPage.cancelBtn, 2);
        activityStreamPage.cancelBtn.click();
    }

    @And("user verifies that user should be able to cancel sending appreciation at any time before sending.")
    public void userVerifiesThatUserShouldBeAbleToCancelSendingAppreciationAtAnyTimeBeforeSending() {
        BrowserUtils.waitForVisibility(activityStreamPage.messageContentAfterCanceling, 2);
        Assert.assertTrue(activityStreamPage.messageContentAfterCanceling.isDisplayed());

    }
}
