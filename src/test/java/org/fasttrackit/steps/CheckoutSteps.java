package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CheckoutPage;
import org.junit.Assert;

public class CheckoutSteps extends BaseSteps{
    private CheckoutPage checkoutPage;
    @Step
    public void enterBillingDetailsAndPlaceOrder(String FirstName, String LastName, String Company, String StreetAddress, String City,String PostalCode,String Phone,String Email,String Comment){
        checkoutPage.setFirstNameField(FirstName);
        checkoutPage.setLastNameField(LastName);
        checkoutPage.setCompanyField(Company);
        checkoutPage.setAddress1Field(StreetAddress);
        checkoutPage.setCityField(City);
        checkoutPage.setPostalCodeField(PostalCode);
        checkoutPage.setPhoneField(Phone);
        checkoutPage.setEmailField(Email);
        checkoutPage.setOrderCommentsField(Comment);
        checkoutPage.clickPlaceOrderBtn();
    }
    @Step
    public void CheckOrderReceivedMessage(){
        Assert.assertTrue("Order received text is displayed ",checkoutPage.checkOrderReceivedText());
    }
}
