package com.openlyCRM.step_definitions;

import com.openlyCRM.pages.MessagePage;
import com.openlyCRM.utilities.BrowserUtils;
import com.openlyCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SendMessageStepDef {

    MessagePage messagePage = new MessagePage();

    @Given("user clicks on Message")
    public void user_clicks_on_Message() {
        messagePage.messageTab.click();
    }

    @Then("verify upload files and images box is displayed")
    public void verify_upload_files_and_images_box_is_displayed() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(messagePage.uploadFilesAndImagesBox.isDisplayed());
    }

    @When("the user selects an email from the menu")
    public void the_user_selects_an_email_from_the_menu() {
        messagePage.hd22email.click();
    }

    @Then("verify the email is displayed")
    public void verify_the_email_is_displayed() {
        Assert.assertTrue(messagePage.isEmailDisplayed());
    }

    @When("the user clicks on the link icon")
    public void the_user_clicks_on_the_link_icon() {
        messagePage.linkBtn.click();
    }

    @When("the user sends {string} to Text box")
    public void the_user_sends_to_Text_box(String title) {
        BrowserUtils.waitFor(1);
        messagePage.textInputBox.sendKeys(title);
    }

    @When("the user sends {string} to Link box")
    public void the_user_sends_to_Link_box(String link) {
        messagePage.linkInputBox.sendKeys(link);
        BrowserUtils.waitFor(1);

    }

    @Then("verify that google is attached")
    public void verify_that_google_is_attached() {
        Driver.get().switchTo().frame(messagePage.iframe);
        BrowserUtils.waitFor(1);
        Assert.assertTrue(messagePage.googleInMessageBox.isDisplayed());
    }

}
