package com.CRM_Archer_B29.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppreciationMessage_StepDefinition {


    @Then("user clicks on MORE module")
    public void userClicksOnMOREModule() {
    }


    @And("user clicks Appreciation")
    public void userClicksAppreciation() {
    }


    @When("user enters {string} in Message Content which is a mandatory field.")
    public void userEntersInMessageContentWhichIsAMandatoryField(String message) {
    }


    @Then("user choose recipient in To field which is a mandatory field")
    public void userChooseRecipientInToFieldWhichIsAMandatoryField() {
    }

    @Then("user clicks send button.")
    public void userClicksSendButton() {
    }

    @And("verifies user can see the appreciation message under Activity Stream.")
    public void verifiesUserCanSeeTheAppreciationMessageUnderActivityStream() {
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


