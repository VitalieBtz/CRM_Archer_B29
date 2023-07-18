package com.CRM_Archer_B29.step_definitions;

import com.CRM_Archer_B29.pages.LoginPage;
import com.CRM_Archer_B29.utilities.BrowserUtils;
import com.CRM_Archer_B29.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class vitalie_StepDefs {

    LoginPage loginPage = new LoginPage();

    @When("user enters {string} and {string} to log in")
    public void user_enters_and_to_log_in(String userType, String userNumber) {
        loginPage.allInLogin(userType, userNumber);
    }

    @When("user clicks the activity stream button")
    public void user_clicks_the_activity_stream_button() {

        Driver.getDriver().findElement(By.xpath("//a[@id='logo_24_a']")).click();
    }

    @Then("user lands on the activity stream page")
    public void user_lands_on_the_activity_stream_page() {

        String expectedInTitle = "Portal";

        BrowserUtils.verifyTitleContains(expectedInTitle);
    }

    @When("user clicks the message box")
    public void user_clicks_the_message_box() {

        Driver.getDriver().findElement(By.xpath("//span[.='Message']/span")).click();
    }

    @When("user clicks the link button")
    public void user_clicks_the_link_button() {
        Driver.getDriver().findElement(By.xpath("//span[@title='Link']/i")).click();
    }

    @When("user enters {string} in the link text field")
    public void user_enters_the_in_the_link_text_field(String linkText) {
        Driver.getDriver().findElement(By.xpath("//input[@id='linkidPostFormLHE_blogPostForm-text']")).sendKeys(linkText);
    }

    @When("user enters {string} in the Link URL field")
    public void user_enters_the_in_the_link_url_field(String url) {
        Driver.getDriver().findElement(By.xpath("//input[@id='linkidPostFormLHE_blogPostForm-href']")).sendKeys(url);
    }

    @When("user clicks the Save button")
    public void user_clicks_the_save_button() {
        Driver.getDriver().findElement(By.xpath("//input[@id='undefined']")).click();
        BrowserUtils.sleep(1);
    }

    @Then("user should see the link attached in the message input field.")
    public void user_should_see_the_link_attached_in_the_message_input_field() {

        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));

        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//a[.='Google']")).isDisplayed());
    }
}
