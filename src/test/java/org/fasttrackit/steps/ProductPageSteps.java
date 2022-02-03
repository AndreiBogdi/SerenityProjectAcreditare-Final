package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.ProductPage;

public class ProductPageSteps extends BaseSteps {
    private CartPage cartPage;
    private ProductPage productPage;

    @Step
    public void navigateToMyAccountPage(){
        homePage.clickAccountLink();
    }

    @Step
    public void Quantity(){
        productPage.setQuantityField(3);
    }

    @Step
    public void clickAddProductToCart(){
        productPage.clickAddToCartBtn();
    }

    @Step
    public void xQuantityAddToCart(){
        productPage.setQuantityField(3);
        productPage.clickAddToCartBtn();
    }

    @Step
    public void clickViewCart(){productPage.clickViewCartBtn();}






    @Step
    public void navigateToCart() {
      //  homePage.clickOnCartIcon();
       // homePage.clickOnViewShoppingCartLink();
    }

    @Step
    public void checkSubtotalPriceIsDisplayedCorrectly(){
    //    Assert.assertTrue("The subtotal price is not correct!",cartPage.isSubtotalPriceCorrect());
    }

    @Step
    public void checkGrandTotalPriceIsCorrect(){
   //     Assert.assertTrue("Total price not correct", cartPage.isGrandTotalPriceCorrect());
    }
}
