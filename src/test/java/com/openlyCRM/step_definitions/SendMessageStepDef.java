package com.openlyCRM.step_definitions;

import com.openlyCRM.pages.MessagePage;
import com.openlyCRM.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SendMessageStepDef {

    MessagePage messagePage = new MessagePage();

    @Given("user clicks on Message")
    public void user_clicks_on_Message() {
        messagePage.messageTab.click();
    }

    @Then("verify upload files and images box is displayed")
    public void verify_upload_files_and_images_box_is_displayed() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(messagePage.sendBtn.isDisplayed());
    }

    @When("the user selects an email from the menu")
    public void the_user_selects_an_email_from_the_menu() {
        messagePage.hd22email.click();
    }

    @Then("verify the email is displayed")
    public void verify_the_email_is_displayed() {
        Assert.assertTrue(messagePage.isEmailDisplayed());
    }

}
