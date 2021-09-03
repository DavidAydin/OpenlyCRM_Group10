package com.openlyCRM.step_definitions;

import com.openlyCRM.pages.*;
import com.openlyCRM.utilities.BrowserUtils;
import com.openlyCRM.utilities.ConfigurationReader;
import com.openlyCRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;


public class AppreciationStepDef {



    @When("the user clicks on Upload files and images cell")
    public void the_user_clicks_on_Upload_files_and_images_cell() {

    }

    @When("the user press enter button")
    public void the_user_press_enter_button() throws InterruptedException {
       Thread.sleep(2000);
    }



    @Given("the user clicks on the add more button")
    public void the_user_clicks_on_the_add_more_button() {
       new AppreciationPage().AddMore.click();
    }


    @When("the user clicks a contact")
    public void the_user_clicks_a_contact() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("the user enter keyword to Text Label")
    public void the_user_enter_keyword_to_Text_Label() {
        BrowserUtils.waitFor(1);
        new AppreciationPage().LinkTextInbox.sendKeys("Hello");
    }
    @When("the user enter Link to Link Label")
    public void the_user_enter_Link_to_Link_Label() {
       new AppreciationPage().LinkInbox.sendKeys("https://www.youtube.com/");
    }
    @When("the user clicks on  save button")
    public void the_user_clicks_on_save_button() {
       new AppreciationPage().LinkSaveButton.click();
    }
    @Then("the user should be able to attach a link")
    public void the_user_should_be_able_to_attach_a_link() {
       // BrowserUtils.verifyElementDisplayed(new AppreciationPage().LinkinBody);
        //Driver.get().switchTo().frame(0);
        BrowserUtils.waitFor(1);
        String ExpectedLink="www.youtube.com";
       String ActualLink=new AppreciationPage().LinkinBody.getAttribute("value");
        System.out.println("Actual link "+ActualLink );
        Assert.assertTrue(ActualLink.contains(ExpectedLink));
    }


    @Given("the user clicks on the Comma icon")
    public void the_user_clicks_on_the_Comma_icon() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user enter keyword to the Quota Block")
    public void the_user_enter_keyword_to_the_Quota_Block() {
        System.out.println("frame size "+Driver.get().findElements(By.tagName("iframe")).size());
        Driver.get().switchTo().frame(0);
        BrowserUtils.verifyElementDisplayed(new AppreciationPage().QuoteBlock);
        new AppreciationPage().QuoteBlock.sendKeys("Hello");
    }


    @When("the user select More dropdowmenu and click Apppreciation")
    public void the_user_select_More_dropdowmenu_and_click_Apppreciation() {
        // Write code here that turns the phrase above into concrete actions
        new AppreciationPage().MoreDropdown.click();
        BrowserUtils.waitForClickablility(new AppreciationPage().Appreciation,5);
       new AppreciationPage().Appreciation.click();
    }



    @Given("the user clicks on the Add mention icon")
    public void the_user_clicks_on_the_Add_mention_icon() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user select a user")
    public void the_user_select_a_user() {

        new AppreciationPage().EmployeesDepartments.click();
        new AppreciationPage().Contact1.click();
    }
    @Then("the user should be add in to Content table")
    public void the_user_should_be_add_in_to_Content_table() {
        BrowserUtils.waitFor(1);
        Driver.get().switchTo().frame(0);
       BrowserUtils.verifyElementDisplayed(By.xpath("//body/span[@class='bxhtmled-metion']"));
    }



    @Given("the user clicks on the send button")
    public void the_user_clicks_on_the_send_button() {
     //  new ActivityStreamPage().eventSendButton.click();
      //  BrowserUtils.waitForClickablility(new MessagePage().sendBtn,10);
    }
    @Then("the user should be send appreciation")
    public void the_user_should_be_send_appreciation() {
        BrowserUtils.waitFor(4);
       BrowserUtils.verifyElementDisplayed(new AppreciationPage().TextBody);
    }


    @Given("the user clicks on the {string} icon")
    public void theUserClicksOnTheIcon(String iconName) {

        new AppreciationPage().bottonIconsClick(iconName);
    }

    @And("the user upload {string} from local disks")
    public void theUserUploadFromLocalDisks(String arg0) throws InterruptedException {
        BrowserUtils.waitFor(2);

         new AppreciationPage().UploadFilesImages.sendKeys("C:\\"+arg0);
    }

    @Then("the user should be upload {string}")
    public void theUserShouldBeUpload(String arg0) {
    BrowserUtils.waitFor(7);
    String expecteddocName="Picture";
       // Assert.assertEquals(expecteddocName,new AppreciationPage().uploadDoc(arg0));
       BrowserUtils.verifyElementDisplayed(By.xpath("//td[@class='files-name']"));


    }


    @When("the user clicks contacts")
    public void theUserClicksContacts() {
        new AppreciationPage().Contact1.click();
        new AppreciationPage().Contact2.click();

    }

    @Then("the user should be able to add multiple contacts")
    public void theUserShouldBeAbleToAddMultipleContacts() {
    String expectedcontackt1=new AppreciationPage().Contact1.getText();
    String expectedcontackt2=new AppreciationPage().Contact2.getText();

    String actualcontackt1=new AppreciationPage().Contact1sendbox.getText();
    String actualcontackt2=new AppreciationPage().Contact2sendbox.getText();

    String[] expectedContacklist={expectedcontackt1,expectedcontackt2};
    String[] acualContacktlist={actualcontackt1,actualcontackt2};

    Assert.assertEquals(expectedContacklist,acualContacktlist);


    }

    @When("the user clicks on the Employees and deprtments submenu")
    public void theUserClicksOnTheEmployeesAndDeprtmentsSubmenu() {

        new AppreciationPage().EmployeesDepartments.click();

    }

    @Then("the user should be able to add contact from department contact lists")
    public void theUserShouldBeAbleToAddContactFromDepartmentContactLists() {
    String Expecteddepartment="aa";
    String Actualdepartment=new AppreciationPage().DepandSubdepartmentsendox.getText();
Assert.assertEquals(Expecteddepartment,Actualdepartment);
    }

    @And("the user select aa department")
    public void theUserSelectAaDepartment() {

     new AppreciationPage().aaDepartments.click();
    BrowserUtils.waitFor(1);

    }

    @And("the user select All depratment and subdepartment employees button")
    public void theUserSelectAllDepratmentAndSubdepartmentEmployeesButton() {
        new AppreciationPage().DepandSubdepartment.click();
        BrowserUtils.waitFor(1);
    }

    @Then("the user should be enter keyword to the Quota Block")
    public void theUserShouldBeEnterKeywordToTheQuotaBlock() {

        BrowserUtils.verifyElementDisplayed(By.xpath("//blockquote"));
    }

    @Given("the user enter keyword to Text Body")
    public void theUserEnterKeywordToTextBody() {
    Driver.get().switchTo().frame(0);
    new AppreciationPage().TextBody.sendKeys("Hello");
    BrowserUtils.waitFor(1);
    }

    @When("the user send links to VideSource Inbox")
    public void theUserSendLinksToVideSourceInbox() {
        new AppreciationPage().VideoInput.sendKeys(ConfigurationReader.get("link2"));
        BrowserUtils.waitForMilis(2000);

    }

    @Then("the user upload video successfully.")
    public void theUserUploadVideoSuccessfully() {

        String ExpectedMessage= "Video Uploaded Successfully";
        String ActuelMessage=new AppreciationPage().VideoMessage.getText();

        Assert.assertEquals(ExpectedMessage,ActuelMessage);

    }


}
