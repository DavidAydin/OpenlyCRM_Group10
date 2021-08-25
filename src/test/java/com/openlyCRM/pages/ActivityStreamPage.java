package com.openlyCRM.pages;

import com.openlyCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    
    public void addSearchField(String fieldName){
        String xPath = "//div[@class='main-ui-select-inner-label'][text()='"+fieldName+"']";
        WebElement searchFieldElement = Driver.get().findElement(By.xpath(xPath));
        
        if(!searchFieldElement.isSelected()){
            searchFieldElement.click();
        }
    }
    
    public void removeSearchField(String fieldName){
        String xPath = "//div[@class='main-ui-select-inner-label'][text()='"+fieldName+"']";
        WebElement searchFieldElement = Driver.get().findElement(By.xpath(xPath));
        
        if(searchFieldElement.isSelected()){
            searchFieldElement.click();
        }
    }
    
    public boolean isSearchFieldSelected(String fieldName){
        String xPath = "//div[@class='main-ui-select-inner-label'][text()='"+fieldName+"']";
        WebElement searchFieldElement = Driver.get().findElement(By.xpath(xPath));
        return searchFieldElement.isSelected();
    }
    
    
    public void waitUntilSearchWinowReady(){
        WebDriverWait wait = new WebDriverWait(Driver.get(),5);
        wait.until(ExpectedConditions.elementToBeClickable(searchSubmitButton));
    }
    public void deleteFilter(String filterName){
        String xPath = "//span[@class='main-ui-filter-sidebar-item-text'][text()='"+filterName+"']/parent::span/parent::div" +
                "//span[@title='Delete filter']";
        Driver.get().findElement(By.xpath(xPath)).click();
    }
}




