Feature: Book Search for
https://danube-webshop.herokuapp.com/

@RegressionTest
Scenario: Novel Search Test
    Given User is on Home Page
    When User search Novels & Stories
    Then Should display novel result page
@SmokeTest    
Scenario: Crime & Thrillers Search Test
    Given User is on Home Page
    When User search Crime & Thrillers
    Then Should display crime result page