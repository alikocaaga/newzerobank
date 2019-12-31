package com.zerobank.stepdefnitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FindTransactionsDefinition {

    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {

    }
    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String string, String string2) {

    }
    @When("clicks search")
    public void clicks_search() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("results table should only show transactions dates between {string} to")
    public void results_table_should_only_show_transactions_dates_between_to(String string) {

    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {

    }

    @Then("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String string) {

    }

    @When("the user enters description {string}")
    public void the_user_enters_description(String string) {

    }

    @Then("results table should only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String string) {

    }

    @Then("results table should only show descriptions containing “OFFICE”")
    public void results_table_should_only_show_descriptions_containing_OFFICE() {

    }
    @Then("results table should not show descriptions containing {string}")
    public void results_table_should_not_show_descriptions_containing(String string) {

    }

    @Then("results table should show at least one result under Deposit")
    public void results_table_should_show_at_least_one_result_under_Deposit() {

    }
    @Then("results table should show at least one result under Withdrawal")
    public void results_table_should_show_at_least_one_result_under_Withdrawal() {

    }
    @When("user selects type {string}")
    public void user_selects_type(String string) {

    }
    @Then("results table should show no result under Withdrawal")
    public void results_table_should_show_no_result_under_Withdrawal() {

    }

    @Then("results table should show no result under Deposit")
    public void results_table_should_show_no_result_under_Deposit() {

    }

}
