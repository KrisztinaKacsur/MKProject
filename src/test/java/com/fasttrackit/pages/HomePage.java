package com.fasttrackit.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa5.fasttrackit.org:8008/")
public class HomePage extends PageObject {


    @FindBy(css = ".account")
    private WebElementFacade loginLink;

    @FindBy(css = ".search-form .search-field")
    private WebElementFacade topSearchField;


    public void clickOnLogin() {
        clickOn(loginLink);
    }

    public void typeIntoTopSearchField(String productName){
        typeInto(topSearchField, productName);
    }

}
