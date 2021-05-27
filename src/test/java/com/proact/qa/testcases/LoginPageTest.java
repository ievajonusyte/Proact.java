package com.proact.qa.testcases;
import com.proact.qa.base.BaseTest;
import com.proact.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.*;
import java.io.FileNotFoundException;

public class LoginPageTest extends BaseTest {
    public LoginPageTest() {
        super();}

    @Test
    public void isLogoDisplayed() {
        LoginPage login = new LoginPage(driver);
        Assert.assertEquals(true, login.isLogoDisplayed());
        System.out.println("Logo is displayed");}

    @Test
    public void login() throws FileNotFoundException, InterruptedException {
        LoginPage logo = new LoginPage(driver);
        logo.enterEmail();
        logo.enterPassword();
        logo.pressSubmit();
        Assert.assertEquals(true, logo.isLogoAfterLoginDisplayed());
        System.out.println("Login successful");}

    @Test
    public void logout() {
        LoginPage logout = new LoginPage(driver);
        logout.pressLogOut();
        Assert.assertEquals(true, logout.isLogoDisplayed());
        System.out.println("Logout successful");}}