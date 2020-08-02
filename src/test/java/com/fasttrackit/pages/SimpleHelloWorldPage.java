package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SimpleHelloWorldPage extends PageObject {

    @FindBy(css = "[name='comment']")
    private WebElementFacade commentTextBox;

    @FindBy(id = "author")
    private WebElementFacade commentNameField;

    @FindBy(id = "email")
    private WebElementFacade emailField;

    @FindBy(id = "submit")
    private WebElementFacade postCommentButton;

    @FindBy(css = ".comments-area")
    private WebElementFacade commentsArea;


    public void typeIntoCommentTextBox(String myComment){
        typeInto(commentTextBox, myComment);
    }

    public void typeName(String name){
        typeInto(commentNameField, name);
    }

    public void typeEmail(String email){
        typeInto(emailField, email);
    }

    public void clickPostCommentButton() {
        clickOn(postCommentButton);
    }

    public boolean verifyInCommentsArea(String myComment){
        return commentsArea.containsText(myComment);
    }

}
