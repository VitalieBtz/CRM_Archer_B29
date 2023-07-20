package com.CRM_Archer_B29.pages;

import com.CRM_Archer_B29.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {
    public TasksPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
