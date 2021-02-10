package com.mycompany.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class SearchResultsPage extends BasePage {
    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css="div>a>h3>span")
    List<WebElement> searchResults;

    public void verifyPageTitle(String input){
        getDriver().getTitle().toLowerCase().contains(input);
    }
    public void verifySearchResultsHasInput(String input){
        boolean isFound = false;
        for(WebElement e:searchResults){
            if(e.getText().toLowerCase().contains(input.toLowerCase()))
                isFound=true;
        }
        Assert.assertTrue("One of the search result doesn't contain input", isFound);

    }
    public void verifyAllSearchResultsHasValidLinks() {
        HttpURLConnection huc = null;
        int respCode = 200;
        List<WebElement> links = this.getDriver().findElements(By.tagName("a"));

        Iterator<WebElement> it = links.iterator();
        String url = "";

        while (it.hasNext()) {
            url = it.next().getAttribute("href");
            if (url == null || url.isEmpty()) {
                System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }


            try {
                huc = (HttpURLConnection) (new URL(url).openConnection());
                huc.setRequestMethod("HEAD");
                huc.connect();
                respCode = huc.getResponseCode();
                if (respCode >= 400) {
                    System.out.println(url + " is a broken link");
                } else {
                    System.out.println(url + " is a valid link");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
