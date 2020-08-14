package com.fasttrackit.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://qa5.fasttrackit.org:8008/")
public class HomePage extends PageObject {


    @FindBy(css = ".account")
    private WebElementFacade loginLink;

    @FindBy (css = ".logout")
    private WebElementFacade logoutLink;

    @FindBy(css = ".search-form .search-field")
    private WebElementFacade topSearchField;

    @FindBy(css = ".search-form .searchsubmit")
    private WebElementFacade searchIcon;

    @FindBy(css = "#menu-item-73 a")
    private WebElementFacade shopLink;

    @FindBy(css = ".read-more")
    private WebElementFacade readMoreButton;

    @FindBy(css = ".woocommerce-error")
    private WebElementFacade userNameRequiredErrorMessage;

    @FindBy(css = ".entry-title a")
    private WebElementFacade helloWorldText;


    public void openHomepage() {
        open();
    }

    public void clickOnLogin() {
        clickOn(loginLink);
    }

    public void typeIntoTopSearchField(String productName) {
        typeInto(topSearchField, productName);
    }

    public void clickOnSearchIcon() {
        clickOn(searchIcon);
    }

    public void clickOnReadMoreButton() {
        clickOn(readMoreButton);
    }

    public boolean verifyUserNameRequiredMessage (String errorMsg) {
        return userNameRequiredErrorMessage.containsOnlyText(errorMsg);
    }

    public void clickOnLogoutLink() {
        clickOn(logoutLink);
    }

    public void clickOnShopLink(){
        clickOn(shopLink);
    }

    public boolean verifyHelloWordText() {
        return helloWorldText.containsOnlyText("Hello world!");
    }

}
