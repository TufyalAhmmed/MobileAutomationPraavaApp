package StepDefination;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Map;
import pages.MapDirection;
import utils.basetests;

import java.net.MalformedURLException;

public class MapDirectionSteps {
    private AndroidDriver driver;
    pages.MapDirection mapDirection;
    utils.basetests base;

    public MapDirectionSteps(basetests base) throws MalformedURLException {

        this.driver = base.setDriver();
        mapDirection = new MapDirection(driver);
    }
    @When("Tap on allow pop up")
    public void tap_on_allow_pop_up() throws InterruptedException {
        Thread.sleep(4000);
        mapDirection.setAllowLink();
        Thread.sleep(4000);

    }
    @Then("Tap on Praava Health")
    public void tap_on_praava_health() throws InterruptedException {
        Thread.sleep(4000);
        mapDirection.setMapDirectionLink();
        Thread.sleep(4000);
    }
}
