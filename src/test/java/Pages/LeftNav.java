package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement countries;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenShip;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement fees;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamsOne;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement setupTwo;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamsTwo;

    @FindBy(xpath = "//span[text()='Fields']")
    private WebElement fields;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanresources;


    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setup3;

    @FindBy(xpath = "(//span[text()='Position Categories'])[1]")
    private WebElement positionsCategories;

    @FindBy(xpath = "//span[text()='Positions']")
    private WebElement positions;

    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement schoolSetup;

    @FindBy(xpath = "//span[text()='Locations']")
    private WebElement locations;





    WebElement myElement;

    public void findAndClick(String strElement) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "setupOne":
                myElement = setupOne;
                break;
            case "parameters":
                myElement = parameters;
                break;
            case "countries":
                myElement = countries;
                break;
            case "citizenShip":
                myElement = citizenShip;
                break;
            case "nationalities":
                myElement = nationalities;
                break;
            case "fees":
                myElement = fees;
                break;
            case "entranceExamsOne":
                myElement = entranceExamsOne;
                break;
            case "setupTwo":
                myElement = setupTwo;
                break;
            case "entranceExamsTwo":
                myElement = entranceExamsTwo;
                break;
            case "fields":
                myElement = fields;
                break;
            case "humanresources":
                myElement = humanresources;
                break;
            case "setup3":
                myElement = setup3;
                break;
            case "positionsCategories":
                myElement = positionsCategories;
                break;
            case "positions":
                myElement = positions;
                break;
            case "schoolSetup" :
                myElement = schoolSetup;
                break;
            case "locations" :
                myElement = locations;
                break;

        }

        clickFunction(myElement);
    }

}
