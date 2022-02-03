package org.fasttrackit.features;

import org.junit.Test;

public class ReviewTest extends BaseTest{

    @Test
    public void AddReview(){
        loginSteps.LogIn();
        homepageSteps.navigateToShopPage();
        shopSteps.OpenProductAlbum();
        reviewSteps.pressReviewsButton();
        reviewSteps.PostReview();

    }
    @Test
    public void AddReviewWithoutComment(){
        loginSteps.LogIn();
        homepageSteps.navigateToShopPage();
        shopSteps.OpenProductAlbum();
        reviewSteps.pressReviewsButton();
        reviewSteps.PostReviewWithoutComment();
        reviewSteps.ReviewWithoutCommentNotAdded();

    }

    @Test
    public void ReviewOnlyClickSubmit(){
        loginSteps.LogIn();
        homepageSteps.navigateToShopPage();
        shopSteps.OpenProductAlbum();
        reviewSteps.pressReviewsButton();
        reviewSteps.pressSubmitbtn();
        reviewSteps.ReviewPressOnlySubmit();

    }

}
