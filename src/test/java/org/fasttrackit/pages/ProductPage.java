package org.fasttrackit.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import javax.swing.text.View;
import java.time.Duration;

public class ProductPage extends BasePage {
    @FindBy(css = ".single_add_to_cart_button")
    private WebElementFacade AddToCartBtn;

    @FindBy(id = "quantity_61fac630b64cc")
    private WebElementFacade QuantityField;

    @FindBy(css = ".woocommerce-message")
    private WebElementFacade AddToCartMessage;

    @FindBy(css = "#tab-title-reviews > a:nth-child(1)")
    private WebElementFacade ReviewBtn;

    @FindBy(id ="comment")
    private WebElementFacade ReviewTypeField;

    @FindBy(css = ".star-4")
    private WebElementFacade ForStars;

    @FindBy(css = "#submit")
    private WebElementFacade SubmitBtn;

    @FindBy(css = ".woocommerce-review__awaiting-approval")
    private WebElementFacade myReview;

    @FindBy(css = "#error-page > p:nth-child(2)")
    private WebElementFacade ReviewErrorMsg;

    @FindBy(css = ".cart-control")
    private WebElementFacade ViewCartBtn;

    public void clickViewCartBtn(){clickOn(ViewCartBtn);}

    public void clickSubmitBtn(){clickOn(SubmitBtn);}

    public void clickForStars(){clickOn(ForStars);}

    public boolean checkReviewPosted(){return myReview.isDisplayed();}

    public boolean checkReviewErrorMessage(){return ReviewErrorMsg.isDisplayed();}

    public void setReviewComment(String comment){
        waitFor(ReviewTypeField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(ReviewTypeField);
        typeInto(ReviewTypeField,String.valueOf(comment));
    }

    public int setQuantityField(int quantity){
        waitFor(QuantityField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(QuantityField);
        typeInto(QuantityField, String.valueOf(quantity));

        return quantity;
    }

    public void clickAddToCartBtn(){clickOn(AddToCartBtn);}

    public void clickReviewBtn(){clickOn(ReviewBtn);}

    public boolean checkAddToCartMessageDisplayed(){return AddToCartMessage.isDisplayed();}





}
