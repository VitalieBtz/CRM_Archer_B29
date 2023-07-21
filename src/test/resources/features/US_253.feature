@B29G6-284
Feature: Default

	#{color:#de350b}_*AC1:*_{color}
	#
	# The delivery should be to 'All employees' by default.
  @B29G6-279
  Scenario Outline:B29G6-253 Poll functionality error messages and validations
    Given user is on the login page for poll
    Then user validates the poll button then clicks on it
    And user verifies that user is on the poll tab
    Then user verifies that the delivery should be to All employees by default
    And user verifies that user should be able to select the Allow multiple choice checkbox
    Then user clicks on send button
    When user verifies that mandatory field error message: The message title is not specified
    Then user clears the  input boxes
    Then user enters "<pollTitle>" in the poll title input
    Then user clears the TO field
    Then user enters "<questionTitle>" question field
    Then user enters "<answer1>" and "<answer2>" in answer1 and answer2 fields
    Then user clicks on send button
    And user verifies that error message: Please specify at least one person.
    Then user clears the  input boxes
    Then user enters "<pollTitle>" in the poll title input
    Then user enters "<answer1>" and "<answer2>" in answer1 and answer2 fields
    Then user clicks on send button
    And user verifies that error message: The question text is not specified.
    Then user clears the  input boxes
    Then user enters "<pollTitle>" in the poll title input
    Then user enters "<questionTitle>" question field
    Then user clicks on send button
    And user verifies that error message: The question "<questionTitle>"  has no answers.
    Examples:
      | pollTitle | questionTitle | answer1 | answer2 |
      | samplePolltitle1 | sampleQuestiontitle1 | sampleAnswertitle1 | sampleAnswertitle2 |

  @B29G6-280
  Scenario Outline: B29G6-253 Poll functionality error messages and validations happy path
    Given user is on the login page for poll
    Then user validates the poll button then clicks on it
    Then user enters "<pollTitle>" in the poll title input
    Then user enters "<questionTitle>" question field
    Then user enters "<answer1>" and "<answer2>" in answer1 and answer2 fields
    Then user clicks on send button
    And user verifies that user should be able to create a poll with  "<pollTitle>" "<questionTitle>" "<answer1>" and "<answer2>"
    Then user delete created poll

    Examples:
      | pollTitle | questionTitle | answer1 | answer2 |
      | samplePolltitle1 | sampleQuestiontitle1 | sampleAnswertitle1 | sampleAnswertitle2 |


