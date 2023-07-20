Feature: As a user I should be able to login in

  @login
  Scenario Outline:
    Given user is on the login page
    When user enters "<username>"
    Then user lands on the home page
    Examples:
      | username    |
      | hr4         |
      | hr7         |
      | helpdesk90  |
      | marketing34 |
