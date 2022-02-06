package org.fasttrackit.steps;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ShopPage;
import org.junit.Assert;

public class ShopSteps extends BaseSteps {
    private ShopPage shopPage;

    @Step
    public void OpenProductBeanie(){shopPage.pressProductBeanie();}

    @Step
    public void OpenProductAlbum(){shopPage.pressProductAlbum();}

    @Step
    public void AddProductToCartandRemove(){
        shopPage.pressAddToCart();
        shopPage.pressCartControl();
        shopPage.pressRemoveFromCartBtn1();
    }

    @Step
    public void checkAddtoCartMessage(){
        Assert.assertTrue("expected message: Beanie has been added to your cart",productPage.checkAddToCartMessageDisplayed());
    }
    @Step
    public void productRemovedMessage(){
        Assert.assertTrue("",shopPage.productRemovedMessage());
    }

    @Step
    public void checkSortButtonDisplayed(){
        Assert.assertTrue("",shopPage.SortByBtnDisplayed());
    }

}