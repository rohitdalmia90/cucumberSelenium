package com.mycompany.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //  use the different locators in prioritry id>name>tags>css>xpath
    @FindBy(name="q")
    WebElement searchInput;

    @FindBy(css="input[@value='Google Search']")
    WebElement searchButton;

// Add all elements on Main page here as a page Objects


    public void enterSearchInput(String input){
        searchInput.clear();
        searchInput.sendKeys(input);
    }

    public void clickSearchButton(){
        searchButton.click();
    }
}
