@B29G6-285 @smoke
Feature: As a user, I should be able to login.

  Background:
    Given User is on the login page

  @B29G6-259
  Scenario Outline: US244_TC2-"Incorrect login or password" error message should be displayed for invalid credentials
    When User enters invalid "<username>" or invalid "<password>"
    And User clicks login button
    Then User should see message Incorrect login or password

    Examples:
      | username                        | password  |
      | hr1@cybertekschool.com          | User      |
      | hr2@cybertekschool.com          | User      |
      | hr3@cybertekschool.com          | User      |
      | helpdesk1@cybertek.com          | User1     |
      | helpdesk2@cybertek.com          | User2     |
      | helpdesk3@cybertek.com          | User3     |
      | marketing102@cybertekschool.com | 4UserUser |
      | marketing202@cybertekschool.com | 5UserUser |
      | marketing301@cybertekschool.com | 6UserUser |


  @B29G6-260
  Scenario Outline: US244_TC3-"Please fill out this field" error message should be displayed if the password or username is empty
    When User enters only a  "<username>" or "<password>"
    And User clicks login button
    Then User should see message Please fill out this field

    Examples:
      | username                        | password   |
      | hr4@cybertekschool.com          |            |
      | hr5@cybertekschool.com          |            |
      |                                 | UserUser   |
      |                                 | User1User  |
      | marketing102@cybertekschool.com |            |
      |                                 | 3@UserUser |
      | marketing301@cybertekschool.com |            |

	#1-Users should be able to log in with valid credentials. 
	# (We have 3 types of users such as HR user, Marketing user, and Helpdesk user).
  @B29G6-258
  Scenario Outline: US244_TC1-Users should be able to log in with valid credentials.
    When User enters a valid "<username>" and "<password>"
    And User clicks login button
    Then User should land on a home page

    Examples:
      | username                      | password |
      | hr1@cybertekschool.com        | UserUser |
      | hr2@cybertekschool.com        | UserUser |
      | hr3@cybertekschool.com        | UserUser |
      | helpdesk1@cybertekschool.com  | UserUser |
      | helpdesk2@cybertekschool.com  | UserUser |
      | helpdesk3@cybertekschool.com  | UserUser |
      | marketing1@cybertekschool.com | UserUser |
      | marketing2@cybertekschool.com | UserUser |
      | marketing3@cybertekschool.com | UserUser |


  @B29G6-261
  Scenario: US244-TC4-User can see "Remember Me" link exists and is clickable on the login page
    When User clicks Remember Me link
    Then Remember Me link is selected


  @B29G6-262
  Scenario Outline: US244-TC5-User should see the password in bullet signs by default
    When User enters any "<username>" and "<password>"
    Then password is in bullet signs
    Examples:
      | username                      | password     |
      | hr1@cybertekschool.com        | User         |
      |                               | User         |
      | hr3@cybertekschool.com        | @UserUser    |
      | helpdesk1@cybertekschool.com  | !UserUser1   |
      | helpdesk2@cybertekschool.com  | UserUser2    |
      | helpdesk3@cybertekschool.com  | User112User  |
      | marketing1@cybertekschool.com | vitaUserUser |
      | marketing2@cybertekschool.com | GUserUser    |
      | marketing3@cybertekschool.com | %UserUser    |