package gov.ukcheck.visa.pages;

import gov.ukcheck.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WorkTypePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement selectHealthAndCareProvision;
    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Continue')]")
    WebElement nextStepButton;
    public void clickOnHealthAndCareProvision(){clickOnElement(selectHealthAndCareProvision);}
    public void clickNextStepButton(){clickOnElement(nextStepButton);}


}
