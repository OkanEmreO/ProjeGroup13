package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class User_5 extends Parent {


    public User_5() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setup;

    @FindBy(xpath = "//span[text()='Positions']")
    private WebElement positions;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogBtn;

    WebElement myElement;

    public void findAndClick(String strELement) {
        switch (strELement) {

            case "humanResources":
                myElement = humanResources;
                break;

            case "setup":
                myElement = setup;
                break;

            case "positions":
                myElement = positions;
                break;
            case "addButton":
                myElement = addButton;
                break;
            case "saveButton":
                myElement = saveButton;
                break;
            case "searchButton":
                myElement = searchButton;
                break;
            case "deleteButton":
                myElement = deleteButton;
                break;
            case "deleteDialogBtn":
                myElement = deleteDialogBtn;
                break;
            case "editButton":
                myElement = editButton;
                break;


        }
        clickFunction(myElement);
    }

    public void findAndSend(String strElement, String value) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "nameInput":
                myElement = nameInput;
                break;
            case "shortName":
                myElement = shortName;
                break;
            case "searchInput":
                myElement = searchInput;
                break;


        }

        sendKeysFunction(myElement, value);
    }

    public void Delete(String strElement) throws InterruptedException {

        findAndSend("searchInput", strElement);
        findAndClick("searchButton");

        waitUntilLoading();


        findAndClick("deleteButton");
        findAndClick("deleteDialogBtn");

    }

    public void Edit(String strElement)  {

        findAndSend("searchInput", strElement);
        findAndClick("searchButton");

        waitUntilLoading();

        findAndClick("editButton");
    }

    public void EditClick(String strElement){


        findAndSend("nameInput",strElement);

    }


}
