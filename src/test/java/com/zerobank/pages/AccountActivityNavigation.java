package com.zerobank.pages;


import com.zerobank.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityNavigation extends BasePage {

    @FindBy(xpath = "//div[@class='offset2 span8']//div[1]//div[1]//table[1]//tbody[1]//tr[1]//td[1]//a[1]")
    public WebElement savings;

    @FindBy(xpath = "//a[contains(text(),'Account Activity')]")
    public WebElement activityTitle;

    @FindBy(xpath = "//a[contains(text(),'Checking')]")
    public WebElement checking;

    @FindBy(xpath = "//a[contains(text(),'Loan')]")
    public WebElement loan;

    @FindBy(xpath = "//a[contains(text(),'Credit Card')]")
    public WebElement creditCard;

    @FindBy(xpath = "//a[contains(text(),'Brokerage')]")
    public WebElement brokerage;

    @FindBy(xpath = "//select[@id='aa_accountId']")
    public WebElement dropDown;

    public void activityNavigation(String activity) {
        if (activity.equals("savings")) {
            savings.click();
        } else if (activity.equals("brokerage")) {
            brokerage.click();
        } else if (activity.equals("creditCard")) {
            creditCard.click();
        } else if (activity.equals("dropDown")) {
            dropDown.click();
        } else if (activity.equals("checking")) {
            checking.click();
        }
    }

    public void isPageTitleDisplayed(String expected) {
        //Retreiving the page title and comparing it.
        String result = activityTitle.getText();
        Assert.assertEquals(expected, result);
    }

    public void dropDown(String dP) {
        dropDown.click();
        Select select = new Select(dropDown);
        WebElement option = select.getFirstSelectedOption();
        String defaultItem = option.getText();
        //Verify that expected and actual is same
        Assert.assertEquals(dP,defaultItem);
        System.out.println("This is default item" + dP + " from" + defaultItem);
        BrowserUtils.wait(1);
    }


}
