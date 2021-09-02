@smoke
Feature: Smoke Test

  Scenario: User logs in as Marketing
    Given the user lands in the login page
    When the user logs in as "Marketing"
    Then the user should be in the Activity Stream page