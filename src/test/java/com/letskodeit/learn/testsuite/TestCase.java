package com.letskodeit.learn.testsuite;

import com.letskodeit.learn.pages.HomePage;
import com.letskodeit.learn.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestCase extends TestBase {
    HomePage homePage;

    @BeforeMethod(groups = {"Regression", "Smoke", "Sanity"})
    public void setUp() {
        homePage = new HomePage();
    }

    @Test(priority = 0, groups = {"Sanity", "Regression", "Smoke"})
    public void verifyUserShouldClickOnLoginLink() {
        homePage.clickOnLoginLink();
    }

    @Test(priority = 1, groups = {"Sanity", "Regression"})
    public void verifyUserShouldClickOnPracticeLink() {
        homePage.clickOnPracticeLink();
    }

    @Test(priority = 2, groups = {"Smoke", "Regression"})
    public void verifyUserShouldClickOnSignUpLink() {
        homePage.clickOnSignUpLink();
    }

    @Test(priority = 3, groups = {"Regression"})
    public void verifyUserShouldGetWelcomeText() {
        homePage.getWelcomeText("Welcome to Let's Kode It");
    }

}
