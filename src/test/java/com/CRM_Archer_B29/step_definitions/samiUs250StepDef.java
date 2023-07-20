package com.CRM_Archer_B29.step_definitions;

import com.CRM_Archer_B29.pages.EmployeesPage;
import com.CRM_Archer_B29.pages.LoginPage;
import com.CRM_Archer_B29.utilities.BrowserUtils;
import com.CRM_Archer_B29.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
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

        BrowserUtils.waitFor(10);
        //employeesPage.employee.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));

        //Actions actions = new Actions(Driver.getDriver());
        //actions.keyDown(Keys.CONTROL).sendKeys(Keys.SUBTRACT).keyUp(Keys.CONTROL).perform();

        //((JavascriptExecutor) Driver.getDriver()).executeScript("document.body.style.zoom='90%';");

    }

    @Then("user should be able to see following modules")
    public void user_should_be_able_to_see_following_modules(List<String> expectedModules) {
/*
List<String> actualModules = new ArrayList<>();
        String companyStructure = employeesPage.CompanyStructure.getText();
        String fineEmployee = employeesPage.FineEmployee.getText();
        String telephoneDirectory = employeesPage.TelephoneDirectory.getText();
        String staffChanges = employeesPage.StaffChanges.getText();
        String efficiencyReport = employeesPage.EfficiencyReport.getText();
        String honoredEmployees = employeesPage.HonoredEmployees.getText();
        String birthdays = employeesPage.Birthdays.getText();
        String newPage = employeesPage.NewPage.getText();

        actualModules.add(companyStructure);
        actualModules.add(fineEmployee);
        actualModules.add(telephoneDirectory);
        actualModules.add(staffChanges);
        actualModules.add(efficiencyReport);
        actualModules.add(honoredEmployees);
        actualModules.add(birthdays );
        actualModules.add(newPage);

        System.out.println("actual = " + actualModules);
        Assert.assertEquals(expectedModules, actualModules);
 */
        List<String> actualModules = BrowserUtils.getElementsText(employeesPage.modulesList);
        System.out.println("actual = " + actualModules);
        Assert.assertEquals(expectedModules, actualModules);



    }

    @Then("User should be able to view Company Structure")
    public void userShouldBeAbleToViewCompanyStructure() {

        BrowserUtils.waitFor(5);
        Assert.assertEquals(employeesPage.CompanyStructureHeader.getText(),"Company Structure");
    }

}
