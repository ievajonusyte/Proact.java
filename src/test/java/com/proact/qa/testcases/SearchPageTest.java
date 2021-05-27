package com.proact.qa.testcases;
import com.proact.qa.base.BaseTest;
import com.proact.qa.pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;

public class SearchPageTest extends BaseTest {
    SearchPage search = new SearchPage(driver);

    public SearchPageTest() {
        super();
    }

    @Test
    public void isSearchDisplayed() throws FileNotFoundException, InterruptedException {
        search.enterEmail();
        search.enterPassword();
        search.pressSubmit();
        Assert.assertEquals(true, search.idSearchDisplayed());
        System.out.println("Search is displayed");}

    @Test
    public void searchSmallLetters() throws FileNotFoundException, InterruptedException {
        search.enterSearchSmall();
        search.pressSearch();
        Assert.assertEquals(true, search.searchResultsSmall());
        System.out.println("Result was found");}

    @Test
    public void searchBigLetters() throws FileNotFoundException, InterruptedException {
        search.enterSearchBig();
        search.pressSearch();
        Assert.assertEquals(true, search.searchResultsBig());
        System.out.println("Result was found");}}
