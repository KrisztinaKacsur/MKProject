package com.fasttrackit.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://qa5.fasttrackit.org:8008/")
public class HomePage extends PageObject {


    @FindBy(css = ".account")
    private WebElementFacade loginLink;

    @FindBy(css = ".search-form .search-field")
    private WebElementFacade topSearchField;

    @FindBy(css = ".search-form .searchsubmit")
    private WebElementFacade searchIcon;


    public void clickOnLogin() {
        clickOn(loginLink);
    }

    public void typeIntoTopSearchField(String productName){
        typeInto(topSearchField, productName);
    }

    public void clickOnSearchIcon(){
        clickOn(searchIcon);
    }

}
