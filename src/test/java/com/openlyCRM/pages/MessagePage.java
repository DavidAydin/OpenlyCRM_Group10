package com.openlyCRM.pages;

import com.openlyCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MessagePage extends BasePage{

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']/span[.='Message']")
    public WebElement messageTab;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesBtn;

    @FindBy(name = "bxu_files[]")
    public WebElement uploadFilesAndImagesBox;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendBtn;

    @FindBy(xpath = "//div[.='helpdesk22@cybertekschool.com']")
    public WebElement hd22email;

    public boolean isEmailDisplayed(){
        return Driver.get().findElement(By.xpath("//span[.='helpdesk22@cybertekschool.com']")).isDisplayed();
    }

}
