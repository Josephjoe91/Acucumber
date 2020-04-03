
@tag
Feature: Add Customer in demo site
  I want to use this template for my feature file

 
  Scenario: Add Customer with hard coded datas
    Given user launches demo telecom site
    And user clicks on add customer button
    When user enters all the fields
    And user clicks on the submit button
    Then user should be displayed customer ID is generated or not
    
    
