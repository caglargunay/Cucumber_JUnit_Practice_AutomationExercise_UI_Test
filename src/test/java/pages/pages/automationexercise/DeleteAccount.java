package pages.pages.automationexercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class DeleteAccount extends Base {
    public DeleteAccount (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//h2[@data-qa='account-deleted']")
    public WebElement accountDeleted;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueBtnDelete;

}
