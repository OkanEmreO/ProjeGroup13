package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.User_2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class User_2_Steps {

    User_2 us = new User_2();
    DialogContent dc = new DialogContent();

    LeftNav ln = new LeftNav();

    @Given("Navigate to Attestations")
    public void navigateToAttestations() {

        ln.findAndClick("humanResources");
        us.findAndClick("setup");
        ln.findAndClick("attestations");
    }

    @When("Create a Attestetions name")
    public void createAAttestetionsName() {

        dc.findAndClick("addButton");
        dc.findAndSend("nameInput","yonis2");
        dc.findAndClick("saveButton");

    }

    @And("Edit a Attestetions name")
    public void editAAttestetionsName() {
        us.findAndClick("editButton");
        dc.findAndSend("nameInput","yonis3");
        dc.findAndClick("saveButton");
    }

    @And("Delete a Attestetions name")
    public void deleteAAttestetionsName() {
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteButton2");
    }
}
