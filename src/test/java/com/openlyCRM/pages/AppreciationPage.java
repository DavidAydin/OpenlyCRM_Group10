package com.openlyCRM.pages;

import com.openlyCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppreciationPage extends BasePage {

    @FindBy(xpath = "//span[@id='feed-add-post-form-link-text'][contains(text(),'More')]")
    public WebElement MoreDropdown;

    @FindBy(xpath = "//span[contains(text(),'Appreciation')]")
    public WebElement Appreciation;


    //@FindBy(xpath = "//div[1]/div[1]/div[2]/div[4]/div[2]/table[1]/tbody[1]/tr[1]/td[1]")
   // @FindBy(xpath = "//span[@class='wd-fa-add-file-light-title-text'][contains(text(),'Upload files and images')]")
    @FindBy(xpath = "//input[@class='diskuf-fileUploader wd-test-file-light-inp ']")
    public WebElement UploadFilesImages;

    @FindBy(xpath = "//a[@href='#'][contains(text(),'Add more')]")
    public WebElement AddMore;

    @FindBy(xpath = "//div[normalize-space()='hr76@cybertekschool.com']")
    public WebElement Contact1;

    @FindBy(xpath = "//div[normalize-space()='hr77@cybertekschool.com']")
    public WebElement Contact2;

    @FindBy(xpath = "//span[contains(text(),'hr76@cybertekschool.com')]")
    public WebElement Contact1sendbox;
    @FindBy(xpath = "//span[contains(text(),'hr77@cybertekschool.com')]")
    public WebElement Contact2sendbox;

    @FindBy(xpath = "//a[normalize-space()='Employees and departments']")
    public WebElement EmployeesDepartments;

    @FindBy(xpath = "//div[contains(text(),'aa')]")
    public WebElement aaDepartments;

    @FindBy(xpath = "//div[@rel='aa: All department and subdepartment employees']")
    public WebElement DepandSubdepartment;

    @FindBy(xpath = "//span[contains(text(),'aa')]")
    public WebElement DepandSubdepartmentsendox;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement LinkInbox;

    @FindBy(xpath = "//input[@id='undefined']")
    public WebElement LinkSaveButton;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement LinkTextInbox;

    @FindBy(xpath = "//input[@id='bxed_idPostFormLHE_blogPostForm']")
    public WebElement LinkinBody;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement QuoteBlock;

    public void bottonIconsClick(String IconName){
        String xpad="//div[@id='divoPostFormLHE_blogPostForm']//div[@class='feed-add-post-form-but-wrap']//*[@title='"+IconName+"']";
        Driver.get().findElement(By.xpath(xpad)).click();
    }

    public String uploadDoc(String docName){
        String locater="//span[@title='Click to insert file'][contains(text(),'"+docName+"')]";
      return Driver.get().findElement(By.xpath(locater)).getText();
    }
}
