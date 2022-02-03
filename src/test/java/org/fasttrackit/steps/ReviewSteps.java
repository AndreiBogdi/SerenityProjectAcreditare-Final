package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.ProductPage;
import org.junit.Assert;
import org.junit.Test;

public class ReviewSteps extends BaseSteps{
    private ProductPage productPage;

    @Step
    public void pressReviewsButton(){productPage.clickReviewBtn();}

    @Step
    public void pressSubmitbtn(){productPage.clickSubmitBtn();}

    @Step
    public void PostReview(){
        productPage.setReviewComment("Good music, but I wanted much more songs");
        productPage.clickForStars();
        productPage.clickSubmitBtn();
    }

    @Step
    public void PostReviewWithoutComment(){
        productPage.clickForStars();
        productPage.clickSubmitBtn();
    }

    @Step
    public void ReviewPostedSuccessful(){
        Assert.assertTrue("Waiting for approval should be displayed", productPage.checkReviewPosted());
    }

    @Step
    public void ReviewWithoutCommentNotAdded(){
        Assert.assertTrue("An error message 'Type a comment' should be displayed",productPage.checkReviewErrorMessage());
    }
    @Step
    public void ReviewPressOnlySubmit(){
        Assert.assertTrue("An error message 'Type a comment' should be displayed",productPage.checkReviewErrorMessage());
    }

}
