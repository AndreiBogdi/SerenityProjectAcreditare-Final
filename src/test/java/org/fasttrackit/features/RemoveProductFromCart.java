package org.fasttrackit.features;

import org.junit.Test;

public class RemoveProductFromCart extends BaseTest{
    @Test
    public void RemoveProductFromCart(){
        loginSteps.LogIn();
        homepageSteps.navigateToShopPage();
        shopSteps.AddProductToCartandRemove();
        shopSteps.productRemovedMessage();


    }

    @Test
    public void UndoRemoveProductFromCart(){
        loginSteps.LogIn();
        homepageSteps.navigateToShopPage();
        shopSteps.AddProductToCartandRemove();
        cartSteps.PressUndoBtn();
        cartSteps.CheckProductInCart();

    }
}
