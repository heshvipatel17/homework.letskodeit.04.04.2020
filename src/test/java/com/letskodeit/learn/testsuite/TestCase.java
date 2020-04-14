package com.letskodeit.learn.testsuite;

import com.letskodeit.learn.pages.HomePage;
import com.letskodeit.learn.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCase extends TestBase {
    HomePage homepage = new HomePage();

    @Test(priority = 0, groups = {"Sanity","Regression"})
    public void verifyUserShouldClickOnLoginLink() {
        homepage.clickOnLoginLink();
    }

    @Test(priority = 1, groups = {"Sanity","Regression"})
    public void verifyUserShouldClickOnPracticeLink() {
        homepage.clickOnPracticeLink();
    }

    @Test(priority = 2, groups = {"Smoke","Regression"})
    public void verifyUserShouldClickOnSignUpLink() {
        homepage.clickOnSignUpLink();
    }

    @Test(priority = 3, groups = {"Smoke","Regression"})
    public void verifyUserShouldGetWelcomeText() {
        homepage.getWelcomeText();
        String expectedText = "Welcome to Let's Kode It";
        String actualText = homepage.getWelcomeText();
        Assert.assertEquals(expectedText,actualText);
    }

}
