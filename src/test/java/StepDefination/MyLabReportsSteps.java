package StepDefination;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import pages.MyAppoinments;
import pages.MyLabReports;
import utils.basetests;

import java.net.MalformedURLException;

public class MyLabReportsSteps {
    private AndroidDriver driver;
    MyLabReports myLabReports;
    utils.basetests base;

    public MyLabReportsSteps(basetests base) throws MalformedURLException {

        this.driver = base.setDriver();
        myLabReports = new MyLabReports(driver);
    }
    @Then("My Lab Reports")
    public void my_lab_reports() throws InterruptedException {
        Thread.sleep(2000);
        myLabReports.setAppoinmentDetails();
        Thread.sleep(4000);
    }

}
