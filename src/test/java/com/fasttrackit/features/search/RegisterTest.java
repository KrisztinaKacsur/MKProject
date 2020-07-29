package com.fasttrackit.features.search;

import com.fasttrackit.Util.BaseTest;
import com.fasttrackit.steps.serenity.RegisterSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    @Steps
    RegisterSteps registerSteps;

    @Test
    public void registerTest(){
        registerSteps.openHomepage();
        registerSteps.clickOnLoginLink();
        registerSteps.typeIntoEmailField();
        registerSteps.typeIntoPasswordField("admin123456*");
        registerSteps.clickOnRegisterButton();
        registerSteps.verifyRegistration();
    }

}
