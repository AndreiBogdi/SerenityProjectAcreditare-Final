package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class CheckoutPage extends BasePage{

    @FindBy(id = "billing_first_name")
    private WebElementFacade FirstNameField;
    public void setFirstNameField(String FirstName){
        waitFor(FirstNameField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(FirstNameField);
        typeInto(FirstNameField,FirstName);
    }

    @FindBy(id = "billing_last_name")
    private WebElementFacade LastNameField;
    public void setLastNameField(String LastName){
        waitFor(LastNameField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(LastNameField);
        typeInto(LastNameField,LastName);
    }
    @FindBy(id = "billing_company")
    private WebElementFacade CompanyNameField;
    public void setCompanyField(String Company){
        waitFor(CompanyNameField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(CompanyNameField);
        typeInto(CompanyNameField,Company);
    }

    @FindBy(id = "billing_address_1")
    private WebElementFacade Address1Field;
    public void setAddress1Field(String Address1){
        waitFor(Address1Field);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(Address1Field);
        typeInto(Address1Field,Address1);
    }

    @FindBy(id = "billing_city")
    private WebElementFacade CityField;
    public void setCityField(String City){
        waitFor(CityField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(CityField);
        typeInto(CityField,City);
    }

    @FindBy(id = "billing_postcode")
    private WebElementFacade PostalCodeField;
    public void setPostalCodeField(String PostalCode){
        waitFor(PostalCodeField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(PostalCodeField);
        typeInto(PostalCodeField,PostalCode);
    }
    @FindBy(id = "billing_phone")
    private WebElementFacade PhoneField;
    public void setPhoneField(String Phone){
        waitFor(PhoneField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(PhoneField);
        typeInto(PhoneField,Phone);
    }
    @FindBy(id = "billing_email")
    private WebElementFacade emailField;
    public void setEmailField(String Email){
        waitFor(emailField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(emailField);
        typeInto(emailField,Email);
    }

    @FindBy(css = "#place_order")
    private WebElementFacade PlaceOrderBtn;
    public void clickPlaceOrderBtn(){clickOn(PlaceOrderBtn);}

    @FindBy(id = "order_comments")
    private WebElementFacade OrderCommentsField;
    public void setOrderCommentsField(String Comment){
        waitFor(OrderCommentsField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(OrderCommentsField);
        typeInto(OrderCommentsField,Comment);
    }

    @FindBy(css = ".entry-title")
    private WebElementFacade OrderReceivedText;
    public boolean checkOrderReceivedText(){return OrderReceivedText.isDisplayed();}

    @FindBy(css = "#menu-item-65 > a:nth-child(1)")
    private WebElementFacade CheckoutTabBtn;
    public void pressCheckoutTabBtn(){clickOn(CheckoutTabBtn);}

    @FindBy(css = ".button")
    private WebElementFacade ReturnToShopBtn;
    public void pressReturnToShopBtn(){clickOn(ReturnToShopBtn);}



}
