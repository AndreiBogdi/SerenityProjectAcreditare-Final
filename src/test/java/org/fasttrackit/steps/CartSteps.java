package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.junit.Assert;


public class CartSteps extends BaseSteps{
    private CartPage cartPage;

    @Step
    public void PressCheckoutBtn(){cartPage.PressCheckoutButton();}

    @Step
    public void PressUndoBtn(){cartPage.pressUndoButton();}

    @Step
    public void CheckViewCartbutton(){
        Assert.assertTrue("Checkout section is reached by pressing 'View Cart' button",cartPage.CheckoutBtnDisplayed());
    }

    @Step
    public void CheckProductInCart(){
        Assert.assertTrue("Products should be added back in cart",cartPage.checkProductInCart());
    }

}
