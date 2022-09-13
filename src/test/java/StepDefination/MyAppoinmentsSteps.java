package StepDefination;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import pages.MyAppoinments;
import pages.Navbar;
import utils.basetests;

import java.net.MalformedURLException;

public class MyAppoinmentsSteps {
    private AndroidDriver driver;
    MyAppoinments myAppoinments;
    utils.basetests base;

    public MyAppoinmentsSteps(basetests base) throws MalformedURLException {

        this.driver = base.setDriver();
        myAppoinments = new MyAppoinments(driver);
    }
    @Then("Tap on my appoinments")
    public void tap_on_my_appoinments() throws InterruptedException {
        Thread.sleep(2000);
        myAppoinments.setAppoinmentDetails();
        Thread.sleep(2000);

    }
    @Then("Tap on past Appointments")
    public void tap_on_past_appointments() throws InterruptedException {
        Thread.sleep(4000);
        myAppoinments.setPastAppoinment();
        Thread.sleep(4000);
    }
}
