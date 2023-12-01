package utility;


import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import java.time.Duration;

public class BrowserUtility {

    public static void sleep(int second){

        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void waitForVisibilityOf(WebElement webElement){
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void waitForInVisibilityOf(WebElement webElement){
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }



    public static void waitForInvisibilityOf(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));

    }
    public static void verifyIsPageLoaded(){
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        boolean result= js.executeScript("return document.readyState").equals("complete");
        Assert.assertTrue("Page is not completely loaded",result);
    }

    public static void alertAccept(){
        Alert alert= Driver.getDriver().switchTo().alert();
        alert.accept();
    }

    public static void alertDismiss(){
        Alert alert= Driver.getDriver().switchTo().alert();
        alert.dismiss();}


    public static void alertGetText(){
        Alert alert= Driver.getDriver().switchTo().alert();
        alert.getText();}


    public static void alertSendKeys(String text) {
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.sendKeys(text);
        alert.accept();
    }

    public static void alertSendKeysDismiss(String text) {
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.sendKeys(text);
        alert.dismiss();
    }

    public static void scrollDown(int  num){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,"+num+")");
    }

    public static void scrollByVerticalAutomatically(WebElement element){

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        int pixel=25;

        while (true) {
            try {
                element.click();

                return;
            } catch (RuntimeException e) {
                js.executeScript("window.scrollBy(0," + pixel + ")");

            }
        }

    }
    public static void verifyTitle(WebDriver driver , String expectedTitle) {

        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }

    public static void waitUntilTitleContains(String title){
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleContains(title));
    }
}
