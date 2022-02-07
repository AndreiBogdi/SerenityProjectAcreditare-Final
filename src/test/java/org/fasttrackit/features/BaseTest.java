package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.ProductPageSteps;
import org.fasttrackit.steps.HomePageSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.EnvConstants;
import org.fasttrackit.steps.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Before
    public void maximise(){
        driver.manage().window().maximize();
        driver.get(EnvConstants.BASE_URL);
    }

    @Steps
    protected LoginSteps loginSteps;

    @Steps
    protected RegisterSteps registerSteps;


    @Steps
    protected ProductPageSteps productPageSteps;

    @Steps
    protected HomePageSteps homepageSteps;

    @Steps
    protected CartSteps cartSteps;

    @Steps
    protected ShopSteps shopSteps;

    @Steps
    protected ReviewSteps reviewSteps;

    @Steps
    protected AccountPageSteps accountPageSteps;

    @Steps
    protected CheckoutSteps checkoutSteps;

    @Steps
    protected SearchSteps searchSteps;
}
