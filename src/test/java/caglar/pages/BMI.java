package caglar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class BMI {
    public BMI (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "gender")
    public WebElement genderDropDpwn;

    @FindBy(id = "age")
    public WebElement age;

    @FindBy(id = "height")
    public WebElement height;

    @FindBy(id = "weight")
    public WebElement weight;

    @FindBy(css = "button.btn-primary")
    public WebElement calculateBtn;

    @FindBy(id = "BMI")
    public WebElement bmi;
}
