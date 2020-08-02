package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.HelloWorldPage;
import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.MyAccountPage;
import com.fasttrackit.pages.SimpleHelloWorldPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CommentSteps {

    private MyAccountPage myAccountPage;
    private HomePage homePage;
    private HelloWorldPage helloWorldPage;
    private SimpleHelloWorldPage simpleHelloWorldPage;

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
        simpleHelloWorldPage.typeIntoCommentTextBox(myComment);
    }

    @Step
    public void typeCommentatorName(String name){
        simpleHelloWorldPage.typeName(name);
    }

    @Step
    public void typeCommentatorEmail(String email){
        simpleHelloWorldPage.typeEmail(email);
    }

    @Step
    public void clickPostCommentNotLogged() {
        simpleHelloWorldPage.clickPostCommentButton();
    }

    @Step
    public void verifyNotLoggedInCommentIsVisible(String myComment) {
        Assert.assertTrue(simpleHelloWorldPage.verifyInCommentsArea(myComment));
    }
}
