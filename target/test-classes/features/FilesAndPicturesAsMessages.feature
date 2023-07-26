@B29G6-332
Feature: As a user, I should be able to upload files and pictures as messages

		#@B29G6-288
  Background: User is on the login page.
    Given user is on the login page

  @B29G6-266
  Scenario Outline: US248:AC1: User should be able to upload files and images in messages
    When  "<users>" Login with valid credentials
    And User clicks on the Messages button
    And User clicks on upload files button
    And User uploads their "<file>"
    Then the "<file>" will be uploaded
    Examples:
      | users | file                                  |
      | hr22  |  /Users/nurlani/Desktop/some-file.txt |
      | hr3   |  /Users/nurlani/Desktop/jpeg_43-2.jpg |
      | marketing1 | /Users/nurlani/Desktop/Interview_Prep_JAVA.pdf |
      | helpdesk4  | /Users/nurlani/Desktop/file-sample_100kB.pages |
      | helpdesk33 | /Users/nurlani/Desktop/pngwing.com.png         |

  @B29G6-290
  Scenario Outline: US248:AC2: User should be able to insert the files and images into the text.
    When  "<users>" Login with valid credentials
    And User clicks on the Messages button
    And User clicks on upload files button
    And User uploads their "<file>"
    And user clicks on Insert button
    Then the "<file>" is inserted
    Examples:
      | users | file                                  |
      | hr22  |  /Users/nurlani/Desktop/some-file.txt |
      | hr3   |  /Users/nurlani/Desktop/jpeg_43-2.jpg |
      | marketing1 | /Users/nurlani/Desktop/Interview_Prep_JAVA.pdf |
      | helpdesk4  | /Users/nurlani/Desktop/file-sample_100kB.pages |
      | helpdesk33 | /Users/nurlani/Desktop/pngwing.com.png         |


  @B29G6-291
  Scenario Outline: US248:AC3: User should be able to remove files and images at any time before sending
    When  "<users>" Login with valid credentials
    And User clicks on the Messages button
    And User clicks on upload files button
    And User uploads their "<file>"
    And user clicks on Insert button
    And user clicks on remove button
    Then the "<file>" will removed
    Examples:
      | users | file                                  |
      | hr22  |  /Users/nurlani/Desktop/some-file.txt |
      | hr3   |  /Users/nurlani/Desktop/jpeg_43-2.jpg |
      | marketing1 | /Users/nurlani/Desktop/Interview_Prep_JAVA.pdf |
      | helpdesk4  | /Users/nurlani/Desktop/file-sample_100kB.pages |
      | helpdesk33 | /Users/nurlani/Desktop/pngwing.com.png         |