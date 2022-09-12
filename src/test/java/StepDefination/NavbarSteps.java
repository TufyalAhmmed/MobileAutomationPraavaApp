package StepDefination;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import pages.Navbar;
import pages.SignUp;
import utils.basetests;

import java.net.MalformedURLException;

public class NavbarSteps {
    private AndroidDriver driver;
    Navbar navbar;
    utils.basetests base;

    public NavbarSteps(basetests base) throws MalformedURLException {

        this.driver = base.setDriver();
        navbar = new Navbar(driver);
    }
    @Then("Tap on Navbar")
    public void tap_on_navbar() throws InterruptedException {
        Thread.sleep(2000);
        navbar.setNav();

    }

}
