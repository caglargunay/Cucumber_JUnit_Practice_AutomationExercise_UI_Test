package pages.pages.automationexercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class AccountCreated extends Base {
    public AccountCreated (){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//h2[@data-qa='account-created']/b")
    public WebElement accountCreated;

  @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueBtn;
}
