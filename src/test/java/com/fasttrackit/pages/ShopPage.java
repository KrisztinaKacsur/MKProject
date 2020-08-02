package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa5.fasttrackit.org:8008/?post_type=product")
public class ShopPage extends PageObject {

    @FindBy(css = ".orderby")
    private WebElementFacade sortByDropdownSelect;

    public void selectSortByDropdown(String visibleText){
        sortByDropdownSelect.selectByVisibleText(visibleText);
    }




}

