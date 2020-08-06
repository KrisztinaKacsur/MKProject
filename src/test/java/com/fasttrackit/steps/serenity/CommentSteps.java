package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.HelloWorldPage;
import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.MyAccountPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CommentSteps {

    private MyAccountPage myAccountPage;
    private HomePage homePage;
    private HelloWorldPage helloWorldPage;


    @Step
    public void clickOnHomeLink(){
        myAccountPage.clickOnHomeLink();
    }

    @Step
    public void clickOnReadMoreButton(){
        homePage.clickOnReadMoreButton();
    }

    @Step
    public void typeCommentText(String commentText) {
        helloWorldPage.typeIntoCommentTextBox(commentText);
    }


    @Step
    public void clickPostComment () {
        helloWorldPage.clickOnPostCommentButton();
    }

    @Step
    public void verifyMyCommentIsVisible(String myComment) {
        Assert.assertTrue(helloWorldPage.verifyInCommentsArea(myComment));
    }

    @Step
    public void commentWithoutLogin(String myComment){
        helloWorldPage.typeIntoCommentTextBoxNotLoggedIn(myComment);
    }

    @Step
    public void typeCommentatorName(String name){
        helloWorldPage.typeNameNotLoggedIn(name);
    }

    @Step
    public void typeCommentatorEmail(String email){
        helloWorldPage.typeEmailNotLoggedIn(email);
    }

    @Step
    public void clickPostCommentNotLogged() {
        helloWorldPage.clickPostCommentButtonNotLoggedIn();
    }

    @Step
    public void verifyNotLoggedInCommentIsVisible(String myComment) {
        Assert.assertTrue(helloWorldPage.verifyInCommentsAreaNotLoggedIn(myComment));
    }
}
