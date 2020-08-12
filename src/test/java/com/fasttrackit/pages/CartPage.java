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
    private WebElementFacade cartUpdatedMessage;

    @FindBy (css = "[type='number']")
    private WebElementFacade cartQtyBox;

    @FindBy (css = "[value='Update cart']")
    private WebElementFacade updateCartButton;

    @FindBy (css =".product-subtotal .woocommerce-Price-amount")
    private WebElementFacade cartTotalPriceAmount;

    @FindBy(css = ".blockUI.blockOverlay")
    private WebElementFacade blockUiElement;

    @FindBy(css = ".remove")
    private WebElementFacade removeFromCartIcon;

    @FindBy(css = ".amount")
    private WebElementFacade cartSum;


    public void clickProceedToCheckout() {
        clickOn(proceedToCheckoutButton);
    }

    public boolean verifyBeanieInCart(){
        return productBeanieInCart.containsText("Beanie");
    }

    public void clickOnRemoveFirstProductFromCart(){
        clickOn(removeFirstProductFromCart);
    }

    public boolean cartUpdated(String message){
        return cartUpdatedMessage.containsText(message);
    }

    public void typeIntoCartQtyBox(String qty){
        typeInto(cartQtyBox,qty);
    }

    public void clickOnUpdateCartButton(){
        waitFor(updateCartButton);
        clickOn(updateCartButton);
    }

    public int totalPriceAmount() {
        waitFor(proceedToCheckoutButton);
        String productPriceText = cartTotalPriceAmount.getText().replace("lei", "").replace(".", "");
        int productPriceInt = Integer.parseInt(productPriceText);
        return productPriceInt;
    }

    public boolean priceAfterQtyChanged(int initialValue, int offset ){
        int priceAfterUpdatedQty = totalPriceAmount();
        if ((initialValue * offset) == (priceAfterUpdatedQty)){
            return true;
        }
        return false;
    }

    public void waitForPageToLoad(){
        blockUiElement.waitUntilNotVisible();
    }

    public void clickOnRemoveFromCartIcon(){
        clickOn(removeFromCartIcon);
    }

    public int verifyCartSumIsZero() {
        String cartSumText = cartSum.getText().replace("LEI","").replace(".","");
        int cartSumInt = Integer.parseInt(cartSumText);
        System.out.println(cartSumInt);
        return cartSumInt;
    }

    public boolean sumInCartIsZero() {
        int sum = 000;
        if (verifyCartSumIsZero() == sum ){
            System.out.println(sum);
            return true;
        }
        return false;
    }


}
