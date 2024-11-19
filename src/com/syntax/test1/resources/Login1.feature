#Author: asel@syntax.com
  @login
  Feature: Login feature
    Background:
      Given user is navigated to HRMS application
      @smoke @ui @sprint3
        Scenario: Valid admin login
        When user enters valid credentials
        And user clicks on login button
        Then admin user is successfully logged in