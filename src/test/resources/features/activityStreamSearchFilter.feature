
  @OP-525 @CRM
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