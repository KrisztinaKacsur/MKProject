package com.fasttrackit.features.search;

import com.fasttrackit.Util.BaseTest;
import com.fasttrackit.Util.Constants;
import com.fasttrackit.steps.serenity.AdminDeleteProductSteps;
import com.fasttrackit.steps.serenity.LoginSteps;
import io.vavr.collection.List;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class AdminDeleteProductTest extends BaseTest {

    @Steps
    LoginSteps loginSteps;

    @Steps
    AdminDeleteProductSteps adminDeleteProductSteps;

    @Test
    public void deleteProductFromAdminPage(){
        loginSteps.allLoginSteps(Constants.ADMIN_USER_NAME, Constants.ADMIN_USER_PASS);
        loginSteps.navigateToAdminSite();
        adminDeleteProductSteps.clickOnAllProductsLink();
        adminDeleteProductSteps.clickOnSelectACategory();
        adminDeleteProductSteps.clickOnUncategorizedProducts();
        adminDeleteProductSteps.clickOnFilterButton();
        adminDeleteProductSteps.clickOnSunglassesLink();
        adminDeleteProductSteps.clickOnDeleteSunglassesLink();
        adminDeleteProductSteps.verifyProductUpdated("1 product moved to the Trash. Undo");
    }
}
