package com.zerobank.pages;


import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchaseForeignCurrency extends BasePage{

    @FindBy(css = "[title='Create Car']")
    public WebElement createACarElement;

    /**
     * Use this method to click on "Create a Car" button
     * Method already contains waits to handle synchronization issues
     */
    public void clickToCreateACar(){
        BrowserUtils.waitForVisibility(createACarElement, 15);
        BrowserUtils.waitForClickablility(createACarElement, 15);
        createACarElement.click();
    }
}
