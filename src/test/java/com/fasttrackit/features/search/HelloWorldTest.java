package com.fasttrackit.features.search;

import com.fasttrackit.Util.BaseTest;
import com.fasttrackit.Util.Constants;
import com.fasttrackit.steps.serenity.CommentSteps;
import com.fasttrackit.steps.serenity.LoginSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class HelloWorldTest extends BaseTest {

    @Steps
    LoginSteps loginSteps;

    @Steps
    CommentSteps commentSteps;

    @Test
    public void leaveCommentTest(){
        loginSteps.allLoginSteps(Constants.USER_NAME, Constants.USER_PASS);
        commentSteps.clickOnHomeLink();
        commentSteps.clickOnReadMoreButton();
        commentSteps.typeCommentText("This is a test comment by MK");
        commentSteps.clickPostComment();
        commentSteps.verifyMyCommentIsVisible("This is a test comment by MK");

    }

   @Test
    public void leaveCommentWithoutLoginTest(){
        loginSteps.openHomepage();
        commentSteps.clickOnHomeLink();
        commentSteps.clickOnReadMoreButton();
        commentSteps.commentWithoutLogin("Test comment without login");
        commentSteps.typeCommentatorName("Krisz");
        commentSteps.typeCommentatorEmail("abcdef@gmail.com");
        commentSteps.clickPostCommentNotLogged();
        commentSteps.verifyNotLoggedInCommentIsVisible("Test comment without login");

    }
}
