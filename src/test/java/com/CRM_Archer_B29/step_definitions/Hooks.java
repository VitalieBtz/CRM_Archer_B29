package com.CRM_Archer_B29.step_definitions;

import com.CRM_Archer_B29.pages.LoginPage;
import com.CRM_Archer_B29.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    LoginPage loginPage = new LoginPage();
    // import the @Before from io.cucumber.java
    @Before
    public void setupMethod(){
        //System.out.println("---> @Before: RUNNING BEFORE EACH SCENARIO");
    }

    /*
    @After will be executed automatically after EVERY scenario in the project
     */
    @After
    public void teardownMethod(Scenario scenario){

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        //System.out.println("---> @After: RUNNING AFTER EACH SCENARIO");
        Driver.closeDriver();
    }
}
