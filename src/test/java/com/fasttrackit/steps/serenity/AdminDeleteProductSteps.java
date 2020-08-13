package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.AdminAddProductPage;
import com.fasttrackit.pages.AdminHomePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class AdminDeleteProductSteps {

    private AdminHomePage adminHomePage;
    private AdminAddProductPage adminAddProductPage;

    @Step
    public void clickOnAllProductsLink() {
        adminHomePage.clickOnAllProductsLink();
    }

    @Step
    public void clickOnSelectACategory() {
        adminAddProductPage.clickOnSelectACategory();
    }

    @Step
    public void clickOnUncategorizedProducts() {
        adminAddProductPage.clickOnUncategorizedProducts();
    }

    @Step
    public void clickOnFilterButton() {
        adminAddProductPage.clickOnFilterButton();
    }

    @Step
    public void clickOnSunglassesLink() {
        adminAddProductPage.clickOnSunglassesLink();
    }

    @Step
    public void clickOnDeleteSunglassesLink() {
        adminAddProductPage.clickOnDeleteSunglassesLink();
    }

    @Step
    public void verifyProductUpdated(String msg) {
        Assert.assertTrue(adminAddProductPage.verifyProductUpdated(msg));
    }

}
