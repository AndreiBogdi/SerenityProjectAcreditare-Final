package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;

public class HomePageSteps extends BaseSteps{
    private HomePage homePage;

    @Step
    public void navigateToShopPage(){homePage.clickShopBtn();}
}
