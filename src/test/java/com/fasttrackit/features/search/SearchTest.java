package com.fasttrackit.features.search;

import com.fasttrackit.Util.BaseTest;
import com.fasttrackit.steps.serenity.SearchSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class SearchTest extends BaseTest {

    @Steps
    SearchSteps searchSteps;

    @Test
    public void searchForAProductWithOneResult () {
        searchSteps.navigateToHomepage();
        searchSteps.typeIntoSearchField("cap");
        searchSteps.clickOnSearchIcon();
        searchSteps.verifySingleProductIsFound("Cap");
    }

    @Test
    public void searchForAProductWithMultipleResults () {
        searchSteps.navigateToHomepage();
        searchSteps.typeIntoSearchField("hoodie");
        searchSteps.clickOnSearchIcon();
        searchSteps.findClickProduct("Hoodie with Logo");
    }


}
