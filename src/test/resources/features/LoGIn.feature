@Login
Feature: As a user, I should be able to login
  Background:
    Given user is on the login page
  Scenario Outline:
    Given  "<users>" Login with valid credentials
    Examples:
      | users       |
      | hr22        |
      | marketing22 |
      | helpdesk2   |
   Scenario Outline: User enter Invalid credentials
      Given user Login with  Invalid  "<user name>" or "<password>"
     Then User should see "Incorrect login or password"  displayed
      Examples:
        | user name                      | password |
        | marketing2@cybertekschool.com  | 1serUser |
        | marketing30@cybertekschool.com | Useruser |
        | marketin32@cybertekschool.com  | UserUser |
         Scenario: Remember me link
           Given user see Remember me link
           Then  user should click on the link
           Scenario: User should see password is hidden
             Given User Enter password
             Then User should see the password in bullet signs
