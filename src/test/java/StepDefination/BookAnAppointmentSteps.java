package StepDefination;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import pages.BookAnAppontment;
import pages.MapDirection;
import utils.basetests;

import java.net.MalformedURLException;

public class BookAnAppointmentSteps {
    private AndroidDriver driver;
    pages.BookAnAppontment bookAnAppointment;
    utils.basetests base;

    public BookAnAppointmentSteps(basetests base) throws MalformedURLException {

        this.driver = base.setDriver();
        bookAnAppointment = new BookAnAppontment(driver);
    }
    @Then("Tap on Book An Appointment")
    public void tap_on_book_an_appointment() throws InterruptedException {
        Thread.sleep(4000);
        bookAnAppointment.setBookAppointmentLink();
        Thread.sleep(2000);
    }
}
