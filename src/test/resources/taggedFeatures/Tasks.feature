Feature: Deals CRUD Management

@SmokeTest
Scenario: Create a new Tasks
    Given User is logged in
    When User create a new Tasks

Scenario: View a Tasks
    Given User is logged in
    When User view Tasks details

@SmokeTest @RegressionTest 
Scenario: Delete a Tasks
    Given User is logged in
    When User delete a Tasks
    


