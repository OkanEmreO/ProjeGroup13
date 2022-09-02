package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_1_LeftNav extends Parent {

    public User_1_LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanresources;


    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setup3;

    @FindBy(xpath = "(//span[text()='Position Categories'])[1]")
    private WebElement positionsCategories;

    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editButton;

    WebElement myElement;

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "humanresources":
                myElement = humanresources;
                break;
            case "setup3":
                myElement = setup3;
                break;
            case "positionsCategories":
                myElement = positionsCategories;
                break;
            case "editButton":
                myElement = editButton;
                break;
        }
        clickFunction(myElement);
    }

}
