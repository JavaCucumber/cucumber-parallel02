@demo
Feature: Feature 2 
  I want to use this template for my feature file

  Scenario: Google 2 tests
    Given User is on google Home page
    When User enters search "junit"
  
  @karma
  Scenario: Signup new karma user
    Given user on career karma homepage
    And close matched pop
    When user click on signin link
    Then user navigates to signin page
    When click on signup link
    Then new signup page displayed
    When enter enter signup form data to fields
           |fakeemail|password|firstname|lastname|
    And click on signup button
    When enter new user email
    
  @karma
  Scenario: Signin with new user
    Given user on career karma homepage
    And close matched pop
    When user click on signin link
    Then user navigates to signin page
    When enter new user email
      