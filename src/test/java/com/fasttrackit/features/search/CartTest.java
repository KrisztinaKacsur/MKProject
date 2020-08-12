package com.fasttrackit.features.search;

import com.fasttrackit.Util.BaseTest;
import com.fasttrackit.Util.Constants;
import com.fasttrackit.steps.serenity.CartSteps;
import com.fasttrackit.steps.serenity.LoginSteps;
import com.fasttrackit.steps.serenity.SearchSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Steps
    SearchSteps searchSteps;

    @Steps
    CartSteps cartSteps;

    @Steps
    LoginSteps loginSteps;

    @Test
    public void addToCartSingleProductBySearchTest() {
        cartSteps.openHomePage();
        searchSteps.typeIntoSearchField("cap");
        searchSteps.clickOnSearchIcon();
        cartSteps.clickAddProductToCartButton();
        cartSteps.verifyProductAddedToCart("cap");
    }

    @Test
    public void addOneProductToCartTest() {
        cartSteps.openHomePage();
        loginSteps.allLoginSteps(Constants.USER_NAME, Constants.USER_PASS);
        cartSteps.clickOnShopLink();
        cartSteps.addBeanieToCart();
        cartSteps.clickOnShoppingCartLink();
        cartSteps.verifyBeanieInCart();
        cartSteps.removeFirstProductFromCart();
        cartSteps.verifyCartUpdated("“Beanie” removed. Undo?");
    }

    @Test
    public void changeQtyInCartTest(){
        cartSteps.openHomePage();
        searchSteps.typeIntoSearchField("polo");
        searchSteps.clickOnSearchIcon();
        cartSteps.clickAddProductToCartButton();
        cartSteps.verifyProductAddedToCart("polo");
        cartSteps.clickOnCartLink();
        cartSteps.typeIntoCartQtyBox("3");
        cartSteps.clickOnUpdateCartButton();
        cartSteps.verifyCartUpdated("Cart updated.");
        cartSteps.verifyIfPriceChanged(3);
    }

    @Test
    public void deleteProductFromCartTest(){
        cartSteps.openHomePage();
        searchSteps.typeIntoSearchField("polo");
        searchSteps.clickOnSearchIcon();
        cartSteps.clickAddProductToCartButton();
        cartSteps.initialProductPrice();
        cartSteps.verifyProductAddedToCart("polo");
        cartSteps.clickOnCartLink();

    }

}
