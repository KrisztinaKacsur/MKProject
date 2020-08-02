package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.ShopPage;
import net.thucydides.core.annotations.Step;

public class ShopSteps {

    private HomePage homePage;
    private ShopPage shopPage;


    @Step
    public void navigateToShopPage(){
        homePage.open();
        homePage.clickOnShopLink();
    }

    @Step
    public void sortByPopularity(){
        shopPage.selectSortByDropdown("Sort by popularity");
    }
    @Step
    public void sortByRating(){
        shopPage.selectSortByDropdown("Sort by average rating");
    }

    @Step
    public void sortByNewness(){
        shopPage.selectSortByDropdown("Sort by newness");
    }

    @Step
    public void sortByLowToHigh(){
        shopPage.selectSortByDropdown("Sort by price: low to high");
    }

    @Step
    public void sortByHighToLow(){
        shopPage.selectSortByDropdown("Sort by price: high to low");
    }


}
