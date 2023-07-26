package com.CRM_Archer_B29.step_definitions;

import com.CRM_Archer_B29.pages.ActivityStreamPage;
import com.CRM_Archer_B29.pages.LoginPage;
import com.CRM_Archer_B29.utilities.BrowserUtils;
import com.CRM_Archer_B29.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UploadInAppreciation_StepDefs {

    LoginPage loginPage = new LoginPage();
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @When("{string} logs in")
    public void logsIn(String user) {
        loginPage.dynamicLogin(user);
    }

    @When("user clicks the More button inside the page")
    public void user_clicks_the_more_button_inside_the_page() {

        activityStreamPage.moreBtn.click();
    }

    @Then("user clicks the Appreciation button")
    public void user_clicks_the_appreciation_button() {

        BrowserUtils.waitForVisibility(activityStreamPage.appreciationBtn, 2);
        activityStreamPage.appreciationBtn.click();
    }

    @And("user clicks the Upload File button")
    public void userClicksTheUploadFileButton() {
        BrowserUtils.waitForVisibility(activityStreamPage.uploadFileBtn, 2);
        activityStreamPage.uploadFileBtn.click();
    }

    @When("user drags the chosen {string} into uploading field")
    public void user_drags_the_chosen_into_uploading_field(String file) {
        activityStreamPage.uploadingField.sendKeys(file);
    }

    @Then("user should see the file uploaded in ready to be used")
    public void userShouldSeeTheFileUploadedInReadyToBeUsed() {
        BrowserUtils.waitForVisibility(activityStreamPage.insertInTxtBtn, 5);
        Assert.assertTrue(activityStreamPage.insertInTxtBtn.isDisplayed());
    }

    @When("user clicks the insert in text button")
    public void user_clicks_the_insert_in_text_button() {
        BrowserUtils.waitForVisibility(activityStreamPage.insertInTxtBtn, 5);
        activityStreamPage.insertInTxtBtn.click();
    }

    @Then("user should see the file inserted in the text input field")
    public void user_should_see_the_file_inserted_in_the_text_input_field() {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));

        BrowserUtils.waitForVisibility(Driver.getDriver().findElement(By.xpath("//*[contains(@id,'bxid')]")), 3);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[contains(@id,'bxid')]")).isDisplayed());
    }

    @When("user sees the file inserted in the text input field")
    public void user_sees_the_file_inserted_in_the_text_input_field() {

    }

    @Then("user should be able to remove files and images at any time before sending")
    public void user_should_be_able_to_remove_files_and_images_at_any_time_before_sending() {

        if (activityStreamPage.sendBtn.isDisplayed()){
            List<WebElement> uploadedFilesBefore = Driver.getDriver().findElements(By.xpath("//*[contains(@id,'disk-edit-attachn')]"));

            activityStreamPage.removeFileBtn.click();

            List<WebElement> uploadedFilesAfter = Driver.getDriver().findElements(By.xpath("//*[contains(@id,'disk-edit-attachn')]"));

            Assert.assertTrue(uploadedFilesAfter.size() < uploadedFilesBefore.size());
        }
    }
}
