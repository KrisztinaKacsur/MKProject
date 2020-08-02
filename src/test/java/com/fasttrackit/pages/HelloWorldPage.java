package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa5.fasttrackit.org:8008/?p=1")
public class HelloWorldPage extends PageObject {

    @FindBy (id = "comment")
    private WebElementFacade commentTextBox;

    @FindBy(id = "submit")
    private WebElementFacade postCommentButton;

    @FindBy(css = ".comments-area")
    private WebElementFacade commentsArea;

    public void typeIntoCommentTextBox(String commentText){
        typeInto(commentTextBox, commentText);
    }

    public void clickOnPostCommentButton() {
        clickOn(postCommentButton);
    }

    public boolean verifyInCommentsArea(String myComment){
        return commentsArea.containsText(myComment);
    }

}
