package com.CRM_Archer_B29.step_definitions;

import com.CRM_Archer_B29.utilities.BrowserUtils;
import com.CRM_Archer_B29.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Browser;

import java.util.List;

public class nourlantask {



    @Then("User should be able to upload file")
    public void userShouldBeAbleToUploadFile() {

    }

    @Then("User click on the things")
    public void userClickOnTheThings() {
        Driver.getDriver().findElement(By.id("feed-add-post-form-link-text")).click();
        WebElement sendkey=Driver.getDriver().findElement(By.xpath("//span[@class='menu-popup-item menu-popup-no-icon feed-add-post-form-file feed-add-post-form-file-more ']"));
        sendkey.click();
        BrowserUtils.sleep(2);

    }

    @Then("User should be able to upload {string}")
    public void userShouldBeAbleToUpload(String arg0) {
        Driver.getDriver().findElement(By.xpath("//input[@name='bxu_files[]']")).sendKeys(arg0);
    }

    @Then("User should be able to insert the files and images to the text")
    public void userShouldBeAbleToInsertTheFilesAndImagesToTheText() {
        Driver.getDriver().findElement(By.xpath("//span[@class=\"insert-btn\"]")).click();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[@class=\"insert-text\"]")).getText().equals("In text"));
    }

    @Then("User should be able to remove files")
    public void userShouldBeAbleToRemoveFiles() {
        Driver.getDriver().findElement(By.id("feed-add-post-form-tab-message")).click();
        BrowserUtils.sleep(2);

        Driver.getDriver().findElement(By.xpath("//td[@class='files-del-btn']")).click();
        Assert.assertFalse(Driver.getDriver().findElement(By.xpath("//div[@class='diskuf-files-block']")).getText().contains("My Drive / Uploaded files"));


    }
}
