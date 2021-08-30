Feature:As a user, I should be able to add news under Company-US19

  Background:
    Given the user is logged in as Human Resource
    And the user navigates to "Company"
    And the user click to Add News

  Scenario: TC_01_User should be able to select the type of information under preview text
    When  the user clicks on Preview text
    Then  the user should be able to select the following options
      | (not set)     |
      | Announcement  |
      | General info  |
      | News          |
      | Notice        |
      | Order         |
      | Portal News   |
      | Press Release |

  Scenario: TC_02_User should be able to select a date and set a time under preview text
    When  the user enter keywords "10/15/2021 12:00:00 pm"
    Then  the user should able to select a "10/15/2021 12:00:00 pm"

  Scenario:TC_03_User should be able to add a picture under details
    Given the user clicks on Details
    Then  the user click Add File dropdown
    When  the user selects "Insert file path"
    Then  the user enter keyword "link"
    And   the user clicks on Add
    And   the user clicks on Save
    Then  the image file should be displayed under details menu

  Scenario: TC_04_User should be able to remove a picture under details
    Given  the user clicks on Details
    Then  the user click Add File dropdown
    When  the user selects "Insert file path"
    Then  the user enter keyword "link"
    And   the user clicks on Add
    And   the user clicks on Save
    And   the user click delete icon
    Then  the image file should not displayed under preview menu

  Scenario: TC_05_User should be able to edit a picture under details
    Given the user clicks on Details
    Then  the user click Add File dropdown
    When  the user selects "Insert file path"
    Then  the user enter keyword "link"
    And   the user clicks on Add
    And   the user clicks on Save
    And   the user click edit button
    And   the user click Rotate Clockwise button
    And   the user clicks on Save
    Then  the image file should be displayed under preview menu

  Scenario:TC_06_User should be able to add tags under details
    Given the user clicks on Details
    When  the user enter keywords "MONA LISA" in TAGS
    Then  the user should see that entered keywords "MONA LISA" in tag label

  Scenario: TC_07_User should be able to select Text, HTML, and Visual Editor
    Then  the user can click radio buttons
      | text   |
      | html   |
      | editor |

  Scenario: TC_08_User should be able to send news
    When  the user enter keywords "News From Germany" in to Title
    And   the user clicks on Save
    Then  the news should able to listed as a "News From Germany" in Company menu