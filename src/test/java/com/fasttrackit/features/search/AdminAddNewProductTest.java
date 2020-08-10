package com.fasttrackit.features.search;

import com.fasttrackit.Util.BaseTest;
import com.fasttrackit.Util.Constants;
import com.fasttrackit.pages.HomePage;
import com.fasttrackit.steps.serenity.AdminAddProductSteps;
import com.fasttrackit.steps.serenity.LoginSteps;
import com.fasttrackit.steps.serenity.SearchSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class AdminAddNewProductTest extends BaseTest {

    @Steps
    LoginSteps loginSteps;

    @Steps
    AdminAddProductSteps adminAddProductSteps;

    @Steps
    SearchSteps searchSteps;

    @Test
    public void addNewProductToSiteTest(){
        loginSteps.allLoginSteps(Constants.ADMIN_USER_NAME, Constants.ADMIN_USER_PASS);
        loginSteps.navigateToAdminSite();
        adminAddProductSteps.clickOnAllProductsLink();
        adminAddProductSteps.clickOnNewProductButton();
        adminAddProductSteps.typeIntoNewProductTitle("Sunglasses MK");
        adminAddProductSteps.clickOnAddMediaButton();
        adminAddProductSteps.clickOnSunglassesImage();
        adminAddProductSteps.clickOnMediaInsertButton();
        adminAddProductSteps.typeIntoRegularPriceFiled("38");
        adminAddProductSteps.clickOnInventoryLink();
        adminAddProductSteps.clickOnManageStockCheckbox();
        adminAddProductSteps.typeIntoStockQuantityField("20");
        adminAddProductSteps.clickOnPublishButton();
        adminAddProductSteps.verifyNewProductIsPublished();
        searchSteps.navigateToHomepage();
        searchSteps.allSearchSteps("Sunglasses MK");
        searchSteps.verifyShopIsDisplayed();
        searchSteps.verifySingleProductIsFound("Sunglasses MK");
        searchSteps.clickOnAdminLink();
        adminAddProductSteps.clickOnAllProductsLink();
        adminAddProductSteps.clickOnSunglassesCheckBox();
        adminAddProductSteps.clickOnSunglassesTrashLink();
    }
}
