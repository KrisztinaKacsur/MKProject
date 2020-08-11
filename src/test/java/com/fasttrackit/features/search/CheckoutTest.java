package com.fasttrackit.features.search;

import com.fasttrackit.Util.BaseTest;
import com.fasttrackit.Util.Constants;
import com.fasttrackit.steps.serenity.CartSteps;
import com.fasttrackit.steps.serenity.CheckoutSteps;
import com.fasttrackit.steps.serenity.LoginSteps;
import com.fasttrackit.steps.serenity.SearchSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class CheckoutTest extends BaseTest {


    @Steps
    LoginSteps loginSteps;

    @Steps
    SearchSteps searchSteps;

    @Steps
    CartSteps cartSteps;

    @Steps
    CheckoutSteps checkoutSteps;


    @Test
    public void validCheckoutTest() {
        loginSteps.allLoginSteps(Constants.USER_NAME, Constants.USER_PASS);
        searchSteps.allSearchSteps("cap");
        cartSteps.clickAddProductToCartButton();
        cartSteps.clickOnCartIcon();
        cartSteps.clickOnProceedToCheckout();
        checkoutSteps.typeIntoFirstNameField("Krisztina");
        checkoutSteps.typeIntoLastNameField("Kacsur");
        checkoutSteps.typeIntoBillingAddress("Cherry street, number 2");
        checkoutSteps.typeIntoBillingCityField("Cluj-Napoca");
        checkoutSteps.typeIntoPostcodeField("400435");
        checkoutSteps.typeIntoPhoneNumberField("0123456789");
        checkoutSteps.clickPlaceOrder();
        checkoutSteps.verifyOrderConfirmed();

    }

    @Test
    public void checkOutWithoutCompletingMandatoryFields(){
        loginSteps.allLoginSteps(Constants.USER_NAME, Constants.USER_PASS);
        searchSteps.allSearchSteps("cap");
        cartSteps.clickAddProductToCartButton();
        cartSteps.clickOnCartIcon();
        cartSteps.clickOnProceedToCheckout();
        checkoutSteps.typeIntoFirstNameField("");
        checkoutSteps.typeIntoLastNameField("");
        checkoutSteps.typeIntoBillingAddress("");
        checkoutSteps.typeIntoBillingCityField("");
        checkoutSteps.typeIntoPostcodeField("");
        checkoutSteps.typeIntoPhoneNumberField("");
        checkoutSteps.clickPlaceOrder();
        checkoutSteps.verifyMandatoryFieldsErrorMessage();
    }

    @Test
    public void checkOutPhoneNumberFiledAcceptsOnlyNumbers(){
        loginSteps.allLoginSteps(Constants.USER_NAME, Constants.USER_PASS);
        searchSteps.allSearchSteps("cap");
        cartSteps.clickAddProductToCartButton();
        cartSteps.clickOnCartIcon();
        cartSteps.clickOnProceedToCheckout();
        checkoutSteps.typeIntoFirstNameField("Krisztina");
        checkoutSteps.typeIntoLastNameField("Kacsur");
        checkoutSteps.typeIntoBillingAddress("Cherry street, number 2");
        checkoutSteps.typeIntoBillingCityField("Cluj-Napoca");
        checkoutSteps.typeIntoPostcodeField("400435");
        checkoutSteps.typeIntoPhoneNumberField("abc%^*(.");
        checkoutSteps.clickPlaceOrder();
        checkoutSteps.verifyBillingPhoneNumberErrorMsg("Billing Phone is not a valid phone number.");
    }

    @Test
    public void productQtyChangedAfterPlacingOrderTest(){
        loginSteps.allLoginSteps(Constants.USER_NAME, Constants.USER_PASS);
        searchSteps.allSearchSteps("mk");
        searchSteps.initialProductStock();
        cartSteps.proceedToCheckoutSteps();
        checkoutSteps.typeIntoFirstNameField("Mihai");
        checkoutSteps.typeIntoLastNameField("STD");
        checkoutSteps.typeIntoBillingAddress("Memorandumului street, number 10");
        checkoutSteps.typeIntoBillingCityField("Cluj-Napoca");
        checkoutSteps.typeIntoPostcodeField("400301");
        checkoutSteps.typeIntoPhoneNumberField("0748978563");
        checkoutSteps.clickPlaceOrder();
        checkoutSteps.verifyOrderConfirmed();
        searchSteps.allSearchSteps("mk");
        searchSteps.verifyIfStockChanged();

    }
}
