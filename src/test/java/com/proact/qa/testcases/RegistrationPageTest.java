package com.proact.qa.testcases;
import com.proact.qa.Utils.Utils;
import com.proact.qa.base.BaseTest;
import com.proact.qa.pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import static org.testng.Assert.assertEquals;

public class RegistrationPageTest extends BaseTest {
    RegistrationPage register = new RegistrationPage(driver);
    public RegistrationPageTest() {
        super();
    }

    @Test
    public void isRegistrationLogoIsDisplayed() {
        driver.get(Utils.REGISTER_URL);
        assertEquals(true, register.isRegistrationLogoDisplayed());
        System.out.println("Registration logo is displayed");}

    @Test
    public void registration() throws FileNotFoundException, InterruptedException {
        driver.get(Utils.REGISTER_URL);
        register.enterUserName();
        register.enterFirstName();
        register.enterLastName();
        register.enterRegistrationEmail();
        register.enterRegistrationPassword();
        register.enterPasswordAgain();
        register.pressSignUp();
        Assert.assertEquals(true, register.isBackToLoginDisplayed());
        System.out.println("Registration was successful");}}