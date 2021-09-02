package com.openlyCRM.step_definitions;

import com.openlyCRM.pages.CompanyPage;
import com.openlyCRM.utilities.BrowserUtils;
import com.openlyCRM.utilities.ConfigurationReader;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AddNewsStepDef {

    CompanyPage companyPage = new CompanyPage();


    @Given("the user navigates to {string}")
    public void theUserNavigatesTo(String CompanyMenu) {
        companyPage.navigateMainMenu(CompanyMenu);
    }

    @Then("the user should be able to select the following options")
    public void theUserShouldBeAbleToSelectTheFollowingOptions(List<String> ExpectedList) throws InterruptedException {
        BrowserUtils.waitFor(2);

        List<String> actualList = BrowserUtils.getElementsText(companyPage.actualListWebElement);

        for (String s : actualList) {
            System.out.println("s = " + s);



        }
        System.out.println("ExpectedList = " + ExpectedList);
        System.out.println("actualList = " + actualList);
        System.out.println("actualList.size() = " + actualList.size());

       Assert.assertEquals(ExpectedList, actualList);





//        for (int i = 0; i < 8; i++) {
//             String actualelement = companyPage.actualListWebElement[i];
//             String expectedResult =ExpectedList [i];
//
//             Assert.assertEquals(actualelement,ExpectedList);


//        Select reminderDropdown = new Select(eventPage.SetReminderDropdown);
//        reminderDropdown.selectByIndex(2);


    }

    @And("the user click {string}")
    public void theUserClick(String arg0) {

    }

    @And("the user click to Add News")
    public void theUserClickToAddNews() {
        companyPage.addNewsButton.click();
    }

//    @When("the user clicks on Preview text")
//    public void theUserClicksOnPreviewText() {
//
//    }

    @When("the user enter keywords {string}")
    public void theUserEnterKeywords(String string) throws InterruptedException {
        Thread.sleep(2000);
        companyPage.dateInputBox.clear();
        Thread.sleep(2000);
        companyPage.dateInputBox.sendKeys(string);


    }

    @Then("the user should able to select a {string}")
    public void theUserShouldAbleToSelectA(String string) throws InterruptedException {


        String actualInput = companyPage.dateInputBox.getAttribute("value");
        String expectedInput = string;
        Assert.assertEquals(expectedInput, actualInput);
    }

    @And("the user clicks on Details")
    public void theUserClicksOnDetails() {
        companyPage.detailsMenü.click();
    }

    @Then("the user click Add File dropdown")
    public void theUserClickAddFileDropdown() {
        companyPage.addFileDropDown.click();
    }

    @When("the user selects {string}")
    public void theUserSelects(String insertFile) {
        if (insertFile.equals("Insert file path")) {
            companyPage.insertFilePath.click();

        } else {
            new CompanyPage().uploadFromComputer.click();
        }

    }

    @Then("the user enter keyword {string}")
    public void theUserEnterKeyword(String link) {
        companyPage.InsertFileLink.sendKeys(ConfigurationReader.get(link));

    }

    @And("the user clicks on Add")
    public void theUserClicksOnAdd() throws InterruptedException {
        companyPage.addButton.click();
        Thread.sleep(2000);
    }

    @And("the user clicks on Save")
    public void theUserClicksOnSave() throws InterruptedException {
        Thread.sleep(4000);
        companyPage.saveButton.click();
        Thread.sleep(4000);
    }

    @Then("the image file should be displayed under details menu")
    public void theImageFileShouldBeDisplayedUnderDetailsMenu() throws InterruptedException {
        System.out.println(companyPage.Picture.getAttribute("width"));
        Thread.sleep(3000);
        Assert.assertTrue(companyPage.Picture.isDisplayed());
    }

    @And("the user click delete icon")
    public void theUserClickDeleteIcon() throws InterruptedException {
        companyPage.deleteIcon.click();
        Thread.sleep(3000);

    }

    @Then("the image file should not displayed under preview menu")
    public void theImageFileShouldNotDisplayedUnderPreviewMenu() {
        Assert.assertTrue(companyPage.deleteIcon.isDisplayed());

    }

    @And("the user click edit button")
    public void theUserClickEditButton() throws InterruptedException {
        Thread.sleep(3000);
        companyPage.editButton.click();

    }

    @And("the user click Rotate Clockwise button")
    public void theUserClickRotateClockwiseButton() throws InterruptedException {

        Thread.sleep(2000);
        companyPage.clockwise.click();

//        Thread.sleep(2000);
//        companyPage.clockwise.click();
//
//        Thread.sleep(2000);
//        companyPage.clockwise.click();
//
        Thread.sleep(2000);
    }

    @Then("the image file should be displayed under preview menu")
    public void theImageFileShouldBeDisplayedUnderPreviewMenu() {
        Assert.assertTrue(companyPage.Picture.isDisplayed());
    }

    @When("the user enter keywords {string} in TAGS")
    public void theUserEnterKeywordsInTAGS(String name) throws InterruptedException {
        Thread.sleep(2000);
        companyPage.TagsInputBox.sendKeys(name);
        Thread.sleep(2000);
    }

    @Then("the user should see that entered keywords {string} in tag label")
    public void theUserShouldSeeThatEnteredKeywordsInTagLabel(String actual) {
        String expectedResult = "Brad Pitt";
        String actualResult = actual;

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Then("the user can click radio buttons")
    public void theUserCanClickRadioButtons(List<String> ExpectedRadioButton) throws InterruptedException {
        for (String button : ExpectedRadioButton) {
            Thread.sleep(2000);
            companyPage.navigateRadioButtons(button);
            Thread.sleep(2000);
            Assert.assertTrue(ExpectedRadioButton.contains(button));
        }

    }

    @When("the user enter keywords {string} in to Title")
    public void theUserEnterKeywordsInToTitle(String string) {
        companyPage.titleBox.sendKeys(string);
    }

    @Then("the news should able to listed as a {string} in Company menu")
    public void theNewsShouldAbleToListedAsAInCompanyMenu(String string) throws InterruptedException {
        Thread.sleep(1000);
        String actual = companyPage.textShowninList.getText();
        Assert.assertTrue(actual.contains(string));

    }


    @And("the user clicks on SaveButtonTwo")
    public void theUserClicksOnSaveButtonTwo() throws InterruptedException {
        Thread.sleep(2000);
        companyPage.savebtn.click();


    }
}

