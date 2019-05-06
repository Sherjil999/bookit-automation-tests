Feature: Login

	Background: 
	Given the user is on the login page
	
	@login
	Scenario: login as teacher
	
	When the user logs in as teacher
	Then the user should be logged in
	
	@login
	Scenario: login as team lead
	
	When the user logs in as team lead
	Then the user should be logged in
	
	Scenario: login as anyone 
	 
	When the user logs in using "kliversageu@cbslocal.com" and "kerrieliversage" 
	Then the user should be logged in 
	
	@login
	Scenario: Login as another person 
	
	When  the user logs in using "rbarstowk@cyberchimps.com" and "reneebarstow" 
	Then  the user should be logged in
	And there should be 1 rooms