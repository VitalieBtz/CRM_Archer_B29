@B29G6-295 @smoke
Feature: Default

  Background:
		#@B29G6-294
    Given user is on the login page

  @B29G6-292
  Scenario Outline: US02_245_TC01: Verify the users can log out from the app after clicking the “Log out” button.
    Given  "<users>" Login with valid credentials
    Then users can log out from the app after clicking the “Log out” button.
    Examples:
      | users       |
      | hr22        |
      | marketing22 |
      | marketing22 |
  @B29G6-293
  Scenario Outline: US_02_TC02:Verify users see 5 options under the profile name.
    Given  "<users>" Login with valid credentials
    Then users see options under the profile name.
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                 |
    Examples:
      | users       |
      | hr33        |
      | marketing31 |
      | marketing35 |
      | helpdesk32  |
      | hr10        |


