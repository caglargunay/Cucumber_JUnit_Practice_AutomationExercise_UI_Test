package caglar.pages.automationexercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class ContactUs extends Base {
   public ContactUs (){
       PageFactory.initElements(Driver.getDriver(),this);

   }
   @FindBy(xpath = "(//h2)[2]")
    public WebElement getInTouch;


   @FindBy(name = "name")
    public WebElement name;

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(name = "subject")
    public WebElement subject;

    @FindBy(name = "message")
    public WebElement message;

    @FindBy(name = "upload_file")
    public WebElement chooseFile;


    @FindBy(name = "submit")
    public WebElement submit;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement succesVerify;

    @FindBy(partialLinkText = "Home")
    public WebElement home;

}
