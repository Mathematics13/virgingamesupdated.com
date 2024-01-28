package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.ResponsibleGamblingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GambleSteps
{
    @Given("I am on homepage and I verify url")
    public void iAmOnHomepageAndIVerifyUrl()
    {
        new HomePage().verifyHomePage();
    }

    @And("I accept all cookies in homepage")
    public void iAcceptAllCookiesInHomepage()
    {
        new HomePage().clickOnAcceptAllCookies();
    }

    @When("I scroll down to Responsible Gambling footer")
    public void iScrollDownToResponsibleGamblingFooter() throws InterruptedException
    {
        new HomePage().scrollDownToResponsibleGambling();
    }

    @Then("I verify {string} text")
    public void iVerifyText(String arg0)
    {
        new HomePage().getTextFromResponsibleGambling();
    }

    @And("I click on Responsible Gambling")
    public void iClickOnResponsibleGambling()
    {
        new HomePage().clickOnResponsibleGambling();
    }

    @Then("I navigate to Responsible gambling page")
    public void iNavigateToResponsibleGamblingPage()
    {
        new ResponsibleGamblingPage().verifyTextFromResponsibleGamblingPage();
    }

    @And("I verify the gambling text")
    public void iVerifyTheGamblingText()
    {
        new ResponsibleGamblingPage().verifyTextFromResponsibleGamblingPage();
    }
}
