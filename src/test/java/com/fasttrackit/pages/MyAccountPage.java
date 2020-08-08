package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.Random;

@DefaultUrl("http://qa5.fasttrackit.org:8008/?page_id=7")
public class MyAccountPage extends PageObject {


    @FindBy(id = "reg_email")
    private WebElementFacade emailField;

    @FindBy(id = "reg_password")
    private WebElementFacade passwordField;

    @FindBy(css = "[value='Register']")
    private WebElementFacade registerButton;

    @FindBy(css = ".post-title")
    private WebElementFacade myAccountTitle;

    @FindBy(id = "username")
    private WebElementFacade userNameOrEmailField;

    @FindBy(id = "password")
    private WebElementFacade loginPassword;

    @FindBy(css = "[name='login']")
    private WebElementFacade loginButton;

    @FindBy(css = ".logout")
    private WebElementFacade logoutLink;

    @FindBy(css = ".login-woocommerce")
    private WebElementFacade loginLink;

    @FindBy(id = "menu-item-69")
    private WebElementFacade homeLink;

    @FindBy(css = ".user-name")
    private WebElementFacade WelcomeLoggedInUserNameLink;

    @FindBy(css = "#meta-2 [href*='wp-admin']")
    private WebElementFacade adminSiteLink;

    @FindBy(id = "menu-item-73")
    private WebElementFacade shopLink;

    @FindBy (css = ".woocommerce-error")
    private WebElementFacade myAccountPageErrorMessage;



    public void setEmailField (){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        String randomEmail = "krisztina" + randomInt + "@gmail.com";
        typeInto(emailField, randomEmail);
    }

    public void setPasswordField(String userName){
        typeInto(passwordField, userName);
    }

    public void clickOnRegisterButton(){
        clickOn(registerButton);
    }

    public boolean verifyRegistered(){
        return myAccountTitle.containsOnlyText("MY ACCOUNT");
    }

    public void setUserNameOrEmailField(String userNameOrEmail){
        typeInto(userNameOrEmailField, userNameOrEmail);
    }

    public void setLoginPassword(String pass){
        typeInto(loginPassword,pass);
    }

    public void clickOnLoginButton(){
        clickOn(loginButton);
    }

    public boolean verifyLogin(){
        return logoutLink.containsOnlyText("Logout");
    }

    public boolean verifyLoginFailed(){
        return loginLink.containsOnlyText("Login");
    }

    public void clickOnHomeLink(){
        clickOn(homeLink);
    }

    public boolean verifyLoggedInUser(String username){
        return WelcomeLoggedInUserNameLink.containsText(username);
    }

    public void clickOnAdminSiteLink(){
        clickOn(adminSiteLink);
    }

    public void clickOnShopLink() {
        clickOn(shopLink);
    }

    public boolean myAccountPassOrEmailErrorMessage(String errorMsg){
        return myAccountPageErrorMessage.containsOnlyText(errorMsg);
    }


}
