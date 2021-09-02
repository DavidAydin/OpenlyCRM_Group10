Feature: Functions under Employee Menu


  Scenario: User should be able to display company structure
    Given the user is logged in as Human Resource
    Then the user navigates to the "Employees" option
    And the user clicks on the "Company Structure" from the menu
    Then verify that "(2) Company Structure" page is displayed


  Scenario: User should be able to find employees by search box
    Given the user is logged in as Human Resource
    When the user navigates to the "Employees" option
    And the user clicks on the "Find Employee" from the menu
    And the user clicks on the search box
    And the user types "Aibek" in the search box
    And the user clicks the search icon
    Then verify that the user can see "Aibek" in the results

  Scenario: User should be able to see "Your search did not match any employees".
    Given the user is logged in as Human Resource
    When the user navigates to the "Employees" option
    And the user clicks on the "Find Employee" from the menu
    And the user clicks on the search box
    And the user types "Anton" in the search box
    And the user clicks the search icon
    Then verify that "Your search did not match any employees." message is displayed

  Scenario: User should not leave the search box empty
    Given the user is logged in as Human Resource
    When the user navigates to the "Employees" option
    And the user clicks on the "Find Employee" from the menu
    And the user clicks on the search box
    And the user types "" in the search box
    And the user clicks the search icon
    Then verify that "You can't leave it blank" message is displayed


  Scenario: User should be able to find employees by search by Alphabet
    Given the user is logged in as Human Resource
    When the user navigates to the "Employees" option
    And the user clicks on the "Find Employee" from the menu
    And the user clicks on search by alphabet
    And the user clicks on alphabet "O"
    Then verify that the result name contains alphabet "O"


  Scenario: User should be able to find employees by search by Alphabet function (A-Z button)
    Given the user is logged in as Human Resource
    When the user navigates to the "Employees" option
    And the user clicks on the "Find Employee" from the menu
    And the user clicks on search by alphabet
    And the user clicks on alphabet "A-Z"
    Then verify that the result name contains alphabet "A-Z"

  Scenario: User should be able to export employee list
    Given the user is logged in as Human Resource
    When the user navigates to the "Employees" option
    And the user clicks on the "Find Employee" from the menu
    And the user click on the more
    And the user clicks Export to Excel
    Then verify that the excel file is downloaded

  Scenario: User should be able to display telephone directory
    Given the user is logged in as Human Resource
    When the user navigates to the "Employees" option
    And the user clicks on the "Telephone Directory" from the menu
    Then verify that work phone column is displayed for the results

  Scenario: User should be able to send message to employees from the telephone directory
    Given the user is logged in as Human Resource
    When the user navigates to the "Employees" option
    And the user clicks on the "Telephone Directory" from the menu
    And the user hovers over "Nadir"
    And the user clicks send message
    And the user types "try: sending a message" in to the message box
    And the user clicks enter button
    Then verify that "try: sending a message" is sent

