package com.CRM_Archer_B29.pages;

import com.CRM_Archer_B29.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EmployeesPage {
    public EmployeesPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//span[normalize-space(text())='Employees']")
    public WebElement employees;

    @FindBy(xpath = "//span[@class='main-buttons-item-text-title']")
    public List <WebElement> modulesList;

    @FindBy(id = "pagetitle")
    public WebElement CompanyStructureHeader;
}
