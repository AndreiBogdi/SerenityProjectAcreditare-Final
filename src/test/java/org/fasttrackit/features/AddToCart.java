package org.fasttrackit.features;

import org.junit.Test;

public class AddToCart extends BaseTest {


    @Test
    public void AddProductToCart(){
        loginSteps.LogIn();
       homepageSteps.navigateToShopPage();
       shopSteps.OpenProductBeanie();
        productPageSteps.clickAddProductToCart();
        shopSteps.checkAddtoCartMessage();


    }
    @Test
    public void AddToCartLogOutCheckCart(){
        loginSteps.LogIn();
        homepageSteps.navigateToShopPage();
        shopSteps.OpenProductBeanie();
        productPageSteps.clickAddProductToCart();
        loginSteps.navigateToMyAccountPage();
        accountPageSteps.pressLogOut();
        loginSteps.LogIn();
        shopSteps.PressCartControl();
        cartSteps.CheckProductInCart();

    }
}
