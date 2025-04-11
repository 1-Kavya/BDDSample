@PhaseTwo
Feature: Deals CRUD Management

@SmokeTest
Scenario: Create a new Deals
    Given User is logged in
    When User create a new Deals

@RegressionTest
Scenario: View a Deals
    Given User is logged in
    When User view Deal details

Scenario: Delete a Deals
    Given User is logged in
    When User delete a Deals
    


