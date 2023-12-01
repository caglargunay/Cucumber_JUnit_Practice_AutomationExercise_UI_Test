package caglar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

import java.util.List;

public class ExpandTestingMainPage {


    public ExpandTestingMainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "search-input")
    public WebElement searchBox;

    @FindBy(id = "search-button")
    public WebElement searchBtn;

    @FindBy(css= "#examples a")
    public List<WebElement> elementList;



}
