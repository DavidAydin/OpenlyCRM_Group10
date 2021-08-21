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
    
    
    public void navigateMainMenu(String menuName){
        new WebDriverWait(Driver.get(),5).until(ExpectedConditions.elementToBeClickable(homeLink));
        String menuItemXpath = "//span[@class='menu-item-link-text'][contains(text(),'"+menuName+"')]";
        WebElement moreMenuItem = Driver.get().findElement(By.xpath("//span[@class='menu-favorites-more-text']"));
        WebElement menuItem = Driver.get().findElement(By.xpath(menuItemXpath));
        if (menuName.equalsIgnoreCase("Applications") || menuName.equalsIgnoreCase("Workflows")){
            moreMenuItem.click();
        }
        menuItem.click();
        new WebDriverWait(Driver.get(),5).until(ExpectedConditions.elementToBeClickable(homeLink));
    }
    
    
}
