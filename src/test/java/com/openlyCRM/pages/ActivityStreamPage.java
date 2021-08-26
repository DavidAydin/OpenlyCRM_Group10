package com.openlyCRM.pages;

import com.openlyCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;
import java.util.List;

public class ActivityStreamPage extends BasePage{
    
    @FindBy(xpath = "//input[@id='LIVEFEED_search']")
    public WebElement searchBox;
    
    /*
    //span[@class='main-ui-filter-sidebar-item-text'][text()='Work'] each filter
     */
    
    @FindBy(xpath = "//span[@class='main-ui-filter-sidebar-item-text']")
    public List<WebElement> filterListElements;
    
    @FindBy(xpath = "//button[@class='ui-btn ui-btn-primary ui-btn-icon-search main-ui-filter-field-button  main-ui-filter-find']")
    public WebElement searchSubmitButton;
    
    @FindBy(xpath = "//span[@title='Configure filter']")
    public WebElement configureFilters;
    
    @FindBy(xpath = "//span[@class='main-ui-filter-add-item']")
    public WebElement saveFilterButton;
    
    @FindBy(xpath = "//input[@class='main-ui-filter-sidebar-edit-control']")
    public WebElement filterNameEntryBox;
    
    @FindBy(xpath = "//SPAN[@class='ui-btn ui-btn-success main-ui-filter-field-button main-ui-filter-save']")
    public WebElement saveChanges;
    
    @FindBy(xpath = "//span[@class='main-ui-filter-field-add-item']")
    public WebElement addSerachFieldButton;

    @FindBy(css = "span[id='feed-add-post-form-tab-calendar'] span")
    public WebElement eventButton;

    @FindBy(css = "input#feed-cal-event-fromcal_3Jcl")
    public WebElement startDate;

    @FindBy(css = "#feed-cal-event-tocal_3Jcl")
    public WebElement endDate;

    @FindBy(css = "#feed_cal_event_from_timecal_3Jcl")
    public WebElement startTime;

    @FindBy(css = "#feed_cal_event_to_timecal_3Jcl")
    public WebElement endTime;

    @FindBy(css = "#feed-cal-tz-switchcal_3Jcl")
    public WebElement SpecifyTimezone;

    @FindBy(xpath = "//span[@class='logo-color']")
    public WebElement logo;

    @FindBy(css = "#feed-cal-tz-fromcal_3Jcl")
    public WebElement fromTimeZone;

    @FindBy(css = "#feed-cal-tz-tocal_3Jcl")
    public WebElement toTimeZone;

    @FindBy(css = "#event-remind_countcal_3Jcl")
    public WebElement setReminderbox;

    @FindBy(css = "#event-remind_typecal_3Jcl")
    public WebElement setReminderDropdown;

    @FindBy(css = "#event-locationcal_3Jcl")
    public WebElement eventLocationBox;

    @FindBy(css = "a#feed-event-dest-add-link")
    public WebElement addPersonsGroupsOrDepartments;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement popupCloseButton;

    @FindBy(xpath = "//span[@class='feed-event-destination-text']")
    public WebElement checkMembers;

    @FindBy(id = "destDepartmentTab_calnAJEM3")
    public WebElement employeesAndDepartments;

    @FindBy(xpath = "//div[@class='bx-finder-company-department-employees']/a[2]")
    public WebElement oneEmployee;

    @FindBy(xpath = "//span[@class='bx-finder-groupbox-content']/a")
    public WebElement toAllEmployees;

    public void addSearchField(String fieldName){
        String xPath = "//div[@class='main-ui-select-inner-label'][text()='"+fieldName+"']/parent::div";
        WebElement searchFieldElement = Driver.get().findElement(By.xpath(xPath));
        
        if(!isSearchFieldSelected(fieldName)){
            searchFieldElement.click();
        }
    }
    
    public void removeSearchField(String fieldName){
        String xPath = "//div[@class='main-ui-select-inner-label'][text()='"+fieldName+"']/parent::div";
        WebElement searchFieldElement = Driver.get().findElement(By.xpath(xPath));
       if(isSearchFieldSelected(fieldName)){
            searchFieldElement.click();
        }
    }
    
    public boolean isSearchFieldSelected(String fieldName){
        String xPath = "//div[@class='main-ui-select-inner-label'][text()='"+fieldName+"']/parent::div";
        WebElement searchFieldElement = Driver.get().findElement(By.xpath(xPath));
        String isChecked = searchFieldElement.getAttribute("class");
        return isChecked.endsWith("main-ui-checked");
    }
    
    
    public void waitUntilSearchWindowReady(){
        WebDriverWait wait = new WebDriverWait(Driver.get(),5);
        wait.until(ExpectedConditions.elementToBeClickable(searchSubmitButton));
    }
    public void deleteFilter(String filterName){
        String xPath = "//span[@class='main-ui-filter-sidebar-item-text'][text()='"+filterName+"']/parent::span/parent::div" +
                "//span[@title='Delete filter']";
        Driver.get().findElement(By.xpath(xPath)).click();
    }
    public void chooseLocation(String location) {
        int numOfLocator = 0;
        switch (location) {
            case "Central Meeting Room":
                numOfLocator = 1;
                break;
            case "East Meeting Room":
                numOfLocator = 2;
                break;
            case "West Meeting Room":
                numOfLocator = 3;
                break;
        }
        String locator = "//div[@class='bxecpl-loc-popup calendar-inp calendar-inp-time calendar-inp-loc']/div["+numOfLocator+"]";
        Driver.get().findElement(By.xpath(locator)).click();
    }
}




