package pages.pages.automationexercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

import java.util.List;

public class Products extends Base{
    public Products(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//div[@id='cartModal']/following-sibling::div")
    public List<WebElement> list;

    @FindBy(xpath ="(//a[.='View Product'])[1]" )
    public WebElement firstProduct;

   // @FindBy(xpath = "(//h2)[3]")
    @FindBy(xpath = "(//div[@class='product-information']//h2)")
    public WebElement productName;

    @FindBy(xpath = "(//div[@class='product-information']//p)[1]")
    public WebElement categoryOfProduct;

    @FindBy(xpath = "//div[@class='product-information']//span//span")
    public WebElement priceOfProduct;

//    @FindBy(xpath = "(//p//b/..)[1]")

    @FindBy(xpath = "(//div[@class='product-information']//p)[2]")
    public WebElement availability;

  //  @FindBy(xpath = "(//p//b/..)[2]")
    @FindBy(xpath = "(//div[@class='product-information']//p)[3]")
    public WebElement condition;

  //  @FindBy(xpath = "(//p//b/..)[3]")
    @FindBy(xpath = "(//div[@class='product-information']//p)[4]")
    public WebElement brand;

    @FindBy(id = "search_product")
    public WebElement searchProduct;

    @FindBy(id = "submit_search")
    public WebElement searchSumbit;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement searchProducts;

    @FindBy(xpath = "//i[@class='fa fa-home']")
    public WebElement img1;


}
