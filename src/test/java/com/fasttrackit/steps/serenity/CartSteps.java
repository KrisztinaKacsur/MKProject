package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.CartPage;
import com.fasttrackit.pages.SearchResultPage;

public class CartSteps {

    private SearchResultPage searchResultPage;
    private CartPage cartPage;

    public void clickAddProductToCartButton() {
        searchResultPage.clickOnAddToCartButton();
    }

    public void verifyProductAddedToCart(String productName) {
        searchResultPage.verifyProductIsAddedToCart(productName);
    }

    public void clickOnCartIcon() {
        searchResultPage.clickOnCartLink();
    }

    public void clickOnProceedToCheckout(){
        cartPage.clickProceedToCheckout();

    }


}
