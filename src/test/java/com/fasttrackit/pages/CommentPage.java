package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.interactions.Actions;

public class CommentPage extends PageObject {

    @FindBy (id = "comment")
    private WebElementFacade commentTextBox;

    @FindBy(id = "submit")
    private WebElementFacade postCommentButton;

    @FindBy(css = ".comments-area")
    private WebElementFacade commentsArea;

    @FindBy (css = ".comment-author-kricsk3 .column-comment")
    private WebElementFacade firstCommentRow;

    @FindBy (css = ".delete")
    private WebElementFacade deleteFirstComment;

    @FindBy (css = "#the-comment-list .trash-undo-inside")
    private WebElementFacade commentMovedToTrash;


    public void typeIntoCommentTextBox(String commentText) {
        typeInto(commentTextBox, commentText);
    }

    public void clickOnPostCommentButton() {
        clickOn(postCommentButton);
    }

    public boolean verifyInCommentsArea(String myComment) {
        return commentsArea.containsText(myComment);
    }

    public void hoverOver() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(firstCommentRow).perform();
    }

    public void clickOnDeleteFirstComment() {
        clickOn(deleteFirstComment);
    }

    public boolean verifyIfCommentWasMovedToTrash() {
       return  commentMovedToTrash.containsOnlyText("Comment by kricsk3 moved to the trash. Undo");
    }

}
