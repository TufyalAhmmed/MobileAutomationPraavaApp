package StepDefination;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import pages.MyLabReports;
import pages.MyPrescriptions;
import utils.basetests;

import java.net.MalformedURLException;

public class MyPrescriptionsSteps {
    private AndroidDriver driver;
    MyPrescriptions myPrescriptions;
    utils.basetests base;

    public MyPrescriptionsSteps(basetests base) throws MalformedURLException {

        this.driver = base.setDriver();
        myPrescriptions= new MyPrescriptions(driver);
    }
    @Then("Tap on My Prescriptions")
    public void tap_on_my_prescriptions() {
        myPrescriptions.setPrescriptionDetails();

    }

}
