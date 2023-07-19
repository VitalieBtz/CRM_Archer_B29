@wip
Feature: Appreciation message functionality
  User Story: US254_As a user, I should be able to send appreciation
  by  clicking on Appreciation tab under Activity Stream.

  Background:
    Given user is on the login page
    When user enters "username" to login
    Then user clicks on MORE module
    And user clicks Appreciation


  Scenario: US254_TC1_a_User should be able to send an appreciation by filling in the mandatory fields.
      When user enters "appreciation message" in Message Content which is a mandatory field.
      Then user choose recipient in To field which is a mandatory field
      Then user clicks send button.
      And verifies user can see the appreciation message under Activity Stream.

  Scenario: US254_TC1_b_User should be able to send an appreciation by filling in the mandatory fields.
    When user enters "appreciation message" in Message Content which is a mandatory field.
    Then user does not choose any recipient in To field which is a mandatory field
    And  user clicks send button
    Then user verifies that mandatory field error message:Please specify at least one person

  Scenario: US254_TC1_c_User should be able to send an appreciation by filling in the mandatory fields.
    When user left the message field empty
    Then user click send button
    And user verifies that mandatory field error message:The message title is not specified


  Scenario: US254_TC2_The delivery should be to 'All employees' by default.
    And user verifies that the delivery should be to All employees by default.


  Scenario: US254_TC3_User should be able to cancel sending appreciation at any time before sending.
    Then user clicks cancel button
    And user verifies that user should be able to cancel sending appreciation at any time before sending.




