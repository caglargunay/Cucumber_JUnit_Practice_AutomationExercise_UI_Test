package caglar.pages.automationexercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.ConfigurationReader;
import utility.Driver;

public class Login extends Base{
    public Login (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@name='name']")
    public WebElement signUpName;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement signUpEmail;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement submit;

    @FindBy(xpath = "(//h2)[3]")
    public WebElement signupVerify;

    @FindBy(xpath ="(//input[@name='email'])[1]" )
    public WebElement loginEmail;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public  WebElement loginPassword;


    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginClick;

    @FindBy(xpath = "(//h2)[1]")
    public WebElement loginVerify;

    @FindBy(xpath = "//p[@style]")
    public WebElement redError;

    String name= ConfigurationReader.getProperties("username");
    String password= ConfigurationReader.getProperties("password");
    String mail=ConfigurationReader.getProperties("email");

    @FindBy (xpath = "//p[.='Email Address already exist!']")
    public WebElement accountAlreadyExist;




    public void login(){
        loginEmail.sendKeys(mail);
        loginPassword.sendKeys(password);
        loginClick.click();
    }
    public void login(String email, String pass){
        loginEmail.sendKeys(email);
        loginPassword.sendKeys(pass);
        loginClick.click();
    }

    public  void goToSignup(){
        signUpName.sendKeys(name);
        signUpEmail.sendKeys(mail);
        submit.click();
    }

    public void createdUser(){
        Driver.getDriver().get("https://www.automationexercise.com/login");
    login();

       try {
          redError.isDisplayed();

       }catch (RuntimeException e){

           Signup signup=new Signup();
            signup.fillTheForm();
            Driver.getDriver().get("https://www.automationexercise.com/");
           System.out.println("Account is now created");
           AccountCreated accountCreated=new AccountCreated();
           accountCreated.continueBtn.click();


       }
       //Driver.closeDriver();


    }


}
