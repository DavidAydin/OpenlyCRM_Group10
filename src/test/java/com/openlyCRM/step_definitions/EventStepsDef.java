package com.openlyCRM.step_definitions;

import com.openlyCRM.pages.ActivityStreamPage;
import com.openlyCRM.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;


public class EventStepsDef {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    @Given("user navigates to Event page")
    public void user_navigates_to_Event_page() {
        activityStreamPage.eventButton.click();
    }


    @And("user adds Event start date and time")
    public void userAddsEventStartDateAndTime() {
        String sDate = "08/28/2021";
        String sTime = "10:00 am";

        activityStreamPage.startDate.sendKeys(sDate);
        activityStreamPage.startTime.sendKeys(sTime);
    }

    @And("user adds Event ending date and time")
    public void userAddsEventEndingDateAndTime() {
        String eDate = "08/28/2021";
        String eTime = "11:00 am";

        activityStreamPage.startDate.clear();
        activityStreamPage.startTime.clear();
        activityStreamPage.endTime.clear();
        activityStreamPage.endDate.clear();
        activityStreamPage.endDate.sendKeys(eDate);
        activityStreamPage.endTime.sendKeys(eTime);
    }


    @When("user specifies the time zone")
    public void user_specifies_the_time_zone() {
        BrowserUtils.clickWithJS(activityStreamPage.SpecifyTimezone);
        BrowserUtils.scrollToElement(activityStreamPage.logo);

        Select slc =  new Select(activityStreamPage.fromTimeZone);
        slc.selectByValue("America/Denver");
        slc = new Select(activityStreamPage.toTimeZone);
        slc.selectByValue("Europe/Paris");

    }

    @When("user enters data")
    public void userEntersData() {
        activityStreamPage.setReminderbox.clear();
        activityStreamPage.setReminderbox.sendKeys("25");
        Select reminderDropdown = new Select(activityStreamPage.setReminderDropdown);
        reminderDropdown.selectByIndex(0);
    }

    @Then("system should display these data")
    public void systemShouldDisplayTheseData() {
        Assert.assertEquals("25",activityStreamPage.setReminderbox.getAttribute("value"));
    }

    @When("user selects event location from dropdown {string}")
    public void userSelectsEventLocationFromDropdown(String location) {
        activityStreamPage.eventLocationBox.click();
        activityStreamPage.chooseLocation(location);
    }

    @Then("system should display {string} as location")
    public void systemShouldDisplayAsLocation(String location) {
        Assert.assertEquals(location,activityStreamPage.eventLocationBox.getAttribute("value"));
    }

    @And("user clicks add person, groups or department")
    public void userClicksAddPersonGroupsOrDepartment() {
        activityStreamPage.addPersonsGroupsOrDepartments.click();
    }

    @When("user adds attendees by {string}")
    public void userAddsAttendeesBy(String typeOfOption) {
        switch (typeOfOption) {
            case "selecting contacts individually":
                activityStreamPage.employeesAndDepartments.click();
                activityStreamPage.oneEmployee.click();
                break;
            case "adding groups and departments":
                activityStreamPage.toAllEmployees.click();
                break;
        }
        activityStreamPage.popupCloseButton.click();
    }

    @Then("system should display selected person on members box")
    public void systemShouldDisplaySelectedPersonOnMembersBox() {
        Assert.assertTrue(activityStreamPage.checkMembers.isDisplayed());
    }
}
