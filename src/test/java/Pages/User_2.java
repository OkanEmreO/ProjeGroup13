package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_2 extends Parent{

    public User_2() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    @FindBy(xpath="(//span[text()='Setup'])[3]")
    private WebElement setup;


    @FindBy(xpath = "(//ms-edit-button//button)[1]")
    private WebElement editButton;


    WebElement myElement;
    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {

            case "setup" : myElement =setup; break;
            case "editButton" : myElement =editButton; break;

        }

        clickFunction(myElement);
    }

    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {

        }

        verifyContainsText(myElement,text);


    }

}


