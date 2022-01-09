package cucumberIntegrationTests.stepDefinitions.common;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberIntegrationTests.CreateAppiumSessionCucumber;
import cucumberIntegrationTests.screens.android.ListingScreen;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class ListingSteps {

ListingScreen listingScreen;
    WebDriver driver;
    Properties configFileObject;
    BaseSteps baseStepsContext;



    public ListingSteps(BaseSteps baseSteps) {
        baseStepsContext = baseSteps;
        driver = baseStepsContext.driver;
        listingScreen = baseStepsContext.listingScreen;
        configFileObject = CreateAppiumSessionCucumber.localeConfigProp;
    }
    @When("user views listing screen")
    //Below method catches API Down error in case of selectors are not found on the listing page
    public void verifycatlisting() {
        try {
            listingScreen.waitForVisibility(listingScreen.listofcatcard);
            listingScreen.waitForVisibility(listingScreen.listofcattext);
        } catch (NoSuchElementException e) {
            if(listingScreen.waitForVisibility(listingScreen.errorpage)){
                System.out.println("Currently API is down, Please try again later");
            }else {
                System.out.println("This element was not found, please ckeck if the element selectors has been changed");
            }
        }
    }
    @And("user clicks Cat listing card")
    public void clickforcatdetails() {
        listingScreen.click(listingScreen.listofcatcard);

    }
    @Then("User verifies Cat name exists")
    public void verifyCatName() {
        listingScreen.waitForVisibility(listingScreen.catdetailname);
    }
    @Then("User verifies Cat Temperament exists")
    public void verifyCatTemperament() {
        listingScreen.waitForVisibility(listingScreen.catdetailtemperament);
    }
    @Then("User verifies Cat Energy Level exists")
    public void verifyCatEnergyLevel() {
        listingScreen.waitForVisibility(listingScreen.catdetailenergylevel);
    }

    @Then("User navigates back to cat listing screen")
    public void navigateBackToListing() {
        listingScreen.back();
        listingScreen.waitForVisibility(listingScreen.listofcatcard);
    }
}
