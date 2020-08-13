package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.commons.text.RandomStringGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SearchResultPage extends PageObject {

    private String nrOfResultsFound;
    private String nrOfResultsAfterGoBack;
    private int productPrice;

    @FindBy(css = ".product")
    private List<WebElementFacade> searchResultList;

    @FindBy(css = ".collection_desc h3")
    private WebElementFacade foundElementsName;

    @FindBy(css = ".product_title")
    private WebElementFacade singleItem;

    @FindBy(css = ".single_add_to_cart_button")
    private WebElementFacade addToCartButton;

    @FindBy(css = ".woocommerce-message")
    private WebElementFacade productAddedToCartMessage;

    @FindBy(css = ".view-cart")
    private WebElementFacade cartLink;

    @FindBy(css = ".woocommerce-info")
    private WebElementFacade noProductFoundMessage;

    @FindBy(css = ".woocommerce-result-count")
    private WebElementFacade searchResultCount;

    @FindBy(css = "[href*='zipper'] h3")
    private WebElementFacade hoodieWithZipperLink;

    @FindBy(css = ".search-form .search-field")
    private WebElementFacade searchField;

    @FindBy(css = ".ak-container.entry-title")
    private WebElementFacade shopTitle;

    @FindBy(css = "[aria-haspopup='true'] .display-name")
    private WebElementFacade adminLink;

    @FindBy(css = ".stock")
    private WebElementFacade productStockText;

    @FindBy(css = ".orderby")
    private WebElementFacade sortByDropdownSelect;


    public boolean verifySingleProductWasFound(String productName) {
        return singleItem.containsOnlyText(productName);
    }

    public boolean findAndClickProductFromList(String productName) {
        for (WebElementFacade product : searchResultList) {
            WebElement productNameText = product.findElement(By.cssSelector(".collection_desc a"));
            if (productNameText.getText().equals(productName)) {
                clickOn(productNameText);
                return true;
            }
        }
        return false;
    }

    public void clickOnAddToCartButton() {
        clickOn(addToCartButton);
    }

    public boolean verifyProductIsAddedToCart(String productName) {
        return productAddedToCartMessage.containsText('"' + productName + '"' + " " +
                                                       " has been added to your cart.");
    }

    public void clickOnCartLink() {
        clickOn(cartLink);
    }

    public boolean verifyNoProductWasFound() {
        return noProductFoundMessage.containsOnlyText("No products were found matching your selection.");
    }

    public boolean verifyProductsWereFound() {
        return searchResultCount.isDisplayed();
    }

    public void clickOnHoodieWithZipperLink() {
        clickOn(hoodieWithZipperLink);
    }

    public void navigateBack() {
        getDriver().navigate().back();
    }

    public void getSearchedResults() {
        nrOfResultsFound = searchResultCount.getText();
    }

    public void getResultsAfterGoBackInChrome() {
        nrOfResultsAfterGoBack = searchResultCount.getText();
    }

    public boolean verifyIfSearchedResultsAreTheSame() {
        if (nrOfResultsFound.equals(nrOfResultsAfterGoBack)) {
            return true;
        }
        return false;
    }

    public boolean verifyIfShopIsDisplayed() {
        return shopTitle.isDisplayed();
    }

    public int getProductQty() {
        String initialProductStock = productStockText.getText().replace(" in stock", "");
        int initialProductStockInt = Integer.parseInt(initialProductStock);
        return initialProductStockInt;
    }

    public boolean verifyIfStockChanged(int initialValue, int offset) {
        int productStockAfterPlacingOrder1 = getProductQty();
        if ((initialValue - offset) == productStockAfterPlacingOrder1) {
            return true;
        }
        return false;
    }

    public void selectSortByDropdown(String visibleText) {
        sortByDropdownSelect.selectByVisibleText(visibleText);
    }

    public int getProductPrice() {
        WebElement firstProductPrice = searchResultList.get(0)
                .findElement(By.cssSelector(".woocommerce-Price-amount"));
        String firstPrice = firstProductPrice.getText().replace("lei", "").replace(".", "");
        int productPrice = Integer.valueOf(firstPrice);
        return productPrice;
    }

    public boolean checkLowestProductPrice(int productPrice) {
        int highestPrice = getProductPrice();
        if (productPrice <= highestPrice) {
            return true;
        }
        return false;
    }


    public boolean checkHighestProductPrice(int productPrice) {
        int highestPrice = getProductPrice();
        if (highestPrice >= productPrice) {
            return true;
        }
        return false;
    }

}
