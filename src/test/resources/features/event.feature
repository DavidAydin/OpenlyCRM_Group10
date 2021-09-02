Feature: Activity Stream Page Event Tab

  #*User Story: As a user, I should be able to create events by clicking on Event tab under Activity Stream-[US14][Automation2]

  Background:
    #@OP-523
    Given the user is logged in as Human Resource
  @OP-539 @OP-545
  Scenario: OP515_US14_TC01_[Automation2]_User should be able to add Event start and ending date and time and specify the time zone.
    Given user navigates to Event page
    And user adds Event ending date and time
    And user adds Event start date and time
    When user specifies the time zone
  @OP-540 @OP-545
  Scenario: OP515_US14_TC02_[Automation2]_User should be able to set a reminder.
    Given user navigates to Event page
    And user enters data
    And user clicks Send button on Event
    When user clicks upcoming events
    Then system should display these data
  @OP-541 @OP-545
  Scenario: OP515_US14_TC03_[Automation2]_User should be able to select event location from the dropdown.
    Given user navigates to Event page
    When user selects event location from dropdown "West Meeting Room"
    Then system should display "West Meeting Room" as location
  @OP-542 @OP-545
  Scenario: OP515_US14_TC04_[Automation2]_User should be able to add attendees by selecting contacts individually.
    Given user navigates to Event page
    And user clicks add person, groups or department
    When user adds attendees by "selecting contacts individually"
    Then system should display selected person on members box
  @OP-543 @OP-545
  Scenario: OP515_US14_TC05_[Automation2]_User should be able to add attendees by adding groups and departments.
    Given user navigates to Event page
    And user clicks add person, groups or department
    When user adds attendees by "adding groups and departments"
    Then system should display selected person on members box
  @OP-544 @OP-545
  Scenario: OP515_US14_TC06_[Automation2]_User should be able to see event details parameters as "Availability, Repeat, Calendar, Importance".
    Given user navigates to Event page
    When user clicks More
    Then the following event details parameters should be displayed
      | Availability |
      | Repeat       |
      | Calendar     |
      | Importance   |


