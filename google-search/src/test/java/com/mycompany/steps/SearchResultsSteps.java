package com.mycompany.steps;

import com.mycompany.pages.SearchResultsPage;
import io.cucumber.java.en.Then;

public class SearchResultsSteps {

    SearchResultsPage searchResultsPage;

    @Then("{string} should be mentioned in the results")
    public void should_be_mentioned_in_the_results(String string) {
        searchResultsPage.verifySearchResultsHasInput(string);
        searchResultsPage.verifyAllSearchResultsHasValidLinks();
    }
    @Then("{string} should be mentioned in the page title")
    public void should_be_mentioned_in_the_page_title(String string) {
       searchResultsPage.verifyPageTitle(string);
    }

}
