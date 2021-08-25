package com.openlyCRM.step_definitions;

import com.openlyCRM.pages.LoginPage;
import com.openlyCRM.utilities.ConfigurationReader;
import com.openlyCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {
    @Given("the user lands in the login page")
    public void theUserLandsInTheLoginPage() {
        Driver.get().navigate().to(ConfigurationReader.get("url"));
    }
    
    @When("the user logs in as {string}")
    public void theUserLogsInAs(String userType) {
        new LoginPage().loginAs(userType);
    }
    
    @Then("the user should be in the Activity Stream page")
    public void theUserShouldBeInTheActivityStreamPage() {
        String title = Driver.get().getTitle();
        Assert.assertTrue(title.contains("Portal"));
    }
    
    @Given("the user is logged in as Human Resource")
    public void theUserIsLoggedInAsHumanResource() {
        Driver.get().navigate().to(ConfigurationReader.get("url"));
        LoginPage login = new LoginPage();
        login.loginAs("Human Resource");
        
    }
    
   
}
