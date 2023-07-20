package com.CRM_Archer_B29.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {

      /**
        This class will be storing only the utility methods that can be used across the project.
       */

    public static void sleep(int second) {
        /*
        This method will accept int (in seconds)
        and execute Thread.sleep method for given duration
        Arg: int second
        */
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void switchWindowAndVerify(String expectedInTitle) {

        //Return and store all window handles in a Set.
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();

        for (String eachWindowHandle : windowHandles) {

            Driver.getDriver().switchTo().window(eachWindowHandle);

            if (Driver.getDriver().getTitle().contains(expectedInTitle)) {
                break;
            }
        }

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }
    public static void switchWindowAndVerify(String expectedInUrl, String expectedInTitle) {

        //Return and store all window handles in a Set.
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();

        for (String eachWindowHandle : windowHandles) {

            Driver.getDriver().switchTo().window(eachWindowHandle);

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }

    public static void verifyTitle(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Title verification failed!", actualTitle, expectedTitle);
    }

    public static void verifyTitleContains(String expectedInTitle) {
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue("Title contains verification failed!",actualTitle.contains(expectedInTitle));
    }

    /*
    This method accepts WebElement target,
    and waits for that WebElement not to be displayed on the page
     */
    public static void waitForInvisibilityOf(WebElement target) {
        //Create the object of 'WebDriverWait' class, and set up the constructor args
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        //use the 'wait' object with the proper syntax to create explicit wait conditions.
        wait.until(ExpectedConditions.invisibilityOf(target));
    }

    /*
    This method accepts String title,
    and waits for that Title to contain given String value.
     */
    public static void waitForTitleContains(String title) {
        //Create the object of 'WebDriverWait' class, and set up the constructor args
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        //use the 'wait' object with the proper syntax to create explicit wait conditions.
        wait.until(ExpectedConditions.titleContains(title));
    }

    public static WebElement waitForVisibility(WebElement element, int time) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }
}
