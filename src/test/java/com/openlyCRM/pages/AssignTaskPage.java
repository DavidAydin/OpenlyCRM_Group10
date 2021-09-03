package com.openlyCRM.pages;

import com.openlyCRM.utilities.BrowserUtils;
import com.openlyCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AssignTaskPage extends BasePage {

    @FindBy(xpath = "//input[@id='tasks-task-priority-cb']")
    public WebElement highPriorityCB;

    @FindBy(xpath = "//span[@id='lhe_button_editor_task-form-lifefeed_task_form']")
    public WebElement visualEditorIcon;

    @FindBy(xpath = "//div[@id='bx-html-editor-tlbr-lifefeed_task_form']")
    public WebElement textEditor;

    @FindBy(xpath = "//input[@class='js-id-checklist-is-form-title task-checklist-field-add']")
    public WebElement checklistItemTextInput;

    @FindBy(xpath = "//span[contains(text(),'add')]")
    public WebElement addLink;

    @FindBy(xpath = "//span[@class='js-id-checklist-is-i-title ']")
    public List<WebElement> savedChecklistItems;

    @FindBy(xpath = "//span[@class='js-id-checklist-is-form-submit block-edit tasks-btn-apply task-field-title-ok']")
    public WebElement addCheckMark;

    @FindBy(xpath = "//span[contains(text(),'separator')]")
    public WebElement separatorLink;

    @FindBy(xpath = "//div[contains(@class,'mode-read a-separator')]")
    public List<WebElement> ckhecklistSeparator;

    @FindBy(xpath = "//span[@data-bx-id='dateplanmanager-deadline']")
    public WebElement deadlineDateBox;

    @FindBy(xpath = "//span[@data-bx-id='dateplanmanager-deadline']//input[@data-bx-id='datepicker-value']")
    public WebElement deadlineDateBoxValue;

    @FindBy(xpath = "//span[text()='Time planning']")
    public WebElement timePlanning;

    @FindBy(xpath = "//span[@data-bx-id='dateplanmanager-start-date-plan']")
    public  WebElement startTaskOnDateBox;

    @FindBy(xpath = "//span[@data-bx-id='dateplanmanager-end-date-plan']")
    public WebElement finishDateBox;

    @FindBy(name = "ACTION[0][ARGUMENTS][data][START_DATE_PLAN]")
    public WebElement startTaskOnDateBoxValue;

    @FindBy(name = "ACTION[0][ARGUMENTS][data][END_DATE_PLAN]")
    public WebElement finishDateBoxValue;


    public void chooseFromDatePicker(String timeSet){
        String[] date_Time_AmPm = timeSet.split(" ");
        String[] mmDDyyyy = date_Time_AmPm[0].split("/");
        String[] hhMMss = date_Time_AmPm[1].split(":");
        String aMpM = date_Time_AmPm[2];
        String minute = hhMMss[1];
        String hour= hhMMss[0];
        String day = mmDDyyyy[1];
        String month = mmDDyyyy[0];
        String year = mmDDyyyy[2];

        String yearXPath = "//span[@data-bx-year='"+year+"']";
        String monthXPath = "//span[contains(@class,'bx-calendar-month')][@data-bx-month='"+(Integer.parseInt(month)-1)+
                "']";
        String dayXPath = "(//a[@class='bx-calendar-cell'] | //a[@class='bx-calendar-cell bx-calendar-weekend'])[text" +
                "()='"+Integer.parseInt(day)+"']";
        String hourXPath = "//input[@class='bx-calendar-form-input']";
        String minuteXPath = "//input[@class='bx-calendar-form-input']";
        String aMpMxPath = "//span[@class='bx-calendar-AM-PM-text']";

        WebElement yearBox = Driver.get().findElement(By.xpath("//a[@class='bx-calendar-top-year']"));
        yearBox.click();
        BrowserUtils.waitForMilis(200);
        WebElement yearSelector = Driver.get().findElement(By.xpath(yearXPath));
        yearSelector.click();
        BrowserUtils.waitForMilis(200);
        WebElement monthBox = Driver.get().findElement(By.xpath("//a[@class='bx-calendar-top-month']"));
        monthBox.click();
        BrowserUtils.waitForMilis(200);
        WebElement monthSelector = Driver.get().findElement(By.xpath(monthXPath));
        monthSelector.click();
        BrowserUtils.waitForMilis(200);
        WebElement daySelector = Driver.get().findElement(By.xpath(dayXPath));
        daySelector.click();
        WebElement aMpMSelector = Driver.get().findElement(By.xpath(aMpMxPath));
        System.out.println("aMpMSelector.getText() = " + aMpMSelector.getText());
        WebElement hourSelector = Driver.get().findElement(By.xpath(hourXPath));
        hourSelector.sendKeys(hour);
        WebElement minuteSelector = Driver.get().findElement(By.xpath(minuteXPath));
        minuteSelector.sendKeys(minute);
        WebElement submitSelectedDate = Driver.get().findElement(By.xpath("//span[@class='bx-calendar-button-text'][text()" +
                "='Select']"));
        if (!aMpMSelector.getText().equalsIgnoreCase(aMpM)) {
            aMpMSelector.click();
        }
        submitSelectedDate.click();
        BrowserUtils.waitForMilis(200);

    }

    public void goToTaskLinks(String linkName) {
        String xPath = "//span[@data-bx-id='task-edit-toggler'][contains(text(),'" + linkName + "')]";
        Driver.get().findElement(By.xpath(xPath)).click();

    }


    public void clickDeleteButtonOf(String checkListItem) {
        String xpath = "//input[@class='js-id-checklist-is-i-new-title block-edit " +
                "task-checklist-field-add'][@value='"+checkListItem+"']/parent::div//span[@class='js-id-checklist-is-i-delete " +
                "task-field-title-del tasks-btn-delete']";
        WebElement deleteChecklistItem = Driver.get().findElement(By.xpath(xpath));
        new Actions(Driver.get()).moveToElement(deleteChecklistItem).perform();
        deleteChecklistItem.click();
    }

    @FindBy(xpath = "//a[@id='logo_24_a']")
    public WebElement homeLink;

    @FindBy(xpath = "//div[@id='feed-add-post-form-tab']//span[contains(text(),'More')]")
    public WebElement QN_More;

    public void waitUntilHomeLinkIsClickable(){
        new WebDriverWait(Driver.get(),10).until(ExpectedConditions.elementToBeClickable(homeLink));
    }

    public void goToQuickNavigationTab(String QN_tabName){
        waitUntilHomeLinkIsClickable();
        String tabLocator = "//div[@id='feed-add-post-form-tab']//span[contains(text(),'"+QN_tabName+"')]";
        Driver.get().findElement(By.xpath(tabLocator)).click();
    }

    public void goToMoreQuickNavigationTab(String QN_tabName){
        waitUntilHomeLinkIsClickable();
        QN_More.click();
        String tabLocator = "//div[@class='menu-popup-items']/span/span[contains(text(),'"+QN_tabName+"')]";
        Driver.get().findElement(By.xpath(tabLocator)).click();
    }

}
