package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa5.fasttrackit.org:8008/?page_id=6")
public class CheckOutPage extends PageObject {

    @FindBy(id = "billing_first_name")
    private WebElementFacade billingFirstNameField;

    @FindBy(id = "billing_last_name")
    private WebElementFacade billingLastNameField;

    @FindBy(id = "billing_address_1")
    private WebElementFacade billingAddressField;

    @FindBy(id = "billing_city")
    private WebElementFacade billingCityField;

    @FindBy(id = "billing_postcode")
    private WebElementFacade postcodeField;

    @FindBy(id = "billing_phone")
    private WebElementFacade phoneNumberField;

    @FindBy(id = "place_order")
    private WebElementFacade placeOrderButton;


    public void setBillingFirstNameField(String firstName){
        typeInto(billingFirstNameField, firstName);
    }

    public void setBillingLastNameField(String lastName) {
        typeInto(billingLastNameField, lastName);
    }

    public void setBillingAddress(String billingAddress){
        typeInto(billingAddressField, billingAddress);
    }

    public void setBillingCityField(String billingCityName){
        typeInto(billingCityField, billingCityName);
    }

    public void setPostcodeField(String postcode){
        typeInto(postcodeField, postcode);
    }

    public void setPhoneNumberField(String phoneNumber){
        typeInto(phoneNumberField, phoneNumber);
    }

    public void clickPlaceOrderButton(){
        clickOn(placeOrderButton);
    }

}
