package org.fasttrackit.features;

import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.HomePageSteps;
import org.fasttrackit.steps.LoginSteps;
import org.junit.Test;

public class AddToCart extends BaseTest {
    private LoginSteps loginSteps;
    private HomePageSteps homePageSteps;
    private CartSteps cartSteps;

    @Test
    public void AddProductToCart(){
       cartSteps.navigateToMyAccountPage();
       loginSteps.enterCredentials("andreinyca@yahoo.com","Serenity_123456");
       loginSteps.ClickLogIn();
       homePageSteps.navigateToShopPage();
       cartSteps.xQuantityAddToCart();


    }
}
