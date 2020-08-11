package com.fasttrackit.steps.serenity;


import com.fasttrackit.pages.CheckOutPage;
import com.fasttrackit.pages.OrderConfirmedPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CheckoutSteps {

    private CheckOutPage checkOutPage;
    private OrderConfirmedPage orderConfirmedPage;


    @Step
    public void typeIntoFirstNameField(String firstName){
        checkOutPage.setBillingFirstNameField(firstName);
    }

    @Step
    public void typeIntoLastNameField(String lastName) {
        checkOutPage.setBillingLastNameField(lastName);
    }

    @Step
    public void typeIntoBillingAddress(String billingAddress){
        checkOutPage.setBillingAddress(billingAddress);
    }

    @Step
    public void typeIntoBillingCityField(String billingCityName){
        checkOutPage.setBillingCityField(billingCityName);
    }

    @Step
    public void typeIntoPostcodeField(String postcode) {
        checkOutPage.setPostcodeField(postcode);
    }

    @Step
    public void typeIntoPhoneNumberField(String phoneNumber){
        checkOutPage.setPhoneNumberField(phoneNumber);
    }

    @Step
    public void clickPlaceOrder(){
        checkOutPage.clickPlaceOrderButton();
    }

    @Step
    public void verifyOrderConfirmed(){
        checkOutPage.waitForPageToLoad();
        Assert.assertTrue(orderConfirmedPage.verifyOrderIsReceived());
    }

    @Step
    public void verifyMandatoryFieldsErrorMessage(){
       Assert.assertTrue(checkOutPage.verifyErrorMessageIsDisplayed());
    }

    @Step
    public void verifyBillingPhoneNumberErrorMsg(String errorMsg){
        Assert.assertTrue(checkOutPage.verifyBillingPhoneNumberErrorMsg(errorMsg));
    }



}
