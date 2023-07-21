package com.CRM_Archer_B29.step_definitions;

import com.CRM_Archer_B29.pages.LoginPage;
import com.CRM_Archer_B29.pages.US_253_Page;
import com.CRM_Archer_B29.utilities.BrowserUtils;
import com.CRM_Archer_B29.utilities.ConfigReader;
import com.CRM_Archer_B29.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class US_253_StepDef {

    LoginPage loginPage = new LoginPage();
    US_253_Page pollPage = new US_253_Page();

    @Given("user is on the login page for poll")
    public void user_is_on_the_login_page_for_poll() {
        Driver.getDriver().get(ConfigReader.getProperty("environment"));
        BrowserUtils.waitForVisibilityOf(loginPage.usernameBox);
        loginPage.login("hr");
    }
    @Then("user validates the poll button then clicks on it")
    public void user_validates_the_poll_button_then_clicks_on_it() {
        BrowserUtils.waitForVisibilityOf(pollPage.pollButton);
        Assert.assertTrue("poll button is not displayed",pollPage.pollButton.isDisplayed());
        Assert.assertTrue("poll button is not enabled",pollPage.pollButton.isEnabled());
        pollPage.pollButton.click();

    }
    @Then("user verifies that user is on the poll tab")
    public void user_verifies_that_user_is_on_the_poll_tab() {
        pollPage.pollButton.isEnabled();
    }

    @Then("user verifies that the delivery should be to All employees by default")
    public void user_verifies_that_the_delivery_should_be_to_all_employees_by_default() {

        Assert.assertTrue("all employees is not selected",pollPage.allEmployeesBox.isDisplayed());
        System.out.println("===========>>>>>>>>>>>>>>>>>>>>>>>>>>>>> allemployeesis selected by default");
    }
    @Then("user verifies that user should be able to select the Allow multiple choice checkbox")
    public void user_verifies_that_user_should_be_able_to_select_the_allow_multiple_choice_checkbox() {

        Assert.assertTrue("multi checkbox is displayed",pollPage.multipleChoiceCheckBox.isDisplayed());
        Assert.assertTrue("multi checkbox is enabled",pollPage.multipleChoiceCheckBox.isEnabled());
        System.out.println("===========>>>>>>>>>>>>>>>>>>>>>>>>>>>>> checkbox is enabled");
    }
    @Then("user clicks on send button")
    public void user_clicks_on_send_button() {

        pollPage.sendButton.click();

    }
    @When("user verifies that mandatory field error message: The message title is not specified")
    public void user_verifies_that_mandatory_field_error_message_the_message_title_is_not_specified() {

        Assert.assertEquals("The message title is not specified",pollPage.pollTitleErrorMsg.getText().trim());
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxtillleee");
    }
    @Then("user enters {string} in the poll title input")
    public void user_enters_in_the_poll_title_input(String pollText) {
        BrowserUtils.waitForVisibilityOf(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        System.out.println("xxxxxxxxxxiframe changed");
        pollPage.pollTitle.clear();
        pollPage.pollTitle.sendKeys(pollText);
        Driver.getDriver().switchTo().parentFrame();
        System.out.println("xxxxxxxxxx main frame");

    }
    @Then("user clears the TO field")
    public void user_clears_the_to_field() {
        pollPage.toInputBox.click();
        // pollPage.toInputBox.clear();
    }

    @Then("user enters {string} question field")
    public void user_enters_question_field(String questionField) {
        pollPage.questionButton.clear();
        pollPage.questionButton.sendKeys(questionField);
        System.out.println("sending key for question");
    }

    @Then("user enters {string} and {string} in answer1 and answer2 fields")
    public void user_enters_and_in_answer1_and_answer2_fields(String answer1, String answer2) {
        BrowserUtils.waitForVisibilityOf(pollPage.answer1Button);
        pollPage.answer1Button.clear();
        pollPage.answer2Button.clear();
        pollPage.answer1Button.sendKeys(answer1);
        pollPage.answer2Button.sendKeys(answer2);

    }
    @Then("user verifies that error message: Please specify at least one person.")
    public void user_verifies_that_error_message_please_specify_at_least_one_person() {
        Assert.assertEquals("Please specify at least one person.",pollPage.specifyOnePersonMsj.getText().trim());

    }
    @Then("user verifies that error message: The question text is not specified.")
    public void user_verifies_that_error_message_the_question_text_is_not_specified() {

        Assert.assertEquals("The question text is not specified.",pollPage.specifyQuestionTextMsj.getText().trim());
    }

    @Then("user verifies that error message: The question {string}  has no answers.")
    public void user_verifies_that_error_message_the_question_has_no_answers(String questiontext) {
        pollPage.questionButton.clear();
        pollPage.questionButton.sendKeys(questiontext);


    }

    @Then("user clears the  input boxes")
    public void userClearsTheInputBoxes() {
        BrowserUtils.waitForVisibilityOf(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        System.out.println("xxxxxxxxxxiframe changed");
        pollPage.pollTitle.clear();
        Driver.getDriver().switchTo().parentFrame();
        pollPage.questionButton.clear();
        pollPage.answer1Button.clear();
        pollPage.answer2Button.clear();
    }


    @And("user verifies that user should be able to create a poll with  {string} {string} {string} and {string}")
    public void userVerifiesThatUserShouldBeAbleToCreateAPollWithAnd(String pollTitle, String question, String ans1, String ans2) {

        BrowserUtils.waitForVisibilityOfFLUENTWAIT(pollPage.pollButton);
        Assert.assertTrue( Driver.getDriver().findElement(By.xpath("//div[.='"+pollTitle+"']" )).isDisplayed());
        Assert.assertTrue( Driver.getDriver().findElement(By.xpath("//div[.='"+question+"']" )).isDisplayed());
        Assert.assertTrue( Driver.getDriver().findElement(By.xpath("//label[.='"+ans1+"']" )).isDisplayed());
        Assert.assertTrue( Driver.getDriver().findElement(By.xpath("//label[.='"+ans2+"']" )).isDisplayed());


    }
    @Then("user delete created poll")
    public void userDeleteCreatedPoll() {
        pollPage.moreButton.click();
        pollPage.deleteButton.click();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();

    }

}
