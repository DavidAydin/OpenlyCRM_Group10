package com.openlyCRM.pages;

import com.openlyCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath = "//a[@id='logo_24_a']")
    public WebElement homeLink;
    
    
    /**
     * This method may be used to wait until a main page loads.
     * It works for all main pages.
     */
    public void waitUntilHomeLinkIsClickable(){
        new WebDriverWait(Driver.get(),10).until(ExpectedConditions.elementToBeClickable(homeLink));
    }
    
    /**
     * This method navigates through the menu items
     * Also works for the menus under the More item.
     * It clicks the More button automatically if necessary
     * @param menuName
     */
    public void navigateMainMenu(String menuName){
        waitUntilHomeLinkIsClickable();
        String menuItemXpath = "//span[@class='menu-item-link-text'][contains(text(),'"+menuName+"')]";
        WebElement moreMenuItem = Driver.get().findElement(By.xpath("//span[@class='menu-favorites-more-text']"));
        WebElement menuItem = Driver.get().findElement(By.xpath(menuItemXpath));
        if (menuName.equalsIgnoreCase("Applications") || menuName.equalsIgnoreCase("Workflows")){
            moreMenuItem.click();
        }
        menuItem.click();
        waitUntilHomeLinkIsClickable();
    }
    
    
}
