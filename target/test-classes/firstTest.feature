Feature: Web Login
  Scenario: User Should be able to login with valid credentials
    Given the user is on the login page
    When  the user enters valid credentials
    And hits Submit
    Then the user should be logged in successfully

