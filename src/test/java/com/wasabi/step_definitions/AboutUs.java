package com.wasabi.step_definitions;

import com.wasabi.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.FindBy;

public class AboutUs {
    @Given("user is on the dashboard page")
    public void userIsOnTheDashboardPage() {
        Driver.getDriver().get("https://www.intrafi.com");

    }

    @When("user is hovering over About Us button")
    public void userIsHoveringOverAboutUsButton() {
    }

    @And("user clicks on the About Us button")
    public void userClicksOnTheAboutUsButton() {

    }

    @Then("user has to be able to see drop down menu with {int} drop down options : About Us,The Company, The team, Company History")
    public void userHasToBeAbleToSeeDropDownMenuWithDropDownOptionsAboutUsTheCompanyTheTeamCompanyHistory(int arg0) {
    }
}
