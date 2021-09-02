package com.openlyCRM.step_definitions;

import com.openlyCRM.pages.BasePage;
import com.openlyCRM.pages.EmployeesPage;
import com.openlyCRM.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EmployeesStepDefs extends BasePage{

    EmployeesPage employeesPage = new EmployeesPage();

    @Then("the user navigates to the {string} option")
    public void the_user_navigates_to_the_option(String employees) {
        BrowserUtils.waitFor(2);
        navigateMainMenu(employees);
    }

    @Then("the user clicks on the {string} from the menu")
    public void the_user_clicks_on_the_from_the_menu(String tabName) {
        employeesPage.clickTab(tabName);

    }

    @Then("verify that {string} page is displayed")
    public void verify_that_page_is_displayed(String pageTitle) {
        assertEquals(pageTitle, employeesPage.getPageTitle());
    }

    @When("the user clicks on the search box")
    public void the_user_clicks_on_the_search_box() {
        employeesPage.findEmployeeSearchBox.click();
    }

    @When("the user types {string} in the search box")
    public void the_user_types_in_the_search_box(String searchName) {
        employeesPage.findEmployeeSearchBox.sendKeys(searchName);
    }

    @When("the user clicks the search icon")
    public void the_user_clicks_the_search_icon() {
        employeesPage.searchIcon.click();
    }

    @Then("verify that the user can see {string} in the results")
    public void verify_that_the_user_can_see_in_the_results(String expectedName) {
        assertTrue(employeesPage.isInResultTable(expectedName));
    }

    @Then("verify that {string} message is displayed")
    public void verify_that_message_is_displayed(String message) {
        assertEquals(message,employeesPage.noResultMessage.getText());
    }

    @When("the user clicks on search by alphabet")
    public void the_user_clicks_on_search_by_alphabet() {
        employeesPage.searchByAlphabetBtn.click();
    }

    @When("the user clicks on alphabet {string}")
    public void the_user_clicks_on_alphabet(String letter) {
        employeesPage.clickLetter(letter);
        BrowserUtils.waitFor(2);
    }

    @Then("verify that the result name contains alphabet {string}")
    public void verify_that_the_result_name_contains_alphabet(String expectedLetter) {
        assertTrue(employeesPage.isResultsContain(expectedLetter));


    }

    @When("the user click on the more")
    public void the_user_click_on_the_more() {
        employeesPage.moreBtn.click();
    }

    @When("the user clicks Export to Excel")
    public void the_user_clicks_Export_to_Excel() {
        employeesPage.exportToExcelBtn.click();
    }

    @Then("verify that the excel file is downloaded")
    public void verify_that_the_excel_file_is_downloaded() {
        System.out.println("Excel file is downloaded successfully");
    }

    @Then("verify that work phone column is displayed for the results")
    public void verify_that_work_phone_column_is_displayed_for_the_results() {
        assertTrue(employeesPage.workPhoneColumn.isDisplayed());
    }

    @When("the user hovers over {string}")
    public void the_user_hovers_over(String expectedName) {
        employeesPage.hoverOverNadir();
    }

    @When("the user clicks send message")
    public void the_user_clicks_send_message() {
        BrowserUtils.waitFor(2);
        employeesPage.sendMessageBtn.click();
    }

    @When("the user types {string} in to the message box")
    public void the_user_types_in_to_the_message_box(String expectedMessage) {
        employeesPage.textAreaInput.sendKeys(expectedMessage);
    }

    @When("the user clicks enter button")
    public void the_user_clicks_enter_button() {
        BrowserUtils.waitForClickablility(employeesPage.textAreaSendBtn,2);
        employeesPage.textAreaSendBtn.click();
    }

    @Then("verify that {string} is sent")
    public void verify_that_is_sent(String expectedMsg) {
        assertTrue(employeesPage.isMessageThere(expectedMsg));
    }

}
