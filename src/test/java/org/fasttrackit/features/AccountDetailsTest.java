package org.fasttrackit.features;

import org.junit.Test;

public class AccountDetailsTest extends BaseTest{

    @Test
    public void AddAccountDetails(){
        loginSteps.LogIn();
        accountPageSteps.PressAccountDetails();
        accountPageSteps.enterAccountDetails("Andrei","Nica");
        accountPageSteps.PressSaveChangesBtn();
        accountPageSteps.MessageSaveChanges();

    }

    @Test
    public void AccountDetailsSaved(){
        loginSteps.LogIn();
        accountPageSteps.PressAccountDetails();
        accountPageSteps.enterAccountDetails("Andrei","Nica");
        accountPageSteps.PressSaveChangesBtn();
        accountPageSteps.MessageSaveChanges();
        accountPageSteps.pressLogOut();
        loginSteps.LogIn();
        accountPageSteps.PressAddresses();
        accountPageSteps.SaveChangesWhenLogOut();
    }

    @Test
    public void ReachShippingAddress(){
        loginSteps.LogIn();
        accountPageSteps.PressAddresses();
        accountPageSteps.PressEdit();
        accountPageSteps.enterShippingAddressInfo("Alex","Dumitru","Pietroaiei","Suceava","133424");
        accountPageSteps.PressSaveAddress();
        accountPageSteps.PressAddresses();
        accountPageSteps.EnteredShippingAddress();
    }
}
