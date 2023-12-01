package pages.step_definitions;

import pages.pages.automationexercise.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utility.BrowserUtility;
import utility.ConfigurationReader;
import utility.Driver;



public class TC1_RegisterUserStepDefinitions {

    MainPage mainPage = new MainPage();

    Login login= new Login();

    Signup signup = new Signup();

    AccountCreated accountCreated = new AccountCreated();

    DeleteAccount deleteAccount = new DeleteAccount();

    @Given("user is on the main page {string}")
    public void user_is_on_the_main_page(String expectedUrl) {

        String url= ConfigurationReader.getProperties(expectedUrl);
        Driver.getDriver().get(url);


    }
    @Then("page is loaded")
    public void page_is_loaded() {
        BrowserUtility.verifyIsPageLoaded();

    }
    @When("user clicks signupLogin button")
    public void user_clicks_signup_login_button() {
        mainPage.sigupLogin.click();

    }
    @Then("{string} is visible")
    public void is_visible(String string) {

        switch (string){
            case "New User Signup!":
                Assert.assertTrue(login.loginVerify.isDisplayed());
                break;
            case "ENTER ACCOUNT INFORMATION":
                Assert.assertTrue(signup.enterAccountElement.isDisplayed());
                break;
            case "ACCOUNT CREATED!" :
                Assert.assertTrue(accountCreated.accountCreated.isDisplayed());
                break;
            case "Logged in as username":
                String loggedText=mainPage.logged.getText();
                String expectedText="Logged in as "+ConfigurationReader.getProperties("username");
                Assert.assertTrue(loggedText.contains(expectedText));
                break;
            case  "ACCOUNT DELETED!":
                Assert.assertTrue(deleteAccount.accountDeleted.isDisplayed());
                break;
            default:
                System.out.println("you should switch case for this expected result");
        }


    }
    @When("user enters name and email address")
    public void user_enters_name_and_email_address() {

    login.signUpName.sendKeys(ConfigurationReader.getProperties("username"));
    login.signUpEmail.sendKeys(ConfigurationReader.getProperties("email"));
        BrowserUtility.sleep(1);
    }
    @When("user clicks signup button")
    public void user_clicks_signup_button() {
       login.submit.click();
        BrowserUtility.sleep(1);


    }
    @When("user fills the signup form")
    public void user_fills_the_signup_form() {
        signup.fillTheForm();
        BrowserUtility.sleep(1);

    }
    @When("user clicks create account button")
    public void user_clicks_create_account_button() {
        signup.createButton.click();

    }
    @When("user clicks continue button")
    public void user_clicks_continue_button() {
        accountCreated.continueBtn.click();

    }
    @When("users clicks delete account button")
    public void users_clicks_delete_account_button() {
       mainPage.deleteAccount.click();


    }
    @When("user clicks continue button after account deleted")
    public void user_clicks_continue_button_after_account_deleted() {
        deleteAccount.continueBtnDelete.click();
    }

}
