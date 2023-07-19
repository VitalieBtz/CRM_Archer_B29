@B29G6-305
Feature: As a user, I should be able to add link in message.

		#@B29G6-288
		Background: User is on the login page.
		    Given user is on the login page

	#_*User Story:*_
	#
	#As a user, I should be able to add link in message.
	#
	#_*AC:*_
	#
	#User should be able to attach a link to the specified text.
	@B29G6-289
	Scenario Outline: US249_TC01 User should be able to attach a link to the specified text.
		When user enters "<userType>" and "<userNumber>" to log in
		    And user clicks the activity stream button
		    Then user lands on the activity stream page
		
		    When user clicks the message box
		    And user clicks the link button
		    And user enters "Volvo" in the link text field
		    And user enters "www.volvo.com" in the Link URL field
		    And user clicks the Save button
		    Then user should see the "Volvo" link attached in the message input field.
		    Examples:
		      | userType  | userNumber |
		      | hr        | 17         |
		      | hr        | 49         |
		      | hr        | 83         |
		      | helpdesk  | 13         |
		      | helpdesk  | 45         |
		      | helpdesk  | 91         |
		      | marketing | 16         |
		      | marketing | 37         |
		      | marketing | 94         |	

	#_*User story:*_
	#
	#As a user, I should be able to add link in message.
	#
	#_*AC:*_
	#
	#By clicking on the link user should be able to navigate to the correct URL.
	@B29G6-303
	Scenario Outline: US249_TC02 By clicking on the link user should be able to navigate to the correct URL.
		When user enters "<userType>" and "<userNumber>" to log in
		    And user clicks the activity stream button
		    Then user lands on the activity stream page
		
		    When user clicks the message box
		    And user clicks the link button
		    And user enters "Volvo" in the link text field
		    And user enters "www.volvo.com" in the Link URL field
		    And user clicks the Save button
		    And user clicks the Send button
		    Then By clicking on the "Volvo" link user should be able to navigate to the correct URL.
		    Examples:
		      | userType  | userNumber |
		      | hr        | 17         |
		      | hr        | 49         |
		      | hr        | 83         |
		      | helpdesk  | 13         |
		      | helpdesk  | 45         |
		      | helpdesk  | 91         |
		      | marketing | 16         |
		      | marketing | 37         |
		      | marketing | 94         |	

	#_*User story:*_
	#
	#As a user, I should be able to add link in message.
	#
	#_*AC:*_
	#
	#Link should open in a new tab.
	@B29G6-304
	Scenario Outline: US249_TC03 Link should open in a new tab.
		When user enters "<userType>" and "<userNumber>" to log in
		    And user clicks the activity stream button
		    Then user lands on the activity stream page
		
		    When user clicks the message box
		    And user clicks the link button
		    And user enters "Volvo" in the link text field
		    And user enters "www.volvo.com" in the Link URL field
		    And user clicks the Save button
		    And user clicks the Send button
		    And By clicking on the "Volvo" link user should be able to navigate to the correct URL.
		    Then Link should open in a new tab the title of which should contain "Volvo"
		    Examples:
		      | userType  | userNumber |
		      | hr        | 17         |
		      | hr        | 49         |
		      | hr        | 83         |
		      | helpdesk  | 13         |
		      | helpdesk  | 45         |
		      | helpdesk  | 91         |
		      | marketing | 16         |
		      | marketing | 37         |
		      | marketing | 94         |