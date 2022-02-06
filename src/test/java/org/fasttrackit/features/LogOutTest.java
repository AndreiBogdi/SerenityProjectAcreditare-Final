package org.fasttrackit.features;

import org.junit.Test;

public class LogOutTest extends BaseTest{
    @Test
    public void Logout(){
        loginSteps.LogIn();
        accountPageSteps.pressLogOut();
        accountPageSteps.checkLoginButtonDisplayed();

    }
}
