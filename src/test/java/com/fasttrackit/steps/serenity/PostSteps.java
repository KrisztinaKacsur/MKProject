package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.AdminPage;
import com.fasttrackit.pages.PostPage;

public class PostSteps {

    private AdminPage adminPage;
    private PostPage postPage;

    public void clickOnPostMenu() {
        adminPage.clickOnPosMenu();
    }

    public void clickOnNewPost() {
        postPage.clickOnNewPostButton();
    }

    public void typePostTile(String titleText) {
        postPage.typeIntoPostTitleField(titleText);
    }

    public void clickTextStyle() {
        postPage.clickTextStyleButton();
    }

    public void typePostBody(String postText) {
        postPage.typeIntoPostBodyField(postText);
    }

    public void clickPublish(){
        postPage.clickOnPublishButton();
    }




}
