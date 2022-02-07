package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends BaseSteps{

    @Step
    public void executeSearch(String value){
        homePage.clickSearchIcon();
        homePage.setSearchField(value);
        homePage.clickSearchIcon2();
    }
    @Step
    public void checkSearchProduct(){
        Assert.assertTrue(homePage.checkHoodieZipperDisplayed());
    }
}
