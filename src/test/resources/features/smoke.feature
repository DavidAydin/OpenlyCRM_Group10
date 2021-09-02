@smoke
Feature: Smoke Test
  Background:
    Given the user lands in the login page

  Scenario: User logs in as Marketing
    When the user logs in as "Marketing"
    Then the user should be in the Activity Stream page

  Scenario: User logs in as Helpdesk
    When the user logs in as "Helpdesk"
    Then the user should be in the Activity Stream page

  Scenario: User logs in as Human resource
    When the user logs in as "Human Resource"
    Then the user should be in the Activity Stream page


  Scenario: The default filters of search box are displayed
    When the user logs in as "Human Resource"
    When the user clicks on the Search box
    Then the following default filters should be displayed
      |WORK          |
      |FAVORITES     |
      |MY ACTIVITY   |
      |ANNOUNCEMENTS |
      |WORKFLOWS     |

  Scenario: OP515_US14_TC06_[Automation2]_User should be able to see event details parameters as "Availability, Repeat, Calendar, Importance".
    When the user logs in as "Human Resource"
    And user navigates to Event page
    When user clicks More
    Then the following event details parameters should be displayed
      | Availability |
      | Repeat       |
      | Calendar     |
      | Importance   |
