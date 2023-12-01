package pages.step_definitions;

import pages.pages.ExpandTestingMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utility.BrowserUtility;
import utility.ConfigurationReader;
import utility.Driver;

public class PracticeSearch_StepDefinitions {

    ExpandTestingMainPage expandTestingMainPage=new ExpandTestingMainPage();


    @Given("user is on the main page of {string}")
    public void user_is_on_the_main_page_of(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperties(string));
    }


    @When("user enter {string} into search box")
   public void user_enter_into_search_box(String string) {
        expandTestingMainPage.searchBox.sendKeys(string);

    }
    @Then("user should see {int} as a number of element")
    public void user_should_see_as_a_number_of_element(Integer int1) {
        BrowserUtility.sleep(2);
        int expected=int1;
        int  actual=expandTestingMainPage.elementList.size();

        Assert.assertEquals(expected,actual);

    }
    @When("user refresh the page")
    public void user_refresh_the_page() {
        Driver.getDriver().navigate().refresh();

    }


}




