package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import Pages.User_2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class User_2_Steps extends Parent {

    User_2 us = new User_2();

    LeftNav ln = new LeftNav();

    DialogContent dc = new DialogContent();

    @Given("Navigate to Attestations")
    public void navigateToAttestations() {

        ln.findAndClick("humanResources");
        ln.findAndClick("setup");
        ln.findAndClick("attestation");
    }

    @When("Create a Attestetions name")
    public void createAAttestetionsName() {

        dc.findAndClick("addButton");
        dc.findAndSend("nameInput","yonis2");
        dc.findAndClick("saveButton");

    }

    @And("Edit a Attestetions name")
    public void editAAttestetionsName() {
        dc.findAndClick("editButton");
        dc.findAndSend("nameInput","yonis3");
        dc.findAndClick("saveButton");
    }

    @And("Delete a Attestetions name")
    public void deleteAAttestetionsName() {
        waitUntilLoading();
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");
    }

}
