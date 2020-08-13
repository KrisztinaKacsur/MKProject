package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.AdminAddProductPage;
import com.fasttrackit.pages.AdminHomePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class AdminAddProductSteps {

    private AdminHomePage adminHomePage;
    private AdminAddProductPage adminAddProductPage;

    @Step
    public void clickOnAllProductsLink() {
        adminHomePage.clickOnAllProductsLink();
    }

    @Step
    public void clickOnNewProductButton() {
        adminAddProductPage.clickOnAddNewProductButton();
    }

    @Step
    public void typeIntoNewProductTitle(String productName) {
        adminAddProductPage.typeIntoNewProductTitle(productName);
    }

    @Step
    public void clickOnAddMediaButton() {
        adminAddProductPage.clickOnAddMediaButton();
    }

    @Step
    public void clickOnSunglassesImage() {
        adminAddProductPage.clickOnSunglassesImage();
    }

    @Step
    public void clickOnMediaInsertButton() {
        adminAddProductPage.clickOnMediaInsertButton();
    }

    @Step
    public void typeIntoRegularPriceFiled(String price) {
        adminAddProductPage.typeIntoRegularPriceFiled(price);
    }

    @Step
    public void clickOnInventoryLink() {
        adminAddProductPage.clickOnInventoryLink();
    }

    @Step
    public void clickOnManageStockCheckbox() {
        adminAddProductPage.clickOnManageStockCheckbox();
    }

    @Step
    public void typeIntoStockQuantityField(String qty) {
        adminAddProductPage.typeIntoStockQuantityField(qty);
    }

    @Step
    public void clickOnPublishButton() {
        adminAddProductPage.clickOnPublishButton();
    }

    @Step
    public void verifyProductUpdated(String msg) {
        Assert.assertTrue(adminAddProductPage.verifyProductUpdated(msg));
    }

}
