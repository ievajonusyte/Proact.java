package com.proact.qa.pages;
import com.proact.qa.Utils.readUtils;
import com.proact.qa.pageobject.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.FileNotFoundException;
import java.util.List;

public class SearchPage extends PageObject {
    @FindBy(id = "login")
    private WebElement login;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(name = "submit")
    private WebElement submit;

    @FindBy(id = "project-search-input")
    private WebElement search;

    @FindBy(id = "project-search-addon")
    private WebElement searchClick;

    @FindBy(name = "reset")
    private WebElement searchResults;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail() throws FileNotFoundException, InterruptedException {
        readUtils.getTestData("src/main/resources/testData.txt");
        List<String> item = readUtils.getTestData("src/main/resources/testData.txt");
        this.login.sendKeys(item.get(1));}

    public void enterPassword() throws FileNotFoundException, InterruptedException {
        readUtils.getTestData("src/main/resources/testData.txt");
        List<String> item = readUtils.getTestData("src/main/resources/testData.txt");
        this.password.sendKeys(item.get(2));}

    public void pressSubmit() { this.submit.click();}

    public void enterSearchSmall() throws FileNotFoundException, InterruptedException {
        readUtils.getTestData("src/main/resources/testData.txt");
        List<String> item = readUtils.getTestData("src/main/resources/testData.txt");
        this.search.sendKeys(item.get(3));}

    public void pressSearch() {this.searchClick.click();}

    public void enterSearchBig() throws FileNotFoundException, InterruptedException {
        readUtils.getTestData("src/main/resources/testData.txt");
        List<String> item = readUtils.getTestData("src/main/resources/testData.txt");
        this.search.sendKeys(item.get(4));}

    public boolean idSearchDisplayed() {this.search.isDisplayed();return true;}
    public boolean searchResultsSmall() {this.searchResults.isDisplayed();return true;}
    public boolean searchResultsBig() {this.searchResults.isDisplayed();return true;}}

