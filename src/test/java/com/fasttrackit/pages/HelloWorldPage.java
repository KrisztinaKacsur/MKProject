package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HelloWorldPage extends PageObject {

    @FindBy (id = "comment")
    private WebElementFacade commentTextBox;

    @FindBy(id = "submit")
    private WebElementFacade postCommentButton;

    @FindBy(css = ".comments-area")
    private WebElementFacade commentsArea;

    @FindBy(css = "[name='comment']")
    private WebElementFacade notLoggedInCommentTextBox;

    @FindBy(id = "author")
    private WebElementFacade notLoggedInCommentNameField;

    @FindBy(id = "email")
    private WebElementFacade notLoggedInEmailField;

    @FindBy(id = "submit")
    private WebElementFacade notLoggedInPostCommentButton;

    @FindBy(css = ".comments-area")
    private WebElementFacade notLoggedInCommentsArea;


    public void typeIntoCommentTextBox(String commentText){
        typeInto(commentTextBox, commentText);
    }

    public void clickOnPostCommentButton() {
        clickOn(postCommentButton);
    }

    public boolean verifyInCommentsArea(String myComment){
        return commentsArea.containsText(myComment);
    }

    public void typeIntoCommentTextBoxNotLoggedIn(String myComment){
        typeInto(notLoggedInCommentTextBox, myComment);
    }

    public void typeNameNotLoggedIn(String name){
        typeInto(notLoggedInCommentNameField, name);
    }

    public void typeEmailNotLoggedIn(String email){
        typeInto(notLoggedInEmailField, email);
    }

    public void clickPostCommentButtonNotLoggedIn() {
        clickOn(notLoggedInPostCommentButton);
    }

    public boolean verifyInCommentsAreaNotLoggedIn(String myComment){
        return notLoggedInCommentsArea.containsText(myComment);
    }

}
