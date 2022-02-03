package org.fasttrackit.features;

import org.junit.Test;

public class AddToCart extends BaseTest {
  //  private LoginSteps loginSteps;
 //   private HomePageSteps homePageSteps;
 //   private CartSteps cartSteps;

    @Test
    public void AddProductToCart(){
        loginSteps.LogIn();
       homepageSteps.navigateToShopPage();
       shopSteps.OpenProductBeanie();
        productPageSteps.clickAddProductToCart();
        shopSteps.checkAddtoCartMessage();


    }
}
