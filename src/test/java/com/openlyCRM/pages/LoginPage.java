package com.openlyCRM.pages;

import com.openlyCRM.utilities.ConfigurationReader;
import com.openlyCRM.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }
  
    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement usernameInput;
    
  
    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordInput;
    
    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement loginSubmit;
    
    public void loginAs(String loginType){
        String username ="invalidUserType";
        String password ="invalidUserType";
        
        switch(loginType){
            case "Helpdesk":
                username = ConfigurationReader.get("helpdesk_username");
                password = ConfigurationReader.get("helpdesk_password");
                break;
            case "Human Resource":
                username = ConfigurationReader.get("hr_username");
                password = ConfigurationReader.get("hr_password");
                break;
            case "Marketing":
                username = ConfigurationReader.get("marketing_username");
                password = ConfigurationReader.get("marketing_password");
                break;
            default:
                System.out.println("invalid entry");
               
        }
        Driver.get().navigate().to(ConfigurationReader.get("url"));
       
        usernameInput.sendKeys(""+ Keys.SHIFT+Keys.HOME+Keys.BACK_SPACE);
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(""+ Keys.SHIFT+Keys.HOME+Keys.BACK_SPACE);
        passwordInput.sendKeys(password);
        loginSubmit.click();
        new HomePage().waitUntilHomeLinkIsClickable();
       
    }
}
