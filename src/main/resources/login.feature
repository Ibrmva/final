Feature: Login functionality

  Scenario: Successful login
    Given I am on the login page
    When I enter valid credentials
    And I click login
    Then I should see the dashboard
