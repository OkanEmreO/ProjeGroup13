package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import Pages.User_1_LeftNav;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class User_1_Steps extends Parent {
    User_1_LeftNav u1l=new User_1_LeftNav();
    DialogContent dc=new DialogContent();


    @Given("Navigate to position categories")
    public void navigateToPositionCategories() {
        u1l.findAndClick("humanresources");
        u1l.findAndClick("setup3");
        u1l.findAndClick("positionsCategories");
    }

    @When("Create position categories")
    public void createPositionCategories() {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput","Sergen");
        dc.findAndClick("saveButton");

    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage","success");
    }

    @When("Edit user position")
    public void editUserPosition() {
        dc.findAndSend("searchInput","Sergen");
        dc.findAndClick("searchButton");
        u1l.findAndClick("editButton");
        dc.findAndSend("nameInput", "Pascal");
        dc.findAndClick("saveButton");
    }

    @When("Delete user position")
    public void deleteUserPosition() {
        dc.findAndSend("searchInput","Pascal");
        dc.findAndClick("searchButton");

        waitUntilLoading();

        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");
    }
}
