@demo
Feature: Feature 1
  I want to use this template for my feature file


 @demo   
 Scenario: Google 2 tests
    Given User is on google Home page
    When User enters search "cuke cuke"
 
  @demo
 Scenario: fail tests
    Given user navigates "https://careerkarma.com/" to url
    When clicks on signin link