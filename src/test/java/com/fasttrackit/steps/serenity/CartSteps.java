package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.*;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps {

    private HomePage homePage;
    private MyAccountPage myAccountPage;
    private SearchResultPage searchResultPage;
    private CartPage cartPage;
    private ShopPage shopPage;
    private int initialProductPrice;

    @Step
    public void openHomePage() {
        homePage.openHomepage();
    }

    @Step
    public void clickAddProductToCartButton() {
        searchResultPage.clickOnAddToCartButton();
    }

    @Step
    public void verifyProductAddedToCart(String productName) {
        searchResultPage.verifyProductIsAddedToCart(productName);
    }

    @Step
    public void clickOnCartLink() {
        searchResultPage.clickOnCartLink();
    }

    @Step
    public void clickOnProceedToCheckout() {
        cartPage.clickProceedToCheckout();
    }

    @Step
    public void clickOnShopLink() {
        myAccountPage.clickOnShopLink();
    }

    @Step
    public void addBeanieToCart() {
        shopPage.addBeanieToCart();
    }

    @Step
    public void clickOnShoppingCartLink() {
        shopPage.clickOnShoppingCartLink();
    }

    @Step
    public void verifyBeanieInCart() {
        Assert.assertTrue(cartPage.verifyBeanieInCart());
    }

    @Step
    public void removeFirstProductFromCart() {
        cartPage.clickOnRemoveFirstProductFromCart();
    }

    @Step
    public void verifyCartUpdated(String message) {
        cartPage.waitForPageToLoad();
        Assert.assertTrue(cartPage.cartUpdated(message));
    }

    @Step
    public void proceedToCheckoutSteps() {
       clickAddProductToCartButton();
       clickOnCartLink();
       clickOnProceedToCheckout();
    }

    @Step
    public void typeIntoCartQtyBox(String qty) {
        cartPage.typeIntoCartQtyBox(qty);
    }

    @Step
    public void clickOnUpdateCartButton() {
        cartPage.clickOnUpdateCartButton();
    }

    @Step
    public void initialProductPrice() {
        initialProductPrice = cartPage.totalPriceAmount();
    }

    @Step
    public void verifyIfPriceChanged(int offset) {
        Assert.assertTrue(cartPage.priceAfterQtyChanged(initialProductPrice,offset));
    }

    @Step
    public void clickOnRemoveFromCartIcon() {
        cartPage.clickOnRemoveFromCartIcon();
    }

    @Step
    public void verifyCartSum() {
        Assert.assertTrue(cartPage.sumInCartIsZero());
    }

}