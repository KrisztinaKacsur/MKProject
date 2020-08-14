package com.fasttrackit.steps.serenity;

import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.ShopPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ShopSteps {

    private HomePage homePage;
    private ShopPage shopPage;

    @Step
    public void clickOnShopLink() {
        homePage.clickOnShopLink();
    }

    @Step
    public void verifyPageHeaderTitle(String pageTitle) {
        Assert.assertTrue(shopPage.verifyPageHeaderTitle(pageTitle));
    }

    @Step
    public void clickOnHeaderHomeLink() {
        shopPage.clickOnHeaderHomeLink();
    }

    @Step
    public void verifyHelloWordText() {
        homePage.verifyHelloWordText();
    }


}
