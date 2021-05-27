package com.proact.qa.pages;
import com.proact.qa.Utils.readUtils;
import com.proact.qa.pageobject.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.FileNotFoundException;
import java.util.List;

public class LoginPage extends PageObject {

    @FindBy(id = "login")
    private WebElement login;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(name = "submit")
    private WebElement submit;

    @FindBy(id = "icon")
    private WebElement icon;

    @FindBy(id = "proactLogo")
    private WebElement logoAfterLogin;

    @FindBy(id = "logout-btn")
    private WebElement logout;

    public LoginPage(WebDriver driver) {
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

    public void pressSubmit() {
        this.submit.click();}

    public boolean isLogoDisplayed() {
        this.icon.isDisplayed();
        return true;}

    public boolean isLogoAfterLoginDisplayed() {
        this.logoAfterLogin.isDisplayed();
        return true;}

    public void pressLogOut() {
        this.logout.click();}}
