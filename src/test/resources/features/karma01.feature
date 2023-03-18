@demo
Feature: Karma Tests
  I want to use this template for my feature file

  @karma2
  Scenario: Signin to karma app
    Given user on career karma homepage
    And close matched pop
    When user click on signin link
    Then user navigates to signin page
    When enter user credentails "max1234@yopmail.com" and "Test@1234"
    And click signin button
    
  
  @karma
  Scenario: user create new post
     Given user on career karma homepage
     And close matched pop
     When user click on signin link
     Then user navigates to signin page
     When user login to karma app
     Then successfully logged in to app
     When user goto to mypost section using user avtar
     Then sucessfully navigates to mypost page
     When click on create post button
     Then user navigates to mypost page
     