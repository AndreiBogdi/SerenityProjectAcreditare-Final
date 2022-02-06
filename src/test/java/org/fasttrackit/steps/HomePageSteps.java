package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.HomePage;

public class HomePageSteps extends BaseSteps{
    private HomePage homePage;
    private CheckoutPage checkoutPage;

    @Step
    public void navigateToShopPage(){homePage.clickShopBtn();}

    @Step
    public void ReachCheckoutReturnToShop(){
        checkoutPage.pressCheckoutTabBtn();
        checkoutPage.pressReturnToShopBtn();
    }

}
