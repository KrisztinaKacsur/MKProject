package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa5.fasttrackit.org:8008/?page_id=6&order-received=393&key=wc_order_5f244aacc01ff")
public class OrderConfirmedPage extends PageObject {

    @FindBy(css = ".post-title")
    private WebElementFacade orderReceivedText;

    public boolean verifyOrderIsReceived(){
        waitFor(orderReceivedText);
        return orderReceivedText.containsOnlyText("ORDER RECEIVED");
    }

}
