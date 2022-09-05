package StepDefinitions;

import Pages.User_2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class User_2_Steps {

    User_2 us = new User_2();

    @Given("Navigate to Attestations")
    public void navigateToAttestations() {

        us.findAndClick("humanResources");
        us.findAndClick("setup");
        us.findAndClick("attestations");
    }

    @When("Create a Attestetions name")
    public void createAAttestetionsName() {

        us.findAndClick("addButton");
        us.findAndSend("nameInput","yonis2");
        us.findAndClick("saveButton");

    }

    @And("Edit a Attestetions name")
    public void editAAttestetionsName() {
        us.findAndClick("editButton");
        us.findAndSend("nameInput","yonis3");
        us.findAndClick("saveButton");
    }

    @And("Delete a Attestetions name")
    public void deleteAAttestetionsName() {
        us.findAndClick("deleteButton");
        us.findAndClick("deleteButton2");
    }
}
