package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class ProductPage extends BasePage {

    @FindBy(css = ".single_add_to_cart_button")
    private WebElementFacade AddToCartBtn;

    @FindBy(id = "quantity_61fac630b64cc")
    private WebElementFacade QuantityField;

    public int setQuantityField(int quantity){
        waitFor(QuantityField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(QuantityField);
        typeInto(QuantityField, String.valueOf(quantity));

        return quantity;
    }

    public void clickAddToCartBtn(){clickOn(AddToCartBtn);}





}
