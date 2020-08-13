package com.fasttrackit.features.search;

import com.fasttrackit.Util.BaseTest;
import com.fasttrackit.steps.serenity.RegisterSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    @Steps
    RegisterSteps registerSteps;


    @Test
    public void successfulRegisterTest(){
        registerSteps.openHomepage();
        registerSteps.clickOnLoginLink();
        registerSteps.typeIntoEmailField();
        registerSteps.typeIntoPasswordField("admin123456*");
        registerSteps.clickOnRegisterButton();
        registerSteps.verifyRegistration();
    }

    @Test
    public void registerWithoutEmailTest(){
        registerSteps.openHomepage();
        registerSteps.clickOnLoginLink();
        registerSteps.typeIntoPasswordField("avioncumotoriamasipeminenzbnor");
        registerSteps.clickOnRegisterButton();
        registerSteps.verifyMyAccountPassOrEmailErrorMessage("Error: Please provide a valid email address.");
    }

    @Test
    public void registerWithoutPasswordTest(){
        registerSteps.openHomepage();
        registerSteps.clickOnLoginLink();
        registerSteps.typeIntoEmailField();
        registerSteps.clickOnRegisterButton();
        registerSteps.verifyMyAccountPassOrEmailErrorMessage("Error: Please enter an account password.");
    }

    @Test
    public void registerWithoutEmailAndPasswordTest(){
        registerSteps.openHomepage();
        registerSteps.clickOnLoginLink();
        registerSteps.clickOnRegisterButton();
        registerSteps.verifyMyAccountPassOrEmailErrorMessage("Error: Please provide a valid email address.");
    }

}
