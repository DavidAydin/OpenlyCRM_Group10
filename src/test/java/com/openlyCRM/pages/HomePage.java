package com.openlyCRM.pages;

import com.openlyCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * This application lands in Activity Stream Page after logging in.
 * I named this page as Home Page for convenience
 */
public class HomePage extends BasePage{
   
    
    @FindBy(xpath = "//div[@id='feed-add-post-form-tab']//span[contains(text(),'More')]")
    public WebElement QN_More;
    
    
    
    /**
     * This method navigates through the quick navigation bar.
     * User needs to forward the tab name as a String
     * @param QN_tabName
     */
    public void goToQuickNavigationTab(String QN_tabName){
        waitUntilHomeLinkIsClickable();
        String tabLocator = "//div[@id='feed-add-post-form-tab']//span[contains(text(),'"+QN_tabName+"')]";
        boolean isMore = QN_tabName=="File" || QN_tabName=="Appreciation"||QN_tabName=="Announcement"||QN_tabName==
                "Workflow";
        if(isMore){
            QN_More.click();
            tabLocator = "//div[@class='menu-popup-items']/span/span[contains(text(),'"+QN_tabName+"')]";
        }
        Driver.get().findElement(By.xpath(tabLocator)).click();
    }
    
    /**
     * Some of the tabs are located under the More tab
     * Use this tab to navigate through the tabs under the MOre tab
     * User needs to forward the tab name as a String
     * @param QN_tabName
     */
    public void goToMoreQuickNavigationTab(String QN_tabName){
        waitUntilHomeLinkIsClickable();
        QN_More.click();
        String tabLocator = "//div[@class='menu-popup-items']/span/span[contains(text(),'"+QN_tabName+"')]";
        Driver.get().findElement(By.xpath(tabLocator)).click();
    }
    
}
