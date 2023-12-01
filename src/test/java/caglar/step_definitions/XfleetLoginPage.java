package caglar.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utility.BrowserUtility;
import utility.Driver;

public class XfleetLoginPage {

   caglar.pages.XfleetLoginPage xfleetLoginPage =new caglar.pages.XfleetLoginPage();

    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {

        xfleetLoginPage.inputUserName.sendKeys(username);
        xfleetLoginPage.inputPassword.sendKeys(password);

    }
    @When("user clicks signuplogin button")
    public void user_clicks_signuplogin_button() {
        xfleetLoginPage.loginButton.click();

    }
    @Then("title should be {string}")
    public void title_should_be(String title) {
        BrowserUtility.waitUntilTitleContains(title);
        Assert.assertEquals(title , Driver.getDriver().getTitle());

    }



}
