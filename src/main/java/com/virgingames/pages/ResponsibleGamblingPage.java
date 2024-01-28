package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ResponsibleGamblingPage extends Utility
{
    private static final Logger log = LogManager.getLogger(ResponsibleGamblingPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Gamble Responsibly at Virgin Games']")
    WebElement gambleText;

    public String verifyTextFromResponsibleGamblingPage()
    {
        Assert.assertEquals(gambleText.getText(),"Gamble Responsibly at Virgin Games" , "Verification of Gamble text");
        log.info("Verifying the Gamble Responsibly at Virgin Games text :" +gambleText);
        return getTextFromElement(gambleText);
    }

}
