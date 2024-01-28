package com.virgingames.steps;

import com.virgingames.propertyreader.PropertyReader;
import com.virgingames.utility.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Utility
{
    @Before                                                                                                  //from cucumber.java not testng
    public void setUp()
    {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After                                                                                               //from cucumber.java not testng
    public void tearDown(Scenario scenario)
    {
        if(scenario.isFailed())
        {
            final byte[] screenshot = getScreenShot();
            scenario.attach(screenshot , "image/png" ,scenario.getName());              //screenshot only if test failed
        }
        closeBrowser();                                                                  //This method will always execute whether pass or fail
    }
}
