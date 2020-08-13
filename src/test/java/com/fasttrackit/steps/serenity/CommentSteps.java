package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.*;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CommentSteps {

    private MyAccountPage myAccountPage;
    private HomePage homePage;
    private CommentPage commentPage;
    private AdminHomePage adminHomePage;


    @Step
    public void clickOnHomeLink() {
        myAccountPage.clickOnHomeLink();
    }

    @Step
    public void clickOnReadMoreButton() {
        homePage.clickOnReadMoreButton();
    }

    @Step
    public void typeCommentText(String commentText) {
        commentPage.typeIntoCommentTextBox(commentText);
    }

    @Step
    public void clickPostComment() {
        commentPage.clickOnPostCommentButton();
    }

    @Step
    public void verifyMyCommentIsVisible(String myComment) {
        Assert.assertTrue(commentPage.verifyInCommentsArea(myComment));
    }

    @Step
    public void clickOnAdminCommentsLink() {
        adminHomePage.clickOnCommentsLink();
    }

    @Step
    public void hoverOverFirstCommentRow() {
        commentPage.hoverOver();
    }

    @Step
    public void clickOnDeleteFirstComment() {
        commentPage.clickOnDeleteFirstComment();
    }

    @Step
    public void verifyIfCommentWasMovedToTrash() {
        Assert.assertTrue(commentPage.verifyIfCommentWasMovedToTrash());
    }

}
