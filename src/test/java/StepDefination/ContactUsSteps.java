package StepDefination;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import pages.ContactUs;
import utils.basetests;

import java.net.MalformedURLException;

public class ContactUsSteps {
    private AndroidDriver driver;
    ContactUs contactus;
    utils.basetests base;

    public ContactUsSteps(basetests base) throws MalformedURLException {

        this.driver = base.setDriver();
        contactus = new ContactUs(driver);
    }
    @Then("Tap on Contact Us")
    public void tap_on_contact_us() throws InterruptedException {
        Thread.sleep(4000);
        contactus.setContactusBtn();
        Thread.sleep(4000);
    }
}
