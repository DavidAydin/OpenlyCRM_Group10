package com.openlyCRM.pages;

import com.openlyCRM.utilities.BrowserUtils;
import com.openlyCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;
import java.util.List;

public class CompanyPage extends BasePage {

@FindBy (css = "span:nth-of-type(3) > .bx-core-popup-menu-item-text")
    public WebElement insertFilePath;

@FindBy(xpath = "//input[@id='bx_file_detail_picture_menu1']")
    public WebElement uploadFromComputer;

@FindBy(xpath = "//select[@name='PROP[3][]']//option")
    public List<WebElement> actualListWebElement;

@FindBy(xpath = "//span[normalize-space()='Add News']")
    public WebElement addNewsButton;

    @FindBy(xpath = "//input[@name='ACTIVE_FROM']")
    public WebElement dateInputBox;

    @FindBy(css = ".bx-core-adm-dialog-tabs > span:nth-of-type(2)")
    public WebElement detailsMenu;

    @FindBy(css = "span#bx_file_detail_picture_add")
    public WebElement addFileDropDown;

    @FindBy(xpath = "//input[@id='bx_file_detail_picturefilePath_0_path']")
    public WebElement InsertFileLink;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement addButton;

    @FindBy(css = ".popup-window-button.popup-window-button-accept")
    public WebElement saveButton;

    @FindBy(css = ".bx-bxu-proper-canvas.portrait")
    public WebElement Picture;

    @FindBy(css = "div#bx_file_detail_picture_block")
    public WebElement deleteIcon;

    @FindBy(css = ".adm-btn-setting.adm-fileinput-item-panel-btn")
    public  WebElement editButton;

    @FindBy(css = "span#FMturn-l > .adm-photoeditor-btn-icon")
    public WebElement clockwise;

    @FindBy(xpath = "//input[@name='TAGS']")
    public WebElement TagsInputBox;

    @FindBy(css = "input[name='NAME']")
    public WebElement titleBox;

    @FindBy(xpath = "//input[@id='savebtn']")
    public WebElement savebtn;

    @FindBy(xpath = "//div[@id='workarea-content']//table/tbody/tr[1]/td[2]")
    public WebElement textShowninList;

    public void navigateRadioButtons(String RadioBut) {
        String RadioButtonLocator = "//label[@for='bxed_PREVIEW_TEXT_" + RadioBut + "']";
        try {
            BrowserUtils.waitForClickablility(By.xpath(RadioButtonLocator), 5);
            WebElement RadioElement = Driver.get().findElement(By.xpath(RadioButtonLocator));
            RadioElement.click();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(RadioButtonLocator), 5);
        }
    }
}