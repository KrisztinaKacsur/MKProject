package com.fasttrackit.features.search;

import com.fasttrackit.Util.BaseTest;
import com.fasttrackit.steps.serenity.SearchSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class SearchTest extends BaseTest {

    @Steps
    SearchSteps searchSteps;

    @Test
    public void searchForAProductWithOneResultTest () {
        searchSteps.navigateToHomepage();
        searchSteps.typeIntoSearchField("cap");
        searchSteps.clickOnSearchIcon();
        searchSteps.verifySingleProductIsFound("Cap");
    }

    @Test
    public void searchForAProductWithMultipleResultsTest () {
        searchSteps.navigateToHomepage();
        searchSteps.typeIntoSearchField("hoodie");
        searchSteps.clickOnSearchIcon();
        searchSteps.findClickProduct("Hoodie with Logo");
    }

    @Test
    public void searchSpecialCharacterTest (){
        searchSteps.navigateToHomepage();
        searchSteps.typeIntoSearchField("#$%");
        searchSteps.clickOnSearchIcon();
        searchSteps.noProductFoundMessage();
    }

    @Test
    public void searchWithoutTypingAnythingInSearchFieldTest() {
        searchSteps.navigateToHomepage();
        searchSteps.clickOnSearchIcon();
        searchSteps.verifyProductsWereFound();
    }

    @Test
    public void searchResultIsMaintainedAfterNavigateBackTest (){
        searchSteps.navigateToHomepage();
        searchSteps.typeIntoSearchField("hoodie");
        searchSteps.clickOnSearchIcon();
        searchSteps.getFirstSearchResult();
        searchSteps.clickOnHoodieWithZipperLink();
        searchSteps.navigateBack();
        searchSteps.getResultAfterGoBackInChrome();
        searchSteps.verifyIfSearchedResultsAreTheSame();

    }


}
