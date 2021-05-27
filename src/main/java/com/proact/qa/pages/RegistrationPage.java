package com.proact.qa.pages;
import com.proact.qa.Utils.readUtils;
import com.proact.qa.pageobject.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.FileNotFoundException;
import java.util.List;

public class RegistrationPage extends PageObject {
    @FindBy(id = "icon")
    private WebElement logo;

    @FindBy(id = "username")
    private WebElement username;

    @FindBy(id = "name")
    private WebElement firstname;

    @FindBy(id = "surname")
    private WebElement lastname;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "pwd")
    private WebElement password;

    @FindBy(id = "pwd-repeat")
    private WebElement repeatPassword;

    @FindBy(name = "register")
    private WebElement signup;

    @FindBy(id = "signupsuccsess-modal")
    private WebElement backToLogin;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void enterUserName()throws FileNotFoundException, InterruptedException {
        readUtils.getTestData("src/main/resources/testData.txt");
        List<String> item = readUtils.getTestData("src/main/resources/testData.txt");
        this.username.sendKeys(item.get(4));}

    public void enterFirstName()throws FileNotFoundException, InterruptedException {
        readUtils.getTestData("src/main/resources/testData.txt");
        List<String> item = readUtils.getTestData("src/main/resources/testData.txt");
        this.firstname.sendKeys(item.get(5));}

    public void enterLastName() throws FileNotFoundException, InterruptedException {
        readUtils.getTestData("src/main/resources/testData.txt");
        List<String> item = readUtils.getTestData("src/main/resources/testData.txt");
        this.lastname.sendKeys(item.get(6));}

    public void enterRegistrationEmail() throws FileNotFoundException, InterruptedException {
        readUtils.getTestData("src/main/resources/testData.txt");
        List<String> item = readUtils.getTestData("src/main/resources/testData.txt");
        this.email.sendKeys(item.get(7));}

    public void enterRegistrationPassword() throws FileNotFoundException, InterruptedException {
        readUtils.getTestData("src/main/resources/testData.txt");
        List<String> item = readUtils.getTestData("src/main/resources/testData.txt");
        this.password.sendKeys(item.get(8));}

    public void enterPasswordAgain() throws FileNotFoundException, InterruptedException {
        readUtils.getTestData("src/main/resources/testData.txt");
        List<String> item = readUtils.getTestData("src/main/resources/testData.txt");
        this.repeatPassword.sendKeys(item.get(8));}

    public void pressSignUp() {
        this.signup.click();
    }

    public boolean isRegistrationLogoDisplayed() {this.logo.isDisplayed();return true;}

    public boolean isBackToLoginDisplayed() {this.backToLogin.isDisplayed();return true;}}

