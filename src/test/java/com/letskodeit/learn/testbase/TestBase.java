package com.letskodeit.learn.testbase;

import com.letskodeit.learn.basepage.BasePage;
import com.letskodeit.learn.browserselector.BrowserSelector;
import com.letskodeit.learn.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {

    //object creation
    LoadProperty loadProperty = new LoadProperty();
    BrowserSelector browserSelector = new BrowserSelector();

    //getting "baseUrl" & "browser" values from config.properties
    String baseUrl = loadProperty.getProperty("baseUrl");
    String browser = loadProperty.getProperty("browser");

    //open browser
    @BeforeMethod(groups = {"Regression", "Sanity", "Smoke"})
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
//        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }
    //close browser
    @AfterMethod(groups = {"Regression", "Sanity", "Smoke"})
    public void tearDown() {
        driver.quit();

    }
}


