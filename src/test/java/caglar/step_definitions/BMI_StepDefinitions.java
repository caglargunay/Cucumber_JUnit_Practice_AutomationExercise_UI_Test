package caglar.step_definitions;

import caglar.pages.BMI;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import utility.BrowserUtility;

import java.util.Map;

public class BMI_StepDefinitions {
    BMI bmi= new BMI();

    @When("user enters HisHer profile spesifications")
    public void user_enters_his_her(Map<String,String> profile) {
        Select select = new Select(bmi.genderDropDpwn);
        select.selectByVisibleText(profile.get("gender"));

        bmi.age.clear();
        bmi.age.sendKeys(profile.get("age"));

        bmi.height.clear();
        bmi.height.sendKeys(profile.get("height"));

        bmi.weight.clear();
        bmi.weight.sendKeys(profile.get("weight"));


    }
    @When("user clicks Calculate button")
    public void user_clicks_calculate_button() {

        bmi.calculateBtn.click();
        BrowserUtility.sleep(3);

    }
    @Then("user should be shown as a {string}")
    public void user_should_be_shown_as_a(String string) {

        String  expected = string;
        String actual   = bmi.bmi.getText();
        System.out.println(string);
        System.out.println(actual);

        Assert.assertTrue(actual.contains(expected));


    }



}
