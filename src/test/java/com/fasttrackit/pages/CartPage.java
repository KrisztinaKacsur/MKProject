package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa5.fasttrackit.org:8008/?page_id=5")
public class CartPage extends PageObject {

    @FindBy(css = ".checkout-button")
    private WebElementFacade proceedToCheckoutButton;

    @FindBy(css = ".product-name a")
    private WebElementFacade productBeanieInCart;

    @FindBy(css = ".product-remove a")
    private WebElementFacade removeFirstProductFromCart;

    @FindBy(css = ".woocommerce-message")
    private WebElementFacade productRemovedMessageFromCart;


    public void clickProceedToCheckout() {
        clickOn(proceedToCheckoutButton);
    }

    public boolean verifyBeanieInCart(){
        return productBeanieInCart.containsText("Beanie");
    }

    public void clickOnRemoveFirstProductFromCart(){
        clickOn(removeFirstProductFromCart);
    }

    public boolean verifyProductRemoved(){
        System.out.println(productRemovedMessageFromCart.getText());
        return productRemovedMessageFromCart.containsText("“Beanie” removed. Undo?");
    }


}
