package org.fasttrackit.features;

import org.apache.commons.lang3.RandomStringUtils;
import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void LogInWithValidCredentials(){
        String validRegisterEmail = RandomStringUtils.randomAlphanumeric(5);
        loginSteps.navigateToHomePage();
        loginSteps.navigateToMyAccountPage();
        loginSteps.enterCredentials(validRegisterEmail + "@mailinator.com",RandomStringUtils.randomAlphanumeric(10));
        loginSteps.ClickLogIn();
        registerSteps.checkUserIsRegisteredContain(validRegisterEmail);
    }

    @Test
    public void LogInWithInvalidCredentials(){
        String validRegisterEmail = RandomStringUtils.randomAlphanumeric(5);
        loginSteps.navigateToMyAccountPage();
        loginSteps.enterCredentials(validRegisterEmail + "mailinator.com",RandomStringUtils.randomAlphanumeric(10));
        loginSteps.ClickLogIn();
        loginSteps.checkUserLoginvalid();
    }


}
