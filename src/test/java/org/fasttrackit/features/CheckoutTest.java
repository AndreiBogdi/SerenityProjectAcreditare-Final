package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class CheckoutTest extends BaseTest{


    @Test
    public void ReachCheckout(){
        loginSteps.LogIn();
        homepageSteps.navigateToShopPage();
        shopSteps.OpenProductAlbum();
        productPageSteps.clickAddProductToCart();
        productPageSteps.clickViewCart();
        cartSteps.CheckViewCartbutton();

    }
    @Test
    public void Checkout(){
        loginSteps.LogIn();
        homepageSteps.navigateToShopPage();
        shopSteps.OpenProductAlbum();
        productPageSteps.clickAddProductToCart();
        productPageSteps.clickViewCart();
        cartSteps.PressCheckoutBtn();
        checkoutSteps.enterBillingDetailsAndPlaceOrder("Anrei","Nica","Pini's","Strada 1","Cluj-Napoca","134500","075613412423","andreinyca@yahoo.com","Call when you arrive ");
        checkoutSteps.CheckOrderReceivedMessage();


    }

    @Test
    public void ReachCheckoutReturnToShop(){
        homepageSteps.ReachCheckoutReturnToShop();
        shopSteps.checkSortButtonDisplayed();
    }
    @Test
    public void CheckoutDownloadableContent(){
        loginSteps.LogIn();
        homepageSteps.navigateToShopPage();
        shopSteps.OpenProductAlbum();
        productPageSteps.clickAddProductToCart();
        productPageSteps.clickViewCart();
        cartSteps.PressCheckoutBtn();
        checkoutSteps.enterBillingDetailsAndPlaceOrder("Anrei","Nica","Pini's","Strada 1","Cluj-Napoca","134500","075613412423","andreinyca@yahoo.com","Call when you arrive ");
        loginSteps.navigateToMyAccountPage();
        accountPageSteps.PressDownloadsBtn();
        accountPageSteps.checkNoDownloadsMsg();

    }
}
