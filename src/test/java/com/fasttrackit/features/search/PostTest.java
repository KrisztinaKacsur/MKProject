package com.fasttrackit.features.search;

import com.fasttrackit.Util.BaseTest;
import com.fasttrackit.Util.Constants;
import com.fasttrackit.steps.serenity.LoginSteps;
import com.fasttrackit.steps.serenity.PostSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class PostTest extends BaseTest {

    @Steps
    LoginSteps loginSteps;

    @Steps
    PostSteps postSteps;

    @Test
    public void addNewPostTest(){
        loginSteps.allLoginSteps(Constants.ADMIN_USER_NAME, Constants.ADMIN_USER_PASS);
        loginSteps.navigateToAdminSite();
        postSteps.clickOnPostMenu();
        postSteps.clickOnNewPost();
        postSteps.typePostTile("Hello, users! by MK");
        //postSteps.clickTextStyle();
        postSteps.typePostBody("This is a test comment created for MK project.");
       // postSteps.clickPublish();
    }
}
