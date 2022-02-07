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

        @FindBy(css = ".search-box > i:nth-child(1)")
        private WebElementFacade SearchIcon;
        public void clickSearchIcon(){clickOn(SearchIcon);}

        @FindBy(css = ".search-form > input:nth-child(1)")
        private WebElementFacade SearchField;
        public void setSearchField(String value){
                typeInto(SearchField,value);
        }

        @FindBy(css = ".search-form > button:nth-child(2) > i:nth-child(1)")
        private WebElementFacade SearchIcon2;
        public void clickSearchIcon2(){clickOn(SearchIcon2);}

        @FindBy(css = ".entry-title > a:nth-child(2)")
        private WebElementFacade HoodieZipperProduct;
        public boolean checkHoodieZipperDisplayed(){return HoodieZipperProduct.isDisplayed();}


}
