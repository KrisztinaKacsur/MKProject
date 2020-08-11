package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa5.fasttrackit.org:8008/wp-admin/post-new.php?post_type=product")
public class AdminAddProductPage extends PageObject {

    @FindBy(css = ".wrap [href*='post-new']")
    private WebElementFacade addNewProductButton;

    @FindBy(css = "#title")
    private WebElementFacade newProductTitle;

    @FindBy(id = "set-post-thumbnail")
    private WebElementFacade setProductImageLink;

    @FindBy(css = "[data-id='58']")
    private WebElementFacade sunglassesImage;

    @FindBy(css = ".media-button-select")
    private WebElementFacade setProductImageButton;

    @FindBy(css = "#_regular_price")
    private WebElementFacade regularPriceField;

    @FindBy(css = ".inventory_options a")
    private WebElementFacade inventoryLink;

    @FindBy(css = "#_manage_stock")
    private WebElementFacade manageStockCheckBox;

    @FindBy(css = "#_stock")
    private WebElementFacade stockQuantityField;

    @FindBy(id = "publish")
    private WebElementFacade publishButton;

    @FindBy(css = ".updated p")
    private WebElementFacade productPublishedMessage;

    //nu merge selectorul
    @FindBy(css = "#cb-select-457")
    private WebElementFacade sunglassesCheckbox;

    @FindBy(css = "[aria-label='Move “Sunglasses MK” to the Trash']")
    private WebElementFacade sunglassesTrashLink;



    @FindBy(css = ".dropdown_product_cat")
    private WebElementFacade dropdownSelectCategory;

    @FindBy(css = "[value='uncategorized']")
    private WebElementFacade uncategorizedProducts;



    public void clickOnAddNewProductButton(){
        clickOn(addNewProductButton);
    }

    public void typeIntoNewProductTitle(String productName){
        typeInto(newProductTitle, productName);
    }

    public void clickOnAddMediaButton(){
        clickOn(setProductImageLink);
    }

    public void clickOnSunglassesImage(){
        clickOn(sunglassesImage);
    }

    public void clickOnMediaInsertButton(){
        clickOn(setProductImageButton);
    }

    public void typeIntoRegularPriceFiled(String price){
        typeInto(regularPriceField, price);
    }

    public void clickOnInventoryLink(){
        clickOn(inventoryLink);
    }

    public void clickOnManageStockCheckbox(){
        clickOn(manageStockCheckBox);
    }

    public void typeIntoStockQuantityField(String qty){
        typeInto(stockQuantityField, qty );
    }

    public void clickOnPublishButton() {
        clickOn(publishButton);
    }

    public boolean verifyNewProductIsPublished(){
        return productPublishedMessage.containsOnlyText("Product published. View Product");
    }

    public void clickOnSunglassesCheckBox() {
        clickOn(sunglassesCheckbox);
    }

    public void clickOnSunglassesTrashLink(){
        clickOn(sunglassesTrashLink);
    }

    public void clickOnSelectACategory(){
        clickOn(dropdownSelectCategory);
    }

    public void clickOnUncategorizedProducts(){
        clickOn(uncategorizedProducts);
    }






}
