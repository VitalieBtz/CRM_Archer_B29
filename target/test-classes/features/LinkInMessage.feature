Feature: As a user, I should be able to add link in message.

  Background: User is logged in and on the activity stream page.
    Given user is on the login page

 Scenario Outline: User should be able to attach a link to the specified text.
   When user enters "<userType>" and "<userNumber>" to log in
   And user clicks the activity stream button
   Then user lands on the activity stream page
   When user clicks the message box
   And user clicks the link button
   And user enters "Google" in the link text field
   And user enters "www.google.com" in the Link URL field
   And user clicks the Save button
   Then user should see the link attached in the message input field.
       Examples:
         | userType | userNumber |
         | hr       | 19         |
         | hr       | 51         |
         | hr       | 92         |