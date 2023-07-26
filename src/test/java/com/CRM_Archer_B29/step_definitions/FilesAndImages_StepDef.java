package com.CRM_Archer_B29.step_definitions;

import com.CRM_Archer_B29.pages.HomePage;
import com.CRM_Archer_B29.pages.LoginPage;
import com.CRM_Archer_B29.pages.MessageModulePage;
import com.CRM_Archer_B29.utilities.BrowserUtils;
import com.CRM_Archer_B29.utilities.ConfigReader;
import com.CRM_Archer_B29.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FilesAndImages_StepDef {

    LoginPage loginPage = new LoginPage();

    MessageModulePage messageModulePage = new MessageModulePage();
    
    @And("User clicks on the Messages button")
    public void userClicksOnTheMessagesButton() {
        messageModulePage.messageBtn.click();
        BrowserUtils.sleep(3);
    }
    @Then("User clicks on upload files button")
    public void userClicksOnUploadFilesButton() {
        messageModulePage.uploadFilesBtn.click();
    }
    @And("User uploads their {string}")
    public void userShouldBeAbleToUpload(String files) {
        messageModulePage.uploadFilesBox.sendKeys(files);
    }
    @Then("the {string} will be uploaded")
    public void theWillBeUploaded(String arg0) {
        messageModulePage.insertBtn.isDisplayed();
    }
    @And("user clicks on Insert button")
    public void userClicksToInsertTheFilesAndImagesToTheText() {
        messageModulePage.insertBtn.click();
        //Assert.assertTrue(messageModulePage.inTextBtn.getText().equals("In text"));
    }

    @Then("the {string} is inserted")
    public void theIsInserted(String arg0) {
        Assert.assertTrue(messageModulePage.inTextBtn.isDisplayed());
    }
    @And("user clicks on remove button")
    public void userClicksOnRemoveButton() {
        messageModulePage.removeBtn.click();
    }

    @Then("the {string} will removed")
    public void theWillRemoved(String arg0) {
        Assert.assertFalse(messageModulePage.filesBlock.getText().contains("My Drive / Uploaded files"));

    }
}

