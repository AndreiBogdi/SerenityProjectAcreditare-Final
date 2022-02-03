package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(css = ".checkout-button")
    private WebElementFacade CheckoutBtn;

    public void PressCheckoutButton(){clickOn(CheckoutBtn);}
    public boolean CheckoutBtnDisplayed(){return CheckoutBtn.isDisplayed();}



}
