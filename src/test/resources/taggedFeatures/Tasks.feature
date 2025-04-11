@PhaseThree
Feature: Deals CRUD Management

Background: User Login
    Given User is logged in

@SmokeTest
Scenario: Create a new Tasks
    #Given User is logged in
    When User create a new Tasks

@SmokeTest @RegressionTest
Scenario: View a Tasks
    #Given User is logged in
    When User view Tasks details

 
Scenario: Delete a Tasks
    #Given User is logged in
    When User delete a Tasks
    

#instead of using the repeated steps/application behavior is same in feature we can use Background
#difference between before hook ( and background (behavior of the application for particular feature file)

