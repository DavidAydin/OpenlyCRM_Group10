#User Story:  As a user, I should be able to send messages by clicking on Message tab under Active Stream-[US12][Automation2]
#
#Acceptance Criteria:
#1. User should be able to click on upload files icon to upload files and pictures from local disks.
#2. User should be able to add users by selecting multiple contacts from Employees and Departments contact lists.
#3. User should be able to attach a link by clicking on the link icon.
#4. User should be able to insert videos by clicking on the video icon and entering the video URL.
#5. User should be able to create a quote by clicking on the Comma icon.
#6. User should be able to add mention by clicking on the Add mention icon.
#7. User should be able to send a message.

Feature: As a user, I should be able to send messages by clicking on Message tab under Active Stream-[US12][Automation2]

  Background:
    #@OP-523
    Given the user is logged in as Human Resource


  Scenario:User should be able to click on upload files icon to upload files and pictures from local disks.
    And user clicks on Message
    When the user clicks on Upload files and images cell
    Then verify upload files and images box is displayed


  Scenario:User should be able to add users by selecting multiple contacts from Employees and Departments contact lists.
    When user clicks on Message
    And the user clicks on Upload files and images cell
    And the user clicks on the add more button
    When the user clicks on the Employees and deprtments submenu
    And the user selects an email from the menu
    Then verify the email is displayed

  @wp
  Scenario:User should be able to attach a link by clicking on the link icon.
    When user clicks on Message
    And the user clicks on the link icon
    And the user sends "google" to Text box
    And the user sends "https://www.google.com/" to Link box
    When the user clicks on  save button
    Then verify that google is attached



