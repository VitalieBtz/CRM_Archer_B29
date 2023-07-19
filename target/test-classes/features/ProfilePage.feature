@B29G6-269
Feature: Default

	
	@B29G6-267
	Scenario: TC01:Verify the users view the following options on my profile page
		Scenario: Verify the users view the following options on my profile page
		Given user click on the username button
		Then user click on the My profile
		And user see the following options 
		|General|Drive|Tasks|Calendar|Conversations	

	
	@B29G6-268
	Scenario: TC02:Verify the email address under the General tab
		Scenario: Verify the email address under the General tab
		Given user see the email under the General tab