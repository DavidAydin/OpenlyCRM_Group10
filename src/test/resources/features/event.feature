Feature: Activity Stream Page Event Tab

  #*User Story: As a user, I should be able to create events by clicking on Event tab under Activity Stream-[US14][Automation2]

  Background:
    #@OP-523
    Given the user is logged in as Human Resource

  Scenario: OP515_US14_TC01_[Automation2]_User should be able to add Event start and ending date and time and specify the time zone.
    Given user navigates to Event page
    And user adds Event ending date and time
    And user adds Event start date and time
    When user specifies the time zone

  Scenario: OP515_US14_TC02_[Automation2]_User should be able to set a reminder.
    Given user navigates to Event page
    When user enters data
    Then system should display these data

  Scenario: OP515_US14_TC03_[Automation2]_User should be able to select event location from the dropdown.
    Given user navigates to Event page
    When user selects event location from dropdown "West Meeting Room"
    Then system should display "West Meeting Room" as location
  @hs
  Scenario: OP515_US14_TC03_[Automation2]_User should be able to add attendees by selecting contacts individually.
    Given user navigates to Event page
    And user clicks add person, groups or department
    When user adds attendees by "selecting contacts individually"
    Then system should display selected person on members box

  Scenario: OP515_US14_TC04_[Automation2]_User should be able to add attendees by adding groups and departments.
    Given user navigates to Event page
    And user clicks add person, groups or department
    When user adds attendees by "adding groups and departments"
    Then system should display selected person on members box


