@login
Feature: Login
  @smoke
  Scenario: User logs in as Marketing
    Given the user lands in the login page
    When the user logs in as "Marketing"
    Then the user should be in the Activity Stream page
  @smoke
  Scenario: User logs in as Human Resource
    Given the user lands in the login page
    When the user logs in as "Human Resource"
    Then the user should be in the Activity Stream page
  @smoke
  Scenario: User logs in as Help Desk
    Given the user lands in the login page
    When the user logs in as "Help Desk"
    Then the user should be in the Activity Stream page

  Scenario: the user is logged in
    Given the user is logged in as Human Resource
    Then the user should be in the Activity Stream page