package org.fasttrackit.features;

import org.junit.Test;

public class SearchTest extends BaseTest{
    @Test
    public void ExecuteSearch(){
        searchSteps.executeSearch("Hoodie with Zipper");
        searchSteps.checkSearchProduct();

    }

}
