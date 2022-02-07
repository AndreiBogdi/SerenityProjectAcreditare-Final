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
}
