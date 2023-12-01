package pages.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class XfleetLoginPage {
    public XfleetLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "prependedInput")
    public WebElement inputUserName;

    @FindBy(id ="prependedInput2")
    public WebElement inputPassword;


    @FindBy(id="_submit")
    public WebElement loginButton;





}
