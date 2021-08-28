package com.openlyCRM.step_definitions;

import com.openlyCRM.pages.ActivityStreamPage;
import com.openlyCRM.utilities.BrowserUtils;
import com.openlyCRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.BrokenBarrierException;

public class activityStreamSearchFilterStepDef {
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    
    @When("the user clicks on the Search box")
    public void theUserClicksOnTheSearchBox() {
        activityStreamPage.searchBox.click();
        activityStreamPage.waitUntilSearchWindowReady();
    }
    
    @Then("the following default filters should be displayed")
    public void theFollowingDefaultFiltersShouldBeDisplayed(List<String> expectedFilters) {
        List<WebElement> filterListElements = activityStreamPage.filterListElements;
        List<String> actualFilters = BrowserUtils.getElementsText(filterListElements);
        
        Assert.assertTrue("verify all default filters are available",
                actualFilters.containsAll(expectedFilters));
        
    }
    
    @And("the user clicks on the configure filters button")
    public void theUserClicksOnTheConfigureFiltersButton() {
        activityStreamPage.configureFilters.click();
    }
    
    
    @And("the user deletes the {string}")
    public void theUserDeletesThe(String filterName) {
        activityStreamPage.deleteFilter(filterName);
        
    }
    
    @Then("the {string} should be deleted")
    public void theShouldBeDeleted(String filterName) {
        List<String> actualFilterNames = BrowserUtils.getElementsText(activityStreamPage.filterListElements);
        Assert.assertFalse(actualFilterNames.contains(filterName.toUpperCase(Locale.ROOT)));
    }
    
    @And("the user clicks on the save filter button")
    public void theUserClicksOnTheSaveFilterButton() {
        activityStreamPage.saveFilterButton.click();
    }
    
    @And("the user enters new filter: {string}")
    public void theUserEntersNewFilter(String filterName) {
        activityStreamPage.filterNameEntryBox.sendKeys(filterName);
    }
    
    @And("the user clicks on the save button")
    public void theUserClicksOnTheSaveButton() {
        activityStreamPage.saveChanges.click();
        BrowserUtils.waitForMilis(300);
    }
    
    @Then("the {string} should be added")
    public void theShouldBeAdded(String filterName) {
        List<String> actualFilterNames = BrowserUtils.getElementsText(activityStreamPage.filterListElements);
        Assert.assertTrue(actualFilterNames.contains(filterName.toUpperCase(Locale.ROOT)));
    }
    
    @And("the user clicks on the add field button")
    public void theUserClicksOnTheAddFieldButton() {
        activityStreamPage.addSearchFieldButton.click();
    }
    
    @And("the user adds {string} search filed")
    public void theUserAddsSearchFiled(String fieldName) {
        activityStreamPage.addSearchField(fieldName);
        
    }
    
    @Then("the {string} search field should be added")
    public void theSearchFieldShouldBeAdded(String fieldName) {
        Assert.assertTrue("Verify the "+fieldName+" is selected",activityStreamPage.isSearchFieldSelected(fieldName));
    }
    
    @And("the user removes {string} search filed")
    public void theUserRemovesSearchFiled(String fieldName) {
        activityStreamPage.removeSearchField(fieldName);
    }
    
    @Then("the {string} search field should be removed")
    public void theSearchFieldShouldBeRemoved(String fieldName) {
        Assert.assertFalse("Verify the "+fieldName+" is selected",activityStreamPage.isSearchFieldSelected(fieldName));
    }
    
    @And("the user clicks on the date filter box")
    public void theUserClicksOnTheDateFilterBox() {
        activityStreamPage.searchFilterDateBox.click();
    }
    
    @And("the user clicks on {string} date filter")
    public void theUserClicksOn(String dateFilterName) {
        activityStreamPage.selectReadyDateFilter(dateFilterName);
        
    }
    
    @Then("the search results should be displayed")
    public void theSearchResultsShouldBeDisplayed() {
        boolean isSearchResultsDisplayed = activityStreamPage.searchResults.size()>0;
        System.out.println("activityStreamPage.searchResults.size() = " + activityStreamPage.searchResults.size());
        Assert.assertTrue("verify search results are displayed",isSearchResultsDisplayed);
    }
    
    @And("the user clicks on the Search button")
    public void theUserClicksOnTheSearchButton() {
        BrowserUtils.waitForMilis(300);
        activityStreamPage.searchSubmitButton.click();
        BrowserUtils.waitForMilis(500);
    }
    
    @And("the user clicks on restore default fields link")
    public void theUserClicksOnRestoreDefaultFieldsLink() {
        activityStreamPage.restoreFieldsLink.click();
    }
}
