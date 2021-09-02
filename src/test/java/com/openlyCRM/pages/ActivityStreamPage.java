package com.openlyCRM.pages;

import com.openlyCRM.utilities.BrowserUtils;
import com.openlyCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.html.CSS;
import javax.xml.xpath.XPath;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ActivityStreamPage extends BasePage{
    
    @FindBy(xpath = "//input[@id='LIVEFEED_search']")
    public WebElement searchBox;
    
    /*
    //span[@class='main-ui-filter-sidebar-item-text'][text()='Work'] each filter
     */
    
    @FindBy(xpath = "//span[@class='main-ui-filter-sidebar-item-text'][text()!='Filter']")
    public List<WebElement> filterListElements;
    
    @FindBy(xpath = "//button[contains(@class,'main-ui-filter-find')]")
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
    public WebElement addSearchFieldButton;
    
    @FindBy(xpath = "//div[@class='feed-post-block feed-post-block-short feed-post-block-separator']")
    public List<WebElement> searchResultBoxes;
    
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
    
    @FindBy(xpath = "//div[@data-name='DATE_CREATE_datesel']")
    public WebElement searchFilterDateBox;
    
    @FindBy(xpath = "//div[contains(@class,'feed-post-block')]")
    public List<WebElement> searchResults;
    
    @FindBy(xpath = "//span[@class='main-ui-filter-field-restore-items']")
    public WebElement restoreFieldsLink;
    
    @FindBy(xpath = "//div[@data-name='EVENT_ID']/div[@data-name='EVENT_ID']")
    public WebElement searchTypeSelector;
    
    @FindBy(xpath = "//span[@class='main-ui-square']")
    public List<WebElement> selectedSearchTypes;
    
    @FindBy(xpath = "//span[text()='Reset to default']")
    public WebElement resetSearchFiltersToDefault;
    
    @FindBy(xpath = "//span[text()='Continue']")
    public WebElement continueResettingSearchFilters;

    @FindBy(xpath = "//div[@id=\"feed-cal-additional-inner\"]/table/tbody/tr/td[@class=\"feed-cal-addit-left-c\"]/label")
    public List<WebElement> checklist;

    @FindBy(xpath = "//span[@class='feed-event-more-link-text'][normalize-space()='More']")
    public WebElement more_text;

    @FindBy(xpath = "//input[@id='feed-cal-event-namecal_3Jcl']")
    public WebElement eventNameBox;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement eventSendButton;

    @FindBy(xpath = "//span[@class='calendar-slider-sidebar-remind-warning-name']")
    public WebElement checkReminderElement;
    
    
    public void selectSearchTypes(String searchTypeName){
        String xpath = "//div[@class='main-ui-select-inner-item'][contains(@data-item,'"+searchTypeName+"')]";
        WebElement searchType = Driver.get().findElement(By.xpath(xpath));
        
        if (!searchType.isSelected()){
            searchType.click();
        }
    }
    
    public void deselectSearchTypes(String searchTypeName){
        String xpath = "//div[@class='main-ui-select-inner-item'][contains(@data-item,'"+searchTypeName+"')]";
        WebElement searchType = Driver.get().findElement(By.xpath(xpath));
        
        if (searchType.isSelected()){
            searchType.click();
        }
    }
    
    
    public void addSearchField(String fieldName){
        String xPath = "//div[@class='main-ui-select-inner-label'][text()='"+fieldName+"']/parent::div";
        WebElement searchFieldElement = Driver.get().findElement(By.xpath(xPath));
        
        if(!isSearchFieldSelected(fieldName)){
            searchFieldElement.click();
        }
    }
    
    public void selectReadyDateFilter(String dateFilterName){
        int size=
                Driver.get().findElements(By.xpath("//div[contains(@data-item,'{\"NAME\":\""+dateFilterName+"\",\"VALUE\":')]")).size();
        WebElement dateFilter =
                Driver.get().findElement(By.xpath("(//div[contains(@data-item,'{\"NAME\":\""+dateFilterName+"\"," +
                        "\"VALUE\":')])["+size+"]/div"));
        dateFilter.click();
        
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
    
    public boolean isDefaultFieldSelected(List<String> expectedDefaultFields){
        String xpath = "//span[@class='main-ui-control-field-label']";
        List<WebElement> actualFieldElements = Driver.get().findElements(By.xpath(xpath));
        List<String> actualFields = new ArrayList<>();
        for (WebElement actualFieldElement : actualFieldElements) {
            actualFields.add(actualFieldElement.getAttribute("title"));
        }
        
        return actualFields.containsAll(expectedDefaultFields);
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

    public String createAnEventName(){
        return "My Event "+(int)(Math.random()*100);
    }

    public final String eventName = createAnEventName();

    public void checkEventReminder(){
        Driver.get().findElement(By.xpath("//span[contains(text(),'"+eventName+"')]")).click();
    }
}




