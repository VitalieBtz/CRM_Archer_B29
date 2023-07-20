package com.CRM_Archer_B29.step_definitions;

import com.CRM_Archer_B29.pages.HomePage;
import com.CRM_Archer_B29.pages.LoginPage;
import com.CRM_Archer_B29.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class Lougout {
    LoginPage loginPage = new LoginPage();
    HomePage page=new HomePage();
    @Given("{string} Login with valid credentials")
    public void login_with_valid_credentials(String string) {
        loginPage.dynamicLogin(string);
    }
    @Then("users can log out from the app after clicking the “Log out” button.")
    public void users_can_log_out_from_the_app_after_clicking_the_log_out_button() {
        page.UsertabOptions.click();
        page.LogoutBtn.click();
        Assert.assertTrue(loginPage.loginBtn.isDisplayed());
    }
    @Then("users see options under the profile name.")
    public void usersSeeOptionsUnderTheProfileName(List<String> S) {
        page.UsertabOptions.click();
        List<String>options=new ArrayList<>();
        options.add(Driver.getDriver().findElement(By.xpath("(//span[@class='menu-popup-item-text'])[1]")).getText());
        options.add(Driver.getDriver().findElement(By.xpath("(//span[@class='menu-popup-item-text'])[2]")).getText());
        options.add(Driver.getDriver().findElement(By.xpath("(//span[@class='menu-popup-item-text'])[3]")).getText());
        options.add(Driver.getDriver().findElement(By.xpath("(//span[@class='menu-popup-item-text'])[4]")).getText());
        options.add(Driver.getDriver().findElement(By.xpath("(//span[@class='menu-popup-item-text'])[5]")).getText());
        Assert.assertEquals(S,options);
    }
}
