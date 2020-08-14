package com.fasttrackit.features.search;

import com.fasttrackit.Util.BaseTest;
import com.fasttrackit.steps.serenity.LoginSteps;
import com.fasttrackit.steps.serenity.SearchSteps;
import com.fasttrackit.steps.serenity.ShopSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class ShopTest extends BaseTest {

    @Steps
    LoginSteps loginSteps;

    @Steps
    ShopSteps shopSteps;

    @Steps
    SearchSteps searchSteps;


    @Test
    public void navigateToShopAndHomePage(){
        loginSteps.openHomepage();
        shopSteps.clickOnShopLink();
        shopSteps.verifyPageHeaderTitle("SHOP");
        shopSteps.clickOnHeaderHomeLink();
        shopSteps.verifyHelloWordText();
    }

    @Test
    public void sortProductsByLowToHighPriceTest() {
        loginSteps.openHomepage();
        searchSteps.search("banner");
        searchSteps.sortByLowToHigh();
        searchSteps.getProductPrice();
        searchSteps.checkLowestProductPrice();
    }

    @Test
    public void sortProductsByHighToLowPriceTest(){
        loginSteps.openHomepage();
        searchSteps.search("banner");
        searchSteps.sortByHighToLow();
        searchSteps.getProductPrice();
        searchSteps.checkHighestPrice();
    }


}
