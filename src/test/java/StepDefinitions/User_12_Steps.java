package StepDefinitions;

import Pages.LeftNav;
import Pages.User_2;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class User_12_Steps {

    LeftNav ln = new LeftNav();
    @And("Click on the element in the User funcitoanality")
    public void clickOnTheElementInTheUserFuncitoanality(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            ln.findAndClick(listElement.get(i));
        }


    }
}
