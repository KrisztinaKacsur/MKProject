package com.fasttrackit.features.search;

import com.fasttrackit.Util.BaseTest;
import com.fasttrackit.Util.Constants;
import com.fasttrackit.steps.serenity.CommentSteps;
import com.fasttrackit.steps.serenity.LoginSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class CommentTest extends BaseTest {

    @Steps
    LoginSteps loginSteps;

    @Steps
    CommentSteps commentSteps;

    @Test
    public void addAndDeleteCommentTest() {
        loginSteps.allLoginSteps(Constants.USER_NAME, Constants.USER_PASS);
        commentSteps.clickOnHomeLink();
        commentSteps.clickOnReadMoreButton();
        commentSteps.typeCommentText("This is a test comment by MK2");
        commentSteps.clickPostComment();
        commentSteps.verifyMyCommentIsVisible("This is a test comment by MK2");
        loginSteps.clickOnLogoutLink();
        loginSteps.allLoginSteps(Constants.ADMIN_USER_NAME, Constants.ADMIN_USER_PASS);
        loginSteps.navigateToAdminSite();
        commentSteps.clickOnAdminCommentsLink();
        commentSteps.hoverOverFirstCommentRow();
        commentSteps.clickOnDeleteFirstComment();
        commentSteps.verifyIfCommentWasMovedToTrash();
    }

}
