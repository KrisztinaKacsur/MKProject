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

    @Step
    public void openHomePage(){
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
    public void clickOnProceedToCheckout(){
        cartPage.clickProceedToCheckout();
    }

    @Step
    public void clickOnShopLink(){
        myAccountPage.clickOnShopLink();
    }

    @Step
    public void addBeanieToCart(){
        shopPage.addBeanieToCart();
    }

    @Step
    public void clickOnShoppingCartLink(){
        shopPage.clickOnShoppingCartLink();
    }

    @Step
    public void verifyBeanieInCart(){
        Assert.assertTrue(cartPage.verifyBeanieInCart());
    }

    @Step
    public void removeFirstProductFromCart(){
        cartPage.clickOnRemoveFirstProductFromCart();
    }

    @Step
    public void verifyBeanieWasRemovedFromCart(){
        Assert.assertTrue(cartPage.verifyProductRemoved());
    }

    @Step
    public void proceedToCheckoutSteps(){
       clickAddProductToCartButton();
       clickOnCartLink();
       clickOnProceedToCheckout();
    }

    @Step
    public void typeIntoCartQtyBox(String qty){
        searchResultPage.typeIntoCartQtyBox(qty);
    }





}
