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

    @FindBy(xpath = "//span[@class=\"wd-fa-add-file-light\"]")
    public WebElement uploadFilesAndImagesBox;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendBtn;

    @FindBy(xpath = "//div[.='helpdesk22@cybertekschool.com']")
    public WebElement hd22email;

    @FindBy(xpath = "(//span[@title='Link'])[1]")
    public WebElement linkBtn;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement textInputBox;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkInputBox;

    @FindBy(xpath = "//a[.='google']")
    public WebElement googleInMessageBox;

    @FindBy(className = "bx-editor-iframe")
    public WebElement iframe;


    public boolean isEmailDisplayed(){
        return Driver.get().findElement(By.xpath("//span[.='helpdesk22@cybertekschool.com']")).isDisplayed();
    }

}
