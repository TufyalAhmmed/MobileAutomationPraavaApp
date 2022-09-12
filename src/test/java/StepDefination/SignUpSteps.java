package StepDefination;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignUp;
import utils.basetests;

import java.net.MalformedURLException;

public class SignUpSteps {
    private AndroidDriver driver;
    SignUp NewsignUp;
    utils.basetests base;

    public SignUpSteps(basetests base) throws MalformedURLException {

        this.driver = base.setDriver();
        NewsignUp = new SignUp(driver);
    }

    @When("Tap on SignUp Tab")
    public void tap_on_sign_up_tab() throws InterruptedException {
        Thread.sleep(4000);
        NewsignUp.setSignupBtn();
    }


//    @When("User enters Country {string} in the Country code field")
//    public void user_enters_country_in_the_country_code_field(String string) throws InterruptedException {
//        Thread.sleep(2000);
//        NewsignUp.setMobile();
//    }

    @When("User enters Mobile {string} in number field")
    public void user_enters_mobile_in_number_field(String string) throws InterruptedException {
        Thread.sleep(2000);
        NewsignUp.setMobile();


    }

    @When("User enters {string} in the name fields")
    public void user_enters_in_the_name_fields(String string) throws InterruptedException {
        Thread.sleep(2000);
        NewsignUp.setNameField();
    }

    @When("user enters {string} in the password field")
    public void user_enters_in_the_password_field(String string) throws InterruptedException {
        Thread.sleep(2000);
        NewsignUp.setPasswordField();
    }

    @When("user enters {string} re-Enter password field")
    public void user_enters_re_enter_password_field(String string) throws InterruptedException {
        Thread.sleep(2000);
        NewsignUp.setReenterPassword();

    }

    @When("user enters {string} in email field")
    public void user_enters_in_email_field(String string) throws InterruptedException {
        Thread.sleep(2000);
        NewsignUp.setEmail();
    }

    @Then("Tap on Sign Up")
    public void tap_on_sign_up() throws InterruptedException {
        Thread.sleep(2000);
        NewsignUp.setSignupButton();
        Thread.sleep(3000);
    }


}
