package com.letskodeit.learn.pages;

import com.letskodeit.learn.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {


    By loginLink = By.xpath("//a[@class='navbar-link fedora-navbar-link']");
    By practiceLink = By.xpath("//a[@class='fedora-navbar-link navbar-link']");
    By signUpLink = By.xpath("//a[@id='header-sign-up-btn']");
    By welcomeText = By.xpath("//h2[@class='headline']");


    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void clickOnPracticeLink() {
        clickOnElement(practiceLink);
    }

    public void clickOnSignUpLink() {
        clickOnElement(signUpLink);
    }

    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }

}
