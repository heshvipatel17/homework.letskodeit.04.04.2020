package com.letskodeit.learn.pages;

import com.letskodeit.learn.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    @FindBy(xpath = "//a[@class='navbar-link fedora-navbar-link']")
    WebElement _loginLink;

    @FindBy(xpath = "//a[@class='fedora-navbar-link navbar-link']")
    WebElement _practiceLink;

    @FindBy(xpath = "//a[@id='header-sign-up-btn']")
    WebElement _signUpLink;

    @FindBy(xpath = "//h2[@class='headline']")
    WebElement _welcomeText;


    public void clickOnLoginLink() {
        Reporter.log(" Click on login link " + _loginLink.toString() + "<br>");
        clickOnElement(_loginLink);
        log.info("Click on login link " + _loginLink.toString());
    }

    public void clickOnPracticeLink() {
        Reporter.log(" Click on practice link " + _practiceLink.toString() + "<br>");
        clickOnElement(_practiceLink);
        log.info(" Click on practice link " + _practiceLink.toString());
    }

    public void clickOnSignUpLink() {
        Reporter.log(" Click on sign up link" + _signUpLink.toString() + "<br>");
        clickOnElement(_signUpLink);
        log.info(" Click on sign up link" + _signUpLink.toString());
    }

    public void getWelcomeText(String welcomeTxt) {
        Reporter.log(" Assert welcome text" + welcomeTxt+ "displayed on home page"+ _welcomeText.toString() +  "<br>");
        verifyText(_welcomeText, welcomeTxt );
        log.info(" Assert welcome text" + welcomeTxt+ "displayed on home page"+ _welcomeText.toString());
    }

}
