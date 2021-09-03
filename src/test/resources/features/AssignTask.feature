Feature: 

	#*User Story:* As a user, I should be able to assign tasks under Quick Navigate Menu
	#
	#*Acceptance Criteria:*
	#
	#{color:#de350b}1. User should be able to click on the "High Priority" checkbox to set the current task to a top priority task.{color}
	#2. User should be able to click on Visual Editor and see the editor text bar displays on top of the message box.
	#3. User can add a checklist item by clicking on the add button or checkmark.
	#4. User can add separator lines between checklist items.
	#5. User can delete a checklist item 
	#6. User can add Deadline, Time Planning by using date pickers.
	#7. User should be able to send tasks.
	@OP-530 @OP-538 @wip
	Scenario: US13_TC01 User should be able to click on the "High Priority" checkbox to set the current task to a top priority task.
		Given the user logs in as "Human Resource"
		When the user clicks on "Task" tab on the quick navigation 
		And the user clicks on the High Priority check box
		Then the High Priority check box should be selected	

	#*User Story:* As a user, I should be able to assign tasks under Quick Navigate Menu
	#
	#*Acceptance Criteria:*
	#
	#1. User should be able to click on the "High Priority" checkbox to set the current task to a top priority task.
	#{color:#de350b}2. User should be able to click on Visual Editor and see the editor text bar displays on top of the message box.{color}
	#3. User can add a checklist item by clicking on the add button or checkmark.
	#4. User can add separator lines between checklist items.
	#5. User can delete a checklist item 
	#6. User can add Deadline, Time Planning by using date pickers.
	#7. User should be able to send tasks.
	@OP-531 @OP-538 @wip
	Scenario: US13_TC02 User should be able to click on Visual Editor and see the editor text bar displays on top of the message box.
		Given the user logs in as "Human Resource"
		When the user clicks on "Task" tab on the quick navigation
		And the user clicks on the Visual Editor icon
		Then the editor text box should be displayed

	#*User Story:* As a user, I should be able to assign tasks under Quick Navigate Menu
	#
	#*Acceptance Criteria:*
	#
	#1. User should be able to click on the "High Priority" checkbox to set the current task to a top priority task.
	#2. User should be able to click on Visual Editor and see the editor text bar displays on top of the message box.
	#{color:#de350b}3. User can add a checklist item by clicking on the add button or checkmark.{color}
	#4. User can add separator lines between checklist items.
	#5. User can delete a checklist item 
	#6. User can add Deadline, Time Planning by using date pickers.
	#7. User should be able to send tasks.
	@OP-532 @OP-538 @wip
	Scenario: US_13_TC03 User can add a checklist item by clicking on the add button or checkmark
		Given the user logs in as "Human Resource"
		When the user clicks on "Task" tab on the quick navigation
		And the user clicks on the "Checklist" link in Task
		And the user enters "This is the first checklist item" as description
		And the user clicks on the add button
		Then the "This is the first checklist item" check list item should be added to the list

	#*User Story:* As a user, I should be able to assign tasks under Quick Navigate Menu
	#
	#*Acceptance Criteria:*
	#
	#1. User should be able to click on the "High Priority" checkbox to set the current task to a top priority task.
	# 2. User should be able to click on Visual Editor and see the editor text bar displays on top of the message box. 
	# 3. User can add a checklist item by clicking on the add button or checkmark. 
	# 4. User can add separator lines between checklist items. 
	# 5. User can delete a checklist item 
	# 6. User can add Deadline, Time Planning by using date pickers.
	# 7. User should be able to send tasks.
	@OP-533 @OP-538 @wip
	Scenario: US_13_TC04 User can add separator lines between checklist items.
		Given the user logs in as "Human Resource"
		When the user clicks on "Task" tab on the quick navigation
		And the user clicks on the "Checklist" link in Task
		And the user enters "This is the first checklist item" as description
		And the user clicks on the add button
		And the user clicks on separator button
		Then the user should be able to display separator line	

	#*User Story:* As a user, I should be able to assign tasks under Quick Navigate Menu
	#
	#*Acceptance Criteria:*
	#
	#1. User should be able to click on the "High Priority" checkbox to set the current task to a top priority task.
	#2. User should be able to click on Visual Editor and see the editor text bar displays on top of the message box.
	#3. User can add a checklist item by clicking on the add button or checkmark.
	#4. User can add separator lines between checklist items.
	#5. User can delete a checklist item 
	#6. User can add Deadline, Time Planning by using date pickers.
	#7. User should be able to send tasks.
	@OP-534 @OP-538 @wip
	Scenario: US13_TC05 User can delete a checklist item
		Given the user logs in as "Human Resource"
		When the user clicks on "Task" tab on the quick navigation
		And the user clicks on the "Checklist" link in Task
		And the user enters "Add Checklist Item" as description
		And the user clicks on the add button
		And the user hovers on the added checklist item 
		And the user clicks on the x button 
		Then the user should not display more the added item	

	#1. User should be able to click on the "High Priority" checkbox to set the current task to a top priority task.
	#2. User should be able to click on Visual Editor and see the editor text bar displays on top of the message box.
	#3. User can add a checklist item by clicking on the add button or checkmark.
	#4. User can add separator lines between checklist items.
	#5. User can delete a checklist item 
	#{color:#de350b}6. User can add Deadline, Time Planning by using date pickers.{color}
	#7. User should be able to send tasks.
	@OP-535 @OP-538 @wip
	Scenario: US_13_TC06 User can add Deadline, Time Planning by using date pickers.
		Given the user logs in as "Human Resource"
		When the user clicks on "Task" tab on the quick navigation
		And the user clicks on Deadline box
		And the user chooses any "Date" in the box
		Then the user should display the choosen "Date" in Deadline box	

	#*User Story:* As a user, I should be able to assign tasks under Quick Navigate Menu
	#
	#*Acceptance Criteria:*
	#
	#1. User should be able to click on the "High Priority" checkbox to set the current task to a top priority task.
	#2. User should be able to click on Visual Editor and see the editor text bar displays on top of the message box.
	#3. User can add a checklist item by clicking on the add button or checkmark.
	#4. User can add separator lines between checklist items.
	#5. User can delete a checklist item 
	#{color:#de350b}6. User can add Deadline, Time Planning by using date pickers.{color}
	#7. User should be able to send tasks.
	@OP-536 @OP-538 @wip
	Scenario: US13_TC07 6. User can add Deadline, Time Planning by using date pickers.
		Given the user logs in as "Human Resource"
		When the user clicks on "Task" tab on the quick navigation
		And the user clicks on Time planning button
		And the user clicks on "Starting Date"
		And the user gives any "Duration"
		Then the user should display the finish date with added duration in finish box	

	#*User Story:* As a user, I should be able to assign tasks under Quick Navigate Menu
	#
	#*Acceptance Criteria:*
	#
	#1. User should be able to click on the "High Priority" checkbox to set the current task to a top priority task.
	#2. User should be able to click on Visual Editor and see the editor text bar displays on top of the message box.
	#3. User can add a checklist item by clicking on the add button or checkmark.
	#4. User can add separator lines between checklist items.
	#5. User can delete a checklist item 
	#6. User can add Deadline, Time Planning by using date pickers.
	#{color:#de350b}7. User should be able to send tasks.{color}
	@OP-537 @OP-538 @wip
	Scenario: US13_TC08 User should be able to send tasks.
		Given the user logs in as "Human Resource"
		When the user clicks on "Task" tab on the quick navigation
		And the user gives any "Task" in things to do box
		And the user clicks on Send button
		Then the user should display the given task in mainpage