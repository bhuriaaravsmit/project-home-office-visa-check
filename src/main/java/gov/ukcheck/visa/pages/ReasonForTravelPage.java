package gov.ukcheck.visa.pages;

import gov.ukcheck.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ReasonForTravelPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement reasonForVisitListTourismAndFamily;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement reasonForVisitListWorkAcademicVisit;


    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement reasonForVisitIsJoinPartnerAndFamily;
    /* public void selectReasonForVisit(String reason){
         selectByContainsTextFromDropDown(reasonForVisitList,reason);
     }*/
    public void clickOnReasonForVisitTourism()
    {
        clickOnElement(reasonForVisitListTourismAndFamily);
    }
    public void clickOnReasonForVisitAcademic()
    {
        clickOnElement(reasonForVisitListWorkAcademicVisit);
    }
    public void clickOnReasonForJoinPartnerAndFamily()
    {
        clickOnElement(reasonForVisitIsJoinPartnerAndFamily);
    }
    public void clickNextStepButton()
    {
        clickOnElement(nextStepButton);
    }

}