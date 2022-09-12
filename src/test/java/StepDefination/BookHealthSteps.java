package StepDefination;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import pages.BookHealth;
import pages.ContactUs;
import utils.basetests;

import java.net.MalformedURLException;

public class BookHealthSteps {
//    private AndroidDriver driver;
//    BookHealth bookHealth;
//    utils.basetests base;
//
//    public BookHealthSteps() throws MalformedURLException {
//        this.driver = base.setDriver();
//        bookHealth = new BookHealth(driver);
//    }

    private AndroidDriver driver;
    BookHealth bookHealth;
    utils.basetests base;

    public BookHealthSteps(basetests base) throws MalformedURLException {

        this.driver = base.setDriver();
        bookHealth = new BookHealth(driver);
    }

    @Then("Tap book a healthcheck Button")
    public void tap_book_a_healthcheck_button() throws InterruptedException {

        Thread.sleep(5000);
        bookHealth.setBookhealthcheck();
        Thread.sleep(2000);

    }

}
