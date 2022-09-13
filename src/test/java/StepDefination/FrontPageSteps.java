package StepDefination;

import io.cucumber.java.en.Given;
import utils.basetests;

import java.net.MalformedURLException;

public class FrontPageSteps {

    basetests base = new basetests();

    public FrontPageSteps() throws MalformedURLException {
        /**
         * In case it shows NullPointerException or driver is null,
         * then call the androidSetup.setDriver manually from stepDefinitions Constructor
         */
        base.setDriver();

    }

    @Given("User In the front page")
    public void user_in_the_front_page() throws MalformedURLException, InterruptedException {
        Thread.sleep(8000);
        base.setUp();
        Thread.sleep(4000);
    }
}
