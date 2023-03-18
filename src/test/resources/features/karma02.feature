Feature: Karma Tests2
  I want to use this template for my feature file

    
  
  @karma_wip
  Scenario: edit user profile
     Given sign in to karma app
     When click on edit profile button on profile page
     Then user navigates to edit profile page
     When enter "I am a python devloper" in about me feild
     And click on save changes button
     And click on profile link
     Then verify about me should displayed
     
     