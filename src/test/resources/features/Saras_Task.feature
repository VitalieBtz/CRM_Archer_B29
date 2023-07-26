@S
Feature: US254_As a user, I should be able to send appreciation by clicking on Appreciation tab under Activity Stream.
Background:
Given user is on the login page
Scenario Outline:
Given  "<users>" Login with valid credentials
Given User click on send on message tab
 Then User should see "The message title is not specified" Error message
  Given user send a message with no person or groups or department specified
  Then user should see Please specify at least one person error message
  And User see all employees by default
  Given user Send a message
  Then  user should be able to cancel anytime
Examples:
| users       |
| hr13        |
| marketing22 |
| marketing26 |