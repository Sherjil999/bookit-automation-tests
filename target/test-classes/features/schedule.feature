Feature: View schedule

@schedule
Scenario: My team schedule
	Given the user is on the login page
	And the user logs in as teacher 
	When the user goes to my schedule
	Then he should be able to see reservation for his team