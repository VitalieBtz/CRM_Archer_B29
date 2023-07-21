package com.CRM_Archer_B29.step_definitions;

import com.CRM_Archer_B29.pages.EmployeesPage;
import com.CRM_Archer_B29.pages.LoginPage;
import com.CRM_Archer_B29.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class samiUs250StepDef extends LoginPage {

        EmployeesPage employeesPage =new EmployeesPage();
        //LoginPage loginPage = new LoginPage()

    @Given("User is on home page")
    public void user_is_on_home_page() {
        allInLogin("hr","1");
    }
    @When("User clicks on Employees")
    public void user_clicks_on_Employees() {

        employeesPage.employees.click();
    }

    @Then("user should be able to see following modules")
    public void user_should_be_able_to_see_following_modules(List<String> expectedModules) {

        for(int i=0; i<3; i++){
            Robot robot = null;
            try {
                robot = new Robot();
            } catch (AWTException e) {
                throw new RuntimeException(e);
            }
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_MINUS);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_MINUS);
        }

        BrowserUtils.sleep(2);
        List<String> actualModules = BrowserUtils.getElementsText(employeesPage.modulesList);
        System.out.println("actual = " + actualModules);
        BrowserUtils.sleep(3);
        Assert.assertEquals(expectedModules, actualModules);
    }

    @Then("User should be able to view Company Structure")
    public void userShouldBeAbleToViewCompanyStructure() {

        BrowserUtils.sleep(5);
        Assert.assertEquals(employeesPage.CompanyStructureHeader.getText(),"Company Structure");
    }

}
