
Feature:Sending appreciation by clicking on the Appreciation subheading from "More" tab under Activity Stream

  Background:
    Given   the user lands in the login page
    When    the user is logged in as Human Resource
    And     the user should be in the Activity Stream page
    And    the user select More dropdowmenu and click Apppreciation


  @OP-573 @OP-572
  Scenario: OP-521_TC1 the user can click upload files icon upload pictures from local disks.
    Given the user clicks on the "Upload files" icon
    When  the user clicks on Upload files and images cell
    And   the user upload "Picture.jpg" from local disks
    Then  the user should be upload "Picture.jpg"

  @OP-574 @OP-572
  Scenario: OP-521_TC2 the user can click upload files icon to upload files
    Given  the user clicks on the "Upload files" icon
    When   the user clicks on Upload files and images cell
    And    the user upload "File.pdf" from local disks
    Then   the user should be upload "File.pdf"


  @OP-576 @OP-572
  Scenario:OP-521_TC3 the user should be able to add users by selecting multiple contacts from Employee
    Given the user clicks on the add more button
    When  the user clicks on the Employees and deprtments submenu
    And   the user clicks contacts
    Then  the user should be able to add multiple contacts

  @OP-577 @OP-572
  Scenario:OP-521_TC4 the user should be able to add users by selecting multiple contacts from Departments contact lists
    Given the user clicks on the add more button
    When  the user clicks on the Employees and deprtments submenu
    And   the user select aa department
    And   the user select All depratment and subdepartment employees button
    Then  the user should be able to add contact from department contact lists


  @OP-578 @OP-572
  Scenario:OP-521_TC5 the user should be able to attach a link by clicking on the link icon
    Given the user clicks on the "Link" icon
    When  the user enter keyword to Text Label
    And   the user enter Link to Link Label
    And   the user clicks on  save button
    Then  the user should be able to attach a link

  @OP-579 @OP-572
  Scenario:OP-521_TC6 the user should be able to create a quote by clicking on the Comma icon
    Given the user clicks on the "Quote text" icon
    When  the user enter keyword to the Quota Block
    Then  the user should be enter keyword to the Quota Block

  @OP-580 @OP-572
  Scenario:OP-521_TC7 the user should be able to add mention by clicking on the Add mention icon
    Given the user clicks on the "Add mention" icon
    When the user select a user
    Then  the user should be add in to Content table


  @OP-581 @OP-572
  Scenario:OP-521_TC8 the user should be able to send appreciation
    Given the user enter keyword to Text Body
    When the user clicks on the send button
    Then the user should be send appreciation

  @OP-582 @OP-572
  Scenario: OP-521_TC9 the user should be able to insert videos by clicking on the video icon and entering the video URL
    Given the user clicks on the "Insert video" icon
    When the user send links to VideSource Inbox
    Then the user upload video successfully.