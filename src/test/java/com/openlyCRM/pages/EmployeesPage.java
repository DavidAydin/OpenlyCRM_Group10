package com.openlyCRM.pages;

import com.openlyCRM.utilities.BrowserUtils;
import com.openlyCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EmployeesPage extends BasePage{

    @FindBy(linkText = "Company Structure")
    private WebElement companyStructureBtn;

    @FindBy(linkText = "Find Employee")
    public WebElement findEmployeeBtn;

    @FindBy(linkText = "Telephone Directory")
    public WebElement telephoneDirectoryBtn;

    @FindBy(className = "webform-small-button-text")
    public WebElement addDepartmentBtn;

    @FindBy(xpath = "//input[@id='NAME']")
    public WebElement departmentNameInputBox;

    @FindBy(id = "user-fio")
    public WebElement findEmployeeSearchBox;

    @FindBy(className = "bx24-top-bar-search-icon")
    public WebElement searchIcon;

    @FindBy(xpath = "//table[@id='employee-table']/tbody/tr/td/div/div/a")
    public List<WebElement> resultList;

    @FindBy(tagName = "p")
    public WebElement noResultMessage;

    @FindBy(className = "filter-but-text")
    public WebElement searchByAlphabetBtn;

    @FindBy(xpath = "//span[@class='filter-but-icon']")
    public WebElement moreBtn;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[1]")
    public WebElement exportToExcelBtn;

    //@FindBy(css = ".employee-ABC-popup>a")
    //public List<WebElement> lettersList;

    @FindBy (css = ".employee-table-wrap")
    public WebElement resultsTable;

    @FindBy (xpath = "(//*[contains(text(),'Work Phone')])[2]")
    public WebElement workPhoneColumn;

    @FindBy(linkText = "Nadir")
    public WebElement nameNadir;

    @FindBy(xpath = "//span[@onclick='return BX.tooltip.openIM(489);']")
    public WebElement sendMessageBtn;

    @FindBy(className = "bx-messenger-textarea-input")
    public WebElement textAreaInput;

    @FindBy(className = "bx-messenger-textarea-send-button")
    public WebElement textAreaSendBtn;

    @FindBy(xpath = "//div[@data-type='self']")
    public List<WebElement> sentTextMessageList;

    public void clickTab(String tabName){
        switch (tabName) {
            case "Company Structure":
                companyStructureBtn.click();
                break;
            case "Find Employee":
                findEmployeeBtn.click();
                break;
            case "Telephone Directory":
                telephoneDirectoryBtn.click();
                break;
        }
    }

    public String getPageTitle(){
        return Driver.get().getTitle();
    }

    public boolean isInResultTable(String expectedName){
        List<String> resultsText = BrowserUtils.getElementsText(resultList);

        boolean flag = false;

        for (String s : resultsText) {
            flag = s.equals(expectedName);
            if (!flag){
                break;
            }
        }
        return flag;
    }

    public void clickLetter(String letter){

        Driver.get().findElement(By.linkText(letter)).click();
    }

    public boolean isResultsContain(String letter){

        List<String> resultsText = BrowserUtils.getElementsText(resultList);
        boolean flag = true;

        for (String s : resultsText) {
            flag = s.contains(letter);
            System.out.println("s = " + s);
            if (!flag){
                break;
            }
        }
        return flag;

    }

    public void hoverOverNadir(){
        Actions actions = new Actions(Driver.get());

        actions.moveToElement(nameNadir).perform();
    }

    public boolean isMessageThere(String expectedMsg){
        return sentTextMessageList.get(sentTextMessageList.size() - 1).getText().contains(expectedMsg);
    }

}
