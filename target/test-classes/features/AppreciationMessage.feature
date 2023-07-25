@B29G6-339
Feature: Default

	Background:
		Given user is on the login page
		

	#passed
	@B29G6-333
	Scenario Outline: US254_TC1_a_Verify user should be able to send an appreciation by filling in the mandatory fields.
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
		      | helpdesk3@cybertekschool.com  | UserUser |
		      | marketing3@cybertekschool.com | UserUser |

	
	@B29G6-334
	Scenario Outline: US254_TC1_b_Verify user should be able to send an appreciation by filling in the mandatory fields.
		When User enters a valid "<username>" and "<password>"
		    And User clicks login button
		    Then User should land on a home page
		    Then user clicks on MORE module
		    And user clicks Appreciation
		    When user enters "great" in Message Content which is a mandatory field.
		    Then user removes All employees recipient which is default 
		    And  user clicks send button.
		    Then user verifies that mandatory field error message:Please specify at least one person.
		    Examples:
		      | username                      | password |
		      | hr3@cybertekschool.com        | UserUser |
		      | helpdesk3@cybertekschool.com  | UserUser |
		      | marketing3@cybertekschool.com | UserUser |


	@B29G6-335
	Scenario Outline: US254_TC1_c_Verify user should be able to send an appreciation by filling in the mandatory fields.
		When User enters a valid "<username>" and "<password>"
		    And User clicks login button
		    Then User should land on a home page
		    Then user clicks on MORE module
		    And user clicks Appreciation
		    When user enters "hi team!" in Message Content which is a mandatory field.
		    Then user clicks send button.
		    And verifies user can see "hi team!" which is the appreciation message under Activity Stream.
		    Examples:
		       | username                      | password |
		       #| hr3@cybertekschool.com        | UserUser |
		       #| helpdesk3@cybertekschool.com  | UserUser |
		       | marketing3@cybertekschool.com | UserUser |


	@B29G6-336
	Scenario Outline: US254_TC2_Verify the delivery should be to 'All employees' by default.
		When User enters a valid "<username>" and "<password>"
		    And User clicks login button
		    Then User should land on a home page
		    Then user clicks on MORE module
		    And user clicks Appreciation
		    And user verifies that the delivery should be to All employees by default.
		    Examples:
		      | username                      | password |
		      | hr3@cybertekschool.com        | UserUser |
		      | helpdesk3@cybertekschool.com  | UserUser |
		      | marketing3@cybertekschool.com | UserUser |



	@B29G6-337
	Scenario Outline: US254_TC3_Verify user should be able to cancel sending appreciation at any time before sending.
		When User enters a valid "<username>" and "<password>"
		And User clicks login button
		Then User should land on a home page
		Then user clicks on MORE module
		And user clicks Appreciation
		When user enters "java" in Message Content which is a mandatory field.
		Then user clicks cancel button
		And user verifies that user should be able to cancel sending appreciation at any time before sending.
		Examples:
			| username                      | password |
			| hr3@cybertekschool.com        | UserUser |
			| helpdesk3@cybertekschool.com  | UserUser |
			| marketing3@cybertekschool.com | UserUser |
