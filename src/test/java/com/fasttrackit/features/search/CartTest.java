package com.fasttrackit.features.search;

import com.fasttrackit.Util.BaseTest;
import com.fasttrackit.steps.serenity.CartSteps;
import com.fasttrackit.steps.serenity.SearchSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Steps
    SearchSteps searchSteps;

    @Steps
    CartSteps cartSteps;

    @Test
    public void addToCartTest() {
        searchSteps.navigateToHomepage();
        searchSteps.typeIntoSearchField("cap");
        searchSteps.clickOnSearchIcon();
        cartSteps.clickAddProductToCartButton();
        cartSteps.verifyProductAddedToCart("Cap");

    }

}
