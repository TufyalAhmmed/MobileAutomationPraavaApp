package StepDefination;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BookHealth;
import pages.LogIn;
import pages.SignUp;
import utils.basetests;

import java.net.MalformedURLException;

public class LoginSteps {

    private AndroidDriver driver;
    LogIn login;
    BookHealth bookHealth;

    public LoginSteps(basetests base) throws MalformedURLException {

        this.driver = (AndroidDriver) base.setUp();
        login = new LogIn(driver);
        bookHealth = new BookHealth(driver);
    }

    @When("User enters Mobile {string} in Mobile# field")
    public void user_enters_mobile_in_mobile_field(String string) throws InterruptedException {
        Thread.sleep(3000);
        login.setMobile();
    }
    @When("user enters# {string} in the password field")
    public void user_enters_in_the_password_field(String string) throws InterruptedException {
        Thread.sleep(3000);
        login.setPassword();
    }
    @Then("Tap on Submit tab")
    public void tap_on_submit_tab() throws InterruptedException {
        Thread.sleep(3000);
        login.setSubmitbtn();
        Thread.sleep(2000);

    }
}
