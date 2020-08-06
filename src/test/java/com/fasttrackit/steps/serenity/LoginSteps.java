package com.fasttrackit.steps.serenity;

import com.fasttrackit.Util.Constants;
import com.fasttrackit.pages.AdminPage;
import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.MyAccountPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps {

    private HomePage homePage;
    private MyAccountPage myAccountPage;
    private AdminPage adminPage;

    @Step
    public void openHomepage(){
        homePage.open();
    }

    @Step
    public void clickLoginLink(){
        homePage.clickOnLogin();
    }

    @Step
    public void setUserNameOrEmailField(String userNameOrEmail){
        myAccountPage.setUserNameOrEmailField(userNameOrEmail);
    }

    @Step
    public void setPasswordField(String pass) {
        myAccountPage.setLoginPassword(pass);
    }

    @Step
    public void clickOnLoginButton(){
        myAccountPage.clickOnLoginButton();
    }

    @Step
    public void verifyLoggedIn(){
        Assert.assertTrue(myAccountPage.verifyLogin());
    }

    @Step
    public void verifyLoginFailed(){
        Assert.assertTrue(myAccountPage.verifyLoginFailed());
    }

    @Step
    public void allLoginSteps(String user, String pass) {
        openHomepage();
        clickLoginLink();
        setUserNameOrEmailField(user);
        setPasswordField(pass);
        clickOnLoginButton();
    }

    @Step
    public void verifyLoggedInUserIdentity(String userName) {
        Assert.assertTrue(myAccountPage.verifyLoggedInUser(userName));
    }

    @Step
    public void navigateToAdminSite(){
        myAccountPage.clickOnAdminSiteLink();
    }

    @Step
    public void verifyLoggedInAdminInterface(String userName){
        adminPage.verifyLoggedInOnAdminPage(userName);
    }

}
