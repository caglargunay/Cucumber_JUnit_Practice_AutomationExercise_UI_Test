package caglar.pages.automationexercise;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Driver;

public class MainPage extends Base{
    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (linkText = "Signup / Login")
    public WebElement sigupLogin;

    @FindBy(partialLinkText ="Logged" )
    public WebElement logged;

    @FindBy(partialLinkText = "Delete")
    public WebElement deleteAccount;

    @FindBy(partialLinkText = "Logout")
    public WebElement logout;

    @FindBy(partialLinkText = "Test Cases")
    public WebElement testcases;

    @FindBy (xpath = "//div[@class='single-widget']//h2")
    public WebElement subscription;

    @FindBy(xpath = "//div[@class='alert-success alert']")
    public  WebElement succesfullyAccess;


    public static void verifyTitle(WebDriver driver , String expectedTitle) {

        Assert.assertEquals(driver.getTitle(), expectedTitle);

    }

    public void befor(){
        Driver.getDriver().get("https://automationexercise.com/");
        String expectTitle="Automation Exercise";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectTitle);
    }

}
