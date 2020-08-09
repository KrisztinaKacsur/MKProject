package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultPage extends PageObject {

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

    @FindBy (css=".woocommerce-info")
    private WebElementFacade noProductFoundMessage;

    @FindBy (css=".woocommerce-result-count")
    private WebElementFacade searchResultCount;

    @FindBy (css = "[href*='zipper'] h3")
    private WebElementFacade hoodieWithZipperLink;




    public boolean findSingleProduct(String productName) {
        return singleItem.containsOnlyText(productName);
    }

    public boolean findAndClickProductFromList (String productName) {
        for (WebElementFacade product : searchResultList) {
            WebElement productNameText = product.findElement(By.cssSelector(".collection_desc a"));
            if (productNameText.getText().equals(productName)){
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
        return productAddedToCartMessage.containsText('"' + productName + '"' + " " + " has been added to your cart.");
    }

    public void clickOnCartLink() {
        clickOn(cartLink);
    }

    public boolean verifyNoProductWasFound (){
        return noProductFoundMessage.containsOnlyText("No products were found matching your selection.");
    }

    public boolean verifyProductsWereFound (){
        return searchResultCount.isDisplayed();
    }

    public void clickOnHoodieWithZipperLink (){
        clickOn(hoodieWithZipperLink);
    }

    
}
