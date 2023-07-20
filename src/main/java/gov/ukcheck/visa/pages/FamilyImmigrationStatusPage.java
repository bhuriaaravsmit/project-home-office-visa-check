package gov.ukcheck.visa.pages;

import gov.ukcheck.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FamilyImmigrationStatusPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement yes;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement no;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
    }
    public void selectImmigrationStatus(String status){
        switch (status)
        {
            case "yes":
                clickOnElement(yes);
                break;
            case "no":
                clickOnElement(no);
                break;
        }

    }













}
