package com.fasttrackit.features.search;

import com.fasttrackit.Util.BaseTest;
import com.fasttrackit.Util.Constants;
import com.fasttrackit.steps.serenity.LoginSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class adminPageTest extends BaseTest {

    @Steps
    LoginSteps loginSteps;

    @Test
    public void navigateToAdminPage() {
        loginSteps.openHomepage();
        loginSteps.clickLoginLink();
        loginSteps.setUserNameOrEmailField(Constants.ADMIN_USER_NAME);
        loginSteps.setPasswordField(Constants.ADMIN_USER_PASS);
        loginSteps.clickOnLoginButton();
        loginSteps.navigateToAdminSite();
        loginSteps.verifyLoggedInAdminInterface("admin");
    }
}
