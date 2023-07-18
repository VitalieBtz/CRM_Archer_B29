Feature: As a user I should be able to login in

  @login
  Scenario Outline:
    Given user is on the login page
    When user enters "<userType>" and "<userNumber>"
    Then user lands on the home
    Examples:
      | userType  | userNumber |
      | hr        | 54         |
      | helpdesk  | 7          |
      | marketing | 12         |
      | helpdesk  | 44         |

      Scenario: check something else
        Given user sees something is displayed