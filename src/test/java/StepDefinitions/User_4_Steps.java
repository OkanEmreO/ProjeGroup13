package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class User_4_Steps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @Given("Navigate to Fields Page")
    public void navigateToFieldsPage() {
        ln.findAndClick("setupOne");
        ln.findAndClick("parameters");
        ln.findAndClick("fields");

    }

    @When("Create a Fields")
    public void createAFields() {
        dc.findAndClick("fieldsAddBtn");
        dc.findAndSend("nameInput","EnginUser4");
        dc.findAndSend("codeInput","171717");
        dc.findAndClick("saveButton");

    }

    @When("Edit Fields")
    public void editFields() {
        dc.findAndSend("searchInput","EnginUser4");
        dc.findAndClick("searchButton");
        dc.findAndClick("editBtn");
        dc.findAndSend("nameInput","EditUser4");
        dc.findAndClick("saveButton");



    }

    @When("Delete Fields {string}")
    public void deleteFields(String kelime) {
        dc.SearchAndDelete(kelime);




    }
}
