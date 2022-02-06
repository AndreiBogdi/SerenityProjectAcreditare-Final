package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
public class ShopPage extends BasePage{

    @FindBy(css = "div.item:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > img:nth-child(1)")
    WebElementFacade ProductBeanie;

    public void pressProductBeanie(){clickOn(ProductBeanie);}

    @FindBy(css = "div.item:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > img:nth-child(1)")
    WebElementFacade ProductAlbum;

    @FindBy(css = "div.item:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > a:nth-child(1)")
    WebElementFacade AddToCartButtonBelt;
    public void pressAddToCart(){clickOn(AddToCartButtonBelt);}

    public void pressProductAlbum() {clickOn(ProductAlbum);}

    @FindBy(css = "td.product-remove > a:nth-child(1)")
    WebElementFacade removeFromCartBtn1;
    public void pressRemoveFromCartBtn1(){clickOn(removeFromCartBtn1);}

    @FindBy(css =".woocommerce-mini-cart__empty-message")
    WebElementFacade noItemsMessage;

    public boolean checkNoItemsMessage(){return noItemsMessage.isDisplayed();}

    @FindBy(css =".cart-control > span:nth-child(2)")
    WebElementFacade cartControl;
    public void pressCartControl(){clickOn(cartControl);}

    @FindBy(css =".woocommerce-message")
    WebElementFacade productRemoveMessage;
    public boolean productRemovedMessage(){return productRemoveMessage.isDisplayed();}

    @FindBy(css = ".orderby")
    WebElementFacade SortByBtn;
    public boolean SortByBtnDisplayed(){return SortByBtn.isDisplayed();}


}
