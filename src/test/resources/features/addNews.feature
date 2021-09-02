
Feature:As a user, I should be able to add news under Company-US19

  Background:
    Given the user is logged in as Human Resource
  @OP-552 @OP-551
  Scenario: TC_01_User should be able to select the type of information under preview text
    Given the user navigates to "Company"
    And the user click to Add News
    Then  the user should be able to select the following options
      |(not set)|
      |Announcement|
      |General info|
      |News|
      |Notice|
      |Order|
      |Portal News|
      |Press Release|
  @OP-553 @OP-551
  Scenario: TC_02_User should be able to select a date and set a time under preview text
    Given the user navigates to "Company"
    And the user click to Add News
    When  the user enter keywords "10/15/2021 12:00:00 pm"
    Then  the user should able to select a "10/15/2021 12:00:00 pm"
  @OP-554 @OP-551
  Scenario:TC_03_User should be able to add a picture under details
    Given the user navigates to "Company"
    And the user click to Add News
    And the user clicks on Details
    Then  the user click Add File dropdown
    When  the user selects "Insert file path"
    Then  the user enter keyword "link"
    And   the user clicks on Add
    Then  the image file should be displayed under details menu
  @OP-555 @OP-551
  Scenario: TC_04_User should be able to remove a picture under details
    Given the user navigates to "Company"
    And the user click to Add News
    And  the user clicks on Details
    Then  the user click Add File dropdown
    When  the user selects "Insert file path"
    Then  the user enter keyword "link"
    And   the user clicks on Add
    And   the user click delete icon
    Then  the image file should not displayed under preview menu
  @OP-556 @OP-551
  Scenario: TC_05_User should be able to edit a picture under details
    Given the user navigates to "Company"
    And the user click to Add News
    And the user clicks on Details
    Then  the user click Add File dropdown
    When  the user selects "Insert file path"
    Then  the user enter keyword "link"
    And   the user clicks on Add
    And   the user click edit button
    And   the user click Rotate Clockwise button
    And   the user clicks on Save
    Then  the image file should be displayed under preview menu
  @OP-557 @OP-551
    Scenario:TC_06_User should be able to add tags under details
    Given the user navigates to "Company"
    And the user click to Add News
    And the user clicks on Details
    When  the user enter keywords "Brad Pitt" in TAGS
    Then  the user should see that entered keywords "Brad Pitt" in tag label
  @OP-558 @OP-551
  Scenario: TC_07_User should be able to select Text, HTML, and Visual Editor
    Given the user navigates to "Company"
    And the user click to Add News
    Then  the user can click radio buttons
      | text   |
      | html   |
      | editor |
  @OP-559 @OP-551
  Scenario: TC_08_User should be able to send news
    Given the user navigates to "Company"
    And the user click to Add News
    When  the user enter keywords "News From Germany" in to Title
    And   the user clicks on SaveButtonTwo
    Then  the news should able to listed as a "News From Germany" in Company menu