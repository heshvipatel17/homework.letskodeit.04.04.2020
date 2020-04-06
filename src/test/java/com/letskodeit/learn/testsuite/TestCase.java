package com.letskodeit.learn.testsuite;

import com.letskodeit.learn.pages.HomePage;
import com.letskodeit.learn.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCase extends TestBase {
    HomePage homepage = new HomePage();

    @Test
    public void verifyUserShouldClickOnLoginLink() {
        homepage.clickOnLoginLink();
    }

    @Test
    public void verifyUserShouldClickOnPracticeLink() {
        homepage.clickOnPracticeLink();
    }

    @Test
    public void verifyUserShouldClickOnSignUpLink() {
        homepage.clickOnSignUpLink();
    }

    @Test
    public void verifyUserShouldGetWelcomeText() {
        homepage.getWelcomeText();
        String expectedText = "Welcome to Let's Kode It";
        String actualText = homepage.getWelcomeText();
        Assert.assertEquals(expectedText,actualText);
    }

}
