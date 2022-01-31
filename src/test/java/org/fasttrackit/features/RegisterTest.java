package org.fasttrackit.features;
import org.apache.commons.lang3.RandomStringUtils;
import org.fasttrackit.features.BaseTest;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void registerWithValidCredentialsTest(){
        String validRegisterEmail = RandomStringUtils.randomAlphanumeric(5);
        registerSteps.navigateToMyAccountPage();
        registerSteps.enterCredentials(validRegisterEmail +"@mailinator.com",RandomStringUtils.randomAlphanumeric(10));
        registerSteps.clickRegister();
        //registerSteps.checkUserIsRegistered(validRegisterEmail);
        registerSteps.checkUserIsRegisteredContain(validRegisterEmail);

    }

    @Test
    public void registerWithInvalidCredentials(){
        //registerSteps.navigateToHomePage();
        registerSteps.navigateToMyAccountPage();
        registerSteps.enterCredentials("sasdaass@yahoo.com","saaxa21sda");
        registerSteps.clickRegister();
        registerSteps.checkUserIsRegisteredInvalidCredentials("sasdaass");
    }

    @Test
    public void checkRegisterInvalidCredentials(){
        registerSteps.navigateToMyAccountPage();
        loginSteps.LoggedIn("sasdaa");
    }
}
