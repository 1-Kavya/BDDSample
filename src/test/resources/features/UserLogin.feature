Feature: User login function
#https://the-internet.herokuapp.com/login

#Scenario: Valid Login Admin 
#Given User is on Login Page
#When User enters credentials
#Then Should display success message

#Scenario: Valid Login Admin 
#Given User is on Login Page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then Should display success message

#Scenario: Valid Login Admin 
#Given User is on Login Page
#When User enters "<username>" and "<password>"
#Then Should display success message
#
#Examples:
#| username | password |
#| tomsmith | SuperSecretPassword1 |
#| tomsmith | SuperSecretPassword2 |
#| tomsmith | SuperSecretPassword! |


#step level implementation
Scenario: Valid Login Admin 
Given User is on Login Page
When User enters credentials
	| username | password |
	| tomsmith | SuperSecretPassword! |
Then Should display success message
	| You logged into a secure area! |
