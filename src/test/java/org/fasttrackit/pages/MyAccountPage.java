package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class MyAccountPage extends BasePage {

    @FindBy(id ="reg_email")
    private WebElementFacade EmailField;

    @FindBy(id ="reg_password")
    private WebElementFacade PassField;

    @FindBy(css =".woocommerce-FormRow > button:nth-child(3)")
    private WebElementFacade RegisterButton;

    @FindBy(id ="username")
    private WebElementFacade EmailFieldLogIn;

    @FindBy(id ="password")
    private WebElementFacade PassFieldLogIn;

    @FindBy(css = ".woocommerce-form > p:nth-child(3) > button:nth-child(3)")
    private WebElementFacade LogInButton;

    @FindBy(css = ".woocommerce-MyAccount-content p:first-child")
    private WebElementFacade loginHelloMessageElement;

    @FindBy(css = "#post-7 > div > div > ul")
    private WebElementFacade LoginErrorMessage;

    @FindBy(css = "#rememberme")
    private WebElementFacade RememberMeBtn;

    @FindBy(css = "li.woocommerce-MyAccount-navigation-link:nth-child(5) > a:nth-child(1)")
    private WebElementFacade AccountDetailsBtn;

    @FindBy(id = "account_first_name")
    private WebElementFacade FirstNameField;

    public void setFirstNameField(String FirstName){
        waitFor(FirstNameField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(FirstNameField);
        typeInto(FirstNameField, FirstName);
    }

    @FindBy(id = "account_last_name")
    private WebElementFacade LastNameField;

    public void setLastNameField(String LastName){
        waitFor(LastNameField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(LastNameField);
        typeInto(LastNameField, LastName);
    }

    @FindBy(css = ".woocommerce-Button")
    private WebElementFacade SaveChangesBtn;
    public void clickSaveChangesBtn(){clickOn(SaveChangesBtn);}

    @FindBy(css = ".woocommerce-message")
    private WebElementFacade SaveChangesMsg;

    public boolean checkSaveChangesMessageDisplayed(){return SaveChangesMsg.isDisplayed();}

    @FindBy(css = "li.woocommerce-MyAccount-navigation-link:nth-child(6) > a:nth-child(1)")
    private WebElementFacade LogOutBtn;
    public void clickLogOut(){clickOn(LogOutBtn);}

    @FindBy(css = "li.woocommerce-MyAccount-navigation-link:nth-child(4) > a:nth-child(1)")
    private WebElementFacade AddressesBtn;
    public void clickAddressesBtn(){clickOn(AddressesBtn);}

    @FindBy(css = ".u-column1 > address:nth-child(2)")
    private WebElementFacade newChanges;

    public boolean checkChangesSaved(){return newChanges.isDisplayed(); }

    @FindBy(css = ".u-column2 > header:nth-child(1) > a:nth-child(2)")
    private WebElementFacade EditBtn;
    public void clickEditBtn(){clickOn(EditBtn);}

    @FindBy(id = "shipping_first_name")
    private WebElementFacade FirstNameShippingField;
    public void setFirstNameShippingField(String FirstName){
        waitFor(FirstNameShippingField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(FirstNameShippingField);
        typeInto(FirstNameShippingField,FirstName);
    }

    @FindBy(id = "shipping_last_name")
    private WebElementFacade LastNameShippingField;
    public void setLastNameShippingField(String LastName){
        waitFor(LastNameShippingField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(LastNameShippingField);
        typeInto(LastNameShippingField,LastName);
    }

    @FindBy(id = "shipping_city")
    private WebElementFacade CityField;
    public void setCityField(String City){
        waitFor(CityField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(CityField);
        typeInto(CityField, City);
    }

    @FindBy(id = "shipping_address_1")
    private WebElementFacade StreetAddressField;
    public void setStreetAddressField(String StreetAddress){
        waitFor(StreetAddressField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(StreetAddressField);
        typeInto(StreetAddressField,StreetAddress);
    }

    @FindBy(id = "shipping_postcode")
    private WebElementFacade ZIPfield;
    public void setZIPField(String ZIP){
        waitFor(ZIPfield);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(ZIPfield);
        typeInto(ZIPfield,ZIP);

    }
    @FindBy(id = ".entry-title")
    private WebElementFacade AddressesTitle;

    public boolean checkEnteredAddress(){return AddressesTitle.isDisplayed();}

    @FindBy(css = "button.button")
    private WebElementFacade SaveAddressBtn;
    public void clickSaveAddressBtn(){clickOn(SaveAddressBtn);}

    @FindBy(css = ".woocommerce-form > p:nth-child(3) > button:nth-child(3)")
    private WebElementFacade LoginBtn;
    public boolean checkLogInButton(){return LoginBtn.isDisplayed();}


    public boolean checkUserLoggedIn(String userName) {
        loginHelloMessageElement.shouldContainOnlyText("Hello " + userName + "!");
        return false;

    }

    public boolean checkUSerRegister(String userName){
       return loginHelloMessageElement.containsText("Hello " + userName) ;
    }

    public boolean checkUSerRegisterrDisplayed(){
        return loginHelloMessageElement.isDisplayed() ;
    }

    public boolean CheckLogInDisplayed(){
        return LoginErrorMessage.isDisplayed();
    }

    public void setEmailField(String email){
        waitFor(EmailField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(EmailField);
        typeInto(EmailField,email);

    }

    public void setEmailFieldLogIn(String username){
        waitFor(EmailFieldLogIn);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(EmailFieldLogIn);
        typeInto(EmailFieldLogIn,username);

    }
    @FindBy(css = "li.woocommerce-MyAccount-navigation-link:nth-child(3) > a:nth-child(1)")
    private WebElementFacade DownloadsBtn;
    public void clickDownloadsBtn(){clickOn(DownloadsBtn);}

    @FindBy(css = ".woocommerce-Message")
    private WebElementFacade noDownloadsMsg;
    public boolean checkNoDownloadsMsgdisplayed(){return noDownloadsMsg.isDisplayed();}


    public void setPasswordField(String pass){
        typeInto(PassField, pass);
    }
    public void setPasswordFieldLogIn(String pass){
        typeInto(PassFieldLogIn, pass);
    }

    public void clickRegisterButton(){
        clickOn(RegisterButton);
    }
    public void clickLogInButton(){
        clickOn(LogInButton);
    }
    public void clickRememberMeBtn() {clickOn(RememberMeBtn);}
    public void clickAccountDetails(){clickOn(AccountDetailsBtn);}
}
