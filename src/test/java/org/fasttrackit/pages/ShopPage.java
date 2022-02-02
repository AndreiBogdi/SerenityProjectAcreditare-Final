package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ShopPage extends BasePage{

    @FindBy(css = "div.item:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > img:nth-child(1)")
    WebElementFacade ProductBeanie;

    public void pressProductBeanie(){clickOn(ProductBeanie);}
}
