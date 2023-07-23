
Feature: Appreciation message functionality
  User Story: US254_As a user, I should be able to send appreciation
  by  clicking on Appreciation tab under Activity Stream.
  #Mandatory fields: 'Message Content' & 'To'.
  #Error messages for mandatory fields:
  #"The message title is not specified"
  #"Please specify at least one person."

  Background:
    Given user is on the login page

  @wip1
  Scenario Outline: US254_TC1_a_User should be able to send an appreciation by filling in the mandatory fields.
    When User enters a valid "<username>" and "<password>"
    And User clicks login button
    Then User should land on a home page
    Then user clicks on MORE module
    And user clicks Appreciation

    When user enters "hello" in Message Content which is a mandatory field.
   # Then user choose recipient in To field which is a mandatory field
    #Then user clicks send button.
    #And verifies user can see "hello" which is the appreciation message under Activity Stream.
    Examples:
      | username                      | password |
      | hr3@cybertekschool.com        | UserUser |


  Scenario Outline: US254_TC1_b_User should be able to send an appreciation by filling in the mandatory fields.
    When User enters a valid "<username>" and "<password>"
    And User clicks login button
    Then User should land on a home page
    Then user clicks on MORE module
    And user clicks Appreciation
    When user enters "hello" in Message Content which is a mandatory field.
    Then user does not choose any recipient in To field which is a mandatory field
    And  user clicks send button.
    Then user verifies that mandatory field error message:Please specify at least one person
    Examples:
      | username                      | password |
      | hr3@cybertekschool.com        | UserUser |

  Scenario Outline: US254_TC1_c_User should be able to send an appreciation by filling in the mandatory fields.
    When User enters a valid "<username>" and "<password>"
    And User clicks login button
    Then User should land on a home page
    Then user clicks on MORE module
    And user clicks Appreciation
    When user left the message field empty
    Then user clicks send button.
    And user verifies that mandatory field error message:The message title is not specified
    Examples:
      | username                      | password |
      | hr3@cybertekschool.com        | UserUser |


  Scenario Outline: US254_TC2_The delivery should be to 'All employees' by default.
    When User enters a valid "<username>" and "<password>"
    And User clicks login button
    Then User should land on a home page
    Then user clicks on MORE module
    And user clicks Appreciation
    And user verifies that the delivery should be to All employees by default.
    Examples:
      | username                      | password |
      | hr3@cybertekschool.com        | UserUser |



  Scenario Outline: US254_TC3_User should be able to cancel sending appreciation at any time before sending.
    When User enters a valid "<username>" and "<password>"
    And User clicks login button
    Then User should land on a home page
    Then user clicks on MORE module
    And user clicks Appreciation
    When user enters "hello" in Message Content which is a mandatory field.
    Then user clicks cancel button
    And user verifies that user should be able to cancel sending appreciation at any time before sending.
    Examples:
      | username                      | password |
      | hr3@cybertekschool.com        | UserUser |





