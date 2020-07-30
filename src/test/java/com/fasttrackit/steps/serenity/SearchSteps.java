package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.HomePage;
import net.thucydides.core.annotations.Step;


public class SearchSteps {

    private HomePage homePage;

    @Step
    public void navigateToHomepage(){
        homePage.open();
    }

    @Step
    public void typeIntoSearchField(String productName ){
        homePage.typeIntoTopSearchField(productName);
    }
}
