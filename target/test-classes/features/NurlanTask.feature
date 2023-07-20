@taskk1
Feature: As a user, I should be able to upload files and pictures as messages
  Background:
    Given user is on the login page
  Scenario Outline:
    Given  "<users>" Login with valid credentials
    Then User click on the things
    Then  User should be able to upload "<file>"
    Then  User should be able to insert the files and images to the text
    Then User should be able to remove files
    Examples:
      | users | file                                             |
      | hr22  | C:\Users\anis\Desktop\task\jpg.jpg               |
      | hr3   | C:\Users\anis\Desktop\task\New Text Document.txt |
      | hr21  | C:\Users\anis\Desktop\task\png.png               |
      | hr2   | C:\Users\anis\Desktop\task\sample3 (1).docx      |
      | hr5   | C:\Users\anis\Desktop\task\task.pdf              |