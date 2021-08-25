package com.openlyCRM.step_definitions;

import com.openlyCRM.pages.ActivityStreamPage;
import com.openlyCRM.utilities.BrowserUtils;
import com.openlyCRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.BrokenBarrierException;

public class activityStreamSearchFilterStepDef {
    
    @When("the user clicks on the Search box")
    public void theUserClicksOnTheSearchBox() {
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.searchBox.click();
        activityStreamPage.waitUntilSearchWinowReady();
    }
    
    @Then("the following default filters should be displayed")
    public void theFollowingDefaultFiltersShouldBeDisplayed(List<String> expectedFilters) {
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        List<WebElement> filterListElements = activityStreamPage.filterListElements;
        List<String> actualFilters = BrowserUtils.getElementsText(filterListElements);
        
        Assert.assertTrue("verify all default filters are available",
                actualFilters.containsAll(expectedFilters));
        
    }
    
    @And("the user clicks on the configure filters button")
    public void theUserClicksOnTheConfigureFiltersButton() {
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.configureFilters.click();
    }
    
    
    @And("the user deletes the {string}")
    public void theUserDeletesThe(String filterName) {
        ActivityStreamPage activityStreamPage  =new ActivityStreamPage();
        activityStreamPage.deleteFilter(filterName);
        
    }
    
    @Then("the {string} should be deleted")
    public void theShouldBeDeleted(String filterName) {
        ActivityStreamPage activityStreamPage =new ActivityStreamPage();
        List<String> actualFilterNames = BrowserUtils.getElementsText(activityStreamPage.filterListElements);
        Assert.assertFalse(actualFilterNames.contains(filterName.toUpperCase(Locale.ROOT)));
    }
    
    @And("the user clicks on the save filter button")
    public void theUserClicksOnTheSaveFilterButton() {
        ActivityStreamPage activityStreamPage= new ActivityStreamPage();
        activityStreamPage.saveFilterButton.click();
    }
    
    @And("the user enters new filter: {string}")
    public void theUserEntersNewFilter(String filterName) {
        ActivityStreamPage activityStreamPage= new ActivityStreamPage();
        activityStreamPage.filterNameEntryBox.sendKeys(filterName);
    }
    
    @And("the user clicks on the save button")
    public void theUserClicksOnTheSaveButton() {
        ActivityStreamPage activityStreamPage= new ActivityStreamPage();
        activityStreamPage.saveChanges.click();
    }
    
    @Then("the {string} should be added")
    public void theShouldBeAdded(String filterName) {
        ActivityStreamPage activityStreamPage =new ActivityStreamPage();
        List<String> actualFilterNames = BrowserUtils.getElementsText(activityStreamPage.filterListElements);
        Assert.assertTrue(actualFilterNames.contains(filterName.toUpperCase(Locale.ROOT)));
    }
    
    @And("the user clicks on the add field button")
    public void theUserClicksOnTheAddFieldButton() {
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.addSerachFieldButton.click();
    }
    
    @And("the user adds {string} search filed")
    public void theUserAddsSearchFiled(String fieldName) {
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.addSearchField(fieldName);
        
    }
    
    @Then("the {string} search field should be added")
    public void theSearchFieldShouldBeAdded(String fieldName) {
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        Assert.assertTrue("Verify the "+fieldName+" is selected",activityStreamPage.isSearchFieldSelected(fieldName));
    }
}
