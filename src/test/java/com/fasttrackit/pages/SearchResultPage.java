package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

@DefaultUrl("http://qa5.fasttrackit.org:8008/?product=cap")
public class SearchResultPage extends PageObject {

    @FindBy(css = ".product")
    private List<WebElementFacade> searchResultList;

    @FindBy(css = ".collection_desc h3")
    private WebElementFacade foundElementsName;

    public boolean findAndClickProduct(String productName) {
        for (WebElementFacade product : searchResultList) {
            WebElement productNameText = product.findElement(By.cssSelector(".collection_desc a"));
            if (productNameText.getText().equals(productName)){
                clickOn(productNameText);
                return true;
            }
        }
        return false;
    }

}
