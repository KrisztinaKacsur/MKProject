package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa5.fasttrackit.org:8008/wp-admin/")
public class AdminPage extends PageObject {

    @FindBy(id = "wp-admin-bar-my-account")
    private WebElementFacade adminWelcomeMessage;

    public boolean verifyLoggedInOnAdminPage(String userName){
        return adminWelcomeMessage.containsText(userName);
    }


}
