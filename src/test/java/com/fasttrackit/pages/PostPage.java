package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PostPage extends PageObject {

    @FindBy(css = ".page-title-action")
    private WebElementFacade newPostButton;

    @FindBy (id = "title")
    private WebElementFacade postTitleField;

    @FindBy(id = "#tinymce p")
    private WebElementFacade postBodyField;

    @FindBy(css = ".wp-editor-tabs :nth-child(2)")
    private WebElementFacade textStyleButton;

    @FindBy(css = "#tinymce p")
    private WebElementFacade publishButton;


    public void clickOnNewPostButton() {
        clickOn(newPostButton);
    }

    public void typeIntoPostTitleField(String titleText) {
        typeInto(postTitleField, titleText);
    }

    public void clickTextStyleButton() {
        clickOn(textStyleButton);
    }

    public boolean typeIntoPostBodyField(String postText) {
        if (postBodyField.isVisible()){
            typeInto(postBodyField, postText);
            return true;
        } else{
            System.out.println("not working");        }
        return false;
    }

    public void clickOnPublishButton(){
        clickOn(publishButton);
    }



}
