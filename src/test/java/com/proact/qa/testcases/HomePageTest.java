package com.proact.qa.testcases;
import com.proact.qa.base.BaseTest;
import com.proact.qa.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;

public class HomePageTest extends BaseTest {

    public HomePageTest() {
        super();}
    @Test
    public static void createProject() throws FileNotFoundException, InterruptedException {
        HomePage home = new HomePage(driver);
        home.enterEmail();
        home.enterPassword();
        home.pressSubmit();
        home.clickCreateProject();
        home.enterTitle();
        home.enterDescription();
        home.clickSubmitProject();
        Assert.assertEquals(true, home.openProjectDisplayed());
        System.out.println("Project was created");}

    @Test
    public static void isHomeLogoDisplayed() {
        HomePage homeLogo = new HomePage(driver);
        Assert.assertEquals(true, homeLogo.isHomeLogoDisplayed());
        System.out.println("Home logo is displayed");}

    @Test
    public static void isUsernameDisplayed() {
        HomePage username = new HomePage(driver);
        //username.enterEmail();
        //username.enterPassword();
        //username.pressSubmit();
        Assert.assertEquals(true, username.isUsernameDisplayed());
        System.out.println("Username is displayed");}

    @Test
    public static void isRowIdDisplayed(){
        HomePage row = new HomePage(driver);
        Assert.assertEquals(true, row.isRowIdDisplayed());
        System.out.println("Project Id is displayed");}

    @Test
    public static void isProjectNameDisplayed() {
        HomePage projectName = new HomePage(driver);
        Assert.assertEquals(true, projectName.isProjectNameDisplayed());
        System.out.println("Project Name is displayed");}

    @Test
    public static void isProjectDescriptionDisplayed() {
        HomePage description = new HomePage(driver);
        Assert.assertEquals(true, description.isProjectDescriptionDisplayed());
        System.out.println("Project Description is displayed");}

    @Test
    public static void isProjectStatusDisplayed() {
        HomePage status = new HomePage(driver);
        Assert.assertEquals(true, status.isProjectStatusDisplayed());
        System.out.println("Project Status is displayed");}

    @Test
    public static void isCsvDisplayed() throws FileNotFoundException, InterruptedException {
        HomePage csv = new HomePage(driver);
        Assert.assertEquals(true, csv.isCsvDisplayed());
        System.out.println("Csv is displayed");}

    @Test
    public static void isProjectDisplayed() throws FileNotFoundException, InterruptedException {
        HomePage task = new HomePage(driver);
        Assert.assertEquals(true, task.isProjectDisplayed());
        System.out.println("Project Tasks are displayed");}

    @Test
    public static void isProjectPendingTasksDisplayed() {
        HomePage pending = new HomePage(driver);
        Assert.assertEquals(true, pending.isProjectPendingTasksDisplayed());
        System.out.println("Project Pending Tasks are displayed");}

    @Test
    public static void isProjectActionsDisplayed() {
        HomePage actions = new HomePage(driver);
        Assert.assertEquals(true, actions.isProjectActionsDisplayed());
        System.out.println("Project Actions are displayed");}

    @Test
    public static void isLogoutButtonDisplayed() {
        HomePage logoutDisplayed = new HomePage(driver);
        Assert.assertEquals(true, logoutDisplayed.isLogoutDisplayed());
        System.out.println("Logout button id displayed");}}