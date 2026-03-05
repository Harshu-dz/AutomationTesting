Feature: Login functionality

  Scenario: Login with Valid credentials
    Given User navigate to the login page
    When User enter valid credentials
    And Click on login button
    Then User should be able to access the account