@B29G6-269
Feature: Default
Background:
	Given User is on the login page
	
	@B29G6-267
	Scenario: TC01:Verify the users view the following options on my profile page
		Given user clicks on his or her profile
		Then user click on the My profile
		And user should to see following options 
		|General|
		|Drive|
		|Tasks|
		|Calendar|
		|Conversations|	

	
	@B29G6-268
	Scenario: TC02:Verify the email address under the General tab
		Given user clicks on his or her profile
		Then user click on the My profile
		Given user see the email under the General tab
