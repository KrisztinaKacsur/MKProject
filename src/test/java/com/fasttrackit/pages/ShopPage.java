package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa5.fasttrackit.org:8008/?post_type=product")
public class ShopPage extends PageObject {

    @FindBy(css = "[href*='cart=26']")
    private WebElementFacade addBeanieToCartButton;

    @FindBy(css = ".cart-contents")
    private WebElementFacade shoppingCartLink;

    @FindBy(css = ".entry-title")
    private WebElementFacade pageHeader;

    @FindBy(css = ".woocommerce-breadcrumb a")
    private WebElementFacade headerHomeLink;


    public void addBeanieToCart() {
        clickOn(addBeanieToCartButton);
    }

    public void clickOnShoppingCartLink() {
        clickOn(shoppingCartLink);
    }

    public boolean verifyPageHeaderTitle(String pageTitle) {
        return pageHeader.containsOnlyText(pageTitle);
    }

    public void clickOnHeaderHomeLink() {
        clickOn(headerHomeLink);
    }

}

