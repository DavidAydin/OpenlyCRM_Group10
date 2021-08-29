Feature:As a user, I should be able to add news under Company-US19

  Scenario: User should be able to select the type of information under preview text
    Given the user navigates to "Company"
    And the user navigates to "Add News"
    When the user navigates to "Preview text"
    Then the user should be able to select the following options

      |(not set)     |
      |Announcement  |
      |General info  |
      |News          |
      |Notice        |
      |Order         |
      |Portal News   |
      |Press Release |