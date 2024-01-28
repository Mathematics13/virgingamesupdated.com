package com.virgingames.pages;

import com.virgingames.propertyreader.PropertyReader;
import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends Utility
{
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "(//label[@class='dialog_button'])[2]")
    WebElement acceptAllCookies;

    @CacheLookup
    @FindBy(xpath="//a[normalize-space()='Responsible Gambling']")
    WebElement responsibleGambling;

    public void verifyHomePage()
    {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = PropertyReader.getInstance().getProperty("baseUrl");
        log.info("Verifying Homepage Url");
        Assert.assertEquals(actualUrl,expectedUrl,"Home Page Url");
    }

    public void clickOnAcceptAllCookies()
    {
        clickOnElement(acceptAllCookies);
    }
    public void scrollDownToResponsibleGambling() throws InterruptedException
    {
       Point coordinates =  responsibleGambling.getLocation();
       int x = coordinates.getX();
       int y = coordinates.getY();
        System.out.println("X coordinates of Responsible Gambling : " +x);
        System.out.println("Y coordinates of Responsible Gambling : " +y);
        Thread.sleep(6000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;                          //Scroll By on Y axis , x=0 , y = positive(opposite)
        jse.executeScript("window.scrollBy(0, "+y+")");                         //Always enclosed in double quotes
        log.info("Scrolling down to Responsible Gambling :" + responsibleGambling);
    }
    public String getTextFromResponsibleGambling()
    {
        Assert.assertEquals(responsibleGambling.getText(),"Responsible Gambling" ,"Verification of Responsible Gambling text");
        log.info("Getting text from responsible Gambling :" +responsibleGambling);
        return getTextFromElement(responsibleGambling);
    }

    public void clickOnResponsibleGambling()
    {
        clickOnElement(responsibleGambling);
        log.info("Clicking onto Responsible Gambling : " +responsibleGambling);
    }
}
