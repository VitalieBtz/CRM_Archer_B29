package com.CRM_Archer_B29.step_definitions;

import com.CRM_Archer_B29.utilities.ConfigReader;
import com.CRM_Archer_B29.utilities.Driver;
import io.cucumber.java.en.Given;

public class LoginPC_StepDef {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("environment"));

    }

}


