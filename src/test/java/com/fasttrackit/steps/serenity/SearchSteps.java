package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.SearchResultPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;


public class SearchSteps {

    private HomePage homePage;
    private SearchResultPage searchResultPage;

    @Step
    public void navigateToHomepage(){
        homePage.openHomepage();
    }

    @Step
    public void typeIntoSearchField(String productName){
        homePage.typeIntoTopSearchField(productName);
    }

    @Step
    public void clickOnSearchIcon(){
        homePage.clickOnSearchIcon();
    }

    @Step
    public void search(String productName){
        typeIntoSearchField(productName);
        clickOnSearchIcon();
    }

    @Step
    public void findClickProduct(String productName) {
        Assert.assertTrue(searchResultPage.findAndClickProductFromList(productName));

    }

    @Step
    public void verifySingleProductIsFound(String productName){
        Assert.assertTrue(searchResultPage.findSingleProduct(productName));
    }

    @Step
    public void allSearchSteps(String productNameFind){
        typeIntoSearchField(productNameFind);
        clickOnSearchIcon();
    }


}
