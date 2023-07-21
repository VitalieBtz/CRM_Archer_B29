package com.CRM_Archer_B29.step_definitions;

import com.CRM_Archer_B29.pages.HomePage;
import com.CRM_Archer_B29.utilities.BrowserUtils;
import com.CRM_Archer_B29.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Saras_Task {
    HomePage homePage=new HomePage();
    @Given("User click on send on message tab")
    public void user_click_on_send_on_message_tab() {
        homePage.MessageTABE.click();
        homePage.SendMessageBTN.click();
    }
    @Given("user send a message with no person or groups or department specified")
    public void user_send_a_message_with_no_person_or_groups_or_department_specified() {
Driver.getDriver().findElement(By.xpath("//span[@class='feed-add-post-del-but']")).click();
        BrowserUtils.sleep(3);
    }
    @Then("User see all employees by default")
    public void user_see_all_employees_by_default() {
Assert.assertTrue(Driver.getDriver().findElement(By.id("UA")).isDisplayed());
    }
    @Given("user Send a message")
    public void user_send_a_message() {

    }
    @Then("user should be able to cancel anytime")
    public void user_should_be_able_to_cancel_anytime() {

    }
    @Then("User should see {string} Error message")
    public void userShouldSeeErrorMessage(String arg0) {
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath("//div[@class='feed-add-error']")).getText(),arg0);
    }
    @Then("user should see Please specify at least one person error message")
    public void userShouldSeePleaseSpecifyAtLeastOnePersonErrorMessage() {
       BrowserUtils.sleep(3);
        homePage.SendMessageBTN.click();
        BrowserUtils.sleep(5);
Assert.assertEquals(homePage.ATleastOnePersonERRORM.getText(),"Please specify at least one person.");
    }

}
