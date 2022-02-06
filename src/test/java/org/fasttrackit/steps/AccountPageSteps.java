package org.fasttrackit.steps;


import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class AccountPageSteps extends BaseSteps{
    @Step
    public void PressAccountDetails(){
        myAccountPage.clickAccountDetails();
    }

    @Step
    public void PressAddresses(){
        myAccountPage.clickAddressesBtn();
    }

    @Step
    public void enterAccountDetails(String FirstName, String LastName){
        myAccountPage.setFirstNameField(FirstName);
        myAccountPage.setLastNameField(LastName);
    }
    @Step
    public void PressSaveChangesBtn(){
        myAccountPage.clickSaveChangesBtn();
    }

    @Step
    public void MessageSaveChanges(){
        Assert.assertTrue("'Account details changed successfully' message should be displayed",myAccountPage.checkSaveChangesMessageDisplayed());
    }

    @Step
    public void pressLogOut(){
        myAccountPage.clickLogOut();
    }
    @Step
    public void PressEdit(){
        myAccountPage.clickEditBtn();
    }

    @Step
    public void enterShippingAddressInfo(String FirstName, String LastName, String StreetAddress,String City, String ZIP){
        myAccountPage.setFirstNameShippingField(FirstName);
        myAccountPage.setLastNameShippingField(LastName);
        myAccountPage.setStreetAddressField(StreetAddress);
        myAccountPage.setCityField(City);
        myAccountPage.setZIPField(ZIP);
    }
    @Step
    public void PressSaveAddress(){
        myAccountPage.clickSaveAddressBtn();
    }

    @Step
    public void SaveChangesWhenLogOut(){
        Assert.assertTrue("User's name should be displayed",myAccountPage.checkChangesSaved());
    }

    @Step
    public void EnteredShippingAddress(){
        Assert.assertTrue("The address that was typed should be displayed",myAccountPage.checkEnteredAddress());
    }

    @Step
    public void checkLoginButtonDisplayed(){
        Assert.assertTrue("Login button is displayed",myAccountPage.checkLogInButton());
    }



}
