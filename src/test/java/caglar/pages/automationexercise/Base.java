package caglar.pages.automationexercise;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Driver;

public abstract class Base {
    public Base(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Home")
    public WebElement Home;

    @FindBy(partialLinkText = "Products")
    public WebElement products;

    @FindBy(partialLinkText = "Cart")
    public WebElement carts;


    @FindBy(partialLinkText = "API Testing")
    public WebElement aPI_Testing;

    @FindBy(partialLinkText = "Video Tutorials")
    public WebElement videoTutorials;

    @FindBy(partialLinkText = "Contact us")
    public WebElement contact_Us;


    @FindBy(linkText = "Signup / Login")
    public WebElement sigupLogin;

    @FindBy(partialLinkText ="Logged" )
    public WebElement logged;

    @FindBy(partialLinkText = "Delete")
    public WebElement deleteAccount;

    @FindBy(partialLinkText = "Logout")
    public WebElement logout;

    @FindBy(partialLinkText = "Test Cases")
    public WebElement testcases;

    @FindBy(id = "susbscribe_email")
    public WebElement emailBox;

    @FindBy(id="subscribe")
    public WebElement emailButton;






    public void befor(){
        Driver.getDriver().get("https://automationexercise.com/");
        String expectTitle="Automation Exercise";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectTitle);
    }



}
