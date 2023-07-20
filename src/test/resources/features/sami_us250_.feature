@B29G6-272 @smoke
Feature: Default


  Background:User on login page
    Given user is on the login page

  @B29G6-270
  Scenario: TC1:Verify the users view the following 8 modules in the Employees page.
    Given User is on home page
    When User clicks on Employees
    Then user should be able to see following modules
      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |


  @B29G6-271
  Scenario: TC2: Verify that user view the Company Structure by default after clicking the Employees Module
    Given User is on home page
    When User clicks on Employees
    Then User should be able to view Company Structure