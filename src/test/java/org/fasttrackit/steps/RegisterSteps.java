package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAccountPage;
import org.junit.Assert;

public class RegisterSteps extends ScenarioSteps {
    private HomePage homePage;
    private MyAccountPage myAccountPage;

    @Step
    public void navigateToHomePage(){homePage.open();}

    @Step
    public void navigateToMyAccountPage(){
        homePage.clickAccountLink();
    }

    @Step
    public void enterCredentials(String email, String pass){
        myAccountPage.setEmailField(email);
        myAccountPage.setPasswordField(pass);

    }

    @Step
    public void clickRegister(){myAccountPage.clickRegisterButton();}

    @Step
    public void checkUserIsRegistered(String userName){
       Assert.assertTrue("failed", myAccountPage.checkUSerRegister(userName)) ;

    }
    @Step
    public void checkUserIsRegisteredContain(String userName){
        Assert.assertTrue("failed", myAccountPage.checkUSerRegisterrDisplayed()) ;

    }

    @Step
    public void checkUserIsRegisteredInvalidCredentials(String userName){
        Assert.assertFalse("failed", myAccountPage.checkUSerRegisterrDisplayed()) ;

    }



}
