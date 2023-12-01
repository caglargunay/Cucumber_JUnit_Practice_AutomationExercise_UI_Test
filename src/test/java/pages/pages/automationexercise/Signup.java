package pages.pages.automationexercise;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utility.ConfigurationReader;
import utility.Driver;

public class Signup extends Base {
    public Signup(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//h2)[1]")
    public WebElement enterAccountElement;

    @FindBy(id = "id_gender1")
    public WebElement titleMr;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id="days")
    public WebElement selectDay;

    @FindBy (id = "months")
    public WebElement selectMonth;

    @FindBy (id = "years")
    public WebElement selectYear;

    @FindBy (id = "newsletter")
    public WebElement newsletter;

    @FindBy (id = "optin")
    public WebElement receiveSpecial;

    @FindBy (id = "first_name")
    public WebElement firstName;

    @FindBy (id = "last_name")
    public WebElement lastName;

    @FindBy(id = "company")
    public WebElement company;

    @FindBy(id = "address1")
    public WebElement adress;

   @FindBy(id = "address2")
   public WebElement adress2;

   @FindBy(id = "country")
    public WebElement selectCountry;

   @FindBy(id = "state")
    public WebElement state;

   @FindBy (id = "city")
    public WebElement city;

   @FindBy (id = "zipcode")
    public WebElement zipcode;

   @FindBy(id = "mobile_number")
    public WebElement mobileNumber;

 @FindBy (xpath = "//button[@data-qa='create-account']")
    public WebElement createButton;


 public void fillTheForm(){

     Faker faker=new Faker();


      //9. Fill details: Title, Name, Email, Password, Date of birth
        titleMr.click();
        String passwordPro= ConfigurationReader.getProperties("password");
        password.sendKeys(passwordPro);

        Select select1=new Select(selectDay);
        select1.selectByIndex(27);

        Select select2=new Select(selectMonth);
        select2.selectByValue("4");

        Select select3=new Select(selectYear);
        select3.selectByValue("1987");


        //10. Select checkbox 'Sign up for our newsletter!'
        newsletter.click();

        //11. Select checkbox 'Receive special offers from our partners!'
        receiveSpecial.click();

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        firstName.sendKeys(faker.name().firstName());
        lastName.sendKeys(faker.name().lastName());
        company.sendKeys(faker.company().name());
        adress.sendKeys(faker.address().streetName());
        adress2.sendKeys(faker.address().buildingNumber());

        Select select4=new Select(selectCountry);
        select4.selectByIndex(3);

        state.sendKeys(faker.address().state());
        city.sendKeys(faker.address().cityName());
        //city.sendKeys(faker.address().cityName().replace(" ",""));
        zipcode.sendKeys(faker.address().zipCode());
        //zipcode.sendKeys(faker.address().zipCode().replace("-",""));
        mobileNumber.sendKeys(faker.phoneNumber().cellPhone());

        //13. Click 'Create Account button'
     //   createButton.click();
 }

}
