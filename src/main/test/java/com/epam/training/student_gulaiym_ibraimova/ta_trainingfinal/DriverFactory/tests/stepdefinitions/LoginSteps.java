package com.epam.training.student_gulaiym_ibraimova.ta_trainingfinal.DriverFactory.tests.stepdefinitions;

import com.epam.training.student_gulaiym_ibraimova.ta_trainingfinal.pages.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.logging.Logger;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;
    private static final Logger logger = Logger.getLogger(LoginSteps.class.getName());

    public LoginSteps(WebDriver driver) {
        this.driver = driver;
        this.loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @When("I log in with username {string} and password {string}")
    public void loginWithCredentials(String username, String password) {
        logger.info("Starting login with provided credentials.");
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
        logger.info("Login submitted.");
    }

    @Then("I should see the dashboard")
    public void verifyDashboard() {
        logger.info("Verifying dashboard page...");
        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();

        Assert.assertEquals("Login unsuccessful - Dashboard page not displayed", expectedTitle, actualTitle);

        if (actualTitle.equals(expectedTitle)) {
            logger.info("Dashboard page successfully verified.");
        } else {
            logger.severe("Dashboard verification failed. Expected title: " + expectedTitle + " but found: " + actualTitle);
        }

        driver.quit();
        logger.info("Test completed and browser closed.");
    }
}
