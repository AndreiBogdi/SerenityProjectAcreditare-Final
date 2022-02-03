package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class CheckoutTest extends BaseTest{

    @Test
    public void validCheckout(){
    //    loginSteps.doLogin(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        //searchSteps.searchAndSelectProduct("SILVER DESERT NECKLACE");
      //  cartSteps.clickAddProductToCart();
    }

    @Test
    public void ReachCheckout(){
        loginSteps.LogIn();
        homepageSteps.navigateToShopPage();
        shopSteps.OpenProductAlbum();
        productPageSteps.clickAddProductToCart();
        productPageSteps.clickViewCart();
        cartSteps.CheckViewCartbutton();

    }
}
