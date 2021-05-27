package com.proact.qa.pages;
import com.proact.qa.Utils.readUtils;
import com.proact.qa.pageobject.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.FileNotFoundException;
import java.util.List;

public class HomePage extends PageObject {

    @FindBy(name = "login")
    private WebElement login;

    @FindBy (id= "export-csv-projects")
    private WebElement csv;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(name = "submit")
    private WebElement submit;

    @FindBy(id = "proactLogo")
    private WebElement homeLogo;

    @FindBy(id = "add-new-project-btn")
    private WebElement addProject;

    @FindBy(id = "statistics-tab")
    private WebElement statistics;

    @FindBy(id = "project-title-input")
    private WebElement title;

    @FindBy(id = "comment-area")
    private WebElement description;

    @FindBy(id = "submit-project-btn2")
    private WebElement clickCreate;

    @FindBy(id = "add-back-btn")
    private WebElement clickBackToList;

    @FindBy(id = "logout-btn")
    private WebElement logout;

    @FindBy(id = "username")
    private WebElement username;

    @FindBy(id = "rowID1")
    private WebElement rowId;

    @FindBy(id = "project1")
    private WebElement projectName;

    @FindBy(id = "description1")
    private WebElement projectDescription;

    @FindBy(id = "status1")
    private WebElement projectStatus;

    @FindBy(id = "total1")
    private WebElement projectTasks;

    @FindBy(id = "pending1")
    private WebElement projectPendingTasks;

    @FindBy(id = "actions1")
    private WebElement projectActions;

    @FindBy(id= "open-project-btn")
    private WebElement openProject;

    public HomePage(WebDriver driver) {
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
        this.submit.click();
    }

    public void clickCreateProject() {
        this.addProject.click();
    }

    public void enterTitle() throws FileNotFoundException, InterruptedException {
        readUtils.getTestData("src/main/resources/testData.txt");
        List<String> item = readUtils.getTestData("src/main/resources/testData.txt");
        this.title.sendKeys(item.get(10));}

    public void enterDescription() throws FileNotFoundException, InterruptedException {
        readUtils.getTestData("src/main/resources/testData.txt");
        List<String> item = readUtils.getTestData("src/main/resources/testData.txt");
        this.description.sendKeys(item.get(11));}

    public void clickSubmitProject() {
        this.clickCreate.click();
    }

    public boolean isLogoutDisplayed() {
        this.logout.isDisplayed();
        return true;}

    public boolean isUsernameDisplayed() {
        this.username.isDisplayed();
        return true;}

    public boolean isRowIdDisplayed() {
        this.rowId.isDisplayed();
        return true;}

    public boolean isProjectNameDisplayed() {
        this.projectName.isDisplayed();
        return true;}

    public boolean isCsvDisplayed() {
        this.csv.isDisplayed();
        return true;}

    public boolean isProjectDescriptionDisplayed() {
        this.projectDescription.isDisplayed();
        return true;}

    public boolean isProjectStatusDisplayed() {
        this.projectStatus.isDisplayed();
        return true;}

    public boolean isProjectDisplayed() {
        this.addProject.isDisplayed();
        return true;}

    public boolean isProjectPendingTasksDisplayed() {
        this.projectPendingTasks.isDisplayed();
        return true;}

    public boolean isProjectActionsDisplayed() {
        this.projectActions.isDisplayed();
        return true;}

    public boolean isHomeLogoDisplayed() {
        this.homeLogo.isDisplayed();
        return true;}

    public boolean openProjectDisplayed() {
        this.openProject.isDisplayed();
        return true;}}
