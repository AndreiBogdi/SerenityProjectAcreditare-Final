package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("http://qa2.fasttrackit.org:8008")
public class HomePage extends BasePage {




        @FindBy(css = "#menu-item-64 > a:nth-child(1)")
        private WebElementFacade accountLink;

        @FindBy(css = "#menu-item-66 > a:nth-child(1)")
        private WebElementFacade ShopBtn;

        public void clickAccountLink() {
            clickOn(accountLink);
        }

        public void clickShopBtn(){clickOn(ShopBtn);}

        @FindBy(css = "div.item:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > img:nth-child(1)")
        WebElementFacade ProductBeanie;

        public void pressProductBeanie(){clickOn(ProductBeanie);}


}
