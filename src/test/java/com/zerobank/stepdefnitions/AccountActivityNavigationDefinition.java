package com.zerobank.stepdefnitions;

import com.zerobank.pages.AccountActivityNavigation;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AccountActivityNavigationDefinition {
    WebDriver driver;
    LoginPage loginPage = new LoginPage();
    AccountActivityNavigation activity = new AccountActivityNavigation();

    @Given("the user is logged in")
    public void the_user_is_logged_in() {

        Driver.get().get(ConfigurationReader.getProperty("url"));
        String userName = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        loginPage.login(userName, password);

    }

    @When("the user clicks on Savings link on the Account Summary page")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page() {
        activity.activityNavigation("savings");

    }

    @Then("the {string} page should be displayed")
    public void the_page_should_be_displayed(String expected) {
        activity.isPageTitleDisplayed(expected);

    }

    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String dP) {
        activity.dropDown(dP);
    }

    @When("the user clicks on Brokerage link on the Account Summary page")
    public void the_user_clicks_on_Brokerage_link_on_the_Account_Summary_page() {
        activity.activityNavigation("brokerage");
    }

    @When("the user clicks on Checking link on the Account Summary page")
    public void the_user_clicks_on_Checking_link_on_the_Account_Summary_page() {
        activity.activityNavigation("checking");
    }

    @When("the user clicks on Credit Card link on the Account Summary page")
    public void the_user_clicks_on_Credit_Card_link_on_the_Account_Summary_page() {
        activity.activityNavigation("creditCard");
    }

    @When("the user clicks on Loan link on the Account Summary page")
    public void the_user_clicks_on_Loan_link_on_the_Account_Summary_page() {
        activity.activityNavigation("loan");
    }

}


