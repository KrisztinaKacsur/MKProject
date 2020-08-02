package com.fasttrackit.features.search;

import com.fasttrackit.Util.BaseTest;
import com.fasttrackit.pages.HomePage;
import com.fasttrackit.steps.serenity.LoginSteps;
import com.fasttrackit.steps.serenity.SearchSteps;
import com.fasttrackit.steps.serenity.ShopSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class SortByTest extends BaseTest {


    @Steps
    HomePage homePage;

    @Steps
    SearchSteps searchSteps;

    @Steps
    ShopSteps shopSteps;

    @Test
    public void sortProductsByLowToHigh(){
        homePage.openHomepage();
        searchSteps.search("hoodie");
        shopSteps.sortByLowToHigh();
    }




}
