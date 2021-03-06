@OP-525 @CRM @search
Feature:Activity Stream Page Search And Filter

  Background:
		#@OP-523
    Given the user is logged in as Human Resource


	#*User Story:* As a user, I should be able to use "Filter and search" functionality on Active Stream
	#
	#*Acceptance Criteria:*
	# # User should be able to see default filters as "my activity, work, favorite, announcements, and workflows" 
  @OP-524
  Scenario: The default filters of search box are displayed
    When the user clicks on the Search box
    Then the following default filters should be displayed
      |WORK          |
      |FAVORITES     |
      |MY ACTIVITY   |
      |ANNOUNCEMENTS |
      |WORKFLOWS     |

	#*User Story OP-404:* As a user, I should be able to use "Filter and search" functionality on Active Stream
	#
	#*Acceptance Criteria*
	#
	#User should be able to add and remove filters
  @OP-526
  Scenario Outline: User can add and remove  filters
    When the user clicks on the Search box
    And the user clicks on the save filter button
    And the user enters new filter: "<filterName>"
    And the user clicks on the save button
    Then the "<filterName>" should be added
    And the user clicks on the configure filters button
    And the user deletes the "<filterName>"
    And the user clicks on the save button
    Then the "<filterName>" should be deleted
    Examples:
      | filterName   |
      | Filter1      |
      | Filter2      |
      | New Filter 1 |
      | New Filter 2 |

	#*User Story:* As a user, I should be able to use "Filter and search" functionality on Active Stream
	#
	#*Acceptance Criteria:*
	#
	#User should be able to add and remove field.
  @OP-527
  Scenario Outline: Scenario Outline: Adding <fieldName> search field
    When the user clicks on the Search box
    And the user clicks on the add field button
    And the user adds "<fieldName>" search filed
    Then the "<fieldName>" search field should be added
    Examples:
      |fieldName|
      |Date     |
      |Type     |
      |Author   |
      |To       |
      |Favorites|
      |Tag      |
      |Extranet |

	#*User Story:* As a user, I should be able to use "Filter and search" functionality on Active Stream
	#
	#*Acceptance Criteria:*
	#
	#User should be able to add and remove field.
  @OP-528
  Scenario Outline: Removing <fieldName> search field
    When the user clicks on the Search box
    And the user clicks on the add field button
    And the user removes "<fieldName>" search filed
    Then the "<fieldName>" search field should be removed
    Examples:
      |fieldName|
      |Date     |
      |Type     |
      |Author   |
      |To       |
      |Favorites|
      |Tag      |
      |Extranet |

	#*User Story:* As a user, I should be able to use "Filter and search" functionality on Active Stream
	#
	#*Acceptance Criteria:*
	#
	#User should be able to search by selecting Date,
  @OP-529
  Scenario Outline: Selecting predefined date search filter
    When the user clicks on the Search box
    And the user clicks on restore default fields link
    And the user clicks on the date filter box
    And the user clicks on "<readyDateFilter>" date filter
    And the user clicks on the Search button
    Then the search results should be displayed
    Examples:
      | readyDateFilter |
      | Yesterday       |
      | Current day     |
      | This week       |
      | This month      |
      | Current quarter |
      | Last 7 days     |
      | Last 30 days    |
      | Last 60 days    |
      | Last 90 days    |
      | Last week       |
      | Last month      |

	#*ser Story:* As a user, I should be able to use "Filter and search" functionality on Active Stream
	#
	#*Acceptance Criteria:*
	#
	#User should be able to search by selecting one or more Type,
  @OP-547
  Scenario Outline: Selecting one search type <searchType>
    When the user clicks on the Search box
    And the user clicks on restore default fields link
    And the user clicks on the search type selector
    And the user selects the search type "<searchType>"
    Then the search type container should include "<searchType>"

    Examples:
      | searchType              |
      | Posts                   |
      | Announcements           |
      | Appreciations           |
      | Polls                   |
      | Conversations           |
      | Tasks                   |
      | Working time management |
      | Work reports            |
      | Calendar                |
      | External source data    |
      | Photo gallery           |
      | Wiki                    |
      | Workflows               |


	#*User Story OP-404:* As a user, I should be able to use "Filter and search" functionality on Active Stream
	#
	#*Acceptance Criteria:*
	#
	#User should be able to search by selecting one or more Type,
  @OP-548
  Scenario: Selecting multiple search types
    When the user clicks on the Search box
    And the user clicks on restore default fields link
    And the user clicks on the search type selector
    And the user clicks on the following search types
      | Posts                   |
      | Announcements           |
      | Appreciations           |
      | Polls                   |
      | Conversations           |
      | Tasks                   |
      | Working time management |
      | Work reports            |
      | Calendar                |
      | External source data    |
      | Photo gallery           |
      | Wiki                    |
      | Workflows               |
    Then the search type container should include following search types
      | Posts                   |
      | Announcements           |
      | Appreciations           |
      | Polls                   |
      | Conversations           |
      | Tasks                   |
      | Working time management |
      | Work reports            |
      | Calendar                |
      | External source data    |
      | Photo gallery           |
      | Wiki                    |
      | Workflows               |


	#*User Story OP-404:* As a user, I should be able to use "Filter and search" functionality on Active Stream
	#
	#*Acceptance Criteria:*
	#
	#User should be able to restore default field,
  @OP-549
  Scenario: Restoring default search field
    When the user clicks on the Search box
    And the user clicks on the add field button
    And the user removes "Date" search filed
    And the user clicks on restore default fields link
    Then the following default search fields should be selected
      | Date   |
      | Type   |
      | Author |
      | To     |

	#*User Story OP-404:* As a user, I should be able to use "Filter and search" functionality on Active Stream
	#
	#*Acceptance Criteria:*
	#
	#User should be able to reset filters to default.
  @OP-550
  Scenario: Resetting search filters to default
    When the user clicks on the Search box
    And the user clicks on the configure filters button
    And the user deletes the "Work"
    And the user clicks on the save button
    And the user clicks on the configure filters button
    And the user clicks on the reset to default button
    And the user clicks on the continue button
    Then the following default filters should be displayed
      | WORK          |
      | FAVORITES     |
      | MY ACTIVITY   |
      | ANNOUNCEMENTS |
      | WORKFLOWS     |
